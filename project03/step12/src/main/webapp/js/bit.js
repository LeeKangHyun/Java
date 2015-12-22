function bit(selector) {
	var el;
	
	if (selector instanceof HTMLElement) { // 파라미터가 태그 객체라면,
		el = [selector];
		
	} else if (selector.indexOf("<") == 0) { // 파라미터가 문자열이고 <..>라면,
		// selector 값이 < 로 시작한다면; 예) <p>
		// 태그를 생성하여 배열에 담는다.
		var tagName = selector.substr(1, selector.length - 2);
		el = [document.createElement(tagName)];
		
	} else { // 그 밖에 CSS 셀렉터 문법
		// DOM API를 통해 찾은 순순한 태그 목록
		el = document.querySelectorAll(selector);		
	}
	
	// 태그 목록에 도우미 함수 추가 
	el.click = function(listener) {
	  for (var i = 0; i < this.length; i++) {
		if (this[i].addEventListener) {
		  this[i].addEventListener('click', listener);
		} else { // <= IE8
		  this[i].attachEvent('onclick', listener);
		}
	  }
	  return this;
	};
	
	// 폼 항목의 값을 설정하는 함수 추가 => getter/setter 겸용!
	el.val = function(value) {
	  if (value == undefined) { //getter로 활용됨 
		return this[0].value; // 목록에서 첫 번째 값만 리턴한다.
	  } else {
		for (var i = 0; i < this.length; i++) {
		  this[i].value = value;
		}
		return this;
	  }
	};
	
	// innerHTML 값을 다루는 함수
	el.html = function(value) {
	  if (value == undefined) { //getter로 활용됨 
		return this[0].innerHTML; // 목록에서 첫 번째 값만 리턴한다.
	  } else { //setter로 사용됨 
		for (var i = 0; i < this.length; i++) {
		  this[i].innerHTML = value;
		}
		return this;
	  }
	};
	
	// textContext 값을 다루는 함수 
	el.text = function(value) {
	  if (value == undefined) { //getter로 활용됨 
		var str = '';
		for (var i = 0; i < this.length; i++) {
		  str += this[i].textContent;
		}
		return str;
	  } else { //setter로 사용됨 
		for (var i = 0; i < this.length; i++) {
		  this[i].textContent = value;
		}
		return this;
	  }
	};
	
	// innerHTML 값을 다루는 함수
	el.append = function(children) {
	  // 부모 태그 반복하기 
      for (var i = 0; i < this.length; i++) {
    	    // 부모에 자식들을 붙인다.
		for (var x = 0; x < children.length; x++) {
		  this[i].appendChild(children[x]);
		}
	  }
      return this;
	};
	
	// 자식을 부모에게 추가하기 
	el.appendTo = function(parents) {
      for (var i = 0; i < parents.length; i++) {
		for (var x = 0; x < this.length; x++) {
		  parents[i].appendChild(this[x]);
		}
	  }
      return this;
	}
	
	// 스타일 설정하는 함수
	el.css = function(styleName, value) {
	  if (value == undefined) { // getter로 사용
		return this[0].style[styleName];
	  } else {
		for (var i = 0; i < this.length; i++) {
	      this[i].style[styleName] = value;
		}
		return this;
	  }
	};
	
	// 태그의 속성 값 : getter/setter
	el.attr = function(attrName, value) {
	  if (value == undefined) { // getter로 사용
		return this[0].getAttribute(attrName);
	  } else {
		for (var i = 0; i < this.length; i++) {
	      this[i].setAttribute(attrName, value);
		}
		return this;
	  }
	};
	
	return el;  // 도우미 함수가 태그 목록을 리턴한다. 
}

var $ = bit;

bit.ajax = function(url, settings) {
  var xhr = null;

  try {
	xhr = new XMLHttpRequest();
  } catch (e) {
	try {
      xhr = new ActiveXObject("Msxml2.XMLHTTP");
	} catch (e) {
	  try { 
	    xhr = new ActiveXObject("Microsoft.XMLHTTP");
	  } catch (e) {
		alert("이 브라우저는 AJAX를 지원하지 않습니다.");
		return;
	  }
	}
  }

  xhr.onreadystatechange = function(event) {
    if (xhr.readyState == 4) {
      if (xhr.status == 200) {
        if (settings.success) {
        	  if (settings.dataType == 'json') {
        		settings.success(JSON.parse(xhr.responseText));  
        	  } else {
        		settings.success(xhr.responseText);
        	  }
        }  
      } else {
        if (settings.error) 
        	  settings.error(xhr.responseText);
      } 
    }
  };
  
  if (settings.method == undefined)
	settings.method = 'GET';
  
  var queryString = '';
  if (settings.data != undefined) {
	for (var propName in settings.data) {
	  if (queryString.length > 0) 
		queryString += '&';
	  queryString += propName + '=' + settings.data[propName];
	}
  }
  
  if (settings.method == 'GET') { //GET 요청은 URL 뒤에 데이터를 붙인다.
	  url += queryString;
  }
  
  xhr.open(settings.method, url, true);  
  xhr.setRequestHeader("Accept", "application/json");
  
  if (settings.method == 'POST') {
	xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhr.send(queryString);
    
  } else {
	xhr.send();
  }
};

// ajax() 함수의 단축용
bit.getJSON = function(url, success) {
  bit.ajax(url, {
	dataType: 'json',
	success: success
  });
};

bit.post = function(url, p2, p3, p4) {
  var data = undefined, 
      success = undefined, 
      dataType = undefined;
  
  if (typeof p2 == 'object') {  // data
	data = p2;
	if (typeof p3 == 'function') {  // success
	  success = p3;
	  if (typeof p4 == 'string') {  // dataType
		dataType = p4;
	  }
	} else if (typeof p3 == 'string') { // dataType
      dataType = p3;
	}
  }
  
  if (typeof p2 == 'function') { // success
	success = p2;
	if (typeof p3 == 'string') { // dataType
	  dataType = p3;
	}
  }
  
  if (typeof p2 == 'string') { // dataType
	dataType = p2;
  }
  
  bit.ajax(url, {
	method: 'POST',
	data: data,
	dataType: dataType,
	success: success
  });
  
};











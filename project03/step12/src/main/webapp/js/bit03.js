function bit(selector) {
	var el;
	
	if (selector.indexOf("<") == 0) { 
		// selector 값이 < 로 시작한다면; 예) <p>
		// 태그를 생성하여 배열에 담는다.
		var tagName = selector.substr(1, selector.length - 2);
		el = [document.createElement(tagName)];
	} else {
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
	};
	
	// 폼 항목의 값을 설정하는 함수 추가 => getter/setter 겸용!
	el.val = function(value) {
	  if (value == undefined) { //getter로 활용됨 
		return this[0].value; // 목록에서 첫 번째 값만 리턴한다.
	  } else {
		for (var i = 0; i < this.length; i++) {
		  this[i].value = value;
		}
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
	};
	
	return el;  // 도우미 함수가 태그 목록을 리턴한다. 
}

var $ = bit;



// JavaScript Document

$(function(){
		
		$("#view_box").width(1121).height(483)
			              .css("overflow","hidden")  
			         
			var cnt=0, timerID = 0 , delay = 3000 
			var arrX =[0,-1245,-2490,-3535]
			// var arrURL = []
// 			
			// arrURL[0] ="#pr_baner1"
			// arrURL[1] ="http://www.naver.com"
			// arrURL[2] ="http://www.naver.com"
			// arrURL[3] ="#pr_baner1"
			
			
			var n  = arrX.length // 배열의 총개수				
			timerID  = setInterval( make  , delay)
			
			function make(){
				cnt++
				if( cnt  ==n){  //if( cnt  > n-1)
					cnt  = 1
					
					$(".gallery").css("left",arrX[0]) //순간이동
				}
				make1()							
			}
				
			$("#view_box").hover(function(){
				clearInterval( timerID )
			},function(){
				timerID  = setInterval( make  , delay)	
			})	
				
			// $("#view_box").click(function(){
				// location.href=(arrURL[cnt])		
			// })	
									
				
			
			$("#right").hover(function(){
				clearInterval( timerID )
			},function(){
				timerID  = setInterval( make  , delay)	
			})	
			
			
			
			$("#left").hover(function(){
				clearInterval( timerID )
			},function(){
				timerID  = setInterval( make  , delay)	
			})	
			
			
			$("#right").click(function(){
					cnt++
				if( cnt  == n){  //if( cnt  > n-1)
					cnt  = 1
					
					$(".gallery").css("left",arrX[0]) //순간이동
				}
				make1()			
			})				
			$("#left").click(function(){
				cnt--					
				if( cnt  < 0){  //if( cnt  > n-1)
					cnt  = 2					
					$(".gallery").css("left",arrX[2]) //순간이동
				}
				make1()					
			})	
			//////////////////////
			function make1(){
				$(".gallery").stop().animate({
					left:arrX[cnt]
				},500,"easeInCubic")
				
				
				}
//				
//				clearInterval( timerID )
//				timerID  = setInterval( make  , delay)	
				
				
				
				
				
				
				
				
				
				
				
				
				$(".slide_img li:last").prependTo(".slide_img")
			$(".slide_img").css("marginLeft","-235px")
			
			$(".right").click(function(){				
				$(".slide_img").stop().animate({
					
					marginLeft:"+=37"
					
				},30,function(){
					$(".slide_img li:last").prependTo(".slide_img")
					$(".slide_img").css("marginLeft","-235px")		
					
									
				})									       
			})
			
			$(".left").click(function(){				
				$(".slide_img").stop().animate({
					marginLeft:"-=37"
				},30,function(){					
				$(".slide_img li:first").appendTo(".slide_img")
					$(".slide_img").css("marginLeft","-235px")			
				})			       
			})				
			
	});
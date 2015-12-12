/**
 * 
 */

var wc_add_to_cart_params = {
      "ajax_url" : "\/grandrestaurant\/wp-admin\/admin-ajax.php",
      "i18n_view_cart" : "View Cart",
      "cart_url" : "http:\/\/themes.themegoods2.com\/grandrestaurant\/cart\/",
      "is_cart" : "",
      "cart_redirect_after_add" : "no"
    };


var woocommerce_params = {
		"ajax_url" : "\/grandrestaurant\/wp-admin\/admin-ajax.php"
	};

var wc_cart_fragments_params = {
		"ajax_url" : "\/grandrestaurant\/wp-admin\/admin-ajax.php",
		"fragment_name" : "wc_fragments"
	};

var tgAjax = {
		"ajaxurl" : "http:\/\/themes.themegoods2.com\/grandrestaurant\/wp-admin\/admin-ajax.php",
		"ajax_nonce" : "763dd29d0d"
	};


jQuery(document).ready(function() {
        // CUSTOM AJAX CONTENT LOADING FUNCTION
        var ajaxRevslider = function(obj) {
        
          // obj.type : Post Type
          // obj.id : ID of Content to Load
          // obj.aspectratio : The Aspect Ratio of the Container / Media
          // obj.selector : The Container Selector where the Content of Ajax will be injected. It is done via the Essential Grid on Return of Content
          
          var content = "";

          data = {};
          
          data.action = 'revslider_ajax_call_front';
          data.client_action = 'get_slider_html';
          data.token = '09f6a8dcc7';
          data.type = obj.type;
          data.id = obj.id;
          data.aspectratio = obj.aspectratio;
          
          // SYNC AJAX REQUEST
          jQuery.ajax({
            type:"post",
            url:"http://themes.themegoods2.com/grandrestaurant/wp-admin/admin-ajax.php",
            dataType: 'json',
            data:data,
            async:false,
            success: function(ret, textStatus, XMLHttpRequest) {
              if(ret.success == true)
                content = ret.data;               
            },
            error: function(e) {
              console.log(e);
            }
          });
          
           // FIRST RETURN THE CONTENT WHEN IT IS LOADED !!
           return content;             
        };
        
        // CUSTOM AJAX FUNCTION TO REMOVE THE SLIDER
        var ajaxRemoveRevslider = function(obj) {
          return jQuery(obj.selector+" .rev_slider").revkill();
        };

        // EXTEND THE AJAX CONTENT LOADING TYPES WITH TYPE AND FUNCTION
        var extendessential = setInterval(function() {
          if (jQuery.fn.tpessential != undefined) {
            clearInterval(extendessential);
            if(typeof(jQuery.fn.tpessential.defaults) !== 'undefined') {
              jQuery.fn.tpessential.defaults.ajaxTypes.push({type:"revslider",func:ajaxRevslider,killfunc:ajaxRemoveRevslider,openAnimationSpeed:0.3});   
              // type:  Name of the Post to load via Ajax into the Essential Grid Ajax Container
              // func: the Function Name which is Called once the Item with the Post Type has been clicked
              // killfunc: function to kill in case the Ajax Window going to be removed (before Remove function !
              // openAnimationSpeed: how quick the Ajax Content window should be animated (default is 0.3)
            }
          }
        },30);
      });








window._wpemojiSettings = {"baseUrl":"http:\/\/s.w.org\/images\/core\/emoji\/72x72\/","ext":".png","source":{"concatemoji":"http:\/\/themes.themegoods2.com\/grandrestaurant\/wp-includes\/js\/wp-emoji-release.min.js"}};
!function(a,b,c){function d(a){var c=b.createElement("canvas"),d=c.getContext&&c.getContext("2d");return d&&d.fillText?(d.textBaseline="top",d.font="600 32px Arial","flag"===a?(d.fillText(String.fromCharCode(55356,56812,55356,56807),0,0),c.toDataURL().length>3e3):(d.fillText(String.fromCharCode(55357,56835),0,0),0!==d.getImageData(16,16,1,1).data[0])):!1}function e(a){var c=b.createElement("script");c.src=a,c.type="text/javascript",b.getElementsByTagName("head")[0].appendChild(c)}var f,g;c.supports={simple:d("simple"),flag:d("flag")},c.DOMReady=!1,c.readyCallback=function(){c.DOMReady=!0},c.supports.simple&&c.supports.flag||(g=function(){c.readyCallback()},b.addEventListener?(b.addEventListener("DOMContentLoaded",g,!1),a.addEventListener("load",g,!1)):(a.attachEvent("onload",g),b.attachEvent("onreadystatechange",function(){"complete"===b.readyState&&c.readyCallback()})),f=c.source||{},f.concatemoji?e(f.concatemoji):f.wpemoji&&f.twemoji&&(e(f.twemoji),e(f.wpemoji)))}(window,document,window._wpemojiSettings);

/******************************************
          - PREPARE PLACEHOLDER FOR SLIDER  -
 ******************************************/


var setREVStartSize = function() {
	var tpopt = new Object();
	tpopt.startwidth = 1425;
	tpopt.startheight = 650;
	tpopt.container = jQuery('#rev_slider_1_1');
	tpopt.fullScreen = "on";
	tpopt.forceFullWidth="on";

	tpopt.container.closest(".rev_slider_wrapper").css({height:tpopt.container.height()});tpopt.width=parseInt(tpopt.container.width(),0);tpopt.height=parseInt(tpopt.container.height(),0);tpopt.bw=tpopt.width/tpopt.startwidth;tpopt.bh=tpopt.height/tpopt.startheight;if(tpopt.bh>tpopt.bw)tpopt.bh=tpopt.bw;if(tpopt.bh<tpopt.bw)tpopt.bw=tpopt.bh;if(tpopt.bw<tpopt.bh)tpopt.bh=tpopt.bw;if(tpopt.bh>1){tpopt.bw=1;tpopt.bh=1}if(tpopt.bw>1){tpopt.bw=1;tpopt.bh=1}tpopt.height=Math.round(tpopt.startheight*(tpopt.width/tpopt.startwidth));if(tpopt.height>tpopt.startheight&&tpopt.autoHeight!="on")tpopt.height=tpopt.startheight;if(tpopt.fullScreen=="on"){tpopt.height=tpopt.bw*tpopt.startheight;var cow=tpopt.container.parent().width();var coh=jQuery(window).height();if(tpopt.fullScreenOffsetContainer!=undefined){try{var offcontainers=tpopt.fullScreenOffsetContainer.split(",");jQuery.each(offcontainers,function(e,t){coh=coh-jQuery(t).outerHeight(true);if(coh<tpopt.minFullScreenHeight)coh=tpopt.minFullScreenHeight})}catch(e){}}tpopt.container.parent().height(coh);tpopt.container.height(coh);tpopt.container.closest(".rev_slider_wrapper").height(coh);tpopt.container.closest(".forcefullwidth_wrapper_tp_banner").find(".tp-fullwidth-forcer").height(coh);tpopt.container.css({height:"100%"});tpopt.height=coh;}else{tpopt.container.height(tpopt.height);tpopt.container.closest(".rev_slider_wrapper").height(tpopt.height);tpopt.container.closest(".forcefullwidth_wrapper_tp_banner").find(".tp-fullwidth-forcer").height(tpopt.height);}
};

/* CALL PLACEHOLDER */
setREVStartSize();


var tpj=jQuery;
tpj.noConflict();
var revapi1;

tpj(document).ready(function() {

	if(tpj('#rev_slider_1_1').revolution == undefined){
		revslider_showDoubleJqueryError('#rev_slider_1_1');
	}else{
		revapi1 = tpj('#rev_slider_1_1').show().revolution(
				{ 
					dottedOverlay:"none",
					delay:7000,
					startwidth:1425,
					startheight:650,
					hideThumbs:200,

					thumbWidth:100,
					thumbHeight:50,
					thumbAmount:1,


					simplifyAll:"off",

					navigationType:"none",
					navigationArrows:"none",
					navigationStyle:"custom",

					touchenabled:"on",
					onHoverStop:"off",
					nextSlideOnWindowFocus:"off",

					swipe_threshold: 75,
					swipe_min_touches: 1,
					drag_block_vertical: false,



					keyboardNavigation:"off",

					navigationHAlign:"center",
					navigationVAlign:"bottom",
					navigationHOffset:0,
					navigationVOffset:20,

					soloArrowLeftHalign:"left",
					soloArrowLeftValign:"center",
					soloArrowLeftHOffset:20,
					soloArrowLeftVOffset:0,

					soloArrowRightHalign:"right",
					soloArrowRightValign:"center",
					soloArrowRightHOffset:20,
					soloArrowRightVOffset:0,

					shadow:0,
					fullWidth:"off",
					fullScreen:"on",

					spinner:"spinner3",

					stopLoop:"off",
					stopAfterLoops:0,
					stopAtSlide:1,

					shuffle:"off",


					forceFullWidth:"on",
					fullScreenAlignForce:"off",
					minFullScreenHeight:"",
					hideTimerBar:"on",
					hideThumbsOnMobile:"off",
					hideNavDelayOnMobile:1500,
					hideBulletsOnMobile:"off",
					hideArrowsOnMobile:"off",
					hideThumbsUnderResolution:0,

					fullScreenOffsetContainer: "",
					fullScreenOffset: "",
					hideSliderAtLimit:0,
					hideCaptionAtLimit:0,
					hideAllCaptionAtLilmit:0,
					startWithSlide:0          });



	}
}); /*ready*/
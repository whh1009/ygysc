 define(function(require,exports,module){
 	require('../zepto');
 	require("../swiper.min");
 	var swiper = new Swiper('.adv',{
	    spaceBetween: 30,
	    centeredSlides: true,
	    autoplay: 4000,
	    autoplayDisableOnInteraction: false,
	    pagination : '.swiper-pagination'
	});
 });
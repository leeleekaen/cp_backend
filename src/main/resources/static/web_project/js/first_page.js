$(function(){

    setInterval(function(){
    	if($(document).scrollTop() > 600){
    		$('#navBox').slideDown(600);
    	}else{
    		$('#navBox').slideUp(600);
    	}
    },1);

    $('#login').click(function(){
    	$('#passwordBox').slideDown(200);
    });

    $('#closeBox').click(function(){
    	$('#passwordBox').hide();
    });

	
	$(".goods_1_img_liu").hover(function() {
		
		$(".goods_1_img_box_liu,.goods_1_img_text_liu").stop();
		
		$(".goods_1_img_box_liu").animate({
			width: '80%',
	        height: '50%',
	        opacity: '1'
		},500);
		
		
		$(".goods_1_img_text_liu").animate({
			top: '-50px'
		},500);
		
	},function(){
		
		$(".goods_1_img_box_liu,.goods_1_img_text_liu").stop();
		
		$(".goods_1_img_box_liu").animate({
			width: '0%',
	        height: '0%',
	        opacity: '0'
		},500);
		
		$(".goods_1_img_text_liu").animate({
			top: '0'
		},500);
		
	});
	
	
	
	
	$(".goods_2_img_liu").hover(function() {
		
		$(".goods_2_img_box_liu,.goods_2_img_text_liu").stop();
		
		$(".goods_2_img_box_liu").animate({
			width: '80%',
	        height: '50%',
	        opacity: '1'
		},500);
		
		
		$(".goods_2_img_text_liu").animate({
			top: '-50px'
		},500);
		
	},function(){
		
		$(".goods_2_img_box_liu,.goods_2_img_text_liu").stop();
		
		$(".goods_2_img_box_liu").animate({
			width: '0%',
	        height: '0%',
	        opacity: '0'
		},500);
		
		$(".goods_2_img_text_liu").animate({
			top: '0'
		},500);
		
	});
	
	
	
	$(".goods_3_img_liu").hover(function() {
		
		$(".goods_3_img_box_liu,.goods_3_img_text_liu").stop();
		
		$(".goods_3_img_box_liu").animate({
			width: '80%',
	        height: '50%',
	        opacity: '1'
		},500);
		
		
		$(".goods_3_img_text_liu").animate({
			top: '-50px'
		},500);
		
	},function(){
		
		$(".goods_3_img_box_liu,.goods_3_img_text_liu").stop();
		
		$(".goods_3_img_box_liu").animate({
			width: '0%',
	        height: '0%',
	        opacity: '0'
		},500);
		
		$(".goods_3_img_text_liu").animate({
			top: '0'
		},500);
		
	});
	
	
	
});

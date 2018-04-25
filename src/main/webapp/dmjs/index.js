require(['jquery'],function(){
$(function(){
	//所有全局变量
	var img_flag = 1;
	
	/*
	 * TODO
	 * ajax请求后台数据然后显示到前台上面
	 */
	init();
   function init(){
   	//测试代码
/*	$newdiv = $("#type-item").clone();
	$("#type-item").after($newdiv);
	$newdiv = $("#type-item").clone();
	$("#type-item").after($newdiv);
		$newdiv = $("#type-item").clone();
	$("#type-item").after($newdiv);
		$newdiv = $("#type-item").clone();
	$("#type-item").after($newdiv);
		$newdiv = $("#type-item").clone();
	$("#type-item").after($newdiv);
		$newdiv = $("#type-item").clone();
	$("#type-item").after($newdiv);
		$newdiv = $("#type-item").clone();
	$("#type-item").after($newdiv);
	$newdiv = $("#type-item").clone();
	$("#type-item").after($newdiv);*/
	
	/*测试代码*/
/*	$ndiv = $(".left .item").clone();
	$(".left .item").after($ndiv);
		$ndiv = $(".left .item").clone();
	$(".left .item").after($ndiv);
	$ndiv = $("#item").clone();
	$("#item").after($ndiv);
	$ndiv = $("#item").clone();
	$("#item").after($ndiv);*/
	
	//有用的部分
	//第一个span默认样式
	$("#1").css("background-color","rgba(189,45,48,.5)");
	$("#hot-job").addClass("after_c1");
	
	/*var url = CONSTANT.root_url+'/imgs/index_header_bottom/ban_1.jpg';
 	$(".showcase").css("background-image","url("+url+")");*/
}
   
   
   
   //图片切换
   function changeImg(){
     if(img_flag>=5){
     	img_flag = 1;
     	var url = CONSTANT.root_url+'/imgs/index_header_bottom/ban_1.jpg';
     	$(".showcase").css("background-image","url("+url+")");
     	$(".content>span").css("background-color","rgba(51,51,51,.5)");
     	$("#1").css("background-color","rgba(189,45,48,.5)");
     }else{
     	img_flag++;
     	var url = CONSTANT.root_url+"/imgs/index_header_bottom/ban_"+img_flag+".jpg";
     	$(".showcase").css("background-image","url("+url+")");
     	$(".content>span").css("background-color","rgba(51,51,51,.5)");
     	$("#"+img_flag).css("background-color","rgba(189,45,48,.5)");
     }
   }
  var st = setInterval(changeImg,4000);
   //绑定hover事件
	$(".type-item").hover(function(){
		$($(this).find("#type-list")).css("display","block");
		$(".banner").css("z-index","-3");
		$(".company-show").css("z-index","-3");
	},function(){
		$($(this).find("#type-list")).css("display","none");
		$(".banner").css("z-index","1");
		$(".company-show").css("z-index","1");
	});
	//绑定点击事件
	$(".content>span").mouseover(function(e){
		$(".content>span").css("background-color","rgba(51,51,51,.5)");
		$(e.target).css("background-color","rgba(189,45,48,.5)");
		img_flag = $(e.target).attr("id");
		var url = CONSTANT.root_url+"/imgs/index_header_bottom/ban_"+img_flag+".jpg";
		$(".showcase").css("background-image","url("+url+")");
	});
	
	$("#hot-job").click(function(){
		$("#newly").hide();
	/*$("#newly").fadeOut(500);*/
		$("#new-job").removeClass("after_c2");
		if($("#hot-job").hasClass("after_c1")){
		$("#hot-job").removeClass("after_c1");
		}else{
			$("#hot-job").addClass("after_c1");
			$("#hot").fadeIn(1000);
		}
	});
	$("#new-job").click(function(){
			$("#hot").hide();
		/*$("#hot").fadeOut(500);*/
		$("#hot-job").removeClass("after_c1");
		if($("#new-job").hasClass("after_c2")){
		}
		else{
		$("#hot-job").removeClass("after_c1");
		$("#new-job").addClass("after_c2");
		$("#newly").fadeIn(1000);
		}
	});
	
});
});


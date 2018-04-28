require(['layer'],function(layer){
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


	//请求热门职位

	
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
		$(".banner").css("z-index","1");
		$(".company-show").css("z-index","1");
        $($(this).find("#type-list")).css("z-index","999");
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
	//绑定事件
    $(".sendResume").live("click",function (e) {
        var $obj = $(e.target);
        var email = $("#loginName").val().trim();
        var entId = $obj.attr("entid");
        var pjId = $obj.attr("data");
        console.log("send"+$("#internId").val());
        var str = $("#internId").val();
        if(str==''){
            layer.msg("您没有登录或者当前账户不是实习生身份，无法投递简历",{icon:05});
            return;
        } //投递简历
        $.ajax({
            async:false,
            type : "post",
            url : CONSTANT.root_url + "/entResume/intern/createEntResume?email="+email+"&entId="+entId+"&pjId="+pjId,
            dataType : "json",
            success : function(result) {
            	console.log(result.success);
            	if(!result.success){
                    layer.msg("不能重复投递",{icon:5});
				}else{
                layer.msg("投递成功，静候佳音",{icon:6});
            	}
            },
            error: function() {
                layer.msg("服务器出错，投递失败");
            }
        });
    });
    //搜索
/*	$("#btn_srh").click(function(){

	});*/

	
});
});


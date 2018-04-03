require(['jquery'],function(){
	$(function(){
	$("#stu-body").hover(function(){
		$("#stu-dd").css("display","block");
		$("#jiantou").css("transform","rotate(180deg)");
	},function(){
		$("#stu-dd").css("display","none");
		$("#jiantou").css("transform","rotate(360deg)");
	 
	});
});
});

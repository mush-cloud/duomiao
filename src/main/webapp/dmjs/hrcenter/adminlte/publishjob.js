require([ 'layer','jquery'],function(layer){
	$(function(){
		if($("#entid").val()==null||$("#entid").val()==''){
			layer.msg("您的公司没有登记，无法发布职位",{time: 4000, icon:5});
		}
		//提交修改
		$("#publishjobsubmit").click(function(){
            if($("#entid").val()==null||$("#entid").val()==''){
                layer.msg("您的公司没有登记，无法发布职位",{time: 4000, icon:5});
                return;
            }
		/*	if($("#").val() == ''){
				layer.msg("密码不能为空");
				return;
			}*/
			$.ajax({
				async:false,
				type : "post",
				url : CONSTANT.root_url + "/pubJob/hr/createPubJob",
				dataType : "json", 
				data:$("#jobinfo").serialize(),
				success : function(result) {
				layer.alert("发布成功");
				},
				error : function(){
					layer.msg("服务器出错!");
				}
			});
		});
	});
	
});
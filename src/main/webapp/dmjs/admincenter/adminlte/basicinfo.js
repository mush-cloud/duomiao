require([ 'layer','jquery'],function(layer){
	$(function(){
		//提交修改
		$("#basicinfoedit").click(function(){
            if($("#adminName").val() == ''){
                layer.msg("用户不能为空");
                return;
            }
			if($("#mima").val() == ''){
				layer.msg("密码不能为空");
				return;
			}
			$.ajax({
				async:false,
				type : "post",
				url : CONSTANT.root_url + "/admin/adminlte/doEditMainInfo",
				dataType : "json", 
				data:$("#basicinfo").serialize(),
				success : function(result) {
				layer.alert("修改成功");
				},
				error : function(){
					layer.msg("服务器出错!");
				}
			});
		});
		
		
		
	});
	
});
require([ 'layer','jquery'],function(layer){
	$(function(){
		init();//初始化数据
		function  init() {
		    if($("#eId").val()==null){
                layer.msg("您还没有注册公司!",{time: 4000, icon:5});
		        return;
            }
            $.ajax({
                async:false,
                type : "post",
                url : CONSTANT.root_url + "/entInfo/hr/getMyEntInfo?id="+$("#eId").val().trim(),
				dataType:"json",
                success : function(data) {
               /* 	console.log(data.proExperience);*/
                    $("#eId").val(data.id);
                      $("#eniname").val(data.eniname);
                    $("#resume").val(data.resume);
                    $("#address").val(data.address);
                    $("#employeenum").val(data.employeenum);
                    $("#tel").val(data.tel);
                    $("#industry").val(data.industry);
                    $("#uniscid").val(data.uniscid);
                    $("#regCapital").val(data.regCapital);
                    $("#regtime").val(data.regtime);
                    $("#introduction").val(data.introduction);
                    $("#welfare").val(data.welfare);
                },
                error : function(){
                    layer.msg("没有公司相关信息!",{time: 4000, icon:5});
                }
            });
        }

		//提交修改
		$("#entinfosubmit").click(function(){
			//TODO 输入验证
			if($("#eId").val()==''){
				//执行注册公司
                $.ajax({
                    async:false,
                    type : "post",
                    url : CONSTANT.root_url + "/entInfo/hr/addEntInfo",
                    dataType:"json",
                    data:$("#entinfo").serialize(),
                    success : function(result) {
                        layer.alert("创建成功");
                    },
                    error : function(){
                        layer.msg("服务器出错!，创建失败");
                    }
                });
			}else{
				//修改公司
                $.ajax({
                    async:false,
                    type : "post",
                    url : CONSTANT.root_url + "/entInfo/hr/editEntInfo",
                    dataType:"json",
                    data:$("#entinfo").serialize(),
                    success : function(result) {
                        layer.alert("修改成功");
                    },
                    error : function(){
                        layer.msg("服务器出错,修改失败!");
                    }
                });
			}

	/*		if($("#mima").val() == ''){
				layer.msg("密码不能为空");
				return;
			}
			$.ajax({
				async:false,
				type : "post",
				url : CONSTANT.root_url + "/intern/adminlte/doEditMainInfo",
				dataType : "json",
				data:$("#basicinfo").serialize(),
				success : function(result) {
				layer.alert("修改成功");
				$(".user-image").attr("src",imgurl);
				$(".img-circle").attr("src",imgurl);
				},
				error : function(){
					layer.msg("服务器出错!");
				}
			});*/
		});
		
		
		
	});
	
});
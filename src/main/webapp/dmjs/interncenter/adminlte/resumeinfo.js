require([ 'layer','jquery'],function(layer){
	$(function(){
		init();//初始化数据
		function  init() {
            $.ajax({
                async:false,
                type : "post",
                url : CONSTANT.root_url + "/resume/intern/getMyResumeInfo?email="+$(".email").text().trim(),
				dataType:"json",
                success : function(data) {
                	console.log(data.proExperience);
                    $("#rId").val(data.id);
                      $("#name").val(data.name);
                    $("#sex").val(data.sex);
                    $("#age").val(data.age);
                    $("#hp").val(data.hp);
                    $("#tel").val(data.tel);
                    $("#major").val(data.major);
                    $("#colloge").val(data.colloge);
                    $("#academic").val(data.academic);
                    $("#jobName").val(data.jobName);
                    $("#workplace").val(data.workplace);
                    $("#motto").val(data.motto);
                    $("#education").val(data.education);
                    $("#certReward").val(data.certReward);
                    $("#workExperience").val(data.workExperience);
                    $("#proExperience").val(data.proExperience);
                    $("#skill").val(data.skill);
                    $("#valuation").val(data.valuation);

                },
                error : function(){
                    layer.msg("服务器出错!");
                }
            });
        }
        function checkAge(age){
		    var format = /^[123456789]\d$/;
		   return format.test(age);
        }
        function checkPhone(phone){
            var format = /^1[34578]\d{9}$/;
            return format.test(phone);
        }
        function checkSex(sex) {
            if(sex=="男"||sex=="女"){
                return true;
            }else{
                return false;
            }
        }
		//提交修改
		$("#resumeinfosubmit").click(function(){
		    console.log($("#name").val());
		    if($("#name").val()=='' ||$("#sex").val()==''||$("#hp").val()==''||$("#major").val()==''||$("#colloge").val()==''||$("#skill").val()==''){
                layer.msg("加*的数据不能为空");
                return;
            }
		    if(!checkAge($("#age").val())){
		        layer.msg("年龄只能是2位数字,不能为0开头");
		        return;
            }
            if(!checkPhone($("#tel").val())){
                layer.msg("手机号码格式错误1[34578]开头的11数字");
                return;
            }if(!checkSex($("#sex").val())){
                layer.msg("性别：男或女");
                return;
            }


            //TODO 输入验证

			if($("#rId").val()==''){
				//执行创建简历
                $.ajax({
                    async:false,
                    type : "post",
                    url : CONSTANT.root_url + "/resume/intern/doMakeResumeInfo",
                    dataType:"json",
                    data:$("#resumeinfo").serialize(),
                    success : function(result) {
                        layer.alert("创建成功");
                    },
                    error : function(){
                        layer.msg("服务器出错!");
                    }
                });
			}else{
				//修改简历
                $.ajax({
                    async:false,
                    type : "post",
                    url : CONSTANT.root_url + "/resume/intern/doEditResumeInfo",
                    dataType:"json",
                    data:$("#basicinfo").serialize(),
                    success : function(result) {
                        layer.alert("修改成功");
                    },
                    error : function(){
                        layer.msg("服务器出错!");
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
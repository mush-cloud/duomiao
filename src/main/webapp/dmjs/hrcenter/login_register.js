require(
		[ 'layer','util'],
		function(layer,util) {
			$(function() {			
				// 绑定a标签点击事件
				$(".lr-box-choice a").click(function(e) {
					$(".lr-box-choice a").removeClass("after");
					$(e.target).addClass("after");
					if ($(e.target).text() == "登录") {
						$(".lr-box-main-r form").hide();
						$(".lr-box-main-r").hide();
						$(".lr-box-main-l").show();
						$(".lr-box-main-l form").show();
					} else {
						$(".lr-box-main-l form").hide();
						$(".lr-box-main-l").hide();
						$(".lr-box-main-r").show();
						$(".lr-box-main-r form").show();
					}
				});
				// 初始化
				init();
				function init() {
					$(".special span").text(createCode());
				}
				// 生成随机验证码
				function createCode() {
					code = "";
					var codeLength = 4;// 验证码的长度
					var random = new Array('0', '1', '2', '3', '4', '5', '6', '7', '8','9', 'A',
							'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
							'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
							'V', 'W', 'X', 'Y', 'Z');// 随机数
					for (var i = 0; i < codeLength; i++) {// 循环操作
						var index = Math.floor(Math.random() * 36);// 取得随机数的索引（0~35）
						// ,向下取整
						code += random[index];// 根据索引取得随机数加到code上
					}
					return code;
				}
				// 绑定span事件
				$(".special span").click(function() {
					$(".special span").text(createCode());
				});
				function testCode(str) {
					var code = $(".special span").text();
					if(code.length>4){
						code = code.substring(0,4);
					}
					if (str == code) {
						return true;
					}
					return false;
				}
				//重名校验
				function haveSameEmail(name){
					var end = false;
					$.ajax({
						async:false,
						type : "get",
						url : CONSTANT.root_url + "/hr/doCheckSameName?hrName="+name,
						dataType : "json",
						success : function(result) {
							end = result.success;
						}
					});
					return end;
				}
				// 判断登录是否合法
				function checkLogin() {
                 if($("#loginName").val() == ''){
                	 layer.msg("用户名不能为空!");
                	 return false;
                 }
                 if($("#loginPwd").val() == ''){
                	 layer.msg("密码不能为空!");
                	 return false;
                 }
                 if(!testCode($("#verify").val())){
                	 layer.msg("验证码错误!");
                	 return false;
                 }
                 return true;
				}
                $("input[type='text']").blur(function(e){
                	if($(e.target).attr("id") == "loginName"){
                		 if(!util.testName($("#loginName").val())){
                        	 layer.msg("用户名可能不存在!");
                        	 return;
                         }
                	}else if($(e.target).attr("id") == "loginName_r"){
                		if(!util.testName($("#loginName_r").val())){
               			 console.log($("#loginName_r").val()+" 邮箱");
                       	 layer.msg("注册名只能以字母开头(5位以上)!");
                       	 return;
                        }
                		if(haveSameEmail($("#loginName_r").val())){
               			 layer.msg("该用户名已注册!");
               		 }
                	}
                	else if($(e.target).attr("id") == "loginPwd"){
                		if(!util.testMiMa($("#loginPwd").val())){
                			console.log($("#loginPwd").val()+" 密码");
                       	 layer.msg("密码只能是6-8的数字或字母!");                    
                        }
                		return;
                	}else if($(e.target).attr("id") == "loginPwd_r"){
                		if(!util.testMiMa($("#loginPwd_r").val())){
                			console.log($("#loginPwd_r").val()+" 密码");
                       	 layer.msg("密码只能是6-8的数字或字母!");                    
                        }
                		return;
                	}else if($(e.target).attr("id") == "verify"){
                		if(!testCode($("#verify").val())){
                			console.log($("#verify").val()+" 验证码");
                       	 layer.msg("验证码错误!");                       	 
                        }      
                	}
                	else{
                		if(!testCode($("#verify_r").val())){
                			console.log($("#verify_r").val()+" 验证码");
                       	 layer.msg("验证码错误!");                       	 
                        }                     
                	}
                	
                });
				// 判断注册是否合法
				function checkRegister() {
                 if($("#loginName_r").val() == ''){
                	 layer.msg("用户名不能为空!");
                	 return false;
                 }
                 if(!util.testName($("#loginName_r").val())){
                	 layer.msg("用户名只能以字母开头(5位以上)!");
                	 return false;
                 }
                 if(haveSameEmail($("#loginName_r").val())){
                	 layer.msg("该用户名已注册!");
                	 return false;
                 }
                 if(!util.testMiMa($("#loginPwd_r").val())){
                	 layer.msg("密码只能是6-8位的数字或字母!");
                	 return false;
                 }
                 if(!testCode($("#verify_r").val())){
                	 layer.msg("验证码错误!");
                	 return false;
                 }
                 return true;
				}
			
				// 登录提交
				$(".btn_lr").click(function(e) {
					if ($(e.target).attr("id") == 'btn_l') {
						if(!checkLogin()){
							return;
						}
						$.ajax({// 默认异步,表单序列化方式传输
							type : "post",
							url : CONSTANT.root_url + "/hr/doLogin",
							data : $("#form_l").serialize(),
							dataType : "json",
							success : function(result) {
								if(result.success){
									window.location.href = CONSTANT.root_url+"/public/index";
								}else{
									layer.msg("用户名或密码错误！");
								}
							}

						});
						return;
					}else if($(e.target).attr("id") == 'btn_r'){
						//注册
						if(!checkRegister()){
							return;
						}
						$.ajax({// 默认异步
							type : "post",
							url : CONSTANT.root_url + "/hr/doRegister",
							data : $("#form_r").serialize(),
							dataType : "json",
							success : function(result) {
								if(result.success){
									layer.alert("注册成功！");
									$(".l-button").click();
								}else{
									layer.msg("注册失败!");
								}
								
							},error:function(){
								layer.msg("服务器错误,注册失败!");
							}

						});
					}
				});
				//键盘事件,对整个文本对象
				$(document).keydown(function(e){
					if(e.keyCode == '13'){
					if($(".lr-box-main-l").css("display") == "none"){
						$("#btn_r").click();
					}else{
						$("#btn_l").click();
					}
					}
			
				});
			});

		});

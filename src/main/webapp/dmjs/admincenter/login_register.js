require(
		[ 'layer','jquery'],
		function(layer) {
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
				// 判断登录是否合法
				function checkLogin() {
                 if($("#loginName").val() == ''){
                	 layer.msg("账户名不能为空!");
                	 return false;
                 }
                 if($("#loginPwd").val() == ''){
                	 layer.msg("密码不能为空!");
                	 return false;
                 }
                 return true;
				}
			
				// 登录提交
				$(".btn_lr").click(function(e) {
						if(!checkLogin()){
							return;
						}
						$.ajax({// 默认异步,表单序列化方式传输
							type : "post",
							url : CONSTANT.root_url + "/admin/doLogin",
							data : $("#form_l").serialize(),
							dataType : "json",
							success : function(result) {
								if(result.success){
									window.location.href = CONSTANT.root_url+"/admin/adminlte/enIndex";
								}else{
									layer.msg("用户名或密码错误！");
								}
							}

						});
						return;
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

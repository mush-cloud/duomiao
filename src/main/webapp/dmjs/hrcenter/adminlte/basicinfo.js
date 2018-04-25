require([ 'layer','util'],function(layer,util){
	$(function(){
		//临时展示上传图片
		//全局变量
		var imgurl;
		$(".shangchuan").change(function(){
			var file = this.files[0];
			var reader = new FileReader();//读取，输入流
			reader.readAsDataURL(file);//将读取到的文件编码成Data URL
			reader.onload = function(e){//成功读取后执行=回调函数
				$("#imgtx").attr("src",this.result);
			}
		});
		//上传图片
		$("#uploadFile").click(function(){
			var begin = new Date();
			var b = begin.getMinutes();
			var arr =$(".shangchuan").val();
			if(arr.length<1){
				layer.msg("文件不能为空！");
				return;
			}
			var formData = new FormData($("#txsc")[0]);//上传文件的文件流无法序列化
			$.ajax({
				async:false,
				type : "post",
				url : CONSTANT.root_url + "/hr/adminlte/doUpImg",
				dataType : "json",
				cache: false,  
				data:formData,
				contentType: false,  //文件类型
			    processData: false, //默认是true,设为false是不对data进行处理
				success : function(result) {
					imgurl = CONSTANT.root_url +result.message.imgPath;
					$("#imgtx").attr("src",CONSTANT.root_url +result.message.imgPath);
					$("#imgUrl").val(result.message.imgPath);
					var end = new Date();
					var a = end.getMilliseconds();
					var count = end.getMilliseconds()-b;
					layer.alert("☺上传成功"+"总用时: "+count+"ms");
				},
				error : function(){
					layer.msg("上传失败!");
				}
			});
		});
		//提交修改
		$("#basicinfoedit").click(function(){
			if($("#mima").val() == ''){
				layer.msg("密码不能为空");
				return;
			}
            if(!util.testMiMa($("#mima").val())){
                layer.msg("密码格式为6-8位的数字或字母");
                return;
            } if(!util.testTel($("#tel").val())){
                layer.msg("号码格式错误（7-11位）");
                return;
            }
			$.ajax({
				async:false,
				type : "post",
				url : CONSTANT.root_url + "/hr/adminlte/doEditMainInfo",
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
			});
		});
		
		
		
	});
	
});
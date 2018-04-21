require([ 'layer'],function(layer){
	$(function(){
            $("#myResumeInfo").bootstrapTable({ // 对应table标签的id
                method: 'post',
                url: CONSTANT.root_url + "/entResume/hr/getValidEntResumes", // 获取表格数据的url
                cache: false, // 设置为 false 禁用 AJAX 数据缓存， 默认为true
                striped: true,  //表格显示条纹，默认为false
                pagination: true, // 在表格底部显示分页组件，默认false
                pageList: [10, 20], // 设置页面可以显示的数据条数
                pageSize: 10, // 页面数据条数
                pageNumber: 1, // 首页页码
                sidePagination: 'server', // 设置为服务器端分页
                queryParams: function (params) { // 请求服务器数据时发送的参数，可以在这里添加额外的查询参数，返回false则终止请求

                    return {
                        pageSize: params.limit, // 每页要显示的数据条数
                        offset: params.offset, // 每页显示数据的开始行号
                        sort: params.sort, // 要排序的字段
                        sortOrder: params.order, // 排序规则
                        dataId: $("#dataId").val() // 额外添加的参数
                    }
                },
                sortName: 'id', // 要排序的字段
                sortOrder: 'desc', // 排序规则
             /*   responseHandler:function (res) {
                    layer.alert(res.DATA);
                    return res.DATA;
                },*///返回数据处理
                columns: [
                  {
                        field: 'id', // 返回json数据中的name
                        title: '编号', // 表格表头显示文字
                        align: 'center', // 左右居中
                        valign: 'middle' // 上下居中
                    }, {
                        field: 'pjName',
                        title: '简历投递者',
                        align: 'center',
                        valign: 'middle'
                    }, {
                        field: 'entName',
                        title: '投递时间',
                        align: 'center',
                        valign: 'middle'
                    }, {
                        title: "操作",
                        align: 'center',
                        valign: 'middle',
                        width: 160, // 定义列的宽度，单位为像素px
                        formatter: function (value, row, index) {
                            return '<button class="btn btn-primary btn-sm" onclick="del(\'' + row.stdId + '\')">删除</button> <button class="btn btn-primary btn-sm" onclick="del(\\\'\' + row.stdId + \'\\\')">查看</button>';
                        }
                    }
                ],
                onLoadSuccess: function () {  //加载成功时执行
                    console.info("加载成功");
                },
                onLoadError: function () {  //加载失败时执行
                    console.info("加载数据失败");
                }

            });


      /*  //提交修改
		$("#basicinfoedit").click(function(){
			if($("#mima").val() == ''){
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
			});
		});*/
		
		
		
	});
	
});
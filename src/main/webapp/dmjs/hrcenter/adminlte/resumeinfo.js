require([ 'layer'],function(layer){
	$(function(){
            $("#myResumeInfo").bootstrapTable({ // 对应table标签的id
                method: 'post',
                url: CONSTANT.root_url + "/entResume/hr/getValidEntResumes", // 获取表格数据的url
                cache: false, // 设置为 false 禁用 AJAX 数据缓存， 默认为true
                striped: true,  //表格显示条纹，默认为false
                pagination: true, // 在表格底部显示分页组件，默认false
                pageList: [5,10,20], // 设置页面可以显示的数据条数
                pageSize: 10, // 页面数据条数
                pageNumber: 1, // 首页页码
                sidePagination: 'client', // 设置为服务器端分页
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
                        title: '序号', // 表格表头显示文字
                      formatter: function (value, row, index) {//field对应的数据,field对应的数据,0,1,2
                          var options = $("#myResumeInfo").bootstrapTable('getOptions');
                          return options.pageSize*(options.pageNumber-1)+index+1;
                          // return index+1;
                      },
                        align: 'center', // 左右居中
                        valign: 'middle' // 上下居中
                    }, {
                        field:'publishJob',
                        title: '职位名称',
                        align: 'center',
                        valign: 'middle',
                        formatter: function (value, row, index) {//field对应的数据,field对应的数据,0,1,2
                            if(value!=null){
                                return value.jobName;
                            }else {
                                return "";
                            }
                            // return index+1;
                        }
                    },
                    {
                        field: 'sex',
                        title: '投递者性别',
                        align: 'center',
                        valign: 'middle'
                    }, {
                        field: 'age',
                        title: '年龄',
                        align: 'center',
                        valign: 'middle'
                    },
                    {
                        field:'academic',
                        title: '学历',
                        align: 'center',
                        valign: 'middle'
                    },
                    {
                        title: "操作",
                        align: 'center',
                        valign: 'middle',
                        width: 160, // 定义列的宽度，单位为像素px
                        formatter: function (value, row, index) {
                            return '<button class="btn btn-primary btn-sm" onclick="del(\'' + row.id + '\')">删除</button> <button class="btn btn-primary btn-sm" onclick="check(\'' + row.riId + '\')">查看</button>';
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
window.del = function (id) {
    $.ajax({
        async:false,
        type : "post",
        url : CONSTANT.root_url + "/entResume/hr/updateForFakeDel?id="+id,
        dataType : "json",
        success : function(result) {
            /*	console.log(result.success);*/
            if(!result.success){
                layer.msg("删除失败",{icon:5});
            }else{
                layer.msg("删除成功",{icon:6});
            }
        },
        error: function() {
            layer.msg("服务器出错，删除失败");
        }
    });
}
        window.check = function (id) {
            $.ajax({
                async:false,
                type : "post",
                url : CONSTANT.root_url + "/entResume/hr/checkResume?id="+id,
                dataType : "json",
                success : function(data) {
                    /*	console.log(result.success);*/
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
                    layer.open({
                        type: 1,
                        shade: false,
                        title: '简历信息', //不显示标题
                        area: ['800px', '600px'],
                        content: $('#resumeCheck'), //捕获的元素，注意：最好该指定的元素要存放在body最外层，否则可能被其它的相对元素所影响
                        cancel:function(){}
                    });
                },
                error: function() {
                    layer.msg("服务器出错，获取数据失败");
                }
            });
        }


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
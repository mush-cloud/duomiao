require([ 'layer','util'],function(layer,util){
	$(function(){
        $("#hrList").bootstrapTable({ // 对应table标签 的id
            method: 'post',
            url: CONSTANT.root_url + "/admin/searchHrList", // 获取表格数据的url//条件start,length
            cache: false, // 设置为 false 禁用 AJAX 数据缓存， 默认为true
            striped: true,  //表格显示条纹，默认为false
            pagination: true, // 在表格底部显示分页组件，默认false
            pageList: [5,10,20,30], // 设置页面可以显示的数据条数
            pageSize: 2, // 页面数据条数
            pageNumber: 1, // 首页页码
            sidePagination: 'server', // 设置为服务器端分页
            showRefresh:true,//刷新按钮
            showColumns:true,
            clickToSelect: true,//是否启用点击选中行
            toolbarAlign:'right',//工具栏对齐方式
            buttonsAlign:'right',//按钮对齐方式
            /*toolbar:'#toolbar',//指定工作栏*/
            search:false,//表格搜素客户端
            queryParams: function (params) {
                // 请求服务器数据时发送的参数，可以在这里添加额外的查询参数，返回false则终止请求
                return {
                    pageNumber:this.pageNumber,
                    pageSize: this.pageSize, // 每页要显示的数据条数
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
                    //field: 'Number',//可不加
                    title: '序号',//标题  可不加
                    formatter: function (value, row, index) {//field对应的数据,field对应的数据,0,1,2
                        var options = $("#hrList").bootstrapTable('getOptions');
                        return options.pageSize*(options.pageNumber-1)+index+1;
                       // return index+1;
                    },
                    align: 'center', // 左右居中
                    valign: 'middle' // 上下居中
                },
                {
                    field: 'hrName', // 返回json数据中的name
                    title: '用户名', // 表格表头显示文字
                    align: 'center', // 左右居中
                    valign: 'middle' // 上下居中
                }, {
                    field: 'enterpriseInfo',
                    title: '登记企业',
                    formatter: function (value, row, index) {
                        return row.enterpriseInfo.eniname;
                    },
                    align: 'center',
                    valign: 'middle'
                },
                {
                    field: 'tel',
                    title: '手机号码',
                    align: 'center',
                    valign: 'middle'
                }, {
                    field: 'regtime',
                    title: '注册时间',
                    formatter: function (value, row, index) {
                        return util.dateFormat(value,"yyyy-MM-dd hh:mm:ss");
                    },
                    align: 'center',
                    valign: 'middle'
                }, {
                    title: "操作",
                    align: 'center',
                    valign: 'middle',
                    width: 160, // 定义列的宽度，单位为像素px
                    formatter: function (value, row, index) {
                        return '<button class="btn btn-primary btn-sm" onclick="delEnt(\''+row.id+'\')">删除</button>';
                    }
                }
            ],
            locale:'zh-CN',//中文支持,
            onLoadSuccess: function () {  //加载成功时执行
                console.info("加载成功");
            },
            onLoadError: function () {  //加载失败时执行
                console.info("加载数据失败");
            }

        });
	});
	
});
function  delEnt(id) {
    console.log("del");
    $.ajax({
        async:false,
        type : "post",
        url : CONSTANT.root_url + "/admin/delHr?id="+id,
        dataType : "json",
        data:$("#basicinfo").serialize(),
        success : function(result) {
            layer.alert("删除成功");
            //刷新
            $("#hrList").bootstrapTable("refreshOptions",{pageNumber:1,pageSize:10});//便可以了
        },
        error : function(){
            layer.msg("服务器出错!");
        }
    });
}
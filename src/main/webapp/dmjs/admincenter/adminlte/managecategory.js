require([ 'layer'],function(layer){
	$(function(){
        /*$("#subBaseCate").on('click',function () {
            $.ajax({// 默认异步
                type : "post",
                url : CONSTANT.root_url + "/posCate/admin/addBasePosCate",
                data : $("#baseCateAdd").serialize(),
                dataType : "json",
                async:false,
                success : function(result) {
                    if(result.success){
                        layer.alert("添加成功！");
                    }else{
                        layer.msg("添加失败!");
                    }

                },error:function(){
                    layer.msg("服务器错误,添加失败!");
                }

            });
        });*/
	    $("#addBaseCat").click(function () {
            layer.open({
                type: 1,
                shade: false,
                title: '添加一级类', //不显示标题
                area: ['300px', '200px'],
                content: $('.layer_addbase'), //捕获的元素，注意：最好该指定的元素要存放在body最外层，否则可能被其它的相对元素所影响
                btn:["提交"],
                yes:function(index){
                    if($(".addName").val()==''||$(".addUrl").val()==''){
                        layer.alert("类名和路径不能为空！");
                        return false;
                    }
                    $.ajax({// 默认异步
                        type : "post",
                        url : CONSTANT.root_url + "/posCate/admin/addBasePosCate",
                        data : $("#baseCateAdd").serialize(),
                        dataType : "json",
                        async:false,
                        success : function(result) {
                            if(result.success){
                                layer.alert("添加成功！");
                                $("#cateList").bootstrapTable('refresh');
                        /*        setTimeout(function () {
                                    /!*layer.closeAll();*!/
                                    $(".layui-layer-close1").click();
                                }, 8000);*/
                            }else{
                                layer.msg("添加失败!");
                            }

                        },error:function(){
                            layer.msg("服务器错误,添加失败!");
                        }

                    });
                },
                cancel: function(){
                    /* layer.msg('捕获就是从页面已经存在的元素上，包裹layer的结构', {time: 5000, icon:6});*/
                }
            });
        });
        $("#cateList").bootstrapTable({ // 对应table标签 的id
            method: 'post',
            url: CONSTANT.root_url + "/posCate/admin/listBigPositionCategorys", // 获取表格数据的url//条件start,length
            cache: false, // 设置为 false 禁用 AJAX 数据缓存， 默认为true
            striped: true,  //表格显示条纹，默认为false
            pagination: true, // 在表格底部显示分页组件，默认false
            pageList: [5,10,20,30], // 设置页面可以显示的数据条数
            pageSize: 3, // 页面数据条数
            pageNumber: 1, // 首页页码
            sidePagination: 'client', // 设置为服务器端分页
            showRefresh:true,//刷新按钮
            showColumns:true,
            clickToSelect: true,//是否启用点击选中行
            toolbarAlign:'right',//工具栏对齐方式
            buttonsAlign:'right',//按钮对齐方式
            toolbar:'#tool',//指定工作栏*/
            search:false,//表格搜素客户端
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
                        var options = $("#cateList").bootstrapTable('getOptions');
                        return options.pageSize*(options.pageNumber-1)+index+1;
                        // return index+1;
                    },
                    align: 'center', // 左右居中
                    valign: 'middle' // 上下居中
                },
                {
                    field: 'typeName', // 返回json数据中的name
                    title: '类别', // 表格表头显示文字
                    align: 'center', // 左右居中
                    valign: 'middle' // 上下居中
                }, {
                    field: 'fatherId',
                    title: '类别等级',
                    formatter: function (value, row, index) {
                        return "一级";
                    },
                    align: 'center',
                    valign: 'middle'
                },
                 {
                    field: 'url',
                    title: '去向路径',
                    align: 'center',
                    valign: 'middle'
                }, {
                    title: "操作",
                    align: 'center',
                    valign: 'middle',
                    width: 160, // 定义列的宽度，单位为像素px
                    formatter: function (value, row, index) {
                        return '<button class="btn btn-primary btn-sm" onclick="addChild(\''+row.id+'\')"><i class="glyphicon glyphicon-plus"></i></button><button class="btn btn-primary btn-sm" onclick="delCate(\''+row.id+'\')"><i class="glyphicon glyphicon-remove"></i></button><button class="btn btn-primary btn-sm" onclick="editBase({id:\''+row.id+'\',typeName:\''+row.typeName+'\',url:\''+row.url+'\'})"><i class="glyphicon glyphicon glyphicon-pencil"></i></button>' +
                            '<button class="btn btn-primary btn-sm" onclick="checkChild(\''+row.id+'\')"><i class="\n' +
                            'glyphicon glyphicon-search"></i></button>';
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
//删除一级类
function delCate(id) {
    layer.confirm('是否删除给当前职位类别？', {
        btn: ['确认','取消'] //按钮
    }, function(){
        $.ajax({// 默认异步
            type : "post",
            url : CONSTANT.root_url + "/posCate/admin/delPosCate?id="+id,
            dataType : "json",
            async:false,
            success : function(result) {
                if(result.success){
                    layer.msg("删除成功！");
                    $("#cateList").bootstrapTable('refresh');
                    $("#childList").bootstrapTable('refresh');

                    /*        setTimeout(function () {
                                /!*layer.closeAll();*!/
                                $(".layui-layer-close1").click();
                            }, 8000);*/
                }else{
                    layer.msg("删除失败!");
                }

            },error:function(){
                layer.msg("服务器异常,删除失败!");
            }

        });
    }, function(){
      return true;
    });
}

//修改一级类别
function editBase(row) {
    console.log(row.typeName);
    $("#baseId").val(row.id);
    $("#typeNameEdit").val(row.typeName);
    $("#urlEdit").val(row.url);
    layer.open({
        type: 1,
        shade: false,
        title: '修改一级类', //不显示标题
        area: ['300px', '200px'],
        content: $('.layer_editBase'), //捕获的元素，注意：最好该指定的元素要存放在body最外层，否则可能被其它的相对元素所影响
        btn:["提交"],
        yes:function(index){
            if($("#typeNameEdit").val()==''||$("#urlEdit").val()==''){
                layer.alert("类名和路径不能为空！");
                return false;
            }
            $.ajax({// 默认异步
                type : "post",
                url : CONSTANT.root_url + "/posCate/admin/editPosCate",
                data : $("#baseCateEdit").serialize(),
                dataType : "json",
                async:false,
                success : function(result) {
                    if(result.success){
                        layer.alert("修改成功！");
                        $("#cateList").bootstrapTable('refresh');
                    }else{
                        layer.msg("修改失败!");
                    }

                },error:function(){
                    layer.msg("服务器错误,添加失败!");
                }

            });
        },
        cancel: function(){
            /* layer.msg('捕获就是从页面已经存在的元素上，包裹layer的结构', {time: 5000, icon:6});*/
        }
    });
}




//添加二级类别
function addChild(id) {
    $("#fatherId").val(id);
    layer.open({
        type: 1,
        shade: false,
        title: '添加子类', //不显示标题
        area: ['300px', '200px'],
        content: $('.layer_addchild'), //捕获的元素，注意：最好该指定的元素要存放在body最外层，否则可能被其它的相对元素所影响
        btn:["提交"],
        yes:function(index){
            if($("#typeNameChild").val()==''||$("#urlChild").val()==''){
                layer.alert("类名和路径不能为空！");
                return false;
            }
            $.ajax({// 默认异步
                type : "post",
                url : CONSTANT.root_url + "/posCate/admin/addChildPosCate",
                data : $("#childCateAdd").serialize(),
                dataType : "json",
                async:false,
                success : function(result) {
                    if(result.success){
                        layer.alert("添加成功！");
                        /*        setTimeout(function () {
                                    /!*layer.closeAll();*!/
                                    $(".layui-layer-close1").click();
                                }, 8000);*/
                    }else{
                        layer.msg("添加失败!");
                    }

                },error:function(){
                    layer.msg("服务器错误,添加失败!");
                }

            });
        },
        cancel: function(){
            /* layer.msg('捕获就是从页面已经存在的元素上，包裹layer的结构', {time: 5000, icon:6});*/
        }
    });
}
function checkChild(id){
    console.log(id);
    $("#childList").bootstrapTable('destroy');
    $("#childList").bootstrapTable({ // 对应table标签 的id
        method: 'post',
        url: CONSTANT.root_url + "/posCate/listChildPositionCategorys?id="+id, // 获取表格数据的url//条件start,length
        cache: false, // 设置为 false 禁用 AJAX 数据缓存， 默认为true
        striped: true,  //表格显示条纹，默认为false
        pagination: true, // 在表格底部显示分页组件，默认false
        pageList: [5,10,20,30], // 设置页面可以显示的数据条数
        pageSize: 2, // 页面数据条数
        pageNumber: 1, // 首页页码
        sidePagination: 'client', // 设置为服务器端分页
        showRefresh:true,//刷新按钮
        showColumns:true,
        clickToSelect: true,//是否启用点击选中行
        toolbarAlign:'right',//工具栏对齐方式
        buttonsAlign:'right',//按钮对齐方式
       /* toolbar:'#toolbar',//指定工作栏*!/*/
        search:false,//表格搜素客户端
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
                    var options = $("#cateList").bootstrapTable('getOptions');
                    return options.pageSize*(options.pageNumber-1)+index+1;
                    // return index+1;
                },
                align: 'center', // 左右居中
                valign: 'middle' // 上下居中
            },
            {
                field: 'typeName', // 返回json数据中的name
                title: '类别', // 表格表头显示文字
                align: 'center', // 左右居中
                valign: 'middle' // 上下居中
            }, {
                field: 'fatherId',
                title: '类别等级',
                formatter: function (value, row, index) {
                    return "二级";
                },
                align: 'center',
                valign: 'middle'
            },
            {
                field: 'url',
                title: '去向路径',
                align: 'center',
                valign: 'middle'
            }, {
                title: "操作",
                align: 'center',
                valign: 'middle',
                width: 160, // 定义列的宽度，单位为像素px
                formatter: function (value, row, index) {
                    return '<button class="btn btn-primary btn-sm" onclick="delCate(\''+row.id+'\')">X</button>';
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
    layer.open({
        type: 1,
        shade: false,
        title: '所有二级类', //不显示标题
        area: ['500px', '400px'],
        content: $('.layer_check'), //捕获的元素，注意：最好该指定的元素要存放在body最外层，否则可能被其它的相对元素所影响
        cancel: function(){
           /* layer.msg('捕获就是从页面已经存在的元素上，包裹layer的结构', {time: 5000, icon:6});*/
        }
    });
}

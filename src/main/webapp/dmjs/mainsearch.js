require(['layer','util'],function(layer,util){
$(function(){
	//所有全局变量
    $(".btn_srh").bind('click',function(){
        //清空子元素
        $("#hot").children().remove();
        $(".pages").children().remove();
        $.ajax({// 默认异步
            type : "post",
            url : CONSTANT.root_url + "/pubJob/searchPubJobs",
            data : $("#searchform").serialize(),
            dataType : "json",
            success : function(result) {
                if(result.success){
                    //数据渲染
                    var pubjobs= result.message.publishJobList;
                   var  totalPage = result.message.totalPage;
                   for(var i=0;i<pubjobs.length;i++){
                       //TODO 当公司没有数据时会报错
                       var $div = "<div class=\"item\" id=\"item\"><div class=\"info\"><div class=\"job_name\"><a href=\"\" target=\"_blank\">"+pubjobs[i].jobName+"</a><span>["+pubjobs[i].workPlace+"]</span></div><div class=\"salary_btn\"><span class=\"salary\">"+pubjobs[i].minSalary+"-"+pubjobs[i].maxSalary+"￥/月</span><a entid=\""+pubjobs[i].enterpriseInfo.id+"\" data=\""+pubjobs[i].id+"\" id=\"sendResume\">立即投递</a></div></div>" +
                           "<div class=\"conpany\"><img class=\"con_tx\" src=\""+CONSTANT.root_url+pubjobs[i].enterpriseInfo.imgUrl+"\"/><div class=\"wrap\"><a href=\"\" class=\"con_name\" target=\"_blank\">"+pubjobs[i].enterpriseInfo.eniname+"</a>" +
                           "<span class=\"major\">["+pubjobs[i].enterpriseInfo.industry+"]</span><p class=\"con_indu\">"+pubjobs[i].enterpriseInfo.resume+"</p></div></div>" +
                           "</div>";
                       $("#hot").append($($div));
                   }
                   for( var i=1;i<=totalPage;i++){
                       var page = "";
                       if($("#currentPage").val()==i){
                           page ="<div class=\"page pageafter\">"+i+"</div>";
                       }else{
                           page ="<div class=\"page\">"+i+"</div>";
                       }
                       $(".pages").append($(page));
                   }
                   if(pubjobs.length<1){
                       $("#hot").append($("<span class=\"nodate\">.....(^_^)未查询到数据.....</span>"));
                   }
                }else{
                    layer.msg("没有数据!");
                }

            },error:function(){
                layer.msg("服务器错误,获取数据失败!");
            }

        });
    });
	init();
   function init(){
    /*   var str =$("#s1").attr("data");
       var js = util.jsonCaseJs(str);*/
      /* console.log(js.maxSalary);*/
       //第一次查询
       if($(".arrId").length<=0&&$("#pcId").val()==null){
           $("#nolimit").addClass("active");
       }
       $("#arrLength").val($(".arrId").length);
	   $(".btn_srh").click();
   }
    $(".s li").click(function(e){
        var $obj = $(e.target);
        $(".s li").removeClass("active");
        $(e.target).addClass("active");
        var json = $obj.attr("data");
        var js = util.jsonCaseJs(json);
        $("#minSalary").val(js.minSalary);
        $("#maxSalary").val(js.maxSalary);
        //点击查询
        $(".btn_srh").click();
    });
    $(".x li").click(function(e){
        var $obj = $(e.target);
        $(".x li").removeClass("active");
        $(e.target).addClass("active");
        var str = $obj.attr("data");
        /*console.log(str+" :学位");*/
        $("#minEducationLev").val(str);
        //点击查询
        $(".btn_srh").click();
    });

    $(".l li").click(function(e){
        var $obj = $(e.target);
        $(".l li").removeClass("active");
        $(e.target).addClass("active");
        $("#pcId").val("");
        $("#arrLength").val("0");
        //点击查询
        $(".btn_srh").click();
    });

    //页数点击,委托代理绑定事件
    $(".pages").on("click","div",function(e){
        var obj = $(e.target);
        $(".page").removeClass("pageafter");
        obj.addClass("pageafter");
        var index = obj.text().trim();
        $("#currentPage").val(index);
        //点击查询
        $(".btn_srh").click();

    });
    //投递简历 委托代理
    $("#sendResume").live("click",function (e) {
        var $obj = $(e.target);
        console.log("send"+$("#internId").val());
        var str = $("#internId").val();
        var email = $("#loginName").val().trim();
        var entId = $obj.attr("entid");
        var pjId = $obj.attr("data");
        if(str==''){
            layer.msg("您没有登录或者当前账户不是实习生身份，无法投递简历",{icon:05});
            return;
        }
        $.ajax({
            async:false,
            type : "post",
            url : CONSTANT.root_url + "/entResume/intern/createEntResume?email="+email+"&entId="+entId+"&pjId="+pjId,
            dataType : "json",
            success : function(result) {
                if(!result.success){
                    layer.msg("不能重复投递",{icon:5});
                }else{
                    layer.msg("投递成功，静候佳音",{icon:6});
                }
            },
            error: function() {
                layer.msg("服务器出错，投递失败");
            }
        });
    });
    //投递简历
 /*   $("#hot").on("click","a",function () {
        if($("#internId").val()==null){
            layer.msg("您没有登录或者当前账户不是实习生身份，无法投递简历",{icon:05});
            return;
        }
    });*/
});
});


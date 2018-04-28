define(['jquery'],function(){//define定义的js可以被其他模块引用   AMD规范（异步模块加载）
    //时间戳格式化
    Date.prototype.Format = function (fmt) { //author: meizz
        var o = {
            "M+": this.getMonth() + 1, //月份
            "d+": this.getDate(), //日
            "h+": this.getHours(), //小时
            "m+": this.getMinutes(), //分
            "s+": this.getSeconds(), //秒
            "q+": Math.floor((this.getMonth() + 3) / 3), //季度
            "S": this.getMilliseconds() //毫秒
        };
        if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
        for (var k in o)
            if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
        return fmt;
    }
	//时间戳转化
    function dateFormat(date,frm) {
		return new Date(date).Format(frm);
    }
    //时间戳转日期
    function caseDate(timestamp){
        var d = new Date(timestamp * 1000);    //根据时间戳生成的日期对象
        var date = (d.getFullYear()) + "-" +
            (d.getMonth() + 1) + "-" +
            (d.getDate());
         return date;
    }


    //注册名验证 只能以字母开头 5位以上
    function testName(str) {
        var format = /^[A-Za-z][A-Za-z\d]{4,10}$/;
        var end = format.test(str);
        return end;
    }

    //号码验证 7-11位
    function testTel(str){
        var format = /^\d{7,11}$/;
        var end = format.test(str);
        return end;
    }

//密码6-8位的数字或字母
    function testMiMa(str) {
        var format = /^[A-Za-z\d]{6,8}$/;
        var end = format.test(str);
        return end;
    }
	/*
	 * 事件绑定
	 * @param bindings 需绑定对象的集合  {el:"元素名",event:"事件名"，handler:methodName}
	 */
	function bindEvents(bindings){
		$.each(bindings,function(i,obj){
			if(typeof obj.el == "string"){
				$(document).on(obj.event,obj.el,obj.handler);//委托模式
			}else{
				$(obj.el).on(obj.event,obj.handler);
			}
		});
	}

	//json对象转js对象
	function jsonCaseJs(json){
        var js= eval('(' + json + ')');
        return js;
    }


	return{
     //绑定多个事件
	  bindEvents:bindEvents,
		dateFormat:dateFormat,
        testName:testName,
        testMiMa:testMiMa,
        testTel:testTel,
        caseDate:caseDate,
        jsonCaseJs:jsonCaseJs
	}
	
});
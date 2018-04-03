define(['jquery'],function(){//define定义的js可以被其他模块引用   AMD规范（异步模块加载）
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
	return{
     //绑定多个事件
	  bindEvents:bindEvents
	}
	
});
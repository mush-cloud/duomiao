require.config({
    baseUrl: '/duomiao/dmjs',
    paths: {
        'jquery': 'common/jquery-1.8.3.min',
        'layer':'common/layer',
        'util':'common/util',
       'bootstrap': 'interncenter/adminlte/bootstrap.min',
        'bstable':'common/bstable/bootstrap-table',
        'bstablecn':'common/bstable/bootstrap-table-zh-CN'
       /* 'handlebars': 'lib/handlebars-1.0.0',
        'hbsHelper': 'common/hbsHelper',
        'layer1': 'lib/layer/layer',
        'laydate': 'lib/laydate/laydate'*/
    },
    map :{//添加css依赖的时候需要引入的文件
    	'*':{
    		'css':'common/css'
    	}
    },
    //不符合AMD规范的
    shim: {//css! 加载css文件的标志
    	 'layer': {
             deps: ['jquery','css!common/theme/default/layer.css']
         },
        'bootstrap': {
            deps: ['css!common/bootstrap.min.css']
        }
/*        'layer1': {
            deps: ['jquery']
        },
        'pagination': {
            deps: ['jquery','lib/css!lib/pagination/pagination.css']
        },
        'laydate': {
            deps: ['jquery']
        }*/
    }
});
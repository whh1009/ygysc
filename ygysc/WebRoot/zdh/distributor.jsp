<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Access-Control-Allow-Origin" content="*">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-touch-fullscreen" content="YES">
    <meta content="telephone=no" name="format-detection">
    <meta content="black" name="apple-mobile-web-app-status-bar-style">
    <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">
    <link rel="stylesheet" href="${CONTEXT_PATH}/zdh/css/public.css?version=1.0.0">
	<link rel="stylesheet" href="${CONTEXT_PATH}/zdh/css/distributor.css?version=1.0.0">
    <script type="text/javascript" src="${CONTEXT_PATH}/zdh/js/jquery-1.11.1.min.js"></script>
	<script type="text/javascript" src="${CONTEXT_PATH}/zdh/js/bootstrap.min.js"></script>
	<style type="text/css">
		.font_null{ font-size: 16px; width: 90%; margin: 20px auto; color: #999; line-height: 26px;}
	</style>
<script>
	var PATH="${CONTEXT_PATH}";
	var ctitle = '<%=request.getParameter("title") %>';
	//alert(ctitle);
</script>
		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
      <!--[if lt IE 9]>
      <script src="${CONTEXT_PATH}/zdh/js/html5shiv.js"></script>
      <script src="${CONTEXT_PATH}/zdh/js/respond.min.js"></script>
      <![endif]-->

    <title>经销商</title>
</head>
<body>
	<div id="warp">
		<div class="map">
			<div class="map-header">
				
			</div>
			<div class="map-img">
				<img src="${CONTEXT_PATH}/zdh/images/block8.png" alt="">
			</div>
		</div>
		<div class="floor-body">
			
		
		</div>
	</div>
	
</body>
<script type="text/javascript" src="${CONTEXT_PATH}/zdh/js/sea.js"></script>
<script id="service-calculate-template" type="text/x-handlebars-template">
</script>
<script type="text/javascript" src="${CONTEXT_PATH}/zdh/js/layout.js"></script>  
<script type="text/javascript">
    /*
    seajs.use(["public","pages/distributor"],function(){
    	
    });
    */
	//console.log();
</script>
<script>
	$(function(){
		//detail();
		var data = '<%=request.getAttribute("list") %>';
		var dataJson = $.parseJSON(data);
		$(".map-header").html(ctitle);
		if(dataJson.length<1){
			//alert("数据为空！");
			$(".floor-body").html("<div class='font_null'>该经销商暂时没有车源，请返回查看其他经销商！</div>");
			return;
		}
		
		//alert(dataJson[0].dlrName);
		
		$(".floor-body").html("");	
		for(var i=0; i<dataJson.length;i++){
			htmlcar = '<a href="${CONTEXT_PATH}/api/getCarInfo?vhclId='+dataJson[i].vhclId+'"><div class="goods-line" ><div class="goods-img"><img src="'+dataJson[i].vhclPic+'" alt=""></div>';
			htmlcar += '<div class="goods-des"><h3>'+dataJson[i].modelName+'</h3><p><span class="price">￥<span class="num">'+dataJson[i].displayPrice+'</span>元</span><i class="tip-car"></i><i class="tip-pai"></i><div class="clear"></div>';
			htmlcar += '</p><div class="goods-tips"><div class="one-tip">'+dataJson[i].productYear+'</div><div class="one-tip">'+dataJson[i].tableShowMileage+'公里</div><div class="one-tip">'+repAddr(dataJson[i].vhclAddrProv)+'</div></div></div></div></a>'; 
			$(".floor-body").append(htmlcar);
		}
	})	
</script>
</html>
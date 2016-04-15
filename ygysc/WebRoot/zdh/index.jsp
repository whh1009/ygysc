<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<title>阳光易手车</title>
<link rel="stylesheet" href="${CONTEXT_PATH}/zdh/css/public.css?version=1.0.0">
<link rel="stylesheet" href="${CONTEXT_PATH}/zdh/css/index.css?version=1.0.0">
<link rel="stylesheet" href="${CONTEXT_PATH}/zdh/css/swiper.css?version=1.0.0">
<link rel="stylesheet" href="${CONTEXT_PATH}/zdh/css/bootstrap.min.css">
<link rel="stylesheet" href="${CONTEXT_PATH}/zdh/css/layout.css">
<script type="text/javascript" name="baidu-tc-cerfication" data-appid="7903805" src="http://apps.bdimg.com/cloudaapi/lightapp.js"></script>	
<script type="text/javascript" src="${CONTEXT_PATH}/zdh/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="${CONTEXT_PATH}/zdh/js/bootstrap.min.js"></script>
<script>
 	var PATH="${CONTEXT_PATH}";
</script>
</head>
<body style="background:#f5f5f5">
<!--	
	<div id="warp">
    	<input type="text" name="seach" id="seach_inp" >
        <button onClick="seach();">搜索</button>
        <br/>
        <input type="text" name="seach" id="jx_seach_inp">
        <button onClick="jx_seach();">经销商搜索</button>
    </div> 
    <a href="zdh/buycar.jsp">购买车</a>
-->   
	<div id="warp">
		<section class="floor adv">
			 <div class="swiper-wrapper">
			 	<div class="swiper-slide"><a href="http://mobile.svwuc.com/gw/siteAssessment.do"><img width="100%" height="100%" src="${CONTEXT_PATH}/zdh/images/banner.jpg" alt=""></a></div>
			 	<div class="swiper-slide"><a href="http://mobile.svwuc.com/gw/siteAssessment.do"><img width="100%" height="100%" src="${CONTEXT_PATH}/zdh/images/banner1.jpg" alt=""></a></div>
			 	
            </div>
            <div class="swiper-pagination"></div>
		</section>
		<div class="adv-logo">
            	
         </div>

		<div class="floor-body">
			<div class="block-line">
				<div class="block">
					<a href="${CONTEXT_PATH}/zdh/recommend.jsp"><img src="${CONTEXT_PATH}/zdh/images/block1.png" alt=""></a>
				</div>
				<div class="block">
					<a href="${CONTEXT_PATH}/zdh/buy.jsp"><img src="${CONTEXT_PATH}/zdh/images/block2.png" alt=""></a>
				</div>
			</div>
			<div class="block-line">
				<div class="block">
					<a href="${CONTEXT_PATH}/zdh/sell.jsp"><img src="${CONTEXT_PATH}/zdh/images/block3.png" alt=""></a>
				</div>
				<div class="block">
					<a href="${CONTEXT_PATH}/zdh/change.jsp"><img src="${CONTEXT_PATH}/zdh/images/block4.png" alt=""></a>
				</div>
			</div>
			<div class="block-line">
				<div class="min-block">
					<a href="${CONTEXT_PATH}/zdh/introduce.jsp"><img src="${CONTEXT_PATH}/zdh/images/block5.png" alt=""></a>
				</div>
				<div class="min-block">
					<!--<a href="${CONTEXT_PATH}/zdh/distributor.jsp"><img src="${CONTEXT_PATH}/zdh/images/block6.png" alt=""></a>-->
					<a href="${CONTEXT_PATH}/zdh/map.jsp"><img src="${CONTEXT_PATH}/zdh/images/block6.png" alt=""></a>
				</div>
				<div class="min-block">
					<a href="${CONTEXT_PATH}/zdh/tell.jsp"><img src="${CONTEXT_PATH}/zdh/images/block7.png" alt=""></a>
				</div>
			</div>
		</div>
		<div class="logo">
			<img src="${CONTEXT_PATH}/zdh/images/logo.png" alt="">
		</div>
	</div>
	
</body>
<script type="text/javascript" src="${CONTEXT_PATH}/zdh/js/sea.js"></script>
<script id="service-calculate-template" type="text/x-handlebars-template"></script>
<script type="text/javascript">
    seajs.use(["public","pages/index"],function(){
    	
    });

</script>
<script type="text/javascript" src="${CONTEXT_PATH}/zdh/js/layout.js"></script>  
</body>
</html>

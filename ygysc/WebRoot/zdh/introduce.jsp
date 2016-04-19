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
    <link rel="stylesheet" href="${CONTEXT_PATH}/zdh/css/public.css?version=1.0.0">
	<link rel="stylesheet" href="${CONTEXT_PATH}/zdh/css/index.css?version=1.0.0">
	<link rel="stylesheet" href="${CONTEXT_PATH}/zdh/css/swiper.css?version=1.0.0">
	
	<link rel="stylesheet" href="${CONTEXT_PATH}/zdh/css/layout.css">
	<script type="text/javascript" src="${CONTEXT_PATH}/zdh/js/jquery-1.11.1.min.js"></script>
	<script type="text/javascript" src="${CONTEXT_PATH}/zdh/js/bootstrap.min.js"></script>
    
    <link rel="stylesheet" href="${CONTEXT_PATH}/zdh/css/public.css?version=1.0.0">
	<link rel="stylesheet" href="${CONTEXT_PATH}/zdh/css/introduce.css?version=1.0.0">
	<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
      <!--[if lt IE 9]>
      <script src="${CONTEXT_PATH}/zdh/js/html5shiv.js"></script>
      <script src="${CONTEXT_PATH}/zdh/js/respond.min.js"></script>
      <![endif]-->
<script>
	var PATH="${CONTEXT_PATH}";
</script>
<title>品牌介绍</title>
</head>
<body>
	<div id="warp" style="background:#fff">
    	
		<div class="player">
			<video src="${CONTEXT_PATH}/zdh/video/test.mp4"  controls="controls"  id="ply" style="display:none">
            您的浏览器不支持 video 标签。
            </video>
            <img src="${CONTEXT_PATH}/zdh/images/about.jpg" width="100%">
		</div>
		<div class="intro">
			<h3><img src="${CONTEXT_PATH}/zdh/images/ico-intro.png" width="22" height="22" alt="">品牌简介</h3>
			<div class="intro-msg">
				德国大众全球易手车品牌Das WeltAuto已在近30个国家为客户提供标准统一的专业易手车服务，并将继续拓展它在全球的业务版图。2013年这一全球品牌正式进入中国，Das WeltAuto上海大众汽车-阳光易手车由此诞生。
			</div>
		</div>
		<div class="linian">

			<div class="tip-line"></div>
			<div class="tip-word">品牌理念</div>
			<img  src="${CONTEXT_PATH}/zdh/images/logo-g.png" width="100%">
			<!-- <table>
				<tr>
					<td>保证<span class="little">/Ensure</span></td>
					<td>信任<span class="little">/Trust</span></td>
				</tr>
				<tr>
					<td>可靠<span class="little">/Reliable</span></td>
					<td>透明<span class="little">/Transparent</span></td>
				</tr>
			</table>
			<div class="logo-gn">
				
			</div> -->
		</div>
		<div class="floor-body">
			<h3><img class="tip" src="${CONTEXT_PATH}/zdh/images/serv-tip.png" width="22" height="22" alt="">8项服务承诺</h3>
			<div class="serv-msg">
				我们始终坚持质量检查、质量保证、金融保险等8项服务承诺，让每一辆大众再造的易手车都犹如新生。
			</div>
			<div class="goods-line">
				<div class="goods-img">
					<img src="${CONTEXT_PATH}/zdh/images/serv1.png" alt="">
				</div>
				<div class="goods-des">
					<h3>置换业务</h3>
					<p>一站式置换服务，方便快捷，无论您现在驾驶什么品牌的车辆，在阳光易手车这里，您都可以放心、便捷地置换到您喜欢的新车。</p>
				</div>
			</div>
			<div class="goods-line">
				<div class="goods-img">
					<img src="${CONTEXT_PATH}/zdh/images/serv2.png" width="22" height="22" alt="">
				</div>
				<div class="goods-des">
					<h3>质量检查</h3>
					<p>每一辆阳光易手车都必须通过德国大众全球统一的133项认证检测，绝不隐瞒任何缺陷，这是我们对您的承诺。</p>
				</div>
			</div>
			<div class="goods-line">
				<div class="goods-img">
					<img src="${CONTEXT_PATH}/zdh/images/serv3.png" alt="">
				</div>
				<div class="goods-des">
					<h3>质量保证</h3>
					<p>所有的阳光易手车都将享有上海大众汽车原厂质量保证，质量保证范围包含重要零部件质量担保、全面保障质量担保。</p>
				</div>
			</div>
			<div class="goods-line">
				<div class="goods-img">
					<img src="${CONTEXT_PATH}/zdh/images/serv4.png" alt="">
				</div>
				<div class="goods-des">
					<h3>试乘试驾</h3>
					<p>试乘试驾是购车过程中的重要体验，是帮您找到想要车辆的最佳方法，也是阳光易手车向您所提供的优质服务。</p>
				</div>
			</div>
			<div class="goods-line">
				<div class="goods-img">
					<img src="${CONTEXT_PATH}/zdh/images/serv5.png" alt="">
				</div>
				<div class="goods-des">
					<h3>车辆美容</h3>
					<p>为了确保阳光易手车的所有车辆都保持最佳状态，上海大众汽车采用了德国专业技术和产品对车辆进行“美容”，使每辆阳光易手车都焕然一新。</p>
				</div>
			</div>
			<div class="goods-line">
				<div class="goods-img">
					<img src="${CONTEXT_PATH}/zdh//images/serv6.png" alt="">
				</div>
				<div class="goods-des">
					<h3>车辆定制</h3>
					<p>我们为有需求的阳光易手车客户提供指定车型订购、个性化装饰等服务。</p>
				</div>
			</div>
			<div class="goods-line">
				<div class="goods-img">
					<img src="${CONTEXT_PATH}/zdh//images/serv7.png" alt="">
				</div>
				<div class="goods-des">
					<h3>金融保险</h3>
					<p>阳光易手车为您度身设计金融及保险产品，满足您的需求，为阳光易手车客户的优质车生活保驾护航。</p>
				</div>
			</div>
			<div class="goods-line">
				<div class="goods-img">
					<img src="${CONTEXT_PATH}/zdh//images/serv8.png" alt="">
				</div>
				<div class="goods-des">
					<h3>七天退换</h3>
					<p>自您购买阳光易手车后的7天/500公里内，如果对所购车辆不满意，都可以在原购车单位处退/换车辆，这是阳光易手车对您的服务承诺。</p>
				</div>
			</div>
		</div>
	</div>
	
</body>
<!--
<script type="text/javascript" src="${CONTEXT_PATH}/zdh/js/sea.js"></script>
<script id="service-calculate-template" type="text/x-handlebars-template">
	
</script>
<script type="text/javascript">
    seajs.use(["public","pages/introduce"],function(){
    	
    });

</script>
-->
</html>
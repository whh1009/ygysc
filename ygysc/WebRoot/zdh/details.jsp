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
	<link rel="stylesheet" href="${CONTEXT_PATH}/zdh/css/details.css?version=1.0.0">
	<link rel="stylesheet" href="${CONTEXT_PATH}/zdh/css/swiper.css?version=1.0.0">
	<style type="text/css">
		.dlrName{ font-size: 18px; line-height: 40px; font-weight: bold;}
	</style>
<script>
	var PATH="${CONTEXT_PATH}";
</script>

	

      <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
      <!--[if lt IE 9]>
      <script src="${CONTEXT_PATH}/zdh/js/html5shiv.js"></script>
      <script src="${CONTEXT_PATH}/zdh/js/respond.min.js"></script>
      <![endif]-->

    <title>明星车源</title>
</head>
<body>
	<div id="warp">
		<section class="floor adv">
			 <div class="swiper-wrapper">
			 	<!--
			 	<div class="swiper-slide"><a href="player.html"><img width="100%" height="100%" src="${CONTEXT_PATH}/zdh/images/1.png" alt=""></a></div>
			 	<div class="swiper-slide"><a href="player.html"><img width="100%" height="100%" src="${CONTEXT_PATH}/zdh/images/2.png" alt=""></a></div>
			 	<div class="swiper-slide"><a href="player.html"><img width="100%" height="100%" src="${CONTEXT_PATH}/zdh/images/3.png" alt=""></a></div>
			 	-->
            </div>
            <div class="swiper-pagination"></div>
		</section>
		<div class="details">
			<h3>上海大众帕萨特 2.0T-A/MT至尊版DSG双离合（国IV）</h3>
			<div class="price">￥<span class="num">25.30</span>元</div>
			<div class="rz"></div>
			<a id="tel"><div class="tel"></div></a>
		</div>
		<table class="des">
			<tr>
				<td>初登年月：<span id="time">2014年02月</span></td>
				<td>行驶里程：<span id="luchen">0.23万</span>公里</td>
			</tr>
			<tr>
				<td>发布日期：<span id="time_f">2015年02月</span></td>
				<td>排放标准：<span id="panf">国IV</span></td>
			</tr>
			<tr>
				<td>变速箱：<span id="bians">6档 手自一体</span></td>
				<td>排量：<span id="bians_num">2.0</span></td>
			</tr>
			<tr>
				<td>车身颜色：<span id="color">棕色L</span></td>
				<td></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<div class="dlrName"></div>
					<div class="btnlist">
						<a id="business"><div>进入店铺</div></a>
					</div>
				</td>
			</tr>
		</table>
		<div class="btnlist" style="display:none">
			<div>收藏店铺</div>
			<div>进入店铺</div>
		</div>
		<div class="tip" style="display:none">
			<div class="tip-line"></div>
			<div class="tip-word">继续拖动，查看基本配置</div>
		</div>
		<div class="bottom">
			<div class="info">没找到心仪车源？易手好车帮你找！</div>
			<div class="btn">
				<a href="${CONTEXT_PATH}/zdh/buy.jsp" style="color:#fff"><span>帮我找车</span></a>
			</div>
		</div>
	</div>
	
</body>
<script type="text/javascript" src="${CONTEXT_PATH}/zdh/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="${CONTEXT_PATH}/zdh/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${CONTEXT_PATH}/zdh/js/sea.js"></script>
<script id="service-calculate-template" type="text/x-handlebars-template">
	
</script>
<script type="text/javascript">
    seajs.use(["public","pages/details"],function(){
    	
    });
	//console.log(<%=request.getAttribute("car") %>);
</script>
<script>
    	var data = ${car};
    	/*
    	if(!data){
			alert("数据为空！");
			//return false;
		}
		*/

function repCar(gearboxMode) {
	return gearboxMode.replace("10441001","MT").replace("10441002","AT").replace("10441003","A/MT").replace("10441004","CVT").replace("10441005","DSG");
}

function gears(gears) {
	return gears.replace("10451001","4档").replace("10451002","5档").replace("10451003","6档").replace("10451004","7档").replace("10451005","8档");
}

function Color(color) {
	return color.replace("23020001","黑色").replace("23020002","金色").replace("23020003","黄色").replace("23020004","蓝色").replace("23020005","橙色").replace("23020006","紫色").replace("23020007","棕色").replace("23020008","白色").replace("23020009","银色").replace("23020010","灰色").replace("23020011","红色").replace("23020012","绿色").replace("23020013","其它");
}

function efflStd(efflStd) {
	return efflStd.replace("10111001","黄标").replace("10111002","国Ⅰ").replace("10111003","国Ⅱ").replace("10111004","国Ⅲ").replace("10111005","国Ⅳ").replace("10111006","国Ⅴ");
}

		$(".details h3").html(data.vm.modelName);
		$(".price .num").html(data.vm.displayPrice);
		$("#time").html(data.vm.productYear);
		$("#luchen").html(data.vm.tableShowMileage);
		$("#time_f").html(data.vm.registerDate);
		$("#panf").html(efflStd(data.vm.efflStd));
		$("#bians").html(repCar(data.vm.gearboxMode)+" "+gears(data.vm.gears));
		$("#bians_num").html(data.vm.discharge);
		$("#color").html(Color(data.vm.vhclColor));
		$("#tel").attr('href','tel:'+data.vm.hotline);
		$(".dlrName").html(data.vm.dlrName);
		
		
		//$("#dp").html("");
		$(function(){
			var listhtml = '';
			var dlrCode = data.vm.dlrCode;
			var dlrName = data.vm.dlrName;
			for(var i=0; i<data.pL.length; i++){
				listhtml+='<div class="swiper-slide"><img width="100%" height="100%" src="'+data.pL[i].vhclPic+'" alt=""></div>';

			}
			//设置进入店铺路径
			$("#business").attr("href","${CONTEXT_PATH}/api/getCarInfoByAddr?dlrCode="+dlrCode+"&title="+dlrName);
			/*
			$.ajax({
				 type: "POST",
				 url: "${CONTEXT_PATH}/car/queryDealer",
				 //data: {sCode:xCode,pageNumber:pageNumber},
				 dataType: "json",
				 success: function(data){
					if(data==null||data==undefined||data.length<1){
						alert("查询出错");
					}else{
						//console.log(data);	
						for(var j=0;j<data.length;j++){
							if(data[j].dlrCode == dlrCode){
								//alert(data[j].dlrCode);
								$("#tel").attr('href','tel:'+data[j].telephone);
								//$("#business").attr('href','tel:'+data[j].telephone);
							}
						}
						
					}
				}
			});
			*/
			$(".swiper-wrapper").append(listhtml);
			
		})
    </script>
</html>
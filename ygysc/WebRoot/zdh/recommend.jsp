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
   	<script type="text/javascript" src="${CONTEXT_PATH}/zdh/js/jquery-1.11.1.min.js"></script>
	<script type="text/javascript" src="${CONTEXT_PATH}/zdh/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="${CONTEXT_PATH}/zdh/css/public.css?version=1.0.0">
	<link rel="stylesheet" href="${CONTEXT_PATH}/zdh/css/distributor.css?version=1.0.0">
	<link rel="stylesheet" href="${CONTEXT_PATH}/zdh/css/recommend.css?version=1.0.0">
	<style type="text/css">
        .last_page,.more_page{ text-align: center; font-size: 14px; line-height: 40px; height: 40px; color: #000000; clear: both;}
    	.floor-body{ padding-bottom: 0px;}	
	</style>
	<script>
    	var PATH="${CONTEXT_PATH}";
    </script>
    <script type="text/javascript" src="${CONTEXT_PATH}/zdh/js/layout.js"></script> 
    <title>明星车源</title>
</head>
<body>
	<div id="warp">
		<div class="shaixuan">
			<ul>
				<li>
					<span>
						<select id="saleModel" style="width:90%">
                        	<option value="">车系</option>
                        	<option value="1932">途观</option>
                            <option value="595">帕萨特</option>
                            <option value="321">途安</option>
                            <option value="340_2786_2839">朗逸系列</option>
                            <option value="330_596_597_2048_2636_291">POLO系列</option>
                            <option value="332_598_600_599">桑塔纳系列</option>
                            <option value="2797_1678">速派</option>
                            <option value="156">明锐</option>
                            <option value="2731">昕锐</option>
                            <option value="2964">昕动</option>
                            <option value="616">晶锐</option>
                            <option value="2843">野帝</option>
                        </select>
					</span>
				</li>
				<li>
					<span>
                    	<select id="carPrice" style="width:90%">
                        	<option value="">价格</option>
                            <option value="28480001">5万以下</option>
                            <option value="28480002">5-8万</option>
                            <option value="28480003">8-12万</option>
                            <option value="28480004">12-16万</option>
                           	<option value="28480005">16-20万</option>
                            <option value="28480006">20-25万</option>
                            <option value="28480007">25-30万</option>
                            <option value="28480008">30万以上</option>
                       	</select>
                    </span>
				</li>
				<li>
					<span>
                    	<select id="carSex" style="width:90%">
                        	<option value="">车龄</option>
                        	<option value="1001">1年以内</option>
                            <option value="1002">2年以内</option>
                            <option value="1003">3年以内</option>
                            <option value="1004">3-5年</option>
                            <option value="1005">5-8年</option>
                            <option value="1006">8年以上</option>
                       	</select>
                   	</span>
				</li>
				<li>
					<span>
                    	<select style="width:90%" id="province">
                        	<option value="">省份</option>
                       	</select>
                    </span>
				</li>
				<li>
					<div class="search" onclick="carseach(1, true);"></div>
				</li>
			</ul>
		</div>
		
		<div class="floor-body" id="floor-body">
		</div>
		
		<div class="more_page" onclick="nextPage()" style="display: none;">点击加载更多</div>
        <div class="last_page" style="display: none;">已经是最后一页了</div>
		<div class="bottom" style="display:none">
			<div class="info">经销商：上海XXXX</div>
			<div class="btn-pst">
				<i></i>
				<span>查看位置</span>
			</div>
			<div class="btn-tel">
				<i></i>
				<span>致电商家</span>
			</div>
		</div>
       
	</div>	
</body>
<script>
var pageNumber = 1;
function carseach(page, arg){
	if(arg==true) {
		$("#floor-body").html("");
	}
	pageNumber = page;
	var seriesId = $("#saleModel").val();
	var carPrice = $("#carPrice").val();
	var carSex = $("#carSex").val();
	var province = $("#province").val();
	$.ajax({
		 type: "POST",
		 url: PATH+"/api/getStarCarList",
		 data: {pageNumber:page,seriesId:seriesId,displayPrice:carPrice,carAge:carSex,city:province},
		 dataType: "json",
		 success: function(data){
			if(data==null||data==undefined||data.length<1){
				alert("暂无数据");
			}else{
				if(data.lastPage) {
					$(".last_page").show();
					$(".more_page").hide();
				} else {
					$(".more_page").show();
					$(".last_page").hide();
				}
				var htmlcar = '';
				for(var i=0;i<data.list.length;i++){
					htmlcar = '<a href='+PATH+'/api/getCarInfo?vhclId='+data.list[i].vhclId+'><div class="goods-line" ><div class="goods-img"><img src="'+data.list[i].vhclPic+'" alt=""></div>';
					htmlcar += '<div class="goods-des"><h3>'+data.list[i].modelName+'</h3><p><span class="price">￥<span class="num">'+data.list[i].displayPrice+'</span>元</span>';
					if(data.list[i].authNo==undefined||data.list[i].authNo==null||data.list[i].authNo=="") {
						htmlcar+="";
					} else {
						htmlcar += '<i class="tip-car"></i><i class="tip-pai"></i>';
					}
					htmlcar += '<div class="clear"></div></p><div class="goods-tips"><div class="one-tip">'+data.list[i].productYear+'</div><div class="one-tip">'+data.list[i].tableShowMileage+'公里</div><div class="one-tip">'+repAddr(data.list[i].vhclAddrProv)+'</div></div></div></div></a>'; 
					$("#floor-body").append(htmlcar);
				}
			}
		}
	});
}
$(function (){
	carseach(1, true);
});

function nextPage() {
	pageNumber++;
	carseach(pageNumber, false);
}
</script>
</html>

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
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<title>我要卖车</title>
<link rel="stylesheet" href="${CONTEXT_PATH}/zdh/css/public.css?version=1.0.0">
<link rel="stylesheet" href="${CONTEXT_PATH}/zdh/css/index.css?version=1.0.0">
<link rel="stylesheet" href="${CONTEXT_PATH}/zdh/css/swiper.css?version=1.0.0">
<link rel="stylesheet" href="${CONTEXT_PATH}/zdh/css/bootstrap.min.css">
<link rel="stylesheet" href="${CONTEXT_PATH}/zdh/css/layout.css">
<script type="text/javascript" src="${CONTEXT_PATH}/zdh/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="${CONTEXT_PATH}/zdh/js/bootstrap.min.js"></script>
<script>
	var PATH="${CONTEXT_PATH}";
</script>
<!--
<script type="text/javascript" src="http://apps.bdimg.com/libs/angular.js/1.2.5/angular.min.js"></script>
<script type="text/javascript" src="http://apps.bdimg.com/libs/angular-route/1.3.13/angular-route.min.js"></script>
<script type="text/javascript" src="http://apps.bdimg.com/libs/angular-resource/1.2.16/angular-resource.min.js"></script>
<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=KtxSv72MRm1rMr8GGMnD4FvA"></script>
-->
</head>
<body>
	<!--
	<div id="warp">
    	<input type="text" name="seach" id="seach_inp" >
        <button onClick="seach();">搜索</button>
        <br/>
        <input type="text" name="seach" id="jx_seach_inp">
        <button onClick="jx_seach();">经销商搜索</button>
    </div> 
    <a href="zdh/buycar.html">购买车</a>
    -->
    <div  class="warp">
    	<header class="h_tit">
            联系人信息
        </header>
        <div class="info">
        	<table width="100%">
            	<tr>
                	<td width="35%"><b>*</b> 联&nbsp;系&nbsp;人：</td>
                    <td><div class="info_inp"><input type="text" name="custName" value="" id="custName" maxlength="300"></div></td>
                </tr>
                <tr>
                	<td><b>*</b> 称&nbsp;&nbsp;&nbsp;&nbsp;呼：</td>
                    <td><div class="info_inp1"><input type="radio" name="custSex"  value="10231001" checked> 先生 &nbsp;&nbsp;<input type="radio" name="custSex" value="10231002"> 女士</div></td>
                </tr>
                <tr>
                	<td><b>*</b> 手机号码：</td>
                    <td><div class="info_inp"><input type="tel" name="mobile" value="" id="mobile" maxlength="120"></div></td>
                </tr>
                <tr>
                	<td><b>*</b> 所在省份：</td>
                    <td>
                    	<div class="info_inp">
                    		<select id="province">
                                <option value="0">请选择</option>
                            </select>
                    	</div>
               		</td>
                </tr>
                <tr>
                	<td><b>*</b> 所在城市：</td>
                    <td><div class="info_inp">
                    		<select id="city">
                                <option value="0">请选择</option>
                            </select>
                      	</div></td>
                </tr>
            </table>
        </div>
        <header class="h_tit">
            旧车信息
        </header>
        <div class="info">
        	<table width="100%">
                <tr>
                    <td width="35%"><b>*</b> 品&nbsp;&nbsp;&nbsp;&nbsp;牌：</td>
                    <td>
                        <div class="info_inp">
                        <select id="brand">
                            <option value="0">选择品牌</option>
                        </select>
                        </div>
                    </td>
                </tr>

                <tr>
                    <td width="35%"><b>*</b> 厂&nbsp;&nbsp;&nbsp;&nbsp;商：</td>
                    <td>
                        <div class="info_inp">
                        <select id="factory">
                            <option value="0">选择厂商</option>
                        </select>
                        </div>
                    </td>
                </tr>

                <tr>
                    <td width="35%"><b>*</b> 现有车系：</td>
                    <td>
                        <div class="info_inp">
                        <select id="saleModel">
                            <option value="0">请选择</option>
                        </select>
                        </div>
                    </td>
                </tr>
            	<tr>
                	<td><b>&nbsp;&nbsp;</b> 预&nbsp;&nbsp;&nbsp;&nbsp;算：</td>
                    <td>
                    	<div class="info_inp">
                    		<select name="budget" id="budget">
                                <option value="28480001">5万以下</option>
                                <option value="28480002">5-8万</option>
                                <option value="28480003">8-10万</option>
                                <option value="28480004">10-12万</option>
                                <option value="28480005">12-18万</option>
                                <option value="28480006">18-25万</option>
                                <option value="28480007">25-50万</option>
                                <option value="28480008">50万以上</option>
                            </select>
                    	</div>
               		</td>
                </tr>
                <tr>
                	<td><b>&nbsp;&nbsp;</b> 有&nbsp;效&nbsp;期：</td>
                    <td>
                    	<div class="info_inp">
                    		<select name="validity" id="validity">
                                <option value="28490001">3天</option>
                                <option value="28490002">一周</option>
                                <option value="28490003">2周</option>
                                <option value="28490004">1个月</option>
                                <option value="28490005">3个月</option>
                                <option value="28490006">6个月</option>
                                <option value="28490007">1年内</option>
                            </select>
                   		</div>
                  	</td>
                </tr>
                <tr>
                    <td><b>&nbsp;&nbsp;</b>初登日期：</td>
                    <td>
                        <div class="info_inp"><input type="date" id="regDate" maxlength="10"></div>
                    </td>
                </tr>
                <tr>
                    <td><b>&nbsp;&nbsp;</b>里&nbsp;&nbsp;&nbsp;&nbsp;程：</td>
                    <td>
                        <div class="info_inp"><input type="text" id="mileage" maxlength="10"></div>
                    </td>
                </tr>
            
                <tr>
                	<td><b>*</b> 经&nbsp;销&nbsp;商：</td>
                    <td><div class="info_inp">
                    	<select id="expectShop">
                    		<option value="0">请选择</option>
                    	</select>
                    </div></td>
                </tr>
                <!--
                <tr>
                	<td><b>*</b> 来源网站：</td>
                    <td><div class="info_inp">
                    	<select id="sourceSite">
                            <option value="BAIDU">百度</option>
                        </select>
                    </div>
                    </td>
                </tr>
                -->
                <tr>
                	<td><b>&nbsp;&nbsp;</b> 备&nbsp;&nbsp;&nbsp;&nbsp;注：</td>
                    <td><div class="info_inp"><input id="usreNote" type="text" maxlength="300"></div></td>
                </tr>
                <tr>
                	<td></td>
                    <td><div class="info_inp info_inp_buy">
                    		<button class="change_btn" onClick="zsubmit();">提 交</button>
                        </div></td>
                </tr>
            </table>
            <input type="hidden" value="BAIDU" name="sourceSite" id="sourceSite">
            <input type="hidden" value="28470002" name="orderType" id="orderType">
        </div>
        
    </div>
<script type="text/javascript" src="js/layout.js"></script>  
<script>
	//车系检索
	//seach_x();
	//品牌检索
    
	
</script> 
</body>
</html>

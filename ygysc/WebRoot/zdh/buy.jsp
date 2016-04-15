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
<title>我要买车</title>
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
    <div class="warp">
    	
        <div class="info">
        	<table width="100%">
            	<tr>
                	<td width="35%"><b>*</b> 联&nbsp;系&nbsp;人：</td>
                    <td><div class="info_inp"><input type="text" name="custName" value="" id="custName" maxlength="50"></div></td>
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
        <div class="hr"></div>
        <div class="info">
        	<table width="100%">
            	<tr>
                	<td  width="35%"><b>&nbsp;&nbsp;</b> 预&nbsp;&nbsp;&nbsp;&nbsp;算：</td>
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
                	<td><b>*</b> 意向车系：</td>
                    <td><div class="info_inp">
                    	<select id="buyModelA">
                            <option value="0">选择车系</option>
                            <option value="1932">途观</option>
                            <option value="595">帕萨特</option>
                            <option value="329">领驭</option>
                            <option value="321">途安</option>
                            <option value="340">朗逸</option>
                            <option value="2786">朗行</option>
                            <option value="330">POLO两厢</option>
                            <option value="291">Cross POLO</option>
                            <option value="2048">POLO三厢</option>
                            <option value="2636">POLO GTI</option>
                            <option value="596">POLO劲情</option>
                            <option value="597">POLO劲取</option>
                            <option value="332">桑塔纳</option>
                            <option value="598">桑塔纳2000</option>
                            <option value="600">桑塔纳3000</option>
                            <option value="599">志俊</option>
                            <option value="2797">速派</option>
                            <option value="1678">昊锐</option>
                            <option value="156">明锐</option>
                            <option value="2731">昕锐</option>
                            <option value="2964">昕动</option>
                            <option value="616">晶锐</option>
                            <option value="2843">野帝</option>
                            <!--
                            <option value="1932">途观</option>
                            <option value="2048">POLO三厢</option>
                            <option value="2636">POLO GTI</option>
                            <option value="2786">朗行</option>
                            <option value="2839">朗境</option>
                            <option value="291">Cross POLO</option>
                            <option value="3089">凌渡</option>
                            <option value="3161">桑塔纳浩纳</option>
                            <option value="321">途安</option>
                            <option value="329">领驭</option>
                            <option value="330">POLO两厢</option>
                            <option value="332">桑塔纳</option>
                            <option value="333">高尔</option>
                            <option value="340">朗逸</option>
                            <option value="595">帕萨特</option>
                            <option value="596">POLO劲情</option>
                            <option value="597">POLO劲取</option>
                            <option value="598">桑塔纳2000</option>
                            <option value="599">志俊</option>
                            <option value="600">桑塔纳3000</option>
                            <option value="156">明锐</option>
                            <option value="1678">昊锐</option>
                            <option value="2029">明锐RS</option>
                            <option value="2467">晶锐Scout</option>
                            <option value="2731">昕锐</option>
                            <option value="2797">速派</option>
                            <option value="2843">野帝</option>
                            <option value="2964">昕动</option>
                            <option value="616">晶锐</option>
                            -->
                        </select>
                    </div></td>
                </tr>
            
                <tr>
                	<td><b>*</b> 经&nbsp;销&nbsp;商：</td>
                    <td><div class="info_inp">
                    	<select id="expectShop">
                    		<option value="0">请选择</option>
                    	</select>
                    </div></td>
                </tr>
                
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
            <input type="hidden" value="28470001" name="orderType" id="orderType">
        </div>
        
    </div>
<script type="text/javascript" src="js/layout.js"></script>  
<script>
	//车系检索
	//seach_x();
</script>  	
</body>
</html>

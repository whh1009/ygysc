<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" >
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-touch-fullscreen" content="YES">
<meta content="telephone=no" name="format-detection">
<meta content="black" name="apple-mobile-web-app-status-bar-style">     
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<title>大众易手车</title>
<link rel="stylesheet" href="${CONTEXT_PATH}/zdh/css/bootstrap.min.css">
<link rel="stylesheet" href="${CONTEXT_PATH}/zdh/css/layout.css">
<script type="text/javascript" src="${CONTEXT_PATH}/zdh/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="${CONTEXT_PATH}/zdh/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="car">
   		<select id="modelId">
        	<option>车型</option>
            <option value="大众">大众</option>
        </select>
        <select id="displayPrice">
        	<option>价格</option>
            <option value="">5万以下</option>
            <option>5万-8万</option>
            <option>8万-12万</option>
            <option>12万-16万</option>
            <option>16万-20万</option>
            <option>20万-25万</option>
            <option>25万-30万</option>
            <option>30万以上</option>
        </select>
        <select id="carAge">
        	<option>车龄</option>
            <option>1年以内</option>
            <option>2年以内</option>
            <option>3年以内</option>
            <option>3年-5年</option>
            <option>5年-8年</option>
            <option>8年以上</option>
        </select>
        <select id="city">
        	<option>城市</option>
            <option>南京</option>
        </select>
        <button onClick="seach_car();">搜索</button>
    </div>
	<div id="warp">
    	<table width="500" cellpadding="0" cellspacing="0">
        	<tr>
            	<td width="30%">姓名</td>
                <td width="70%"><input type="text" name="custName" value="" id="custName" maxlength="300"></td>
            </tr>
            <tr>
            	<td width="30%">性别</td>
                <td width="70%">
                <select name="custSex" id="custSex">
                	<option value="10231001">男</option>
                    <option value="10231002">女</option>
                </select>
                </td>
            </tr>
            <tr>
            	<td width="30%">电话</td>
                <td width="70%"><input type="text" name="mobile" value="" id="mobile" maxlength="120"></td>
            </tr>
            <tr>
            	<td width="30%">地区</td>
                <td width="70%">
                	<select id="province">
                        <option value="0">请选择</option>
                    </select>
                    <select id="city">
                        <option value="0">请选择</option>
                    </select>
              	</td>
            </tr>
            <tr>
            	<td width="30%">注册ID</td>
                <td width="70%"><input type="text" name="registId" value="" id="registId" maxlength="20"></td>
            </tr>
            <tr>
            	<td width="30%">订单属性</td>
                <td width="70%">
                	<select name="orderType" id="orderType">
                  		<option value="28470001">求购</option>
                        <option value="28470002">卖车</option>
                        <option value="28470003">置换新车</option>
                        <option value="28470004">置换易手车</option>
                    </select>
             	</td>
            </tr>
            <tr>
            	<td width="30%">预算</td>
                <td width="70%">
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
             	</td>
            </tr>
            <tr>
            	<td width="30%">需求有效期</td>
                <td width="70%">
                	<select name="validity" id="validity">
                  		<option value="28490001">3天</option>
                        <option value="28490002">一周</option>
                        <option value="28490003">2周</option>
                        <option value="28490004">1个月</option>
                        <option value="28490005">3个月</option>
                        <option value="28490006">6个月</option>
                        <option value="28490007">1年内</option>
                    </select>
             	</td>
            </tr>
            <tr>
            	<td width="30%">意向车型A</td>
                <td width="70%">
                	<select id="buyModelA">
                    	<option>请选择</option>
                    </select>
             	</td>
            </tr>
            <tr>
            	<td width="30%">其他A</td>
                <td width="70%">
                	<input id="buyOtherA" type="text" maxlength="300">
             	</td>
            </tr>
            <tr>
            	<td width="30%">意向车型B</td>
                <td width="70%">
                	<select id="buyModelB">
                    	<option>请选择</option>
                    </select>
             	</td>
            </tr>
            <tr>
            	<td width="30%">其他B</td>
                <td width="70%">
                	<input id="buyOtherB" type="text" maxlength="300">
             	</td>
            </tr>
            <tr>
            	<td width="30%">意向车型C</td>
                <td width="70%">
                	<select id="buyModelC">
                    	<option>请选择</option>
                    </select>
             	</td>
            </tr>
            <tr>
            	<td width="30%">其他C</td>
                <td width="70%">
                	<input id="buyOtherC" type="text" maxlength="300">
             	</td>
            </tr>
            <tr>
            	<td width="30%">现有车车型</td>
                <td width="70%">
                	<select id="saleModel">
                    	<option>请选择</option>
                    </select>
             	</td>
            </tr>
            <tr>
            	<td width="30%">其他</td>
                <td width="70%">
                	<input id="saleOther" type="text" maxlength="300">
             	</td>
            </tr>
            <tr>
            	<td width="30%">初登日期</td>
                <td width="70%">
                	<input type="date" id="regDate" maxlength="10">
             	</td>
            </tr>
            <tr>
            	<td width="30%">里程</td>
                <td width="70%">
                	<input type="text" id="mileage" maxlength="10">
             	</td>
            </tr>
            <tr>
            	<td width="30%">期望4S店</td>
                <td width="70%">
                	<select id="expectShop">
                    	<option>请选择</option>
                    </select>
             	</td>
            </tr>
            <tr>
            	<td width="30%">用户备注</td>
                <td width="70%">
                	<input id="usreNote" type="text" maxlength="300">
             	</td>
            </tr>
            
            <tr>
            	
                <td align="center" colspan="2">
               		<button id="zsubmit" onClick="zsubmit();">提交</button>
             	</td>
            </tr>
        </table>
        <input type="hidden" value="BAIDU" name="sourceSite" id="sourceSite">
    </div> 
<script type="text/javascript" src="${CONTEXT_PATH}/zdh/js/layout.js"></script>  
</body>
</html>

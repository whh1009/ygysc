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
<title>我要换车</title>
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
        	意向车型
        </header>
        <div class="info">
        	<table width="100%">
                <tr>
                    <td  width="35%"><b>*</b> 意向车系：</td>
                    <td><div class="info_inp">
                        <select id="buyModelA">
                            <option value="0">选择车系</option>
                            <!--
                            <option value="1932">途观</option>
                            <option value="595">帕萨特</option>
                            <option value="321">途安</option>
                            <option value="340_2786_2839">朗逸系列</option>
                            <option value="330_596_597_2048_2636_291">POLO系列</option>
                            <option value="332_598_600_599">桑塔纳系列</option>
                            <option value="2797">速派</option>
                            <option value="156">明锐</option>
                            <option value="2731">昕锐</option>
                            <option value="2964">昕动</option>
                            <option value="616">晶锐</option>
                            <option value="2843">野帝</option>
                            -->
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
                        </select>
                    </div></td>
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
                    <td ><b>&nbsp;&nbsp;</b> 预&nbsp;&nbsp;&nbsp;&nbsp;算：</td>
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

<option value="476,504,544">大众</option>
<option value="486,537">斯柯达</option>
<option value="451,453,529">本田</option>
<option value="446,463,487,502,546">丰田</option>
<option value="432,467,494,516,633,801">一汽</option>
<option value="444,469,540">日产</option>
<option value="461,482,549">铃木</option>
<option value="462,492">东风</option>
<option value="480,495,535">克莱斯勒</option>
<option value="452,499,511,526">雪佛兰</option>
<option value="455,500,557">马自达</option>
<option value="489,503">双环</option>
<option value="491,505,543">福特</option>
<option value="468,508,513,545,645">三菱</option>
<option value="496,519">长丰</option>
<option value="507,521,573">标致</option>
<option value="481,522">凯迪拉克</option>
<option value="514,523,661">宝马</option>
<option value="421,530">奥迪</option>
<option value="498,531,617,648">奔驰</option>
<option value="470,539,637">菲亚特</option>
<option value="497,542">道奇</option>
<option value="484,550">起亚</option>
<option value="450,559">现代</option>
<option value="490,561,961">名爵</option>
<option value="471,566">沃尔沃</option>
<option value="454,567,701">雪铁龙</option>
<option value="466,576">吉利</option>
<option value="440,584">吉普</option>
<option value="456,587">别克</option>
<option value="585,608">庞蒂克</option>
<option value="485,611">五菱</option>
<option value="541,612">雷诺</option>
<option value="447,614">万丰</option>
<option value="564,615">三星</option>
<option value="443,618">海马</option>
<option value="524,721">阿尔法罗米欧</option>
<option value="640,802">恒天</option>
<option value="493,901">比亚迪</option>
<option value="650">AC Schnitzer</option>
<option value="646">Arash</option>
<option value="586">GMC</option>
<option value="635">GTA Motor</option>
<option value="628">GUMPERT</option>
<option value="643">Knight</option>
<option value="841">KTM</option>
<option value="636">MARUSSIA</option>
<option value="642">MAXUS大通</option>
<option value="641">Pgo</option>
<option value="552">Smart</option>
<option value="644">Spirra</option>
<option value="525">阿斯顿马丁</option>
<option value="520">安驰</option>
<option value="599">奥兹莫比尔</option>
<option value="631">巴博斯</option>
<option value="625">宝骏</option>
<option value="423">宝龙</option>
<option value="649">宝马M</option>
<option value="553">保时捷</option>
<option value="632">北京汽车</option>
<option value="881">北汽幻速</option>
<option value="422">北汽制造</option>
<option value="761">北汽制造厂</option>
<option value="465">奔腾</option>
<option value="562">宾利</option>
<option value="532">波罗乃兹</option>
<option value="589">布加迪</option>
<option value="624">布里斯托尔</option>
<option value="426">昌河</option>
<option value="607">川汽</option>
<option value="534">达契亚</option>
<option value="457">大迪</option>
<option value="590">大发</option>
<option value="533">大宇</option>
<option value="602">帝豪</option>
<option value="441">东南</option>
<option value="538">法拉利</option>
<option value="634">菲斯克</option>
<option value="596">丰田Scion</option>
<option value="583">伏尔加</option>
<option value="510">福迪</option>
<option value="429">福田</option>
<option value="741">观致</option>
<option value="616">光冈</option>
<option value="620">广汽</option>
<option value="483">哈飞</option>
<option value="803">海格</option>
<option value="547">悍马</option>
<option value="821">航天</option>
<option value="424">黑豹</option>
<option value="501">红旗</option>
<option value="518">华北</option>
<option value="433">华普</option>
<option value="475">华泰</option>
<option value="458">华翔</option>
<option value="619">华阳</option>
<option value="438">黄海</option>
<option value="578">汇众</option>
<option value="595">霍顿</option>
<option value="431">吉奥</option>
<option value="609">吉姆</option>
<option value="479">江淮</option>
<option value="459">江铃</option>
<option value="439">江南</option>
<option value="551">捷豹</option>
<option value="474">金杯</option>
<option value="435">金程</option>
<option value="613">九龙</option>
<option value="681">卡尔森</option>
<option value="861">卡威</option>
<option value="604">开瑞</option>
<option value="639">凯佰赫</option>
<option value="922">凯马汽车</option>
<option value="600">柯尼赛格</option>
<option value="555">拉达</option>
<option value="571">兰博基尼</option>
<option value="591">蓝旗亚</option>
<option value="626">劳伦士</option>
<option value="548">劳斯莱斯</option>
<option value="569">雷克萨斯</option>
<option value="509">力帆</option>
<option value="606">莲花</option>
<option value="580">林肯</option>
<option value="941">陆地方舟</option>
<option value="460">陆风</option>
<option value="536">路虎</option>
<option value="568">路特斯</option>
<option value="556">罗孚</option>
<option value="579">玛莎拉蒂</option>
<option value="558">迈巴赫</option>
<option value="627">迈凯轮</option>
<option value="622">梅尔库斯</option>
<option value="448">美亚</option>
<option value="560">迷你</option>
<option value="638">摩根</option>
<option value="629">纳智捷</option>
<option value="506">南汽</option>
<option value="572">讴歌</option>
<option value="554">欧宝</option>
<option value="601">帕加尼</option>
<option value="597">普利茅斯</option>
<option value="464">奇瑞</option>
<option value="436">庆铃</option>
<option value="478">荣威</option>
<option value="603">瑞麒</option>
<option value="563">萨博</option>
<option value="442">赛宝</option>
<option value="430">厦门金龙</option>
<option value="647">陕汽通家</option>
<option value="565">世爵</option>
<option value="527">双龙</option>
<option value="594">水星</option>
<option value="528">斯巴鲁</option>
<option value="592">塔塔</option>
<option value="621">特纳蒙塔纳</option>
<option value="921">特斯拉</option>
<option value="477">天津一汽</option>
<option value="445">天马</option>
<option value="581">通宝</option>
<option value="437">通田</option>
<option value="588">土星</option>
<option value="605">威麟</option>
<option value="630">威兹曼</option>
<option value="598">沃克斯豪尔</option>
<option value="582">五十铃</option>
<option value="593">西雅特</option>
<option value="427">新大地</option>
<option value="574">新凯</option>
<option value="781">新龙马</option>
<option value="434">依维柯</option>
<option value="570">英菲尼迪</option>
<option value="512">英格尔</option>
<option value="577">英伦</option>
<option value="981">英致</option>
<option value="428">永源汽车</option>
<option value="575">云豹</option>
<option value="515">云雀</option>
<option value="425">长安</option>
<option value="488">长城</option>
<option value="473">中华</option>
<option value="623">中欧</option>
<option value="472">中顺</option>
<option value="449">中兴</option>
<option value="610">中誉</option>
<option value="517">众泰</option>

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
                            <option value="0">选择车系</option>
                        </select>
                        </div>
                    </td>
                </tr>
                
                <tr>
                    <td><b>&nbsp;&nbsp;</b>初登日期</td>
                    <td>
                        <div class="info_inp"><div class="info_inp"><input type="date" id="regDate" maxlength="10"></div></div>
                    </td>
                </tr>
                <tr>
                    <td><b>&nbsp;&nbsp;</b>里&nbsp;&nbsp;&nbsp;&nbsp;程</td>
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
                            
                            <option value="DWA">官网代码</option>
                            <option value="WX">微信</option>
                            <option value="58">58</option>
                            <option value="DOW">经销商官网</option>
                            
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
                    <td><div class="info_inp">
                    		<button class="change_btn" onClick="zsubmit();">提 交</button>
                        </div></td>
                </tr>
            </table>
            <input type="hidden" value="BAIDU" name="sourceSite" id="sourceSite">
            <input type="hidden" value="28470003" name="orderType" id="orderType">
        </div>
    </div>
<script type="text/javascript" src="js/layout.js"></script>  
<script>
	//车系检索
	//seach_x();
</script> 
</body>
</html>

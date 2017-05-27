
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object cart extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[List[Cart],List[Commodity],Double,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(items: List[Cart],commoditys: List[Commodity],money: Double,current_user:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.83*/("""

<!DOCTYPE html>
<html>
	<head>
		<title>购物车</title>
		<link href=""""),_display_(Seq[Any](/*7.16*/routes/*7.22*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*7.61*/("""" rel="stylesheet" type="text/css" media="all" />
		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script src=""""),_display_(Seq[Any](/*9.17*/routes/*9.23*/.Assets.at("javascripts/jquery.min.js"))),format.raw/*9.62*/(""""></script>
		<!-- Custom Theme files -->
		<!--theme-style-->
		<link href=""""),_display_(Seq[Any](/*12.16*/routes/*12.22*/.Assets.at("stylesheets/style.css"))),format.raw/*12.57*/("""" rel="stylesheet" type="text/css" media="all" />
		<!--//theme-style-->
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="keywords" content="New Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
		Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
		<script type="application/x-javascript"> addEventListener("load", function() """),format.raw/*18.80*/("""{"""),format.raw/*18.81*/(""" setTimeout(hideURLbar, 0); """),format.raw/*18.109*/("""}"""),format.raw/*18.110*/(""", false); function hideURLbar()"""),format.raw/*18.141*/("""{"""),format.raw/*18.142*/(""" window.scrollTo(0,1); """),format.raw/*18.165*/("""}"""),format.raw/*18.166*/(""" </script>
		<!--fonts-->
		<!-- start menu -->
		<link href=""""),_display_(Seq[Any](/*21.16*/routes/*21.22*/.Assets.at("stylesheets/memenu.css"))),format.raw/*21.58*/("""" rel="stylesheet" type="text/css" media="all" />
		<script type="text/javascript" src=""""),_display_(Seq[Any](/*22.40*/routes/*22.46*/.Assets.at("javascripts/memenu.js"))),format.raw/*22.81*/(""""></script>
		<script>$(document).ready(function()"""),format.raw/*23.39*/("""{"""),format.raw/*23.40*/("""$(".memenu").memenu();"""),format.raw/*23.62*/("""}"""),format.raw/*23.63*/(""");</script>
		<script src=""""),_display_(Seq[Any](/*24.17*/routes/*24.23*/.Assets.at("javascripts/simpleCart.min.js"))),format.raw/*24.66*/(""""> </script>
	</head>
	<body>
		<!--header-->
		<div class="header">
			<div class="header-top">
				<div class="container">
					<div class="search">
						<form>
							<input type="text" value="Search " onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*33.100*/("""{"""),format.raw/*33.101*/("""this.value = 'Search';"""),format.raw/*33.123*/("""}"""),format.raw/*33.124*/("""">
							<input type="submit" value="Go">
						</form>
					</div>
					<div class="header-left">
						<ul>
"""),_display_(Seq[Any](/*39.2*/if(current_user=="登录")/*39.24*/{_display_(Seq[Any](format.raw/*39.25*/("""<li ><a href="/login"  >登录</a></li><li><a  href="/register"  >注册</a></li>""")))}/*39.99*/else/*39.103*/{_display_(Seq[Any](format.raw/*39.104*/("""<li ><a href="#"  >"""),_display_(Seq[Any](/*39.124*/current_user)),format.raw/*39.136*/("""</a></li>""")))})),format.raw/*39.146*/("""

						</ul>
						<div class="cart box_1">
							<a href="/checkout">
								<h3> <div class="total">购物车</div>
									<img src=""""),_display_(Seq[Any](/*45.21*/routes/*45.27*/.Assets.at("images/cart.png"))),format.raw/*45.56*/("""" alt=""/></h3>
							</a>
							<!-- <p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p> -->

						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
			<div class="container">
				<div class="head-top">
					<div class="logo">
						<a href="/"><img src=""""),_display_(Seq[Any](/*58.30*/routes/*58.36*/.Assets.at("images/logo.png"))),format.raw/*58.65*/("""" alt=""></a>
					</div>
					<div class=" h_menu4">
						<ul class="memenu skyblue">
							<li class="active grid"><a class="color8" href="/">首页</a></li>
							<li><a class="color1" href="#">店铺管理</a></li>
							<li class="grid"><a class="color2" href="#">后台管理</a></li>
							<li><a class="color4" href="/blog">所有帖子</a></li>
							<!-- <li><a class="color6" href="/contact">Conact</a></li> -->
						</ul>
					</div>

					<div class="clearfix"> </div>
				</div>
			</div>

		</div>


		<div class="container">
			<div class="check">
				<h1>我的购物车</h1>
				<div class="col-md-9 cart-items">
					"""),_display_(Seq[Any](/*81.7*/for(item <- items) yield /*81.25*/{_display_(Seq[Any](format.raw/*81.26*/("""
					        <script>$(document).ready(function(c) """),format.raw/*82.52*/("""{"""),format.raw/*82.53*/("""
                            $('#del"""),_display_(Seq[Any](/*83.37*/item/*83.41*/.commodityId)),format.raw/*83.53*/("""').on('click', function(c)"""),format.raw/*83.79*/("""{"""),format.raw/*83.80*/("""
	                            $('#cart-header"""),_display_(Seq[Any](/*84.46*/item/*84.50*/.commodityId)),format.raw/*84.62*/("""').fadeOut('slow', function(c)"""),format.raw/*84.92*/("""{"""),format.raw/*84.93*/("""
		                            $('#cart-header"""),_display_(Seq[Any](/*85.47*/item/*85.51*/.commodityId)),format.raw/*85.63*/("""').remove();
		                            $('#deldetails"""),_display_(Seq[Any](/*86.46*/item/*86.50*/.commodityId)),format.raw/*86.62*/("""').remove();
		                            			$.ajax("""),format.raw/*87.41*/("""{"""),format.raw/*87.42*/("""
					                                url:"/delcart?id="""),_display_(Seq[Any](/*88.56*/item/*88.60*/.commodityId)),format.raw/*88.72*/("""",
					                                type:"get",
					                                success:function (data) """),format.raw/*90.62*/("""{"""),format.raw/*90.63*/("""
                                                        if(data=="success")
                                                            alert("添加成功");
					                                """),format.raw/*93.38*/("""}"""),format.raw/*93.39*/("""
			                                """),format.raw/*94.36*/("""}"""),format.raw/*94.37*/(""")
	                            """),format.raw/*95.30*/("""}"""),format.raw/*95.31*/(""");
                            """),format.raw/*96.29*/("""}"""),format.raw/*96.30*/(""");
                            """),format.raw/*97.29*/("""}"""),format.raw/*97.30*/(""");
					</script>
					<div class="cart-header" id="cart-header"""),_display_(Seq[Any](/*99.47*/item/*99.51*/.commodityId)),format.raw/*99.63*/("""">
						<div id="del"""),_display_(Seq[Any](/*100.20*/item/*100.24*/.commodityId)),format.raw/*100.36*/("""" class="close1"> </div>
						<div class="cart-sec simpleCart_shelfItem">
							<div class="cart-item cyc">
								<img src=""""),_display_(Seq[Any](/*103.20*/routes/*103.26*/.Assets.at("uploads/commodity_"))),_display_(Seq[Any](/*103.59*/item/*103.63*/.commodityId)),format.raw/*103.75*/("""" class="img-responsive" alt=""/>
							</div>
							<div class="cart-item-info">
								<span>数量</span>
						        <span class="total1"> x """),_display_(Seq[Any](/*107.40*/item/*107.44*/.number)),format.raw/*107.51*/("""</span>
							</div>
							<div class="clearfix"></div>
						</div>
					</div>
					""")))})),format.raw/*112.7*/("""
				</div>
				<div class="col-md-3 cart-total">

					"""),_display_(Seq[Any](/*116.7*/for(commodity<-commoditys) yield /*116.33*/{_display_(Seq[Any](format.raw/*116.34*/("""
					<div class="price-details" id="deldetails"""),_display_(Seq[Any](/*117.48*/commodity/*117.57*/.commodityId)),format.raw/*117.69*/("""">
						<h3>价格细节</h3>
						<span>单价</span>
						<span class="total1">"""),_display_(Seq[Any](/*120.29*/commodity/*120.38*/.price)),format.raw/*120.44*/("""</span>
						<span>折扣</span>
						<span class="total1">"""),_display_(Seq[Any](/*122.29*/commodity/*122.38*/.agio)),format.raw/*122.43*/("""</span>
						<span>名称</span>
						<span class="total1">"""),_display_(Seq[Any](/*124.29*/commodity/*124.38*/.commodityName)),format.raw/*124.52*/("""</span>
						<div class="clearfix"></div>
					</div>
					<div class="clearfix"></div>
					<br><br>
					""")))})),format.raw/*129.7*/("""
					
					<ul class="total_price">
						<li class="last_price"> <h4>总计</h4></li>
						<li class="last_price"><span>"""),_display_(Seq[Any](/*133.37*/money)),format.raw/*133.42*/("""</span></li>
						<div class="clearfix"> </div>
					</ul>
					<a class="order" id="buyall" href="#">支付</a>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		
		<script>
	$(document).ready(function () """),format.raw/*143.32*/("""{"""),format.raw/*143.33*/("""
		$("#buyall").click(function () """),format.raw/*144.34*/("""{"""),format.raw/*144.35*/("""
			$.ajax("""),format.raw/*145.11*/("""{"""),format.raw/*145.12*/("""
					url:"/buy",
					type:"get",
					success:function (data) """),format.raw/*148.30*/("""{"""),format.raw/*148.31*/("""
                        alert(data);
                        location.reload() 
					"""),format.raw/*151.6*/("""}"""),format.raw/*151.7*/("""
			"""),format.raw/*152.4*/("""}"""),format.raw/*152.5*/(""")
		"""),format.raw/*153.3*/("""}"""),format.raw/*153.4*/(""")

	"""),format.raw/*155.2*/("""}"""),format.raw/*155.3*/(""")
</script>
		<!--//content-->
		<div class="footer">
			<div class="footer-class">
				<p >Copyright &copy; 2017</p>
			</div>
		</div>
	</body>
</html>
"""))}
    }
    
    def render(items:List[Cart],commoditys:List[Commodity],money:Double,current_user:String): play.api.templates.HtmlFormat.Appendable = apply(items,commoditys,money,current_user)
    
    def f:((List[Cart],List[Commodity],Double,String) => play.api.templates.HtmlFormat.Appendable) = (items,commoditys,money,current_user) => apply(items,commoditys,money,current_user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 27 15:11:19 CST 2017
                    SOURCE: /home/byer/haha/Amaze_Play_Framework-master/app/views/cart.scala.html
                    HASH: 591e6c8008df974c89e2db98db91f07ac7ad3da9
                    MATRIX: 807->1|982->82|1092->157|1106->163|1166->202|1334->335|1348->341|1408->380|1525->461|1540->467|1597->502|2189->1066|2218->1067|2275->1095|2305->1096|2365->1127|2395->1128|2447->1151|2477->1152|2579->1218|2594->1224|2652->1260|2778->1350|2793->1356|2850->1391|2929->1442|2958->1443|3008->1465|3037->1466|3102->1495|3117->1501|3182->1544|3483->1816|3513->1817|3564->1839|3594->1840|3747->1958|3778->1980|3817->1981|3910->2055|3924->2059|3964->2060|4021->2080|4056->2092|4099->2102|4276->2243|4291->2249|4342->2278|4730->2630|4745->2636|4796->2665|5460->3294|5494->3312|5533->3313|5614->3366|5643->3367|5717->3405|5730->3409|5764->3421|5818->3447|5847->3448|5930->3495|5943->3499|5977->3511|6035->3541|6064->3542|6148->3590|6161->3594|6195->3606|6290->3665|6303->3669|6337->3681|6419->3735|6448->3736|6541->3793|6554->3797|6588->3809|6731->3924|6760->3925|6980->4117|7009->4118|7074->4155|7103->4156|7163->4188|7192->4189|7252->4221|7281->4222|7341->4254|7370->4255|7472->4321|7485->4325|7519->4337|7579->4360|7593->4364|7628->4376|7797->4508|7813->4514|7877->4547|7891->4551|7926->4563|8114->4714|8128->4718|8158->4725|8284->4819|8381->4880|8424->4906|8464->4907|8550->4956|8569->4965|8604->4977|8717->5053|8736->5062|8765->5068|8862->5128|8881->5137|8909->5142|9006->5202|9025->5211|9062->5225|9208->5339|9369->5463|9397->5468|9655->5697|9685->5698|9749->5733|9779->5734|9820->5746|9850->5747|9946->5814|9976->5815|10093->5904|10122->5905|10155->5910|10184->5911|10217->5916|10246->5917|10280->5923|10309->5924
                    LINES: 26->1|29->1|35->7|35->7|35->7|37->9|37->9|37->9|40->12|40->12|40->12|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|51->23|52->24|52->24|52->24|61->33|61->33|61->33|61->33|67->39|67->39|67->39|67->39|67->39|67->39|67->39|67->39|67->39|73->45|73->45|73->45|86->58|86->58|86->58|109->81|109->81|109->81|110->82|110->82|111->83|111->83|111->83|111->83|111->83|112->84|112->84|112->84|112->84|112->84|113->85|113->85|113->85|114->86|114->86|114->86|115->87|115->87|116->88|116->88|116->88|118->90|118->90|121->93|121->93|122->94|122->94|123->95|123->95|124->96|124->96|125->97|125->97|127->99|127->99|127->99|128->100|128->100|128->100|131->103|131->103|131->103|131->103|131->103|135->107|135->107|135->107|140->112|144->116|144->116|144->116|145->117|145->117|145->117|148->120|148->120|148->120|150->122|150->122|150->122|152->124|152->124|152->124|157->129|161->133|161->133|171->143|171->143|172->144|172->144|173->145|173->145|176->148|176->148|179->151|179->151|180->152|180->152|181->153|181->153|183->155|183->155
                    -- GENERATED --
                */
            
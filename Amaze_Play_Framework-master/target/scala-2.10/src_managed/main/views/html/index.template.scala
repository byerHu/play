
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Commodity],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(lines: List[Commodity],current_user:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.46*/("""

<!DOCTYPE html>
<html>
<head>
<title>首页</title>
<link href=""""),_display_(Seq[Any](/*7.14*/routes/*7.20*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*7.59*/("""" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src=""""),_display_(Seq[Any](/*9.15*/routes/*9.21*/.Assets.at("javascripts/jquery.min.js"))),format.raw/*9.60*/(""""></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href=""""),_display_(Seq[Any](/*12.14*/routes/*12.20*/.Assets.at("stylesheets/style.css"))),format.raw/*12.55*/("""" rel="stylesheet" type="text/css" media="all" />
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="New Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() """),format.raw/*18.78*/("""{"""),format.raw/*18.79*/(""" setTimeout(hideURLbar, 0); """),format.raw/*18.107*/("""}"""),format.raw/*18.108*/(""", false); function hideURLbar()"""),format.raw/*18.139*/("""{"""),format.raw/*18.140*/(""" window.scrollTo(0,1); """),format.raw/*18.163*/("""}"""),format.raw/*18.164*/(""" </script>
<!--fonts-->
<!-- start menu -->
<link href=""""),_display_(Seq[Any](/*21.14*/routes/*21.20*/.Assets.at("stylesheets/memenu.css"))),format.raw/*21.56*/("""" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src=""""),_display_(Seq[Any](/*22.38*/routes/*22.44*/.Assets.at("javascripts/memenu.js"))),format.raw/*22.79*/(""""></script>
<script>$(document).ready(function()"""),format.raw/*23.37*/("""{"""),format.raw/*23.38*/("""$(".memenu").memenu();"""),format.raw/*23.60*/("""}"""),format.raw/*23.61*/(""");</script>
<script src=""""),_display_(Seq[Any](/*24.15*/routes/*24.21*/.Assets.at("javascripts/simpleCart.min.js"))),format.raw/*24.64*/(""""> </script>
</head>
<body>
<!--header-->
<div class="header">
	<div class="header-top">
		<div class="container">
			<div class="search">
					<form>
						<input type="text" value="Search " onFocus="this.value = '';" onBlur="if (this.value == '') """),format.raw/*33.99*/("""{"""),format.raw/*33.100*/("""this.value = 'Search';"""),format.raw/*33.122*/("""}"""),format.raw/*33.123*/("""">
						<input type="submit" value="Go">
					</form>
			</div>
			<div class="header-left">
					<ul>
					"""),_display_(Seq[Any](/*39.7*/if(current_user=="登录")/*39.29*/{_display_(Seq[Any](format.raw/*39.30*/("""<li ><a href="/login"  >登录</a></li><li><a  href="/register"  >注册</a></li>""")))}/*39.104*/else/*39.108*/{_display_(Seq[Any](format.raw/*39.109*/("""<li ><a href="#"  >"""),_display_(Seq[Any](/*39.129*/current_user)),format.raw/*39.141*/("""</a></li>""")))})),format.raw/*39.151*/("""
						

					</ul>
					<div class="cart box_1">
						<a href="/checkout">
						<h3> <div class="total">购物车</div>
							<img src=""""),_display_(Seq[Any](/*46.19*/routes/*46.25*/.Assets.at("images/cart.png"))),format.raw/*46.54*/("""" alt=""/></h3>
						</a>
						<!-- <p><a href="javascript:;" class="simpleCart_empty">清空购物车</a></p> -->

					</div>
					<div class="clearfix"> </div>
			</div>
				<div class="clearfix"> </div>
		</div>
		</div>
		<div class="container">
			<div class="head-top">
				<div class="logo">
					<a href="/"><img src=""""),_display_(Seq[Any](/*59.29*/routes/*59.35*/.Assets.at("images/logo.png"))),format.raw/*59.64*/("""" alt=""></a>
				</div>
		  <div class=" h_menu4">
				<ul class="memenu skyblue">
					<li class="active grid"><a class="color8" href="/">主页</a></li>

				  <li><a class="color4" href="/blog">帖子</a></li>
				  """),_display_(Seq[Any](/*66.8*/if(current_user.indexOf("商家") != -1 || current_user.indexOf("管理员") != -1)/*66.81*/{_display_(Seq[Any](format.raw/*66.82*/("""
				  <li><a class="color6" href="/"""),_display_(Seq[Any](/*67.37*/if(current_user.indexOf("管理员") == -1)/*67.74*/{_display_(Seq[Any](format.raw/*67.75*/("""business""")))}/*67.84*/else/*67.88*/{_display_(Seq[Any](format.raw/*67.89*/("""admin""")))})),format.raw/*67.95*/("""">个人中心</a></li>
				  """)))}/*68.8*/else/*68.12*/{})),format.raw/*68.14*/("""
			  </ul>
			</div>

				<div class="clearfix"> </div>
		</div>
		</div>

	</div>

	<div class="banner">
		<div class="container">
			  <script src=""""),_display_(Seq[Any](/*80.20*/routes/*80.26*/.Assets.at("javascripts/responsiveslides.min.js"))),format.raw/*80.75*/(""""></script>
  <script>
    $(function () """),format.raw/*82.19*/("""{"""),format.raw/*82.20*/("""
      $("#slider").responsiveSlides("""),format.raw/*83.37*/("""{"""),format.raw/*83.38*/("""
      	auto: true,
      	nav: true,
      	speed: 500,
        namespace: "callbacks",
        pager: true,
      """),format.raw/*89.7*/("""}"""),format.raw/*89.8*/(""");
    """),format.raw/*90.5*/("""}"""),format.raw/*90.6*/(""");
  </script>
			<div  id="top" class="callbacks_container">
			<ul class="rslides" id="slider">
			    <li>

						<div class="banner-text">
							<h3>华伦天奴西服 </h3>
						<p>时间成就经典，岁月铸造永恒</p>

						</div>

				</li>
				<li>

						<div class="banner-text">
							<h3>爱登堡服装 </h3>
						<p>男人简单就好！</p>


						</div>

				</li>
				<li>
						<div class="banner-text">
							<h3>雪梦莱牌服装</h3>
						<p>潇潇洒洒雪梦莱，“一年半载”有风采！</p>
						</div>

				</li>
			</ul>
		</div>

	</div>
	</div>
<!--content-->
<div class="content">
	<div class="container">
	<div class="content-top">
		<h1>新品发布</h1>
		<div class="grid-in">
		    """),_display_(Seq[Any](/*131.8*/for(line <- lines) yield /*131.26*/{_display_(Seq[Any](format.raw/*131.27*/("""
			<div class="col-md-4 grid-top">
				<a href="/item?id="""),_display_(Seq[Any](/*133.24*/line/*133.28*/.commodityId)),format.raw/*133.40*/("""" class="b-link-stripe b-animate-go  thickbox"><img style="height:300px" class="img-responsive" src=""""),_display_(Seq[Any](/*133.142*/routes/*133.148*/.Assets.at("uploads/commodity_"))),_display_(Seq[Any](/*133.181*/line/*133.185*/.commodityId)),format.raw/*133.197*/("""" alt="">
							<div class="b-wrapper">
									<h3 class="b-animate b-from-left    b-delay03 ">
										<span>"""),_display_(Seq[Any](/*136.18*/line/*136.22*/.commodityName)),format.raw/*136.36*/("""</span>
									</h3>
								</div>
				</a>


			<p><a href="/item?id="""),_display_(Seq[Any](/*142.26*/line/*142.30*/.commodityId)),format.raw/*142.42*/("""">"""),_display_(Seq[Any](/*142.45*/line/*142.49*/.commodityName)),format.raw/*142.63*/("""</a></p>
			</div>
			""")))})),format.raw/*144.5*/("""


					<div class="clearfix"> </div>
		</div>
	</div>
	<!----->

	<div class="content-top-bottom">
		<h2>特色商品</h2>
		<div class="col-md-6 men">
			<a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src=""""),_display_(Seq[Any](/*155.105*/routes/*155.111*/.Assets.at("images/t1.jpg"))),format.raw/*155.138*/("""" alt="">
				<div class="b-wrapper">
									<h3 class="b-animate b-from-top top-in   b-delay03 ">
										<span>女鞋</span>
									</h3>
								</div>
			</a>


		</div>
		<div class="col-md-6">
			<div class="col-md1 ">
				<a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src=""""),_display_(Seq[Any](/*167.106*/routes/*167.112*/.Assets.at("images/t2.jpg"))),format.raw/*167.139*/("""" alt="">
					<div class="b-wrapper">
									<h3 class="b-animate b-from-top top-in1   b-delay03 ">
										<span>行李箱</span>
									</h3>
								</div>
				</a>

			</div>
			<div class="col-md2">
				<div class="col-md-6 men1">
					<a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src=""""),_display_(Seq[Any](/*178.107*/routes/*178.113*/.Assets.at("images/t3.jpg"))),format.raw/*178.140*/("""" alt="">
							<div class="b-wrapper">
									<h3 class="b-animate b-from-top top-in2   b-delay03 ">
										<span>领带</span>
									</h3>
								</div>
					</a>

				</div>
				<div class="col-md-6 men2">
					<a href="single.html" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src=""""),_display_(Seq[Any](/*188.107*/routes/*188.113*/.Assets.at("images/t4.jpg"))),format.raw/*188.140*/("""" alt="">
							<div class="b-wrapper">
									<h3 class="b-animate b-from-top top-in2   b-delay03 ">
										<span>男鞋</span>
									</h3>
								</div>
					</a>

				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		<div class="clearfix"> </div>
	</div>
	</div>
</div>
<div class="footer" style="margin-top:40px;">
		<div class="footer-class">
		<p >Copyright &copy; 2017</p>
		</div>
</div>
</body>
</html>
"""))}
    }
    
    def render(lines:List[Commodity],current_user:String): play.api.templates.HtmlFormat.Appendable = apply(lines,current_user)
    
    def f:((List[Commodity],String) => play.api.templates.HtmlFormat.Appendable) = (lines,current_user) => apply(lines,current_user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 27 15:11:19 CST 2017
                    SOURCE: /home/byer/haha/Amaze_Play_Framework-master/app/views/index.scala.html
                    HASH: 699ab4bbb41dc3a9ed52fa8e99de827b5ac44425
                    MATRIX: 790->1|928->45|1026->108|1040->114|1100->153|1262->280|1276->286|1336->325|1444->397|1459->403|1516->438|2090->984|2119->985|2176->1013|2206->1014|2266->1045|2296->1046|2348->1069|2378->1070|2471->1127|2486->1133|2544->1169|2667->1256|2682->1262|2739->1297|2815->1345|2844->1346|2894->1368|2923->1369|2985->1395|3000->1401|3065->1444|3342->1693|3372->1694|3423->1716|3453->1717|3598->1827|3629->1849|3668->1850|3762->1924|3776->1928|3816->1929|3873->1949|3908->1961|3951->1971|4122->2106|4137->2112|4188->2141|4544->2461|4559->2467|4610->2496|4858->2709|4940->2782|4979->2783|5052->2820|5098->2857|5137->2858|5165->2867|5178->2871|5217->2872|5255->2878|5296->2901|5309->2905|5333->2907|5521->3059|5536->3065|5607->3114|5676->3155|5705->3156|5770->3193|5799->3194|5942->3310|5970->3311|6004->3318|6032->3319|6690->3941|6725->3959|6765->3960|6861->4019|6875->4023|6910->4035|7050->4137|7067->4143|7132->4176|7147->4180|7183->4192|7336->4308|7350->4312|7387->4326|7498->4400|7512->4404|7547->4416|7587->4419|7601->4423|7638->4437|7693->4460|7980->4709|7997->4715|8048->4742|8418->5074|8435->5080|8486->5107|8867->5450|8884->5456|8935->5483|9294->5804|9311->5810|9362->5837
                    LINES: 26->1|29->1|35->7|35->7|35->7|37->9|37->9|37->9|40->12|40->12|40->12|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|51->23|52->24|52->24|52->24|61->33|61->33|61->33|61->33|67->39|67->39|67->39|67->39|67->39|67->39|67->39|67->39|67->39|74->46|74->46|74->46|87->59|87->59|87->59|94->66|94->66|94->66|95->67|95->67|95->67|95->67|95->67|95->67|95->67|96->68|96->68|96->68|108->80|108->80|108->80|110->82|110->82|111->83|111->83|117->89|117->89|118->90|118->90|159->131|159->131|159->131|161->133|161->133|161->133|161->133|161->133|161->133|161->133|161->133|164->136|164->136|164->136|170->142|170->142|170->142|170->142|170->142|170->142|172->144|183->155|183->155|183->155|195->167|195->167|195->167|206->178|206->178|206->178|216->188|216->188|216->188
                    -- GENERATED --
                */
            
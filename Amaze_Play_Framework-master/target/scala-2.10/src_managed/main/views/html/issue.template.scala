
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
object issue extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Paper],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(lines: List[Paper],current_user:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.42*/("""
<!DOCTYPE html>
<html>
<head>
<title>帖子</title>
<link href=""""),_display_(Seq[Any](/*6.14*/routes/*6.20*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*6.59*/("""" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src=""""),_display_(Seq[Any](/*8.15*/routes/*8.21*/.Assets.at("javascripts/jquery.min.js"))),format.raw/*8.60*/(""""></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href=""""),_display_(Seq[Any](/*11.14*/routes/*11.20*/.Assets.at("stylesheets/style.css"))),format.raw/*11.55*/("""" rel="stylesheet" type="text/css" media="all" />
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="New Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() """),format.raw/*17.78*/("""{"""),format.raw/*17.79*/(""" setTimeout(hideURLbar, 0); """),format.raw/*17.107*/("""}"""),format.raw/*17.108*/(""", false); function hideURLbar()"""),format.raw/*17.139*/("""{"""),format.raw/*17.140*/(""" window.scrollTo(0,1); """),format.raw/*17.163*/("""}"""),format.raw/*17.164*/(""" </script>
<!--fonts-->
<!-- start menu -->
<link href=""""),_display_(Seq[Any](/*20.14*/routes/*20.20*/.Assets.at("stylesheets/memenu.css"))),format.raw/*20.56*/("""" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src=""""),_display_(Seq[Any](/*21.38*/routes/*21.44*/.Assets.at("javascripts/memenu.js"))),format.raw/*21.79*/(""""></script>
<script>$(document).ready(function()"""),format.raw/*22.37*/("""{"""),format.raw/*22.38*/("""$(".memenu").memenu();"""),format.raw/*22.60*/("""}"""),format.raw/*22.61*/(""");</script>
<script src=""""),_display_(Seq[Any](/*23.15*/routes/*23.21*/.Assets.at("javascripts/simpleCart.min.js"))),format.raw/*23.64*/(""""> </script>

</head>
<body>
<!--header-->
<div class="header">
	<div class="header-top">
		<div class="container">
			<div class="search">
					<form>
						<input type="text" value="Search " onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*33.99*/("""{"""),format.raw/*33.100*/("""this.value = 'Search';"""),format.raw/*33.122*/("""}"""),format.raw/*33.123*/("""">
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
							<img src=""""),_display_(Seq[Any](/*45.19*/routes/*45.25*/.Assets.at("images/cart.png"))),format.raw/*45.54*/("""" alt=""/></h3>
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
					<a href="/"><img src=""""),_display_(Seq[Any](/*58.29*/routes/*58.35*/.Assets.at("images/logo.png"))),format.raw/*58.64*/("""" alt=""></a>
				</div>
		  <div class=" h_menu4">
				<ul class="memenu skyblue">
					  <li class="active grid"><a class="color8" href="/">首页</a></li>
				      <li><a class="color1" href="/business">店铺管理</a></li>
				<li><a class="color4" href="/blog">所有帖子</a></li>
				<!-- <li><a class="color6" href="/contact">个人中心</a></li> -->
			  </ul>
			</div>

				<div class="clearfix"> </div>
		</div>
		</div>

	</div>
<!--content-->
<div class="blog">
<div class="container">
	<h1>所有帖子</h1>
				<div class="button" style="margin-bottom:20px;"><a href="/blog_single">发帖</a></div>

				"""),_display_(Seq[Any](/*80.6*/for(line <- lines) yield /*80.24*/{_display_(Seq[Any](format.raw/*80.25*/("""
					<div class="blog-top">
				  <div class="col-md-6 grid_3">
						<h3><a href="blog_single.html">"""),_display_(Seq[Any](/*83.39*/line/*83.43*/.title)),format.raw/*83.49*/("""</a></h3>
						<!-- <a href="blog_single.html"><img src="images/b1.jpg" class="img-responsive" alt=""/></a> -->

						<div class="blog-poast-info">
							<ul>
								<li><a class="admin" href="#"><i> </i> """),_display_(Seq[Any](/*88.49*/line/*88.53*/.author)),format.raw/*88.60*/(""" </a></li>
								<li><span><i class="date"> </i>"""),_display_(Seq[Any](/*89.41*/line/*89.45*/.time)),format.raw/*89.50*/("""</span></li>
							</ul>
					    </div>
						<p>"""),_display_(Seq[Any](/*92.11*/line/*92.15*/.content)),format.raw/*92.23*/("""</p>
						<!-- <div class="button"><a href="#">查看全文</a></div> -->
					</div>

					<!-- <div class="clearfix"> </div> -->
				  </div>
				""")))})),format.raw/*98.6*/("""
</div>
</div>

<script type="text/javascript">
		$(document).ready(function () """),format.raw/*103.33*/("""{"""),format.raw/*103.34*/("""
			console.log("haha");
			// $.ajax("""),format.raw/*105.14*/("""{"""),format.raw/*105.15*/("""
			// 		url:"/issue",
			// 		success:function (data) """),format.raw/*107.33*/("""{"""),format.raw/*107.34*/("""
			// 			console.log(data);
			// 		"""),format.raw/*109.9*/("""}"""),format.raw/*109.10*/("""
			// """),format.raw/*110.7*/("""}"""),format.raw/*110.8*/(""")
		"""),format.raw/*111.3*/("""}"""),format.raw/*111.4*/(""")
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
    
    def render(lines:List[Paper],current_user:String): play.api.templates.HtmlFormat.Appendable = apply(lines,current_user)
    
    def f:((List[Paper],String) => play.api.templates.HtmlFormat.Appendable) = (lines,current_user) => apply(lines,current_user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 27 15:11:20 CST 2017
                    SOURCE: /home/byer/haha/Amaze_Play_Framework-master/app/views/issue.scala.html
                    HASH: e8b0898fa77dd1e55f66f3b39890567487521be4
                    MATRIX: 786->1|920->41|1022->108|1036->114|1096->153|1260->282|1274->288|1334->327|1445->402|1460->408|1517->443|2097->995|2126->996|2183->1024|2213->1025|2273->1056|2303->1057|2355->1080|2385->1081|2481->1141|2496->1147|2554->1183|2678->1271|2693->1277|2750->1312|2827->1361|2856->1362|2906->1384|2935->1385|2998->1412|3013->1418|3078->1461|3366->1721|3396->1722|3447->1744|3477->1745|3622->1855|3653->1877|3692->1878|3785->1952|3799->1956|3839->1957|3896->1977|3931->1989|3974->1999|4144->2133|4159->2139|4210->2168|4584->2506|4599->2512|4650->2541|5292->3148|5326->3166|5365->3167|5507->3273|5520->3277|5548->3283|5799->3498|5812->3502|5841->3509|5929->3561|5942->3565|5969->3570|6060->3625|6073->3629|6103->3637|6282->3785|6396->3870|6426->3871|6495->3911|6525->3912|6611->3969|6641->3970|6708->4009|6738->4010|6774->4018|6803->4019|6836->4024|6865->4025
                    LINES: 26->1|29->1|34->6|34->6|34->6|36->8|36->8|36->8|39->11|39->11|39->11|45->17|45->17|45->17|45->17|45->17|45->17|45->17|45->17|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|50->22|51->23|51->23|51->23|61->33|61->33|61->33|61->33|67->39|67->39|67->39|67->39|67->39|67->39|67->39|67->39|67->39|73->45|73->45|73->45|86->58|86->58|86->58|108->80|108->80|108->80|111->83|111->83|111->83|116->88|116->88|116->88|117->89|117->89|117->89|120->92|120->92|120->92|126->98|131->103|131->103|133->105|133->105|135->107|135->107|137->109|137->109|138->110|138->110|139->111|139->111
                    -- GENERATED --
                */
            
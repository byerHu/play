
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
object applyStore extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(current_user:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.23*/("""
<!DOCTYPE html>
<html>
<head>
<title>Blog_Single</title>
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
						<input type="text" value="Search " onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*32.99*/("""{"""),format.raw/*32.100*/("""this.value = 'Search';"""),format.raw/*32.122*/("""}"""),format.raw/*32.123*/("""">
						<input type="submit" value="Go">
					</form>
			</div>
			<div class="header-left">
					<ul>
"""),_display_(Seq[Any](/*38.2*/if(current_user=="登录")/*38.24*/{_display_(Seq[Any](format.raw/*38.25*/("""<li ><a href="/login"  >登录</a></li><li><a  href="/register"  >注册</a></li>""")))}/*38.99*/else/*38.103*/{_display_(Seq[Any](format.raw/*38.104*/("""<li ><a href="#"  >"""),_display_(Seq[Any](/*38.124*/current_user)),format.raw/*38.136*/("""</a></li>""")))})),format.raw/*38.146*/("""

					</ul>
					<div class="cart box_1">
						<a href="/checkout">
						<h3> <div class="total">购物车</div>
							<img src=""""),_display_(Seq[Any](/*44.19*/routes/*44.25*/.Assets.at("images/cart.png"))),format.raw/*44.54*/("""" alt=""/></h3>
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
					<a href="/"><img src=""""),_display_(Seq[Any](/*57.29*/routes/*57.35*/.Assets.at("images/logo.png"))),format.raw/*57.64*/("""" alt=""></a>
				</div>
		  <div class=" h_menu4">
				<ul class="memenu skyblue">
					  <li class="active grid"><a class="color8" href="/">首页</a></li>
				      <li><a class="color1" href="/business">店铺管理</a></li>
				    <li class="grid"><a class="color2" href="/admin">后台管理</a></li>
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
	       <div class="blog-top">
				<div class="single-bottom">

			<h3>申请开店</h3>
				<form>

						<input type="text" id="storename" name="storename" value="店名" onfocus="this.value='';" onblur="if (this.value == '') """),format.raw/*85.124*/("""{"""),format.raw/*85.125*/("""this.value ='Name';"""),format.raw/*85.144*/("""}"""),format.raw/*85.145*/("""">

						<textarea cols="77" rows="6" value=" " id="description" name="description" onfocus="this.value='';" onblur="if (this.value == '') """),format.raw/*87.137*/("""{"""),format.raw/*87.138*/("""this.value = 'Message';"""),format.raw/*87.161*/("""}"""),format.raw/*87.162*/("""">描述</textarea>



				</form>
				<input type="submit" id="apply" value="申请">
			</div>
			  </div>
      </div>
</div>
<script>
	$(document).ready(function () """),format.raw/*98.32*/("""{"""),format.raw/*98.33*/("""
		$("#apply").click(function () """),format.raw/*99.33*/("""{"""),format.raw/*99.34*/("""
			var storename = $("#storename").val();
			var description = $("#description").val();
			var data = """),format.raw/*102.15*/("""{"""),format.raw/*102.16*/("""
				"storename":storename,
				"description":description
			"""),format.raw/*105.4*/("""}"""),format.raw/*105.5*/("""
      console.log(data);
			$.ajax("""),format.raw/*107.11*/("""{"""),format.raw/*107.12*/("""
					url:"/business",
					type:"post",
					data:data,
					success:function (data) """),format.raw/*111.30*/("""{"""),format.raw/*111.31*/("""
						alert(data);
					"""),format.raw/*113.6*/("""}"""),format.raw/*113.7*/("""
			"""),format.raw/*114.4*/("""}"""),format.raw/*114.5*/(""")
		"""),format.raw/*115.3*/("""}"""),format.raw/*115.4*/(""")

	"""),format.raw/*117.2*/("""}"""),format.raw/*117.3*/(""")
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
    
    def render(current_user:String): play.api.templates.HtmlFormat.Appendable = apply(current_user)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (current_user) => apply(current_user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 27 15:11:20 CST 2017
                    SOURCE: /home/byer/haha/Amaze_Play_Framework-master/app/views/applyStore.scala.html
                    HASH: beda8845589a2dbb0f3c38e7f6e36ec257123fdc
                    MATRIX: 779->1|894->22|1000->93|1014->99|1074->138|1236->265|1250->271|1310->310|1418->382|1433->388|1490->423|2064->969|2093->970|2150->998|2180->999|2240->1030|2270->1031|2322->1054|2352->1055|2445->1112|2460->1118|2518->1154|2641->1241|2656->1247|2713->1282|2789->1330|2818->1331|2868->1353|2897->1354|2959->1380|2974->1386|3039->1429|3316->1678|3346->1679|3397->1701|3427->1702|3567->1807|3598->1829|3637->1830|3730->1904|3744->1908|3784->1909|3841->1929|3876->1941|3919->1951|4083->2079|4098->2085|4149->2114|4510->2439|4525->2445|4576->2474|5370->3239|5400->3240|5448->3259|5478->3260|5647->3400|5677->3401|5729->3424|5759->3425|5948->3586|5977->3587|6038->3620|6067->3621|6199->3724|6229->3725|6318->3786|6347->3787|6412->3823|6442->3824|6557->3910|6587->3911|6640->3936|6669->3937|6701->3941|6730->3942|6762->3946|6791->3947|6823->3951|6852->3952
                    LINES: 26->1|29->1|34->6|34->6|34->6|36->8|36->8|36->8|39->11|39->11|39->11|45->17|45->17|45->17|45->17|45->17|45->17|45->17|45->17|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|50->22|51->23|51->23|51->23|60->32|60->32|60->32|60->32|66->38|66->38|66->38|66->38|66->38|66->38|66->38|66->38|66->38|72->44|72->44|72->44|85->57|85->57|85->57|113->85|113->85|113->85|113->85|115->87|115->87|115->87|115->87|126->98|126->98|127->99|127->99|130->102|130->102|133->105|133->105|135->107|135->107|139->111|139->111|141->113|141->113|142->114|142->114|143->115|143->115|145->117|145->117
                    -- GENERATED --
                */
            
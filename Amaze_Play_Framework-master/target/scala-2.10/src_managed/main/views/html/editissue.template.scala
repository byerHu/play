
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
object editissue extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

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
				    <!-- <li class="grid"><a class="color2" href="#">后台管理</a></li> -->
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

			<h3>发帖</h3>
				<form>

						<input type="text" id="title" name="title" value="标题" onfocus="this.value='';" onblur="if (this.value == '') """),format.raw/*85.116*/("""{"""),format.raw/*85.117*/("""this.value ='Name';"""),format.raw/*85.136*/("""}"""),format.raw/*85.137*/("""">

						<textarea cols="77" rows="6" value=" " id="content" name="content" onfocus="this.value='';" onblur="if (this.value == '') """),format.raw/*87.129*/("""{"""),format.raw/*87.130*/("""this.value = 'Message';"""),format.raw/*87.153*/("""}"""),format.raw/*87.154*/("""">内容</textarea>



				</form>
				<input type="submit" id="issue" value="发表">
			</div>
			  </div>
      </div>
</div>
<script>
	$(document).ready(function () """),format.raw/*98.32*/("""{"""),format.raw/*98.33*/("""
		$("#issue").click(function () """),format.raw/*99.33*/("""{"""),format.raw/*99.34*/("""
			var title = $("#title").val();
			var content = $("#content").val();
			var data = """),format.raw/*102.15*/("""{"""),format.raw/*102.16*/("""
				"title":title,
				"content":content
			"""),format.raw/*105.4*/("""}"""),format.raw/*105.5*/("""
			$.ajax("""),format.raw/*106.11*/("""{"""),format.raw/*106.12*/("""
					url:"/issue",
					type:"post",
					data:data,
					success:function (data) """),format.raw/*110.30*/("""{"""),format.raw/*110.31*/("""
						alert(data);
						window.location.href="http://localhost:9000/blog";
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
                    SOURCE: /home/byer/haha/Amaze_Play_Framework-master/app/views/editissue.scala.html
                    HASH: 948c3fb8542b214a3a3d47cfd7840cee75044131
                    MATRIX: 778->1|893->22|1004->98|1018->104|1078->143|1242->272|1256->278|1316->317|1427->392|1442->398|1499->433|2079->985|2108->986|2165->1014|2195->1015|2255->1046|2285->1047|2337->1070|2367->1071|2463->1131|2478->1137|2536->1173|2660->1261|2675->1267|2732->1302|2809->1351|2838->1352|2888->1374|2917->1375|2980->1402|2995->1408|3060->1451|3346->1709|3376->1710|3427->1732|3457->1733|3603->1844|3634->1866|3673->1867|3766->1941|3780->1945|3820->1946|3877->1966|3912->1978|3955->1988|4125->2122|4140->2128|4191->2157|4565->2495|4580->2501|4631->2530|5447->3317|5477->3318|5525->3337|5555->3338|5718->3472|5748->3473|5800->3496|5830->3497|6030->3669|6059->3670|6121->3704|6150->3705|6269->3795|6299->3796|6375->3844|6404->3845|6445->3857|6475->3858|6591->3945|6621->3946|6734->4031|6763->4032|6796->4037|6825->4038|6858->4043|6887->4044|6921->4050|6950->4051
                    LINES: 26->1|29->1|34->6|34->6|34->6|36->8|36->8|36->8|39->11|39->11|39->11|45->17|45->17|45->17|45->17|45->17|45->17|45->17|45->17|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|50->22|51->23|51->23|51->23|60->32|60->32|60->32|60->32|66->38|66->38|66->38|66->38|66->38|66->38|66->38|66->38|66->38|72->44|72->44|72->44|85->57|85->57|85->57|113->85|113->85|113->85|113->85|115->87|115->87|115->87|115->87|126->98|126->98|127->99|127->99|130->102|130->102|133->105|133->105|134->106|134->106|138->110|138->110|141->113|141->113|142->114|142->114|143->115|143->115|145->117|145->117
                    -- GENERATED --
                */
            
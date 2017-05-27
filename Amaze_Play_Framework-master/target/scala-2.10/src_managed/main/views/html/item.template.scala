
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
object item extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Commodity,List[Comment],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(item: Commodity,comments: List[Comment],current_user:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.63*/("""

<!DOCTYPE html>
<html>
<head>
<title>Signle</title>
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


<script src=""""),_display_(Seq[Any](/*26.15*/routes/*26.21*/.Assets.at("javascripts/main.js"))),format.raw/*26.54*/(""""></script>
<script src=""""),_display_(Seq[Any](/*27.15*/routes/*27.21*/.Assets.at("javascripts/simpleCart.min.js"))),format.raw/*27.64*/(""""> </script>
</head>
<body>
<!--header-->
<div class="header">
	<div class="header-top">
		<div class="container">
			<div class="search">
					<form>
						<input type="text" value="Search " onfocus="this.value = '';" onblur="if (this.value == '') """),format.raw/*36.99*/("""{"""),format.raw/*36.100*/("""this.value = 'Search';"""),format.raw/*36.122*/("""}"""),format.raw/*36.123*/("""">
						<input type="submit" value="Go">
					</form>
			</div>
			<div class="header-left">
					<ul>
"""),_display_(Seq[Any](/*42.2*/if(current_user=="登录")/*42.24*/{_display_(Seq[Any](format.raw/*42.25*/("""<li ><a href="/login"  >登录</a></li><li><a  href="/register"  >注册</a></li>""")))}/*42.99*/else/*42.103*/{_display_(Seq[Any](format.raw/*42.104*/("""<li ><a href="#"  >"""),_display_(Seq[Any](/*42.124*/current_user)),format.raw/*42.136*/("""</a></li>""")))})),format.raw/*42.146*/("""

					</ul>
					<div class="cart box_1">
						<a href="/checkout">
						<h3> <div class="total">购物车</div>
							<img src=""""),_display_(Seq[Any](/*48.19*/routes/*48.25*/.Assets.at("images/cart.png"))),format.raw/*48.54*/("""" alt=""/></h3>
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
					<a href="index.html"><img src=""""),_display_(Seq[Any](/*61.38*/routes/*61.44*/.Assets.at("images/logo.png"))),format.raw/*61.73*/("""" alt=""></a>
				</div>
		  <div class=" h_menu4">
					<ul class="memenu skyblue">
					  <li class="active grid"><a class="color8" href="/">主页</a></li>
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


<!--content-->
<!---->
		<div class="product">
			<div class="container">
				<div class="col-md-3 product-price">

				<div class=" rsidebar span_1_of_left">
					<div class="of-left">
						<h3 class="cate">种类</h3>
					</div>
		 <ul class="menu">
		<li class="item1"><a href="#">男 </a>
			<ul class="cute">
				<li class="subitem1"><a href="#">Cute Kittens </a></li>
				<li class="subitem2"><a href="#">Strange Stuff </a></li>
				<li class="subitem3"><a href="#">Automatic Fails </a></li>
			</ul>
		</li>
		<li class="item2"><a href="#">女 </a>
			<ul class="cute">
				<li class="subitem1"><a href="#">Cute Kittens </a></li>
				<li class="subitem2"><a href="#">Strange Stuff </a></li>
				<li class="subitem3"><a href="#">Automatic Fails </a></li>
			</ul>
		</li>
		<li class="item3"><a href="#">儿童</a>
			<ul class="cute">
				<li class="subitem1"><a href="#">Cute Kittens </a></li>
				<li class="subitem2"><a href="#">Strange Stuff </a></li>
				<li class="subitem3"><a href="#">Automatic Fails</a></li>
			</ul>
		</li>

	</ul>
					</div>
				<!--initiate accordion-->
		<script type="text/javascript">
			$(function() """),format.raw/*117.17*/("""{"""),format.raw/*117.18*/("""
			    var menu_ul = $('.menu > li > ul'),
			           menu_a  = $('.menu > li > a');
			    menu_ul.hide();
			    menu_a.click(function(e) """),format.raw/*121.33*/("""{"""),format.raw/*121.34*/("""
			        e.preventDefault();
			        if(!$(this).hasClass('active')) """),format.raw/*123.44*/("""{"""),format.raw/*123.45*/("""
			            menu_a.removeClass('active');
			            menu_ul.filter(':visible').slideUp('normal');
			            $(this).addClass('active').next().stop(true,true).slideDown('normal');
			        """),format.raw/*127.12*/("""}"""),format.raw/*127.13*/(""" else """),format.raw/*127.19*/("""{"""),format.raw/*127.20*/("""
			            $(this).removeClass('active');
			            $(this).next().stop(true,true).slideUp('normal');
			        """),format.raw/*130.12*/("""}"""),format.raw/*130.13*/("""
			    """),format.raw/*131.8*/("""}"""),format.raw/*131.9*/(""");

			"""),format.raw/*133.4*/("""}"""),format.raw/*133.5*/(""");
		</script>
<!---->
	<div class="product-middle">

					<div class="fit-top">
						<h6 class="shop-top">Lorem Ipsum</h6>
						<a href="#" class="shop-now">SHOP NOW</a>
<div class="clearfix"> </div>
	</div>
				</div>
						<div class="sellers">
							<div class="of-left-in">
								<h3 class="tag">标签</h3>
							</div>
								<div class="tags">
									<ul>
										<li><a href="#">design</a></li>
										<li><a href="#">fashion</a></li>
										<li><a href="#">lorem</a></li>
										<li><a href="#">dress</a></li>
										<li><a href="#">fashion</a></li>
										<li><a href="#">dress</a></li>
										<li><a href="#">design</a></li>
										<li><a href="#">dress</a></li>
										<li><a href="#">design</a></li>
										<li><a href="#">fashion</a></li>
										<li><a href="#">lorem</a></li>
										<li><a href="#">dress</a></li>

										<div class="clearfix"> </div>
									</ul>

								</div>

		</div>
				<!---->
				<div class="product-bottom">
					<div class="of-left-in">
								<h3 class="best">热卖商品</h3>
							</div>
					<div class="product-go">
						<div class=" fashion-grid">
									<a href="#"><img class="img-responsive" src=""""),_display_(Seq[Any](/*176.56*/routes/*176.62*/.Assets.at("images/p1.jpg"))),format.raw/*176.89*/("""" alt=""></a>

								</div>
							<div class=" fashion-grid1">
								<h6 class="best2"><a href="#" >Lorem ipsum dolor sit
amet consectetuer  </a></h6>

								<span class=" price-in1"> $40.00</span>
							</div>

							<div class="clearfix"> </div>
							</div>
							<div class="product-go">
						<div class=" fashion-grid">
									<a href="#"><img class="img-responsive " src=""""),_display_(Seq[Any](/*190.57*/routes/*190.63*/.Assets.at("images/p2.jpg"))),format.raw/*190.90*/("""" alt=""></a>

								</div>
							<div class="fashion-grid1">
								<h6 class="best2"><a href="#" >Lorem ipsum dolor sit
amet consectetuer </a></h6>

								<span class=" price-in1"> $40.00</span>
							</div>

							<div class="clearfix"> </div>
							</div>

				</div>

				</div>
				<div class="col-md-9 product-price1">
				<div class="col-md-5 single-top">
			<div class="flexslider">
  <ul class="slides">
      <img style="width:320px" src=""""),_display_(Seq[Any](/*210.38*/routes/*210.44*/.Assets.at("uploads/commodity_"))),_display_(Seq[Any](/*210.77*/item/*210.81*/.commodityId)),format.raw/*210.93*/("""" />

  </ul>
</div>
<!-- FlexSlider -->
  <script defer src=""""),_display_(Seq[Any](/*215.23*/routes/*215.29*/.Assets.at("javascripts/jquery.flexslider.js"))),format.raw/*215.75*/(""""></script>
<link rel="stylesheet" href=""""),_display_(Seq[Any](/*216.31*/routes/*216.37*/.Assets.at("stylesheets/flexslider.css"))),format.raw/*216.77*/("""" type="text/css" media="screen" />

<script>
// Can also be used with $(document).ready()
$(window).load(function() """),format.raw/*220.27*/("""{"""),format.raw/*220.28*/("""
  $('.flexslider').flexslider("""),format.raw/*221.31*/("""{"""),format.raw/*221.32*/("""
    animation: "slide",
    controlNav: "thumbnails"
  """),format.raw/*224.3*/("""}"""),format.raw/*224.4*/(""");
"""),format.raw/*225.1*/("""}"""),format.raw/*225.2*/(""");
</script>
					</div>
					<div class="col-md-7 single-top-in simpleCart_shelfItem">
						<div class="single-para ">
						<h4>"""),_display_(Seq[Any](/*230.12*/item/*230.16*/.commodityName)),format.raw/*230.30*/("""</h4>


							<h5 class="item_price">$ """),_display_(Seq[Any](/*233.34*/item/*233.38*/.price)),format.raw/*233.44*/("""</h5>
							<p>评论</p>
							<div class="available">
								<ul>
									<li>Color
										<select>
										<option>Silver</option>
										<option>Black</option>
										<option>Dark Black</option>
										<option>Red</option>
									</select></li>
								<li class="size-in">Size<select>
									<option>Large</option>
									<option>Medium</option>
									<option>small</option>
									<option>Large</option>
									<option>small</option>
								</select></li>
								<div class="clearfix"> </div>
							</ul>
						</div>
							<ul class="tag-men">
								<li><span>TAG</span>
								<span class="women1">: Women,</span></li>
								<li><span>SKU</span>
								<span class="women1">: CK09</span></li>
							</ul>

							数量：<input id="number" type="text" value="1">
								<a id="addcart" href="#" class="add-cart item_add">加入购物车</a>

						</div>
					</div>
				<div class="clearfix"> </div>
			<!---->
					<div class="cd-tabs">
			<nav>
				<ul class="cd-tabs-navigation">
					<li><a data-content="fashion"  href="#0">商品描述 </a></li>
					<li><a data-content="cinema" href="#0" >更多信息</a></li>
					<li><a data-content="television" href="#0" class="selected ">评论 (1)</a></li>

				</ul>
			</nav>
	<ul class="cd-tabs-content">
		<li data-content="fashion" >
		<div class="facts">
									  <p > fwer4jgfireik</p>
										<ul>
											<li>Research</li>
											<li>Design and Development</li>
											<li>Porting and Optimization</li>
											<li>System integration</li>
											<li>Verification, Validation and Testing</li>
											<li>Maintenance and Support</li>
										</ul>
							        </div>

</li>
<li data-content="cinema" >
		<div class="facts1">

						<div class="color"><p>Color</p>
							<span >Blue, Black, Red</span>
							<div class="clearfix"></div>
						</div>
						<div class="color">
							<p>Size</p>
							<span >S, M, L, XL</span>
							<div class="clearfix"></div>
						</div>

			 </div>

</li>
<li data-content="television" class="selected">
	<div class="comments-top-top">
	    		    """),_display_(Seq[Any](/*310.13*/for(comment <- comments) yield /*310.37*/{_display_(Seq[Any](format.raw/*310.38*/("""
				<div class="top-comment-left">
					<img class="img-responsive" src=""""),_display_(Seq[Any](/*312.40*/routes/*312.46*/.Assets.at("images/co.png"))),format.raw/*312.73*/("""" alt="">
				</div>
				<div class="top-comment-right">
					<h6><a href="#">"""),_display_(Seq[Any](/*315.23*/comment/*315.30*/.user)),format.raw/*315.35*/("""</a> - """),_display_(Seq[Any](/*315.43*/comment/*315.50*/.time)),format.raw/*315.55*/("""</h6>
					<ul class="star-footer">
										<li><a href="#"><i> </i></a></li>
										<li><a href="#"><i> </i></a></li>
										<li><a href="#"><i> </i></a></li>
										<li><a href="#"><i> </i></a></li>
										<li><a href="#"><i> </i></a></li>
									</ul>
									<p>"""),_display_(Seq[Any](/*323.14*/comment/*323.21*/.content)),format.raw/*323.29*/("""</p>
				</div>
				""")))})),format.raw/*325.6*/("""
				<a id="disscus" class="add-re" href="#">添加评论</a>
			</div>
<form>
    <input type="hidden" id="title" name="title" value=""""),_display_(Seq[Any](/*329.58*/item/*329.62*/.commodityId)),format.raw/*329.74*/("""">
    <textarea cols="77" rows="6" value=" " id="content" name="content" onfocus="this.value='';" onblur="if (this.value == '') """),format.raw/*330.127*/("""{"""),format.raw/*330.128*/("""this.value = 'Discuss';"""),format.raw/*330.151*/("""}"""),format.raw/*330.152*/(""""></textarea>
</form>
</li>

<script>
	$(document).ready(function () """),format.raw/*335.32*/("""{"""),format.raw/*335.33*/("""
		$("#disscus").click(function () """),format.raw/*336.35*/("""{"""),format.raw/*336.36*/("""
			var title = $("#title").val();
			var content = $("#content").val();
			var data = """),format.raw/*339.15*/("""{"""),format.raw/*339.16*/("""
				"commodityId":title,
				"content":content
			"""),format.raw/*342.4*/("""}"""),format.raw/*342.5*/("""
			if(content != "Discuss" && content != "")"""),format.raw/*343.45*/("""{"""),format.raw/*343.46*/("""
			$.ajax("""),format.raw/*344.11*/("""{"""),format.raw/*344.12*/("""
					url:"/discuss",
					type:"post",
					data:data,
					success:function (data) """),format.raw/*348.30*/("""{"""),format.raw/*348.31*/("""
					    if(data=="success")
					        location.reload() 
					"""),format.raw/*351.6*/("""}"""),format.raw/*351.7*/("""
			"""),format.raw/*352.4*/("""}"""),format.raw/*352.5*/(""")
			"""),format.raw/*353.4*/("""}"""),format.raw/*353.5*/("""
		"""),format.raw/*354.3*/("""}"""),format.raw/*354.4*/(""")


	"""),format.raw/*357.2*/("""}"""),format.raw/*357.3*/(""")
	$(document).ready(function () """),format.raw/*358.32*/("""{"""),format.raw/*358.33*/("""
		$("#addcart").click(function () """),format.raw/*359.35*/("""{"""),format.raw/*359.36*/("""
			var title = $("#title").val();
			var content = $("#number").val();
			var data = """),format.raw/*362.15*/("""{"""),format.raw/*362.16*/("""
				"id":title,
				"num":content
			"""),format.raw/*365.4*/("""}"""),format.raw/*365.5*/("""
			$.ajax("""),format.raw/*366.11*/("""{"""),format.raw/*366.12*/("""
					url:"/addcart",
					type:"get",
					data:data,
					success:function (data) """),format.raw/*370.30*/("""{"""),format.raw/*370.31*/("""
                        if(data=="success")
                            alert("添加成功");
					"""),format.raw/*373.6*/("""}"""),format.raw/*373.7*/("""
			"""),format.raw/*374.4*/("""}"""),format.raw/*374.5*/(""")
		"""),format.raw/*375.3*/("""}"""),format.raw/*375.4*/(""")

	"""),format.raw/*377.2*/("""}"""),format.raw/*377.3*/(""")
</script>
				

<div class="clearfix"></div>
	</ul>
</div>

</div>

		</div>
		</div>
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
    
    def render(item:Commodity,comments:List[Comment],current_user:String): play.api.templates.HtmlFormat.Appendable = apply(item,comments,current_user)
    
    def f:((Commodity,List[Comment],String) => play.api.templates.HtmlFormat.Appendable) = (item,comments,current_user) => apply(item,comments,current_user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 27 15:11:20 CST 2017
                    SOURCE: /home/byer/haha/Amaze_Play_Framework-master/app/views/item.scala.html
                    HASH: b0dbb866ce094f3ce4c76d1bb2861b1f8f91fc00
                    MATRIX: 797->1|952->62|1060->135|1074->141|1134->180|1298->309|1312->315|1372->354|1483->429|1498->435|1555->470|2135->1022|2164->1023|2221->1051|2251->1052|2311->1083|2341->1084|2393->1107|2423->1108|2519->1168|2534->1174|2592->1210|2716->1298|2731->1304|2788->1339|2865->1388|2894->1389|2944->1411|2973->1412|3040->1443|3055->1449|3110->1482|3173->1509|3188->1515|3253->1558|3539->1816|3569->1817|3620->1839|3650->1840|3796->1951|3827->1973|3866->1974|3959->2048|3973->2052|4013->2053|4070->2073|4105->2085|4148->2095|4318->2229|4333->2235|4384->2264|4765->2609|4780->2615|4831->2644|6529->4313|6559->4314|6736->4462|6766->4463|6872->4540|6902->4541|7139->4749|7169->4750|7204->4756|7234->4757|7389->4883|7419->4884|7456->4893|7485->4894|7522->4903|7551->4904|8826->6142|8842->6148|8892->6175|9336->6582|9352->6588|9402->6615|9919->7095|9935->7101|9999->7134|10013->7138|10048->7150|10153->7218|10169->7224|10238->7270|10318->7313|10334->7319|10397->7359|10547->7480|10577->7481|10638->7513|10668->7514|10755->7573|10784->7574|10816->7578|10845->7579|11019->7716|11033->7720|11070->7734|11151->7778|11165->7782|11194->7788|13396->9953|13437->9977|13477->9978|13591->10055|13607->10061|13657->10088|13776->10170|13793->10177|13821->10182|13866->10190|13883->10197|13911->10202|14240->10494|14257->10501|14288->10509|14343->10532|14512->10664|14526->10668|14561->10680|14721->10810|14752->10811|14805->10834|14836->10835|14939->10909|14969->10910|15034->10946|15064->10947|15183->11037|15213->11038|15295->11092|15324->11093|15399->11139|15429->11140|15470->11152|15500->11153|15618->11242|15648->11243|15746->11313|15775->11314|15808->11319|15837->11320|15871->11326|15900->11327|15932->11331|15961->11332|15997->11340|16026->11341|16089->11375|16119->11376|16184->11412|16214->11413|16332->11502|16362->11503|16431->11544|16460->11545|16501->11557|16531->11558|16648->11646|16678->11647|16802->11743|16831->11744|16864->11749|16893->11750|16926->11755|16955->11756|16989->11762|17018->11763
                    LINES: 26->1|29->1|35->7|35->7|35->7|37->9|37->9|37->9|40->12|40->12|40->12|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|51->23|54->26|54->26|54->26|55->27|55->27|55->27|64->36|64->36|64->36|64->36|70->42|70->42|70->42|70->42|70->42|70->42|70->42|70->42|70->42|76->48|76->48|76->48|89->61|89->61|89->61|145->117|145->117|149->121|149->121|151->123|151->123|155->127|155->127|155->127|155->127|158->130|158->130|159->131|159->131|161->133|161->133|204->176|204->176|204->176|218->190|218->190|218->190|238->210|238->210|238->210|238->210|238->210|243->215|243->215|243->215|244->216|244->216|244->216|248->220|248->220|249->221|249->221|252->224|252->224|253->225|253->225|258->230|258->230|258->230|261->233|261->233|261->233|338->310|338->310|338->310|340->312|340->312|340->312|343->315|343->315|343->315|343->315|343->315|343->315|351->323|351->323|351->323|353->325|357->329|357->329|357->329|358->330|358->330|358->330|358->330|363->335|363->335|364->336|364->336|367->339|367->339|370->342|370->342|371->343|371->343|372->344|372->344|376->348|376->348|379->351|379->351|380->352|380->352|381->353|381->353|382->354|382->354|385->357|385->357|386->358|386->358|387->359|387->359|390->362|390->362|393->365|393->365|394->366|394->366|398->370|398->370|401->373|401->373|402->374|402->374|403->375|403->375|405->377|405->377
                    -- GENERATED --
                */
            
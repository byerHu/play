
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
object edititem extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Commodity,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(commodity:Commodity):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.23*/("""
<!doctype html>
<html lang="en">
<head>
	<title>后台管理</title>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
	<!-- VENDOR CSS -->
	<link rel="stylesheet" href=""""),_display_(Seq[Any](/*10.32*/routes/*10.38*/.Assets.at("vendor/bootstrap/css/bootstrap.min.css"))),format.raw/*10.90*/("""">
	<link rel="stylesheet" href=""""),_display_(Seq[Any](/*11.32*/routes/*11.38*/.Assets.at("vendor/font-awesome/css/font-awesome.min.css"))),format.raw/*11.96*/("""">
	<link rel="stylesheet" href=""""),_display_(Seq[Any](/*12.32*/routes/*12.38*/.Assets.at("vendor/linearicons/style.css"))),format.raw/*12.80*/("""">
	<link rel="stylesheet" href=""""),_display_(Seq[Any](/*13.32*/routes/*13.38*/.Assets.at("vendor/chartist/css/chartist-custom.css"))),format.raw/*13.91*/("""">
	<!-- MAIN CSS -->
	<link rel="stylesheet" href=""""),_display_(Seq[Any](/*15.32*/routes/*15.38*/.Assets.at("stylesheets/mainManage.css"))),format.raw/*15.78*/("""">
	<!-- FOR DEMO PURPOSES ONLY. You should remove this in your project -->
	<link rel="stylesheet" href=""""),_display_(Seq[Any](/*17.32*/routes/*17.38*/.Assets.at("stylesheets/demo.css"))),format.raw/*17.72*/("""">
	<!-- GOOGLE FONTS -->
	<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700" rel="stylesheet">
	<!-- ICONS -->
	<link rel="apple-touch-icon" sizes="76x76" href=""""),_display_(Seq[Any](/*21.52*/routes/*21.58*/.Assets.at("images/apple-icon.png"))),format.raw/*21.93*/("""">
	<link rel="icon" type="image/png" sizes="96x96" href=""""),_display_(Seq[Any](/*22.57*/routes/*22.63*/.Assets.at("images/favicon.png"))),format.raw/*22.95*/("""">
</head>

<body>

	<div id="wrapper">
		<!-- NAVBAR -->
		<nav class="navbar navbar-default navbar-fixed-top">
			<div class="brand">
				<a href="/"><img src=""""),_display_(Seq[Any](/*31.28*/routes/*31.34*/.Assets.at("images/logo-dark.png"))),format.raw/*31.68*/("""" alt="Klorofil Logo" class="img-responsive logo"></a>
			</div>
			<div class="container-fluid">
				<div class="navbar-btn">
					<button type="button" class="btn-toggle-fullwidth"><i class="lnr lnr-arrow-left-circle"></i></button>
				</div>
				<form class="navbar-form navbar-left">
					<div class="input-group">
						<input type="text" value="" class="form-control" placeholder="Search dashboard...">
						<span class="input-group-btn"><button type="button" class="btn btn-primary">Go</button></span>
					</div>
				</form>
				<div class="navbar-btn navbar-btn-right">
					<a class="btn btn-success update-pro" href="#downloads/klorofil-pro-bootstrap-admin-dashboard-template/?utm_source=klorofil&utm_medium=template&utm_campaign=KlorofilPro" title="Upgrade to Pro" target="_blank"><i class="fa fa-rocket"></i> <span>UPGRADE TO PRO</span></a>
				</div>
				<div id="navbar-menu">
					<ul class="nav navbar-nav navbar-right">
						<li class="dropdown">
							<a href="#" class="dropdown-toggle icon-menu" data-toggle="dropdown">
								<i class="lnr lnr-alarm"></i>
								<span class="badge bg-danger">5</span>
							</a>
							<ul class="dropdown-menu notifications">
								<li><a href="#" class="notification-item"><span class="dot bg-warning"></span>System space is almost full</a></li>
								<li><a href="#" class="notification-item"><span class="dot bg-danger"></span>You have 9 unfinished tasks</a></li>
								<li><a href="#" class="notification-item"><span class="dot bg-success"></span>Monthly report is available</a></li>
								<li><a href="#" class="notification-item"><span class="dot bg-warning"></span>Weekly meeting in 1 hour</a></li>
								<li><a href="#" class="notification-item"><span class="dot bg-success"></span>Your request has been approved</a></li>
								<li><a href="#" class="more">See all notifications</a></li>
							</ul>
						</li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="lnr lnr-question-circle"></i> <span>Help</span> <i class="icon-submenu lnr lnr-chevron-down"></i></a>
							<ul class="dropdown-menu">
								<li><a href="#">Basic Use</a></li>
								<li><a href="#">Working With Data</a></li>
								<li><a href="#">Security</a></li>
								<li><a href="#">Troubleshooting</a></li>
							</ul>
						</li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"><img src=""""),_display_(Seq[Any](/*72.78*/routes/*72.84*/.Assets.at("images/user.png"))),format.raw/*72.113*/("""" class="img-circle" alt="Avatar"> <span>Samuel</span> <i class="icon-submenu lnr lnr-chevron-down"></i></a>
							<ul class="dropdown-menu">
								<li><a href="#"><i class="lnr lnr-user"></i> <span>My Profile</span></a></li>
								<li><a href="#"><i class="lnr lnr-envelope"></i> <span>Message</span></a></li>
								<li><a href="#"><i class="lnr lnr-cog"></i> <span>Settings</span></a></li>
								<li><a href="#"><i class="lnr lnr-exit"></i> <span>Logout</span></a></li>
							</ul>
						</li>
						<!-- <li>
							<a class="update-pro" href="#downloads/klorofil-pro-bootstrap-admin-dashboard-template/?utm_source=klorofil&utm_medium=template&utm_campaign=KlorofilPro" title="Upgrade to Pro" target="_blank"><i class="fa fa-rocket"></i> <span>UPGRADE TO PRO</span></a>
						</li> -->
					</ul>
				</div>
			</div>
		</nav>
		<!-- END NAVBAR -->
		<!-- LEFT SIDEBAR -->
		<div id="sidebar-nav" class="sidebar">
			<div class="sidebar-scroll">
				<nav>
					<ul class="nav">
						<li><a href="/business" class="active"><i class="lnr lnr-home"></i> <span>后台管理</span></a></li>
					</ul>
				</nav>
			</div>
		</div>
		<!-- END LEFT SIDEBAR -->
		<!-- MAIN -->
		<div class="main">
			<!-- MAIN CONTENT -->
			<div class="main-content">
				<div class="container-fluid">
					<div class="row">
						<div class="col-md-12">
							<!-- RECENT PURCHASES -->
              <form action="/postedititem/"""),_display_(Seq[Any](/*107.44*/commodity/*107.53*/.commodityId)),format.raw/*107.65*/("""" method="post" enctype="multipart/form-data">
                <div class="form-group">
                  <label for="commodityName">商品名称</label>
                  <input type="text" name="commodityName" class="form-control" id="commodityName" value=""""),_display_(Seq[Any](/*110.107*/commodity/*110.116*/.commodityName)),format.raw/*110.130*/("""">
                </div>
                <div class="form-group">
                  <label for="price">商品价格</label>
                  <input type="text" name="price" class="form-control" id="price" value=""""),_display_(Seq[Any](/*114.91*/commodity/*114.100*/.price)),format.raw/*114.106*/("""">
                </div>
                <div class="form-group">
                  <label for="agio">商品折扣</label>
                  <input type="text" name="agio" class="form-control" id="agio" value=""""),_display_(Seq[Any](/*118.89*/commodity/*118.98*/.agio)),format.raw/*118.103*/("""">
                </div>
								<!-- <div class="form-group">
									<label for="agio">商品图片</label>
									<input type="text" name="picture" class="form-control" id="picture" placeholder="商品的折扣">
								</div> -->


                <div class="form-group">
                  <label for="cType">商品类型</label>
                  <input type="text" name="cType" class="form-control" id="cType" value=""""),_display_(Seq[Any](/*128.91*/commodity/*128.100*/.cType)),format.raw/*128.106*/("""">
                </div>

								<!-- <div class="form-group">
									<label for="cType">商品图片</label>
									<img src="commodity.picture" alt="" width="200px" height="200px">
								</div> -->
								<div class="form-group">
                  <label for="picture">修改商品图片</label>
                  <input type="file" id="picture" name="picture">
                </div>

                <button type="submit" class="btn btn-default">修改</button>
              </form>
							<!-- END RECENT PURCHASES -->
						</div>

					</div>
				</div>
			</div>
		</div>
		<!-- END MAIN -->
		<div class="clearfix"></div>
		<footer>
			<div class="container-fluid">
				<p class="copyright">&copy; 2017</p>
			</div>
		</footer>
	</div>
	<!-- END WRAPPER -->
	<!-- Javascript -->
	<script src="assets/vendor/jquery/jquery.min.js"></script>
	<script src="assets/vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="assets/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
	<script src="assets/vendor/jquery.easy-pie-chart/jquery.easypiechart.min.js"></script>
	<script src="assets/vendor/chartist/js/chartist.min.js"></script>
	<script src="assets/scripts/klorofil-common.js"></script>
</body>

</html>
"""))}
    }
    
    def render(commodity:Commodity): play.api.templates.HtmlFormat.Appendable = apply(commodity)
    
    def f:((Commodity) => play.api.templates.HtmlFormat.Appendable) = (commodity) => apply(commodity)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 27 15:11:19 CST 2017
                    SOURCE: /home/byer/haha/Amaze_Play_Framework-master/app/views/edititem.scala.html
                    HASH: 689fd69910c1b7892fa05578735ca8c336b9a7bf
                    MATRIX: 780->1|895->22|1241->332|1256->338|1330->390|1400->424|1415->430|1495->488|1565->522|1580->528|1644->570|1714->604|1729->610|1804->663|1893->716|1908->722|1970->762|2113->869|2128->875|2184->909|2417->1106|2432->1112|2489->1147|2584->1206|2599->1212|2653->1244|2852->1407|2867->1413|2923->1447|5410->3898|5425->3904|5477->3933|6930->5349|6949->5358|6984->5370|7274->5622|7294->5631|7332->5645|7576->5852|7596->5861|7626->5867|7867->6071|7886->6080|7915->6085|8356->6489|8376->6498|8406->6504
                    LINES: 26->1|29->1|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|43->15|43->15|43->15|45->17|45->17|45->17|49->21|49->21|49->21|50->22|50->22|50->22|59->31|59->31|59->31|100->72|100->72|100->72|135->107|135->107|135->107|138->110|138->110|138->110|142->114|142->114|142->114|146->118|146->118|146->118|156->128|156->128|156->128
                    -- GENERATED --
                */
            
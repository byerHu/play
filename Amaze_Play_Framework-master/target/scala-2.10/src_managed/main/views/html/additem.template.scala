
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
object additem extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!-- <!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Document</title>
</head>
<body>
    <form action="/postitem" method="post">
        <input type="text" name="commodityName">
        <input type="text" name="price">
        <input type="text" name="agio">
        <input type="text" name="picture">
        <input type="text" name="cType">
        <input type="submit" value="tijiao">
    </form>
</body>
</html> -->

<!doctype html>
<html lang="en">
<head>
	<title>后台管理</title>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
	<!-- VENDOR CSS -->
	<link rel="stylesheet" href=""""),_display_(Seq[Any](/*29.32*/routes/*29.38*/.Assets.at("vendor/bootstrap/css/bootstrap.min.css"))),format.raw/*29.90*/("""">
	<link rel="stylesheet" href=""""),_display_(Seq[Any](/*30.32*/routes/*30.38*/.Assets.at("vendor/font-awesome/css/font-awesome.min.css"))),format.raw/*30.96*/("""">
	<link rel="stylesheet" href=""""),_display_(Seq[Any](/*31.32*/routes/*31.38*/.Assets.at("vendor/linearicons/style.css"))),format.raw/*31.80*/("""">
	<link rel="stylesheet" href=""""),_display_(Seq[Any](/*32.32*/routes/*32.38*/.Assets.at("vendor/chartist/css/chartist-custom.css"))),format.raw/*32.91*/("""">
	<!-- MAIN CSS -->
	<link rel="stylesheet" href=""""),_display_(Seq[Any](/*34.32*/routes/*34.38*/.Assets.at("stylesheets/mainManage.css"))),format.raw/*34.78*/("""">
	<!-- FOR DEMO PURPOSES ONLY. You should remove this in your project -->
	<link rel="stylesheet" href=""""),_display_(Seq[Any](/*36.32*/routes/*36.38*/.Assets.at("stylesheets/demo.css"))),format.raw/*36.72*/("""">
	<!-- GOOGLE FONTS -->
	<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700" rel="stylesheet">
	<!-- ICONS -->
	<link rel="apple-touch-icon" sizes="76x76" href=""""),_display_(Seq[Any](/*40.52*/routes/*40.58*/.Assets.at("images/apple-icon.png"))),format.raw/*40.93*/("""">
	<link rel="icon" type="image/png" sizes="96x96" href=""""),_display_(Seq[Any](/*41.57*/routes/*41.63*/.Assets.at("images/favicon.png"))),format.raw/*41.95*/("""">
</head>

<body>

	<div id="wrapper">
		<!-- NAVBAR -->
		<nav class="navbar navbar-default navbar-fixed-top">
			<div class="brand">
				<a href="/"><img src=""""),_display_(Seq[Any](/*50.28*/routes/*50.34*/.Assets.at("images/logo-dark.png"))),format.raw/*50.68*/("""" alt="Klorofil Logo" class="img-responsive logo"></a>
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
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"><img src=""""),_display_(Seq[Any](/*91.78*/routes/*91.84*/.Assets.at("images/user.png"))),format.raw/*91.113*/("""" class="img-circle" alt="Avatar"> <span>Samuel</span> <i class="icon-submenu lnr lnr-chevron-down"></i></a>
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
              <form action="/item" method="post" enctype="multipart/form-data">
                <div class="form-group">
                  <label for="commodityName">商品名称</label>
                  <input type="text" name="commodityName" class="form-control" id="commodityName" placeholder="名称">
                </div>
                <div class="form-group">
                  <label for="price">商品价格</label>
                  <input type="text" name="price" class="form-control" id="price" placeholder="商品的价格">
                </div>
                <div class="form-group">
                  <label for="agio">商品折扣</label>
                  <input type="text" name="agio" class="form-control" id="agio" placeholder="商品的折扣">
                </div>
								<!-- <div class="form-group">
									<label for="agio">商品图片</label>
									<input type="text" name="picture" class="form-control" id="picture" placeholder="商品的折扣">
								</div> -->


                <div class="form-group">
                  <label for="cType">商品类型</label>
                  <input type="text" name="cType" class="form-control" id="cType" placeholder="商品的类型">
                </div>

								<div class="form-group">
                  <label for="picture">上传商品图片</label>
                  <input type="file" id="picture" name="picture">
                </div>

                <button type="submit" class="btn btn-default">添加</button>
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
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 27 15:11:20 CST 2017
                    SOURCE: /home/byer/haha/Amaze_Play_Framework-master/app/views/additem.scala.html
                    HASH: 42d9539022bb0cf608853db3e1c85803f3cc8edd
                    MATRIX: 857->0|1778->885|1793->891|1867->943|1937->977|1952->983|2032->1041|2102->1075|2117->1081|2181->1123|2251->1157|2266->1163|2341->1216|2430->1269|2445->1275|2507->1315|2650->1422|2665->1428|2721->1462|2954->1659|2969->1665|3026->1700|3121->1759|3136->1765|3190->1797|3389->1960|3404->1966|3460->2000|5947->4451|5962->4457|6014->4486
                    LINES: 29->1|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|62->34|62->34|62->34|64->36|64->36|64->36|68->40|68->40|68->40|69->41|69->41|69->41|78->50|78->50|78->50|119->91|119->91|119->91
                    -- GENERATED --
                */
            
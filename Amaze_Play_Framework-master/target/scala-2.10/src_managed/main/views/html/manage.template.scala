
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
object manage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Commodity],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(commoditys: List[Commodity]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.31*/("""
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
							<div class="panel">
								<div class="panel-heading">
									<h3 class="panel-title">所有商品</h3>


									<div class="right">
										<button type="button" class="btn-toggle-collapse"><i class="lnr lnr-chevron-up"></i></button>
										<button type="button" class="btn-remove"><i class="lnr lnr-cross"></i></button>
									</div>
								</div>
								<div class="panel-body no-padding">
									<table class="table table-striped">
										<thead>
											<tr>
												<th>商品ID</th>
												<th>商品名称</th>
												<th>商品价格</th>
												<th>商品折扣</th>
												<th>操作</th>
											</tr>
										</thead>
										<tbody>
                        """),_display_(Seq[Any](/*129.26*/for(commodity <- commoditys) yield /*129.54*/{_display_(Seq[Any](format.raw/*129.55*/("""
                          <tr>
                            <td><a href="#">"""),_display_(Seq[Any](/*131.46*/commodity/*131.55*/.commodityId)),format.raw/*131.67*/("""</a></td>
                            <td>"""),_display_(Seq[Any](/*132.34*/commodity/*132.43*/.commodityName)),format.raw/*132.57*/("""</td>
                            <td>"""),_display_(Seq[Any](/*133.34*/commodity/*133.43*/.price)),format.raw/*133.49*/("""</td>
                            <td>"""),_display_(Seq[Any](/*134.34*/commodity/*134.43*/.agio)),format.raw/*134.48*/("""</td>
                            <td>
                              <a href="/edititem?id="""),_display_(Seq[Any](/*136.54*/commodity/*136.63*/.commodityId)),format.raw/*136.75*/("""" type="button">修改</a>
                              <a href="/delitem?id="""),_display_(Seq[Any](/*137.53*/commodity/*137.62*/.commodityId)),format.raw/*137.74*/("""" type="button">删除</a>
                            </td>
                          </tr>
                        """)))})),format.raw/*140.26*/("""

										</tbody>
									</table>
								</div>
								<div class="panel-footer">
									<div class="row">
										<div class="col-md-6"><span class="panel-note"><i class="fa fa-clock-o"></i> Last 24 hours</span></div>
										<div class="col-md-6 text-right"><a href="/edititem" class="btn btn-primary">添加商品</a></div>
									</div>
								</div>
							</div>
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
    
    def render(commoditys:List[Commodity]): play.api.templates.HtmlFormat.Appendable = apply(commoditys)
    
    def f:((List[Commodity]) => play.api.templates.HtmlFormat.Appendable) = (commoditys) => apply(commoditys)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 27 15:11:20 CST 2017
                    SOURCE: /home/byer/haha/Amaze_Play_Framework-master/app/views/manage.scala.html
                    HASH: 8e6cd4958f8654c5b24e057f714b69ec64ae5316
                    MATRIX: 784->1|907->30|1253->340|1268->346|1342->398|1412->432|1427->438|1507->496|1577->530|1592->536|1656->578|1726->612|1741->618|1816->671|1905->724|1920->730|1982->770|2125->877|2140->883|2196->917|2429->1114|2444->1120|2501->1155|2596->1214|2611->1220|2665->1252|2864->1415|2879->1421|2935->1455|5422->3906|5437->3912|5489->3941|7591->6006|7636->6034|7676->6035|7790->6112|7809->6121|7844->6133|7924->6176|7943->6185|7980->6199|8056->6238|8075->6247|8104->6253|8180->6292|8199->6301|8227->6306|8356->6398|8375->6407|8410->6419|8522->6494|8541->6503|8576->6515|8723->6629
                    LINES: 26->1|29->1|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|43->15|43->15|43->15|45->17|45->17|45->17|49->21|49->21|49->21|50->22|50->22|50->22|59->31|59->31|59->31|100->72|100->72|100->72|157->129|157->129|157->129|159->131|159->131|159->131|160->132|160->132|160->132|161->133|161->133|161->133|162->134|162->134|162->134|164->136|164->136|164->136|165->137|165->137|165->137|168->140
                    -- GENERATED --
                */
            
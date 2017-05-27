
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
object admin extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[User],List[Store],List[Checkstore],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(users:List[User], stores:List[Store], checkstores:List[Checkstore]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.70*/("""
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
						<li><a href="/admin" class="active"><i class="lnr lnr-home"></i> <span>后台管理</span></a></li>
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
									<h3 class="panel-title">店铺申请</h3>


									<div class="right">
										<button type="button" class="btn-toggle-collapse"><i class="lnr lnr-chevron-up"></i></button>
										<button type="button" class="btn-remove"><i class="lnr lnr-cross"></i></button>
									</div>
								</div>
								<div class="panel-body no-padding">
									<table class="table table-striped">
										<thead>
											<tr>
												<th>ID</th>
												<th>申请人</th>
												<th>商店名</th>
												<th>店铺描述</th>
												<th>操作</th>
											</tr>
										</thead>
										<tbody>
											"""),_display_(Seq[Any](/*129.13*/for(checkstore <- checkstores) yield /*129.43*/ {_display_(Seq[Any](format.raw/*129.45*/("""
												<tr>
													<td><a href="#">"""),_display_(Seq[Any](/*131.31*/checkstore/*131.41*/.checkId)),format.raw/*131.49*/("""</a></td>
													<td>"""),_display_(Seq[Any](/*132.19*/checkstore/*132.29*/.storename)),format.raw/*132.39*/("""</td>
													<td>"""),_display_(Seq[Any](/*133.19*/checkstore/*133.29*/.user)),format.raw/*133.34*/("""</td>
													<td>"""),_display_(Seq[Any](/*134.19*/checkstore/*134.29*/.description)),format.raw/*134.41*/("""</td>
													<td>
														<a href="/pass?id="""),_display_(Seq[Any](/*136.34*/checkstore/*136.44*/.checkId)),format.raw/*136.52*/("""" type="button">通过</a>
														<a href="/delapply?id="""),_display_(Seq[Any](/*137.38*/checkstore/*137.48*/.checkId)),format.raw/*137.56*/("""" type="button">删除</a>
													</td>
												</tr>
											""")))})),format.raw/*140.13*/("""
										</tbody>
									</table>
								</div>
								<div class="panel-footer">
									<div class="row">
										<div class="col-md-6"><span class="panel-note"><i class="fa fa-clock-o"></i> Last 24 hours</span></div>
										<div class="col-md-6 text-right"><a href="#" class="btn btn-primary">View All Purchases</a></div>
									</div>
								</div>
							</div>
							<!-- END RECENT PURCHASES -->
						</div>

					</div>
				</div>
			</div>


			<div class="main-content">
				<div class="container-fluid">
					<div class="row">
						<div class="col-md-12">
							<!-- RECENT PURCHASES -->
							<div class="panel">
								<div class="panel-heading">
									<h3 class="panel-title">所有用户</h3><br>
									<p>(类型1为会员，2为商家，3为管理员)</p>
									<div class="right">
										<button type="button" class="btn-toggle-collapse"><i class="lnr lnr-chevron-up"></i></button>
										<button type="button" class="btn-remove"><i class="lnr lnr-cross"></i></button>
									</div>
								</div>
								<div class="panel-body no-padding">
									<table class="table table-striped">
										<thead>
											<tr>
												<th>用户名</th>
												<th>类型</th>
												<th>操作</th>
											</tr>
										</thead>
										<tbody>
											"""),_display_(Seq[Any](/*183.13*/for(user <- users) yield /*183.31*/ {_display_(Seq[Any](format.raw/*183.33*/("""
												<tr>
													<td><a href="#">"""),_display_(Seq[Any](/*185.31*/user/*185.35*/.username)),format.raw/*185.44*/("""</a></td>
													<td>"""),_display_(Seq[Any](/*186.19*/user/*186.23*/.powerid)),format.raw/*186.31*/("""</td>
													<td>
														<a href="/deluser?username="""),_display_(Seq[Any](/*188.43*/user/*188.47*/.username)),format.raw/*188.56*/("""" type="button">删除</a>
													</td>
												</tr>
											""")))})),format.raw/*191.13*/("""
										</tbody>
									</table>
								</div>
								<div class="panel-footer">
									<div class="row">
										<div class="col-md-6"><span class="panel-note"><i class="fa fa-clock-o"></i> Last 24 hours</span></div>
										<div class="col-md-6 text-right"><a href="#" class="btn btn-primary">View All Purchases</a></div>
									</div>
								</div>
							</div>
							<!-- END RECENT PURCHASES -->
						</div>

					</div>
				</div>
			</div>
			<!-- END MAIN CONTENT -->

			<div class="main-content">
				<div class="container-fluid">
					<div class="row">
						<div class="col-md-12">
							<!-- RECENT PURCHASES -->
							<div class="panel">
								<div class="panel-heading">
									<h3 class="panel-title">所有店铺</h3>
									<div class="right">
										<button type="button" class="btn-toggle-collapse"><i class="lnr lnr-chevron-up"></i></button>
										<button type="button" class="btn-remove"><i class="lnr lnr-cross"></i></button>
									</div>
								</div>
								<div class="panel-body no-padding">
									<table class="table table-striped">
										<thead>
											<tr>
												<th>ID</th>
												<th>Name</th>
												<th>Description</th>
												<th>Date &amp; Time</th>
												<th>Status</th>
											</tr>
										</thead>
										<tbody>
													"""),_display_(Seq[Any](/*235.15*/for(store <- stores) yield /*235.35*/ {_display_(Seq[Any](format.raw/*235.37*/("""
														<tr>
															<td><a href="#">"""),_display_(Seq[Any](/*237.33*/store/*237.38*/.StoreId)),format.raw/*237.46*/("""</a></td>
															<td>"""),_display_(Seq[Any](/*238.21*/store/*238.26*/.storename)),format.raw/*238.36*/("""</td>
															<td>"""),_display_(Seq[Any](/*239.21*/store/*239.26*/.description)),format.raw/*239.38*/("""</td>
															<td>"""),_display_(Seq[Any](/*240.21*/store/*240.26*/.time)),format.raw/*240.31*/("""</td>
															<td><span class="label label-success">COMPLETED</span></td>
														</tr>
													""")))})),format.raw/*243.15*/("""
										</tbody>
									</table>
								</div>
								<div class="panel-footer">
									<div class="row">
										<div class="col-md-6"><span class="panel-note"><i class="fa fa-clock-o"></i> Last 24 hours</span></div>
										<div class="col-md-6 text-right"><a href="#" class="btn btn-primary">View All Purchases</a></div>
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
    
    def render(users:List[User],stores:List[Store],checkstores:List[Checkstore]): play.api.templates.HtmlFormat.Appendable = apply(users,stores,checkstores)
    
    def f:((List[User],List[Store],List[Checkstore]) => play.api.templates.HtmlFormat.Appendable) = (users,stores,checkstores) => apply(users,stores,checkstores)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 27 15:11:19 CST 2017
                    SOURCE: /home/byer/haha/Amaze_Play_Framework-master/app/views/admin.scala.html
                    HASH: 13fad31706cc3502a64d87c9070fcc4b6ad481a2
                    MATRIX: 807->1|969->69|1324->388|1339->394|1413->446|1484->481|1499->487|1579->545|1650->580|1665->586|1729->628|1800->663|1815->669|1890->722|1981->777|1996->783|2058->823|2203->932|2218->938|2274->972|2511->1173|2526->1179|2583->1214|2679->1274|2694->1280|2748->1312|2956->1484|2971->1490|3027->1524|5555->4016|5570->4022|5622->4051|7761->6153|7808->6183|7849->6185|7936->6235|7956->6245|7987->6253|8053->6282|8073->6292|8106->6302|8168->6327|8188->6337|8216->6342|8278->6367|8298->6377|8333->6389|8429->6448|8449->6458|8480->6466|8578->6527|8598->6537|8629->6545|8737->6620|10097->7943|10132->7961|10173->7963|10260->8013|10274->8017|10306->8026|10372->8055|10386->8059|10417->8067|10522->8135|10536->8139|10568->8148|10676->8223|12102->9612|12139->9632|12180->9634|12271->9688|12286->9693|12317->9701|12385->9732|12400->9737|12433->9747|12497->9774|12512->9779|12547->9791|12611->9818|12626->9823|12654->9828|12805->9946
                    LINES: 26->1|29->1|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|43->15|43->15|43->15|45->17|45->17|45->17|49->21|49->21|49->21|50->22|50->22|50->22|59->31|59->31|59->31|100->72|100->72|100->72|157->129|157->129|157->129|159->131|159->131|159->131|160->132|160->132|160->132|161->133|161->133|161->133|162->134|162->134|162->134|164->136|164->136|164->136|165->137|165->137|165->137|168->140|211->183|211->183|211->183|213->185|213->185|213->185|214->186|214->186|214->186|216->188|216->188|216->188|219->191|263->235|263->235|263->235|265->237|265->237|265->237|266->238|266->238|266->238|267->239|267->239|267->239|268->240|268->240|268->240|271->243
                    -- GENERATED --
                */
            

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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>asd</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/fileuploader.css"))),format.raw/*8.102*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png"))),format.raw/*9.97*/("""">
        <script src=""""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*10.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("javascripts/fileuploader.js"))),format.raw/*11.70*/("""" type="text/javascript"></script>
   
    </head>
    <body>
    <ul class="aaaa">asdasdasd
    </ul>

<script>        
    jQuery(function()"""),format.raw/*19.22*/("""{"""),format.raw/*19.23*/("""
        var uploader = new qq.FileUploader("""),format.raw/*20.44*/("""{"""),format.raw/*20.45*/("""
            element: document.getElementById('file-uploader'),
            action: 'upload/',
            onComplete: function(id, fileName, responseJSON)"""),format.raw/*23.61*/("""{"""),format.raw/*23.62*/("""
            	console.log($(".aaaa"));
            	$(".aaaa").append('<li><a href="/service/download/'+fileName+'">Download</a></li>');
            	return false;
            """),format.raw/*27.13*/("""}"""),format.raw/*27.14*/(""",
        """),format.raw/*28.9*/("""}"""),format.raw/*28.10*/(""");           
    """),format.raw/*29.5*/("""}"""),format.raw/*29.6*/(""");     
</script>
        
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
                    DATE: Sat May 27 15:11:19 CST 2017
                    SOURCE: /home/byer/haha/Amaze_Play_Framework-master/app/views/main.scala.html
                    HASH: 86804dc4c28ba82b739abd5f49d438fc918bd4ad
                    MATRIX: 854->2|1004->117|1018->123|1082->165|1178->226|1192->232|1245->264|1306->289|1321->295|1388->340|1481->397|1496->403|1559->444|1729->586|1758->587|1830->631|1859->632|2042->787|2071->788|2275->964|2304->965|2341->975|2370->976|2415->994|2443->995
                    LINES: 29->3|34->8|34->8|34->8|35->9|35->9|35->9|36->10|36->10|36->10|37->11|37->11|37->11|45->19|45->19|46->20|46->20|49->23|49->23|53->27|53->27|54->28|54->28|55->29|55->29
                    -- GENERATED --
                */
            
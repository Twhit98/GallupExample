
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(users: List[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.21*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("User list")/*5.19*/{_display_(Seq[Any](format.raw/*5.20*/("""
	<h1>User List - """),_display_(Seq[Any](/*6.19*/users/*6.24*/.size())),format.raw/*6.31*/(""" users found</h1>

	<ul>
		"""),_display_(Seq[Any](/*9.4*/for(user <- users) yield /*9.22*/{_display_(Seq[Any](format.raw/*9.23*/("""
			<li>
				"""),_display_(Seq[Any](/*11.6*/user/*11.10*/.username)),format.raw/*11.19*/(""" - """),_display_(Seq[Any](/*11.23*/user/*11.27*/.email)),format.raw/*11.33*/("""
			</li>
		""")))})),format.raw/*13.4*/("""
	</ul>
""")))})))}
    }
    
    def render(users:List[User]): play.api.templates.HtmlFormat.Appendable = apply(users)
    
    def f:((List[User]) => play.api.templates.HtmlFormat.Appendable) = (users) => apply(users)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Nov 01 10:40:04 CDT 2014
                    SOURCE: C:/Users/avguest/Desktop/PlayProjects/todoList/app/views/index.scala.html
                    HASH: c2e385f3c292949dc43817dd9db0acaf8250659e
                    MATRIX: 778->1|907->20|935->39|971->41|996->58|1034->59|1088->78|1101->83|1129->90|1191->118|1224->136|1262->137|1311->151|1324->155|1355->164|1395->168|1408->172|1436->178|1480->191
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|34->6|34->6|34->6|37->9|37->9|37->9|39->11|39->11|39->11|39->11|39->11|39->11|41->13
                    -- GENERATED --
                */
            
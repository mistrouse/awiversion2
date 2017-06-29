
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Task],Form[Task],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(tasks: List[Task], taskForm: Form[Task]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.43*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("List to do")/*5.20*/ {_display_(Seq[Any](format.raw/*5.22*/("""


<h2>Nombre de tâches: """),_display_(Seq[Any](/*8.24*/tasks/*8.29*/.size())),format.raw/*8.36*/("""</h2>
<div class="table-responsive">
    <table class="table table-striped">
        <thead>
        <tr>
            <th>id</th>
            <th>Name</th>
            <th>Contenu</th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <tbody>

        """),_display_(Seq[Any](/*22.10*/for(task <- tasks) yield /*22.28*/ {_display_(Seq[Any](format.raw/*22.30*/("""
        <tr>
            <td>"""),_display_(Seq[Any](/*24.18*/task/*24.22*/.id)),format.raw/*24.25*/("""</td>
            <td>"""),_display_(Seq[Any](/*25.18*/task/*25.22*/.name)),format.raw/*25.27*/("""</td>
            <td>"""),_display_(Seq[Any](/*26.18*/task/*26.22*/.label)),format.raw/*26.28*/("""</td>
            <td>
              <a href=""""),_display_(Seq[Any](/*28.25*/routes/*28.31*/.Application.edit(task.id))),format.raw/*28.57*/("""">Modifier</a>
            </td>
            <td>
                """),_display_(Seq[Any](/*31.18*/form(routes.Application.deleteTask(task.id))/*31.62*/ {_display_(Seq[Any](format.raw/*31.64*/("""
                <input type="submit" value="Suprimer">
                """)))})),format.raw/*33.18*/("""
            </td>

        </tr>
        """)))})),format.raw/*37.10*/("""
        </tbody>
    </table>
</div>




<div id="add">
<h2>Tâche </h2>

"""),_display_(Seq[Any](/*48.2*/form(routes.Application.newTask())/*48.36*/ {_display_(Seq[Any](format.raw/*48.38*/("""


<h2>Nom :  </h2>
"""),_display_(Seq[Any](/*52.2*/inputText(taskForm("name")))),format.raw/*52.29*/("""

<h2>Contenu : </h2>
"""),_display_(Seq[Any](/*55.2*/inputText(taskForm("label")))),format.raw/*55.30*/("""

    <div id="ad"><input type="submit" value="ajouter"></div>

""")))})),format.raw/*59.2*/("""

</div>
""")))})),format.raw/*62.2*/("""
"""))}
    }
    
    def render(tasks:List[Task],taskForm:Form[Task]): play.api.templates.HtmlFormat.Appendable = apply(tasks,taskForm)
    
    def f:((List[Task],Form[Task]) => play.api.templates.HtmlFormat.Appendable) = (tasks,taskForm) => apply(tasks,taskForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jun 28 21:08:50 CEST 2017
                    SOURCE: /Users/florianeMac/awi/app/views/index.scala.html
                    HASH: 7170be491c9a71d44869eb41203588bc8a5956b8
                    MATRIX: 789->1|940->42|968->61|1004->63|1030->81|1069->83|1130->109|1143->114|1171->121|1493->407|1527->425|1567->427|1634->458|1647->462|1672->465|1731->488|1744->492|1771->497|1830->520|1843->524|1871->530|1954->577|1969->583|2017->609|2120->676|2173->720|2213->722|2318->795|2393->838|2503->913|2546->947|2586->949|2642->970|2691->997|2749->1020|2799->1048|2895->1113|2936->1123
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|36->8|36->8|36->8|50->22|50->22|50->22|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|56->28|56->28|56->28|59->31|59->31|59->31|61->33|65->37|76->48|76->48|76->48|80->52|80->52|83->55|83->55|87->59|90->62
                    -- GENERATED --
                */
            
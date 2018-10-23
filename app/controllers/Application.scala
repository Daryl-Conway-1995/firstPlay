package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("hello world"))
  }

  def test(name:String) = Action {
    Ok(views.html.test(name))
  }

  def testNum(number:Int) = Action {
    Ok(views.html.test(number.toString))
  }

  def testRedirect = Action { implicit request: Request[AnyContent] =>    Redirect(routes.Application.test("Bob"))  }

}
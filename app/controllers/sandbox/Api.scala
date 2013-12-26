package controllers.sandbox

import play.api.mvc.{Controller, Action}

object Api extends Controller {

  def index = Action {
    Ok(views.html.sandbox.api("Your Crossw application is ready!"))
  }

}

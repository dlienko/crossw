package controllers.custom

import play.api.mvc._
import play.Logger
import scala.concurrent.Future

object LoggingAction extends ActionBuilder[Request] {

  def invokeBlock[A](request: Request[A], block: Request[A] => Future[SimpleResult]) = {
    block(request)
  }

  override def composeAction[A](action: Action[A]) = Logging(action)
}

case class Logging[A](action: Action[A]) extends Action[A] {

  def apply(request: Request[A]): Future[SimpleResult] = {
    Logger.info("Calling action")
    action(request)
  }

  lazy val parser = action.parser
}

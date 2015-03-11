package controllers

import play.api._
import play.api.mvc._
import components.DbAccess

object CreateTasksController extends Controller {


  def createTasksView = Action {
    Ok(views.html.createTask())
  }
  
  def createTask = Action {
    Ok("")
  }
}

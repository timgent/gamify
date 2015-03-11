package components

import scala.slick.driver.PostgresDriver.simple._
//import scala.slick.driver.H2Driver.simple._

object DbAccess {
  val db = Database.forURL("jdbc:postgresql://localhost/presentation", driver = "org.postgresql.Driver")
}

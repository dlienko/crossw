import play.Project._
import play.Keys.lessEntryPoints

name := "crossw"

version := "1.0"

libraryDependencies ++= Seq(jdbc, anorm)

playScalaSettings

lessEntryPoints <<= baseDirectory(_ / "app" / "assets" / "stylesheets" ** "main.less")

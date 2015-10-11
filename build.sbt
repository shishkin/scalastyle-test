lazy val commonSettings = Seq(
  scalaVersion := "2.11.7",
  organization := "org.shishkin",
  version := "1.0"
) ++ Scalastyle.settings

lazy val libs = Seq("org.scalatest" %% "scalatest" % "2.2.4")

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "scalastyle-test",
    libraryDependencies ++= libs)

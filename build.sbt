def styleSettings: Seq[Def.Setting[_]] = {
  val configFile = Def.setting(root.base / "project/scalastyle_config.xml")
  Seq(
    scalastyleConfig in Compile := configFile.value,
    scalastyleConfig in scalastyle := configFile.value,
    scalastyle := {
      (scalastyle in Compile).toTask("").value
      (scalastyle in Test).toTask("").value
    }
  )
}

lazy val commonSettings = Seq(
  scalaVersion := "2.11.7",
  organization := "org.shishkin",
  version := "1.0"
) ++ styleSettings

lazy val libs = Seq("org.scalatest" %% "scalatest" % "2.2.4")

lazy val root = (project in file("."))
  .aggregate(submodule)
  .settings(commonSettings: _*)
  .settings(
    name := "scalastyle-test",
    libraryDependencies ++= libs)

lazy val submodule = (project in file("submodule")).
  settings(commonSettings: _*)
  .settings(
    name := "submodule",
    libraryDependencies ++= libs)
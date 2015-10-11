//scalaVersion := "2.10.6"
scalaVersion := "2.11.7"

organization := "org.shishkin"

name := "scalastyle-test"

version := "1.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4"

lazy val scalastyleSettings: Seq[Def.Setting[File]] = {
  import org.scalastyle.sbt.ScalastylePlugin.scalastyleConfig
  val ssc = Def.setting { baseDirectory.value / "project" / "scalastyle_config.xml" }
  Seq(
    scalastyleConfig in Compile := ssc.value,
    scalastyleConfig in Test := ssc.value
  )
}


//scalastyleConfig := baseDirectory.value / "project/scalastyle_config.xml"

scalastyleSettings

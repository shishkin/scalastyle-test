import sbt._
import sbt.Keys._

import org.scalastyle.sbt.ScalastylePlugin._

object Scalastyle {

  def settings = {
    val configFile = Def.setting(baseDirectory.value / "project/scalastyle_config.xml")
    Seq(
      scalastyleConfig in Compile := configFile.value,
      scalastyleConfig in scalastyle := configFile.value
    )
  }
}

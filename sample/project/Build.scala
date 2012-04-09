import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "sample"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "com.github.julienrf" %% "play-jsmessages" % "1.0"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA)

}

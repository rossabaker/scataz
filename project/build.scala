import sbt._
import Keys._

object ScatazBuild extends Build {
  lazy val scataz = Project("scataz", file("."))
    .dependsOn(catsCore)
    .settings(
      libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.1.0"
    )

  lazy val catsCore = ProjectRef(uri("http://github.com/non/cats.git"), "core")
}

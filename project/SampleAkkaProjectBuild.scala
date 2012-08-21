import sbt._
import sbt.Keys._

object SampleAkkaProjectBuild extends Build {

  lazy val sampleAkkaProject = Project(
    id = "sample-akka-project",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "Sample Akka Project",
      organization := "org.example",
      version := "0.1",
      scalaVersion := "2.9.2",
      resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases",
      libraryDependencies += "com.typesafe.akka" % "akka-actor" % "2.0.1"
    )
  )
}

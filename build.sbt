name := "euler-scala"

version := "0.1"

scalaVersion := "2.13.2"

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "utf-8",
  "-feature",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint",
  "-Ywarn-dead-code",
  "-Ywarn-unused",
  "-Ywarn-value-discard",
)

// log time execution for each test
testOptions in Test += Tests.Argument("-oD")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test

libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.14.0" % Test

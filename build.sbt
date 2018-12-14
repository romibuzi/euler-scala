name := "euler-scala"

version := "0.1"

scalaVersion := "2.12.7"

// log time execution for each test
testOptions in Test += Tests.Argument("-oD")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test

libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.14.0" % Test

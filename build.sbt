import sbt.Keys._

name := "SparkWordCount"

version := "1.0"

scalaVersion := "2.10.5"

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.10" % "1.6.1",
  "org.apache.spark" % "spark-bagel_2.10" % "1.6.1")

mainClass in(Compile, packageBin) := Some("StreamingDriver")

mainClass in(Compile, run) := Some("StreamingDriver")
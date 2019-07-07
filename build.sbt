name := """play-hands-on"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.3" % Test,
  javaJdbc,
  "mysql" % "mysql-connector-java" % "8.0.16", // mysql-connector
  "com.typesafe.play" %% "anorm" % "2.5.3",
  evolutions,
)

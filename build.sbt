name := """dashboard"""

version := "1.0-SNAPSHOT"

resolvers += "Local Maven Repository" at Path.userHome.asFile.toURI.toURL + ".m2/repository"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.3.0",
  cache,
  ws
)


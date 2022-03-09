ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "learningScalaA"
  )
// found the api we need and import by copying the corresponding SBT from the https://mvnrepository.com/
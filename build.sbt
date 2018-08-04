lazy val `upem-course-2` = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "upem",
      scalaVersion := "2.12.6",
      version      := "1.0.0"
    )),
    name := "functional-programming"
  )

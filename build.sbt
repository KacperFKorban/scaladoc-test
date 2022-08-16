val scala3Version = "3.1.3"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scaladoc-test",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    Compile / doc / scalacOptions ++= Seq(
      "-snippet-compiler:compile",
      "-siteroot", "docs",
      "-d", "output",
    ),

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )

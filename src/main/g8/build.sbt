seq(webSettings :_*)

organization := "$organization$"

name := "$name$"

scalaVersion := "$scalaVersion$"

version := "$version$"

libraryDependencies ++= Seq(
  "ru.circumflex" % "circumflex-web" % "$circumflexVersion$" % "compile",
  "ru.circumflex" % "circumflex-core" % "$circumflexVersion$" % "compile",
  "ru.circumflex" % "circumflex-ftl" % "$circumflexVersion$" % "compile",
  "org.mortbay.jetty" % "jetty" % "$jettyVersion$" % "container"
)

resolvers ++= Nil

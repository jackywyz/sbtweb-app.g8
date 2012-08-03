// give the user a nice default project!
scalaVersion :="2.9.2"

seq(webSettings :_*)

libraryDependencies ++= Seq("org.mortbay.jetty" % "jetty" % "6.1.26" % "container")


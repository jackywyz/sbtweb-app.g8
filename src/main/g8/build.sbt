// give the user a nice default project!
scalaVersion :="2.10.3"

seq(webSettings :_*)

libraryDependencies ++= Seq("org.mortbay.jetty" % "jetty" % "6.1.26" % "container",
"ch.qos.logback" % "logback-classic" % "1.0.13" % "runtime",
"javax.servlet" % "servlet-api" % "2.5" % "provided",
"org.slf4j" % "slf4j-api" % "1.7.5"
)


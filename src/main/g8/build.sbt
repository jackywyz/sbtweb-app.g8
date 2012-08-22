// give the user a nice default project!
scalaVersion :="2.9.2"

seq(webSettings :_*)

libraryDependencies ++= Seq("org.mortbay.jetty" % "jetty" % "6.1.26" % "container",
 "com.typesafe.akka" % "akka-actor" % "2.0.3",
 "com.typesafe.akka" % "akka-slf4j" % "2.0.3",
"ch.qos.logback" % "logback-classic" % "1.0.6" % "runtime"
)


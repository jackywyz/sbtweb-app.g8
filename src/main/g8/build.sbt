// give the user a nice default project!
scalaVersion :="2.10.0"

seq(webSettings :_*)

libraryDependencies ++= Seq("org.mortbay.jetty" % "jetty" % "6.1.26" % "container",
 "com.typesafe.akka" %% "akka-actor" % "2.1.0",
 "com.typesafe.akka" %% "akka-slf4j" % "2.1.0",
"ch.qos.logback" % "logback-classic" % "1.0.6" % "runtime"
)


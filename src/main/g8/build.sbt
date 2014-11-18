// give the user a nice default project!
scalaVersion :="2.11.4"

jetty()

libraryDependencies ++= Seq("javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided",
"ch.qos.logback" % "logback-classic" % "1.1.2" % "runtime",
"org.slf4j" % "slf4j-api" % "1.7.7"
)


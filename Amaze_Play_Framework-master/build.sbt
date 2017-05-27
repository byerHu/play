name := "amaze"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "mysql" % "mysql-connector-java" % "5.1.42",
  "org.mindrot" % "jbcrypt" % "0.4"
)     

play.Project.playJavaSettings

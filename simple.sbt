name := "Exercise ADAM"

version := "0.1"

scalaVersion := "2.9.3"

libraryDependencies += "org.apache.spark" %% "spark-core" % "0.8.1-incubating"

libraryDependencies += "edu.berkeley.cs.amplab.adam" % "adam-core" % "0.6.1-SNAPSHOT"

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"

resolvers += "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"






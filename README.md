sample-akka-project
===================

Sample Akka project with Akka 2.0.1 , sbt and gen-idea plugin
Akka 2.0.1 sample project using Scala and SBT.
To run and test it use SBT invoke: 'sbt run'

This is based on the g8 template at https://github.com/typesafehub/akka-scala-sbt.g8, with the addition of sbt-idea plugin. 

You can choose to fork it before you use it or just start off by cloning it.
1. Clone the repo into your directory. Ideally clone it into a directory name of your choice (instead of the default sample-akka-project). 
git clone git://github.com/ripplekhera/sample-akka-project.git my-akka-testing

2. Rename the SampleAkkaProjectBuild.scala to refer to your project (eg. MyAkkaTesting.scala)
Rename the object in the scala file to your project build (eg. MyAkkaTestingBuild)
Rename the val to your project (eg. myAkkaProject)
Rename the id of the project (eg id = "my-akka-testing")

3. Run sbt and ensure everything is working
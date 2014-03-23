name := "DataTable"

version := "1.0"

libraryDependencies ++= Seq(
	"org.hibernate" % "hibernate-entitymanager" % "4.3.4.Final",
	"mysql" % "mysql-connector-java" % "5.1.29",
	jdbc,
	javaCore,
	javaJdbc,
	javaJpa
)

play.Project.playScalaSettings

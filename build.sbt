name := "TwitterStream"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.4.1",
  "org.apache.spark" %% "spark-streaming" % "1.4.1",
  "org.apache.spark" %% "spark-streaming-twitter" % "1.4.1",
  "org.twitter4j"    %  "twitter4j-core" % "4.0.4",
  "org.twitter4j"    %  "twitter4j-stream" % "4.0.4",
  "org.apache.kafka" %  "kafka_2.10" % "0.8.2.0",
  "org.apache.spark" %  "spark-streaming-kafka_2.10" % "1.4.1"
)
    
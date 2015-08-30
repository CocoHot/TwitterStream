name := "TwitterStream"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.4.1",
  "org.apache.spark" %% "spark-streaming" % "1.4.1",
  "org.apache.spark" %% "spark-streaming-twitter" % "1.4.1",
  "org.twitter4j"    %  "twitter4j-stream" % "3.0.3",
  "org.apache.kafka" %  "kafka_2.10" % "0.8.0",
  "org.apache.spark" % "spark-streaming-kafka_2.10" % "1.4.1"
)
    
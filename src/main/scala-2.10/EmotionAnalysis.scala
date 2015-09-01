import org.apache.spark.SparkConf
import org.apache.spark.streaming.kafka.KafkaUtils
import org.apache.spark.streaming.{Seconds, StreamingContext}
import twitter4j._

/**
 * Created by kevin on 9/1/15.
 */
object EmotionAnalysis {
  def main(args: Array[String]) {
    if (args.length < 4) {
      System.err.println("Usage: TwitterPopularTags <consumer key> <consumer secret> " +
        "<access token> <access token secret> [<filters>]")
      System.exit(1)
    }

    val sparkConf = new SparkConf().setAppName("emotionAnalysis").setMaster("local[2]")
    val ssc = new StreamingContext(sparkConf, Seconds(2))


    //val kafkaStream = KafkaUtils.createStream(streamingContext, [ZK quorum], [consumer group id], [per-topic number of Kafka partitions to consume])
    // Create direct kafka stream with brokers and topics
    val kafkaParams = Map[String, String]("metadata.broker.list" -> "localhost:9092")
    val messages = KafkaUtils.createDirectStream[String, String, kafka.serializer.StringDecoder, kafka.serializer.StringDecoder](ssc, kafkaParams, Set("twitter-stream") )




    // Get the lines, split them into words, count the words and print
//    val lines = messages.map(_._2)
//    val words = lines.flatMap(_.split(" "))
//    val wordCounts = words.map(x => (x, 1L)).reduceByKeyAndWindow(_ + _, Seconds(60))
//      .map{case (topic, count) => (count, topic)}
//      .transform(_.sortByKey(false))
//    wordCounts.print()

    // Start the computation
    ssc.start()
    ssc.awaitTermination()
  }

}

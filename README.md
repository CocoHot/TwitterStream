# EMOTION ANALYSIS

### Installation

#### Kafka server setup
* Step 1: Download the code
[Download](https://www.apache.org/dyn/closer.cgi?path=/kafka/0.8.2.0/kafka_2.10-0.8.2.0.tgz) the 0.8.2.0 release and un-tar it.
```sh
> tar -xzf kafka_2.10-0.8.2.0.tgz
> cd kafka_2.10-0.8.2.0
> cd kafka_2.10-0.8.2.0
```
* Step 2: Start the ZooKeeper and Kafka server
``` sh
> bin/zookeeper-server-start.sh config/zookeeper.properties
> bin/kafka-server-start.sh config/server.properties
```
* Step 3: Create a topic
``` sh
> bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic twitter-stream
```
### Run Application
1. Clone the project to local and import into Intellij
2. Let SBT download the dependencies
3. Run TwitterProducer object, should see information coming in
4. Run EmotionAnalysis object, should see application start running.
5. The default request server is localhost:3000, if need to change it is set in EmotionAnalysis.scala line 18
6. POST request URL:
``` sh
http://localhost:3000/post
```


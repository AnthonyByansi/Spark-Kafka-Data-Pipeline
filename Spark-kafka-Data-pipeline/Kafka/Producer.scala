import java.util.Properties
import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}

object Producer {

  def main(args: Array[String]): Unit = {

    // Kafka producer configuration
    val props = new Properties()
    props.put("bootstrap.servers", "localhost:9092")
    props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
    props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")

    val topic = "your-topic" // Replace with your Kafka topic name

    // Create Kafka producer
    val producer = new KafkaProducer[String, String](props)

    try {
      // Generate and publish sample data to Kafka
      while (true) {
        val data = generateData()
        val record = new ProducerRecord[String, String](topic, data)
        producer.send(record)
        Thread.sleep(1000) // Adjust sleep time as per your requirements
      }
    } catch {
      case e: Exception =>
        e.printStackTrace()
    } finally {
      producer.close()
    }
  }

  def generateData(): String = {
    // Implement your logic to generate data here
    // Return the generated data as a string
    // Example: Random.nextInt(100).toString
    "Sample data"
  }

}

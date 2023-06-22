# Kafka Producer

This directory contains the code for the Kafka producer in the "Spark-Kafka-Data-Pipeline" project. The Kafka producer is responsible for generating and publishing sample data to a Kafka topic.

## Prerequisites

Before running the Kafka producer, ensure that you have the following prerequisites set up:

- Apache Kafka is installed and configured.
- Scala and Kafka dependencies are installed.

## Configuration

To configure the Kafka producer, you need to update the `bootstrap.servers`, `key.serializer`, and `value.serializer` properties in the `Producer.scala` file. Modify these properties based on your Kafka cluster setup.

## Running the Kafka Producer

To run the Kafka producer, follow these steps:

1. Open a terminal and navigate to the `kafka` directory.

2. Compile the Kafka producer code using the following command:

   ```shell
   scalac Producer.scala
   ```
3. Run the Kafka producer using the following command: `scala Producer`
The Kafka producer will start generating sample data and publishing it to the Kafka topic.

## Customizing Data Generation

By default, the `generateData` method in the `Producer.scala` file generates a placeholder `sample data`. Modify this method to generate data based on your specific use case.

## Additional Notes

Adjust the sleep time in the Kafka producer loop to control the rate at which data is generated and published.
Make sure that the Kafka topic specified in the `Producer.scala` file matches the topic you want to publish data to.

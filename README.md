# Spark-Kafka-Data-Pipeline

[![License](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)

A data engineering project showcasing a data pipeline built using Apache Kafka and Apache Spark, implemented in Scala.

## Overview

This project demonstrates a real-time data pipeline that ingests streaming data from Apache Kafka and processes it using Apache Spark. The pipeline is built using Scala and leverages the power of Spark Streaming for real-time data processing.

## Architecture

The following diagram illustrates the architecture of the data pipeline:

![Architecture](diagram.png)

<details>
<summary>Click to expand the Mermaid diagram code</summary>

```mermaid
graph LR
    A[Kafka Producer] -- Produces data --> B((Kafka))
    B -- Consumes data --> C[Spark Streaming]
    C -- Processes data --> D((Output Destination))
```

</details>


## Features
* Ingests streaming data from Apache Kafka.
* Real-time data processing using Apache Spark Streaming.
* Flexible and scalable pipeline architecture.
* Data processing operations like filtering, aggregation, and more.
* Easily customizable for different use cases.

  ## Getting Started
To run this data pipeline locally, follow these steps:

1. Prerequisites:

* Apache Kafka: Install and set up Kafka.
* Apache Spark: Install and set up Spark.

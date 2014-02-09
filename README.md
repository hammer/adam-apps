An example of using [ADAM](https://github.com/bigdatagenomics/adam) core in a Scala application.

This example is modeled after the [Standalone App in Scala](http://spark.incubator.apache.org/docs/latest/quick-start.html#a-standalone-app-in-scala) from the Spark documentation.

Note that I'm picking up the ADAM jar from the user's internal Maven repository--that's because I'm using code from an unmerged branch. I'll change that in the future.

Also be sure that you've built Spark with `SPARK_HADOOP_VERSION` set to the same Hadoop version as the `hadoop.version` property used to build the ADAM jar.

To run, just do
```sh
sbt package
sbt run
```

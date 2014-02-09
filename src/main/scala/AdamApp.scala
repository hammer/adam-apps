import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.rdd.RDD
import edu.berkeley.cs.amplab.adam.rdd.variation.ADAMVariationContext._
import edu.berkeley.cs.amplab.adam.rdd.AdamContext._
import edu.berkeley.cs.amplab.adam.avro.ADAMGenotype

object AdamApp {
  def main(args: Array[String]) {
    val vcfadamFile = "/Users/hammer/Desktop/top10k.vcfadam"
    val sc = new SparkContext("local", "ADAM App", "/Users/hammer/Dropbox/codebox/spark-0.8.1-incubating",
      List("target/scala-2.9.3/exercise-adam_2.9.3-0.1.jar"))
    val variants : RDD[ADAMGenotype] = sc.adamLoad("file://"+vcfadamFile)
    val variantsCount = variants.count()
    val variantsPerSample = variants.map(v => (v.sampleId, 1)).reduceByKey((a, b) => a + b).collect()
    println("Number of variants: %s, Variants per sample: %s".format(variantsCount, variantsPerSample.deep.mkString("\n")))
  }
}
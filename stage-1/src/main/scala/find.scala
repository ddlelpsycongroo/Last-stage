import scala.collection.mutable.ArrayBuffer

object find {
    def main(args: Array[String]): Unit = {
        val arr = ArrayBuffer(9,5,4,6,9,1,3,4,7)

        val max = arr.max

        var i = 0
        for (elem <- arr) {
            if (elem == max){
                arr.remove(i)
            }
            i = i+1
        }

        val secMax = arr.max

        println(max)
        println(secMax)
    }
}

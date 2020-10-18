object Statistics {

    def main(args: Array[String]): Unit = {

        val array = Array(
            "hello you",
            "hello me",
            "hello shit"
        )

        val str = array.flatMap(_.split("\\s+")).groupBy(word => word)

        for((word,count) <- str){
            println(word+"-------->"+count.length)
        }

    }
}

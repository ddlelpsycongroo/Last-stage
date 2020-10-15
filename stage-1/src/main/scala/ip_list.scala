object ip_list {
    def main(args: Array[String]): Unit = {
        ipAnalysis("1.0.1.0", "1.0.3.255")
        ipAnalysis("1.0.8.0", "1.0.15.255")
        ipAnalysis("1.0.32.0", "1.0.63.255")
        ipAnalysis("1.1.0.0", "1.1.0.255")
    }

    def ipAnalysis(ipStart: String, ipEnd: String) = {
        val begin = ipStart.split("\\.")
        val tai = ipEnd.split("\\.")

        var total = 0
        for (i <- begin(2).toInt to tai(2).toInt) {
            for (j <- 0 to 255) {
                println(begin(0) + "." + begin(1) + "." + begin(2) + "." + j)
                total = total + 1
            }
        }
        println(total)
        println("-------------------------------------------------------------------")
    }
}

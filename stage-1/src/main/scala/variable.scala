object variable {
    def main(args: Array[String]): Unit = {
        println(add(1,2,3,4))
        val arr = Array(1, 2, 3)
        add(arr: _*)
    }

    def add(arr: Int*) = {
        var sum = 0
        for (i <- arr) {
            sum += i
        }
        sum
    }
}

object factorial {
    def main(args: Array[String]): Unit = {
        val i = 3
        val res = factorial(i)
        println(res)
    }

    def factorial(num:Int):Int = {
        if (num >= 1) {
            num * factorial(num-1)
        } else {
            1
        }
    }
}
object Fibonacci {
    def main(args: Array[String]): Unit = {
      /*  用scala实现斐波拉切数列（递归和非递归）
        斐波那契数列：1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
        求12阶的斐波拉切数列的值*/
        Recursion(1,1,12)
        normal(1,1,12)
    }

    def Recursion(befor: Int, after: Int, times: Int): Any = {
        if (times == 2){
            println(after)
        } else {
            Recursion(after,befor+after,times-1)
        }
    }

    def normal(befor: Int, after: Int,times: Int) ={
        var fist = befor
        var last = after
        for (_ <- 0 until times-2){
            val temp = last
            last = fist + last
            fist = temp
        }
        println(last)
    }
}

object SumList {

    def main(args: Array[String]): Unit = {
        val list = List(1,2,3,4,5)
        println(sum(list))
    }

    def sum(list:List[Int]):Int = {
        if (list.isEmpty){
            0
        } else {
            list.head + sum(list.tail)
        }

    }
}

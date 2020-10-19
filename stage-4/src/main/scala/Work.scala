object Work {
    /**
     * 1. 统计字符串"abceadefacg"中每一个字符出现的次数，并按照次数降序排序，如果次数相同按照字符升序排序
     * 2. 模拟实现String的函数trim方法，去除字符串两端的空格
     * 3. 要求不使用系统api(str.toInt, Integer.value或者Long.value)将数字字符串"12345"转换为数字12345
     */
    def main(args: Array[String]): Unit = {

        val str = "abceadefacg"
        wcAndSort(str)


        val trimStr = "    a b c "
        val str1 = myTrim(trimStr)
        println(str1)

        val str2 = "12345"
        val i = change(str2)
        println(i)

    }

    def wcAndSort(str: String): Unit = {
        val ret: Map[String, Int] = str
            .split("")
            .groupBy(word => word)
            .map(tuple => (tuple._1, tuple._2.length))
        val sortedList = ret.toList.sorted(new Ordering[(String, Int)](){
                override def compare(x: (String, Int), y: (String, Int)): Int = {
                    var ret = y._2.compareTo(x._2)
                    if(ret == 0) {
                        ret = x._1.compareTo(y._1)
                    }
                    ret
                }
            })
        for((word, count) <- sortedList) {
            println(word + "(" + count + ")")
        }
        val stringToStrings = str.split("").groupBy(word => word).map(map => (map._1, map._2.length))
        val tuples = stringToStrings.toList.sortWith((w1, w2) => w1._2 > w2._2)
        for ((word, count) <- tuples) {
            println(word + "(" + count + ")")
        }
    }



    def myTrim(trimStr: String): String = {
        var head = 0
        var tail = trimStr.length - 1
        while (trimStr(head) == ' ') {
            head += 1
        }
        while (trimStr(tail) == ' ') {
            tail -= 1
        }
        trimStr.substring(head, tail + 1)
    }

    def change(str2: String): Int = {
        var strInt = 0
        val strArray: Array[Char] = str2.toCharArray
        for (i <- 0 until strArray.length)
            strInt = (strArray(i) - 48) + strInt * 10
        strInt
    }
}
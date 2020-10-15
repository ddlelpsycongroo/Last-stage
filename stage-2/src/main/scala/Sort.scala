object Sort {

    var sortArr: Array[Int] = null
    var arr: Array[Int] = Array(5, 9, 2, -1, 3, 6, -4, 8, 5, 10)
    def main(args: Array[String]): Unit = {

//        使用冒泡、选择、插入、希尔排序，对以上数组进行升序排序

        println("冒泡排序："+bubble(arr).mkString("[",",","]"))
        println("选择排序："+select(arr).mkString("[",",","]"))
        println("插入排序："+insert(arr).mkString("[",",","]"))
        println("希尔排序："+Hill(arr).mkString("[",",","]"))

    }

    def bubble(arr:Array[Int]) ={
        for(i <- 0 to arr.length-2){
            for(j <- 0 to arr.length-2-i){
                if (arr(j) > arr(j+1)){
                    val temp = arr(j)
                    arr(j) = arr(j+1)
                    arr(j+1) = temp
                }
            }
        }
        arr
    }

    def select(arr:Array[Int]) = {
        var temp = 0

        for( i <- 0 to arr.length-1) {
            for (j <- 0 to arr.length-1 ) {
                if ( arr(i) < arr(j) ){
                    temp = arr(i)
                    arr(i) = arr(j)
                    arr(j) = temp
                }
            }
        }
        arr
    }

    def insert(arr:Array[Int]) = {
        for (i <- 1 until arr.size) {
            val temp = arr(i)
            var j = i
            while (j > 0 && temp< arr(j - 1)) {
                arr(j) = arr(j - 1)
                j = j - 1
            }
            if (j != i) {
                arr(j) = temp
            }
        }
        arr
    }

    def Hill(arr:Array[Int]) = {
        val n = arr.length
        var d = n/2
        while (d > 0){
            var p = d
            while (p<n) {
                val temp = arr(p)
                var j = p
                while (j > 0 && temp< arr(j - d)) {
                    arr(j) = arr(j - d)
                    j = j - d
                }
                if (j != p) {
                    arr(j) = temp
                }
                p+=1
            }
            d/=2
        }
        arr
    }

    def getArray: Array[Int] ={
        sortArr = bubble(arr)
        sortArr
    }

}

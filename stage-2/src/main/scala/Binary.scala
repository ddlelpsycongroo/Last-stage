object Binary {

    def main(args: Array[String]): Unit = {
        val arr = Sort.getArray
        println(arr.mkString("[",",","]"))
        println(find(arr, 3))
    }

    def find(arr:Array[Int],num:Int): Int ={
        var min = 0
        var max = arr.length-1
        while (min != max+1){
            val mid = (min + max)/2
            if(num < arr(mid)){
                max = mid-1
            } else if (num > arr(mid)){
                min = mid+1
            } else {
                return mid
            }
        }
        -1
    }
}

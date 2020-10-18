object QuickSort {

    def main(args: Array[String]): Unit = {
        val array = Array(3, -2, 0, 9, 5, 7, 4, 6, 1)
        val ints = quickSort(array)
        println(ints.mkString("(",",",")"))
    }

    def quickSort(array: Array[Int]): Array[Int] = {
        if (array.isEmpty){
            array
        } else {
            quickSort(array.filter(_ < array.head)) ++ array.filter(_ == array.head) ++ quickSort(array.filter(_ > array.head))
        }
    }

}

object Singleton {

    def main(args: Array[String]): Unit = {
        println(Hungry.getInstance().x)
        println(Lazy.getInstance().x)
    }

}

class Hungry private(){
    val x = 1
}

object Hungry {
    val instance = new Hungry
    def getInstance(): Hungry = {
        instance
    }
}

class Lazy private(){
    val x = 0
}

object Lazy {
    var instance: Lazy = null

    def getInstance(): Lazy = {
        if(instance == null) {
            Lazy.synchronized {
                if (instance == null) {
                    instance = new Lazy
                }
            }
        }
        instance
    }
}

import scala.io.StdIn
import scala.util.control.Breaks.{break, breakable}

object logIn {
    def main(args: Array[String])= {
        val username = "song"
        val password = "9527"
        breakable{
            for (i <- 1 to 3) {
                val name = StdIn.readLine("用户名");
                val pass = StdIn.readLine("密码");
                if (name == username && pass == password) {
                    println("登录成功")
                    break
                } else {
                    println("请检查用户名和密码")
                }
            }
        }
    }
}

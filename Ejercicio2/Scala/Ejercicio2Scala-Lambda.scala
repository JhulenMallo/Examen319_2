object Ejercicio1Scala {
  
  def main(args:Array[String]):Unit = {

    val fibo = (n:Int) =>
        var a = 1
        var b = 0
        var c = 0
        for(i <- 0 to n) {
            c = b + a
            a = b
            b = c
        }
        a
		
    lazy val fibo_rec: LazyList[Int] = 0 #:: 1 #:: fibo_rec.zip(fibo_rec.tail).map { case (a, b) => a + b }

    println("Ingrese n para Fibonacci estructurado: ")
    val n = scala.io.StdIn.readInt()
    for(i <- 0 to n-1) {
        print(fibo(i)+" ") }

    println()
		
    println("Ingrese n para Fibonacci recursivo: ")
    val n1 = scala.io.StdIn.readInt()
    for(i <- 0 to n1-1) {
        print(fibo_rec(i)+" ") }

  }
  
}
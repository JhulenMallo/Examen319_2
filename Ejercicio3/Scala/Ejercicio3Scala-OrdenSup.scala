object Ejercicio3Scala {
  def fibo(n:Int):Int={
    var a = (-1)
    var b = 1
    var f = 0
    for(i <- 0 to n) {
        f = a + b
        a = b
        b = f
    }
    f
  }
  
  def fibo_rec(n:Int):Int={
    if(n<2) n
    else (fibo_rec(n-1)+fibo_rec(n-2))
  }

  def funcion_fibo(funcion:(Int) => Int, n:Int):Int = funcion(n)
  
  def main(args:Array[String]):Unit = {
    println("Ingrese n para Fibonacci estructurado: ")
    val n = scala.io.StdIn.readInt()
    for(i <- 0 to n-1) {
        print(funcion_fibo(fibo, i)+" ")
    }
    
    println()

    println("Ingrese n para Fibonacci recursivo: ")
    val n1 = scala.io.StdIn.readInt()
    for(i <- 0 to n1-1) {
        print(funcion_fibo(fibo_rec, i)+" ")
    }
  }
  
}
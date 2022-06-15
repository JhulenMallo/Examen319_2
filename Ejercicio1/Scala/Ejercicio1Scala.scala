object Ejercicio1Scala {
  def Fibo(n:Int):Unit={
    var a = (-1)
    var b = 1
    var f = 0
    for(i <- 1 to n) {
        f = a + b
        a = b
        b = f
        print(f+" ")
    }
  }
  
  def fibo_rec(n:Int):Int={
    if(n<2) n
    else (fibo_rec(n-1)+fibo_rec(n-2))
  }
  
  def main(args:Array[String]):Unit = {
    println("Ingrese n para Fibonacci estructurado: ")
    val n = scala.io.StdIn.readInt()
    Fibo(n)
	
    println
	
    println("Ingrese n para Fibonacci recursivo: ")
    val n1 = scala.io.StdIn.readInt()
    for(i <- 0 to n1-1) {
        print(fibo_rec(i)+" ")
    }
	
  }
  
}
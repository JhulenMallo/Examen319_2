namespace Ejercicio4FSharp

type ClassFibo() = 
    member this.X = "Fibonacci en F#"

module Funcion_fibo =
    let fibo n =
        let mutable a=0
        let mutable b=1
        let mutable f=0
        for i in 1 .. n do
          f<-a+b
          a<-b
          b<-f
        a
    
    let rec fibo_rec(n) =
        match n with
        | 0 | 1 -> n
        | n -> fibo_rec(n-1) + fibo_rec(n-2)
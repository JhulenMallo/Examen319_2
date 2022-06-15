// Learn more about F# at http://fsharp.org

open System

let fibo n =
  let mutable a=(-1)
  let mutable b=1
  let mutable f=0
  for i in 1 .. n do
    f<-a+b
    a<-b
    b<-f
    printf "%i " f

let rec fib_rec n =
    match n with
    | 0 | 1 -> n
    | n -> fib_rec (n-1) + fib_rec (n-2)


[<EntryPoint>]
let main argv =
    printf "Ingrese n para Fibonacci estructurado: "
    let n = System.Int32.Parse(Console.ReadLine())
    fibo (n)

    printfn " "
    
    printf "Ingrese n para Fibonacci recursivo: "
    let n = System.Int32.Parse(Console.ReadLine())
    let mutable a=0
    for i in (0) .. (n-1) do
        a <- fib_rec (i)
        printf "%i " a
    

    0 // return an integer exit code    
fibo_rec :: Int -> Int
fibo_rec 0 = 0
fibo_rec 1 = 1
fibo_rec n = fibo_rec (n - 1) + fibo_rec (n - 2)

fibo = map fst (iterate f (0,1)) where f (x,y) = (y,x+y)

main = do
    putStrLn "Ingrese n para Fibonacci estructurado: "
    n <- getLine
    let a = (read n :: Int)
    print (take a fibo)
    putStrLn "Ingrese n para Fibonacci recursivo: "
    n1 <- getLine
    let a1 = (read n1 :: Int)
    print (map fibo_rec[0..a1-1])
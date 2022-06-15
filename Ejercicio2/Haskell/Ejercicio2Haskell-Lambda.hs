fibo_rec =
    let fv 0 = 0
        fv 1 = 1
        fv n = fibo_rec (n-2) + fibo_rec (n-1)
        fx = map fv [0 .. ]
    in \f -> (fx !! f)

fibo n = take n . map head $ iterate (\(x:y:xs) -> (x+y):x:xs) [0,1]

main = do 
    putStrLn "Ingrese n para Fibonacci estructurado: "
    n <- getLine
    let a = (read n :: Int)
    print (fibo a)

    putStrLn "Ingrese n para Fibonacci recursivo: "
    n1 <- getLine
    let a1 = (read n1 :: Int)
    print (map fibo_rec[0..a1-1])
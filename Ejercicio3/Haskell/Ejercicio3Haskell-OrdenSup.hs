fibo_rec :: Int -> Int
fibo_rec 0 = 0
fibo_rec 1 = 1
fibo_rec n = fibo_rec (n - 1) + fibo_rec (n - 2)

fibo_rec2 = 0:1:(zipWith (+) fibo_rec2 (tail fibo_rec2))

fibo = map fst (iterate f (0,1)) where f (x,y) = (y,x+y)

main = do
   putStrLn "Ingrese n para Fibonacci estructurado: "
   n <- getLine
   let a = (read n :: Int)
   let funcion_fibo n = take n fibo
   print (funcion_fibo a)

   putStrLn "Ingrese n para Fibonacci recursivo: "
   n <- getLine
   let a = (read n :: Int)
   let funcion_fibo= fibo_rec
   print(map funcion_fibo [0..a-1])

   putStrLn "Ingrese n para Fibonacci recursivo 2: "
   n <- getLine
   let a = (read n :: Int)
   let funcion_fibo n = take n fibo_rec2
   print(funcion_fibo a)
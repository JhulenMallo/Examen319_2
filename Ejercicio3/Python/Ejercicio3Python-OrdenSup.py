def opera_fibo(fibo, n):
    return fibo(n)

def suma(a, b):
    return a+b

def funcion_fibo(funcion):
    if funcion=='e':
        def fibo(n):
            a = 0
            b = 1
            for k in range(n):
                c = b+a
                a = b
                b = c
            return a
        return fibo
    if funcion=='r':
        def fibo_rec(n):
            if n < 2:   
                return n
            else:
                return fibo_rec(n-1) + fibo_rec(n-2)
        return fibo_rec

n = int(input("Ingrese n para Fibonacci estructurado: "))
for i in range(n):
    print(opera_fibo(funcion_fibo("e"), i), end=" ")

print("")

n = int(input("Ingrese n para Fibonacci recursivo: "))
for i in range(n):
    print(opera_fibo(funcion_fibo("r"), i), end=" ")
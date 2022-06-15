# -*- coding: utf-8 -*-
"""
Created on Fri Jun 10 18:43:21 2022

@author: jm_vi
"""

from functools import reduce
fibo = lambda y: reduce(lambda x, _: x + [x[-1] + x[-2]], range(y - 2), [0, 1])

fibo_rec = lambda n, x=0, y=1 : x if not n else fibo_rec(n-1, y, x+y)

n = int(input("Ingrese n para Fibonacci estructurado: "))
print(fibo(n), end=" ")

print("")

n = int(input("Ingrese n para Fibonacci recursivo: "))
for i in range(n):
    print(fibo_rec(i), end=" ")
# -*- coding: utf-8 -*-
"""
Created on Fri Jun 10 16:12:50 2022

@author: jm_vi
"""

def fibo(n):
    a=-1
    b=1
    f=0
    for i in range(n):
        f=a+b
        a=b
        b=f
        print(f, end=" ")

def fibo_rec(n):
    if n < 2:
        return n
    else:
        return fibo_rec(n-1) + fibo_rec(n-2)

n = int(input("Ingrese n para Fibonacci estructurado: "))
fibo(n)

print("")

n = int(input("Ingrese n para Fibonacci recursivo: "))
for i in range(n):
    print(fibo_rec(i), end=" ")

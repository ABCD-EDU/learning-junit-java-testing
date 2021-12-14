import math

l = -2
u = 4

def f(x):
    return (1 - x - 4*x**3 + x**5) 
    # return (8 + 4*math.cos(x))

I = ((u-l)/2)*(f(u)+f(l))

print(I)
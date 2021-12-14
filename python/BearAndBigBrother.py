# this function solves the bear and big brother problem from codeforces
# it takes two parameters a and b corresponding to their ages
def solve(a, b):
    _w = 0
    while True:
        a *= 3
        b *= 2
        _w += 1
        if (a>b):
            return _w


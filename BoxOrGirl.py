import sys
input = sys.stdin.readline

s = input()
d = (list(s[:len(s) - 1]))
a = set()
for e in d:
    a.add(e)

if len(a) % 2 == 0:
    print("CHAT WITH HER!")
else:
    print("IGNORE HIM!")
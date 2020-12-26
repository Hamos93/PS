import sys

A, B = map(int, sys.stdin.readline().split())

set_A = set(map(int, sys.stdin.readline().split()))
set_B = set(map(int, sys.stdin.readline().split()))

arr = list(set_A - set_B)
arr.sort()

print(len(arr))
for i in arr:
    print(i, end=' ')
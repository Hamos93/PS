N = int(input())

for i in range(0, N):
    for j in range(N-1, -1, -1):
        if j <= i: print("*", end = '')
        else: print(" ", end = '')
    print()
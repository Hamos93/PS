N, X = map(int, input().split())

data = list(map(int, input().split()))

for i in data:
    if i < X: print(i, end = ' ')
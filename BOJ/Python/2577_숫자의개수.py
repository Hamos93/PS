A = int(input())
B = int(input())
C = int(input())

result = str(A * B * C)

data = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

for ch in result:
    data[int(ch)] += 1

for i in range(len(data)):
    print(data[i])
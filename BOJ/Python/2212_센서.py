import sys

N = int(input())
K = int(input())

if N <= K:
    print("0")
    sys.exit()

sensor = list(map(int, sys.stdin.readline().split()))
sensor.sort()

distances = []
for i in range(1, N):
    distances.append(sensor[i] - sensor[i-1])

distances.sort(reverse=True)

for i in range(K-1):
    distances[i] = 0

print(sum(distances))
N, K, B = map(int, input().split())
light = [False] * (N + 1)

for i in range(B):
    light[int(input())] = True

cnt = 0
for i in range(1, K+1):
    if light[i]: cnt += 1

result = cnt
for i in range(1, N-K+1):
    if light[i]: cnt -= 1
    if light[i + K]: cnt += 1

    result = min(result, cnt)

print(result)
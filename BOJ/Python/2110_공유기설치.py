import sys

N, C = list(map(int, sys.stdin.readline().split()))

home = []
for _ in range(N):
    home.append(int(sys.stdin.readline()))

home.sort()

low = 1
high = home[N-1] - home[0]
distance = 0
while low <= high:
    mid = (low + high) // 2

    pos = home[0]
    cnt = 1
    for i in range(1, N):
        if pos + mid <= home[i]:
            pos = home[i]
            cnt += 1

    if C <= cnt:
        distance = mid
        low = mid + 1
    else: high = mid - 1

print(distance)
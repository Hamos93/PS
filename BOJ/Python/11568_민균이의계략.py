import sys

N = int(input())
card = list(map(int, sys.stdin.readline().split()))

dp = [0] * N
LIS = 0

for i in range(N):
    dp[i] = 1
    for j in range(0, i):
        if card[j] < card[i]: dp[i] = max(dp[i], dp[j] + 1)

    LIS = max(LIS, dp[i])

print(LIS)
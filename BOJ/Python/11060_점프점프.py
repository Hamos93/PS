N = int(input())
A = list(map(int, input().split()))

dp = [100000] * N
dp[0] = 0

for i in range(N-1):
    jump = A[i]
    for j in range(i+1, i+jump+1):
        if j <= N-1: dp[j] = min(dp[j], dp[i] + 1)

if dp[N-1] == 100000: print(-1)
else: print(dp[N-1])
N = int(input())
arr = []

for i in range(N):
    arr.append(int(input()))

dp = [0] * N
LIS = 0

for i in range(N):
    dp[i] = 1
    for j in range(0, i):
        if arr[j] < arr[i]:
            dp[i] = max(dp[i], dp[j] + 1)

    LIS = max(LIS, dp[i])

print(N - LIS)
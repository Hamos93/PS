N = int(input())
arr = list(map(int, input().split()))

arr.reverse()

dp = [1] * N

for i in range(1, N):
    for j in range(0, i):
        if arr[j] < arr[i]: dp[i] = max(dp[i], dp[j] + 1)

print(N - max(dp))
N = int(input())
A = list(map(int, input().split()))

dp = [1] * N

result = 1
for i in range(N):
    for j in range(0, i):
        if A[j] < A[i]:
            dp[i] = max(dp[i], dp[j] + 1)

    result = max(result, dp[i])

print(result)
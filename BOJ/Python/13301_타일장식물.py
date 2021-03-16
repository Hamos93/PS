dp = [0] * 81
dp[0], dp[1] = 1, 1

for i in range(2, 81):
    dp[i] = dp[i-1] + dp[i-2]

N = int(input())
print((dp[N-1] + dp[N]) * 2)
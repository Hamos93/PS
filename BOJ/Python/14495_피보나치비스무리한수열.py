dp = [0] * 117
dp[1] = dp[2] = dp[3] = 1

n = int(input())
for i in range(4, 117):
    dp[i] = dp[i-1] + dp[i-3]

print(dp[n])
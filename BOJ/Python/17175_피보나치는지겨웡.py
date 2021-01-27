dp = [0] * 51
dp[0] = dp[1] = 1

for i in range(2, 51):
    dp[i] = (dp[i-1] + dp[i-2] + 1) % 1000000007

n = int(input())
print(dp[n])
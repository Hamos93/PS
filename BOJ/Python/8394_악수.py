dp = [0] * 10000001
dp[1], dp[2] = 1, 2

for i in range(3, 10000001):
    dp[i] = (dp[i-1] + dp[i-2]) % 10

n = int(input())
print(dp[n])
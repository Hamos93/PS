n, k = map(int, input().split())

coins = [0] * n
for i in range(n):
    coins[i] = int(input())

dp = [10001 for _ in range(k + 1)]
dp[0] = 0

for coin in coins:
    for j in range(coin, k+1):
        dp[j] = min(dp[j], dp[j - coin] + 1)

if dp[k] == 10001: print("-1")
else: print(dp[k])
D, K = list(map(int, input().split()))

dp = [[0] * 31 for _ in range(2)]

dp[0][3] = 1
dp[0][4] = 2

dp[1][3] = 1
dp[1][4] = 1

for i in range(5, 31):
    dp[0][i] = dp[0][i-1] + dp[0][i-2]
    dp[1][i] = dp[1][i-1] + dp[1][i-2]

x, y = 0, 0

idx = 1
while True:
    res = K - idx * dp[1][D]

    if res % dp[0][D] == 0:
        x = idx
        y = res // dp[0][D]

        break

    idx += 1

print(x)
print(y)
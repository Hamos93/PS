dp = [[0] * 31 for _ in range(31)]

for j in range(1, 31): dp[1][j] = j
for i in range(2, 31):
    for j in range(i, 31):
        for k in range(j-1,i-2,-1):
            dp[i][j] += dp[i-1][k]

T = int(input())

for _ in range(T):
    N, M = list(map(int, input().split()))
    print(dp[N][M])
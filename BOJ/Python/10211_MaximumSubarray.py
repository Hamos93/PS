T = int(input())

for tc in range(T):
    N = int(input())
    X = list(map(int, input().split()))

    dp = [0] * N
    res = -1001
    for i in range(N):
        if i == 0: dp[0] = X[0]
        else: dp[i] = max(dp[i-1] + X[i], X[i])

        res = max(res, dp[i])

    print(res)
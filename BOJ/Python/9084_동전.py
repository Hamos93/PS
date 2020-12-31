import sys

T = int(sys.stdin.readline())
for tc in range(T):
    N = int(sys.stdin.readline())
    coins = list(map(int, sys.stdin.readline().split()))

    M = int(sys.stdin.readline())
    dp = [0] * 100001
    dp[0] = 1

    for i in range(N):
        for j in range(coins[i], M + 1):
            dp[j] += dp[j - coins[i]]

    print(dp[M])
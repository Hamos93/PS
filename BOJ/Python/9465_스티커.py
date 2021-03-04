T = int(input())

for _ in range(T):
    n = int(input())
    sticker = [[0] * 2 for _ in range(n)]

    input1 = list(map(int, input().split()))
    for i in range(n):
        sticker[i][1] = input1[i]

    input2 = list(map(int, input().split()))
    for i in range(n):
        sticker[i][0] = input2[i]

    dp = [[0] * 3 for _ in range(n)]
    dp[0][0] = 0
    dp[0][1] = sticker[0][0]
    dp[0][2] = sticker[0][1]

    result = 0
    for i in range(1, n):
        dp[i][0] = max(dp[i-1][0], dp[i-1][1], dp[i-1][2])
        dp[i][1] = max(dp[i-1][0], dp[i-1][2]) + sticker[i][0]
        dp[i][2] = max(dp[i-1][0], dp[i-1][1]) + sticker[i][1]

        result = max(dp[i][0], dp[i][1], dp[i][2])

    print(result)
import sys

n = int(sys.stdin.readline())

arr = [[0] * n for _ in range(n)]
for i in range(n):
    input_list = list(map(int, sys.stdin.readline().split()))
    for j in range(i+1):
        arr[i][j] = input_list[j]

dp = [[0] * n for _ in range(n)]
dp[0][0] = arr[0][0]

if n == 1:
    print(dp[0][0])
    sys.exit()

answer = 0
for i in range(1, n):
    for j in range(i+1):
        if j == 0: dp[i][j] = dp[i-1][j] + arr[i][j]
        elif j == i: dp[i][j] = dp[i-1][j-1] + arr[i][j]
        else: dp[i][j] = max(dp[i-1][j-1], dp[i-1][j]) + arr[i][j]

        answer = max(answer, dp[i][j])

print(answer)
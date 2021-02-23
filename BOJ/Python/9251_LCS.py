s1 = input()
s2 = input()

N, M = len(s1) + 1, len(s2) + 1
dp = [[0] * M for _ in range(N)]

for i in range(1, N):
    for j in range(1, M):
        if s1[i-1] == s2[j-1]: dp[i][j] = dp[i-1][j-1] + 1
        else: dp[i][j] = max(dp[i][j-1], dp[i-1][j])

print(dp[N-1][M-1])
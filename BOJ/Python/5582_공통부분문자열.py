s1 = input()
s2 = input()

N = len(s1) + 1
M = len(s2) + 1

dp = [[0] * M for _ in range(N)]
LCS = 0

for i in range(1, N):
    for j in range(1, M):
        if s1[i-1] == s2[j-1]:
            dp[i][j] = dp[i-1][j-1] + 1
            LCS = max(LCS, dp[i][j])

print(LCS)
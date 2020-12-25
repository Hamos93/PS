N = int(input())

# 리스트 컴프리헨션 초기화
stairs = [0 for i in range(301)]

for i in range(1, N+1):
    score = int(input())
    stairs[i] = score

# dp 리스트
dp = [0 for i in range(301)]
dp[1] = stairs[1]
dp[2] = stairs[1] + stairs[2]

for i in range(3, N+1):
    dp[i] = max(dp[i-3] + stairs[i-1] + stairs[i], dp[i-2] + stairs[i])

print(dp[N])
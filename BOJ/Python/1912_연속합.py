import sys

n = int(input())

arr = list(map(int, sys.stdin.readline().split()))
arr.insert(0, 0)

dp = [0] * (n + 1)

for i in range(1, n+1):
    dp[i] = max(arr[i], arr[i] + dp[i-1])

print(max(dp[1:]))
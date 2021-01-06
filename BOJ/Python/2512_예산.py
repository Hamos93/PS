import sys

N = int(input())
budget = list(map(int, sys.stdin.readline().split()))
M = int(input())

low, high, answer = 0, int(1e9), 0
while low <= high:
    mid = (low + high) // 2

    sum, max_budget = 0, 0
    for b in budget:
        value = 0
        if b <= mid:
            value = b
            sum += value
        else:
            value = mid
            sum += value

        max_budget = max(max_budget, value)

    if sum <= M:
        low = mid + 1
        answer = max_budget
    else: high = mid - 1

print(answer)
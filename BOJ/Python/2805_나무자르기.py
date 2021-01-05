import sys

input_list = list(map(int, sys.stdin.readline().split()))

N = input_list[0]
M = input_list[1]

trees = list(map(int, sys.stdin.readline().split()))
low = 0
high = max(trees)

H = 0
while low <= high:
    mid = (low + high) // 2

    result = 0
    for tree in trees:
        if mid < tree:
            result += (tree - mid)

    if M <= result:
        H = mid
        low = mid + 1
    else: high = mid - 1

print(H)
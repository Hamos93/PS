import sys

N = int(input())
arr = [0] * N

num_list = list(map(int, sys.stdin.readline().split()))
for i in range(N):
    arr[i] = num_list[i]

arr.sort()

M = int(input())
input_list = list(map(int, sys.stdin.readline().split()))

for x in input_list:
    low = 0
    high = N - 1
    flag = False

    while low <= high:
        mid = (low + high) // 2

        if arr[mid] == x:
            flag = True
            break
        elif x < arr[mid]: high = mid - 1
        else: low = mid + 1

    if flag: print(1)
    else: print(0)
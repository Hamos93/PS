T = int(input())

for tc in range(1, T+1):
    l = list(map(int, input().split()))

    sum = 0
    for i in l:
        if i % 2 == 1: sum += i

    print("#%d %d" %(tc, sum))
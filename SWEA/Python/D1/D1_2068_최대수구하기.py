T = int(input())

for tc in range(1, T+1):
    l = list(map(int, input().split()))

    print("#%d %d" %(tc, max(l)))
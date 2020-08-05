T = int(input())

for tc in range(1, T + 1):
    a, b = map(int, input().split())
    print("#%d %d %d" %(tc, (a // b), (a % b)))
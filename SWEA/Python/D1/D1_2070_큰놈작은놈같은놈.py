T = int(input())

for tc in range(1, T+1):
    num1, num2 = map(int, input().split())

    if num1 < num2: print("#%d %c" %(tc, '<'))
    elif num2 < num1: print("#%d %c" %(tc, '>'))
    else: print("#%d %c" %(tc, '='))
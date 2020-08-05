T = int(input())

for tc in range(1, T + 1):
    word = input()

    N = len(word)
    flag = True
    for i in range(0, N):
        if word[i] != word[N - i - 1]:
            flag = False
            break

    if flag == True: print("#%d 1" %tc)
    else: print("#%d 0" %tc) 
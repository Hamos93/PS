t = int(input())

for tc in range(t):
    n = int(input())

    word = []
    for i in range(n):
        word.append(input())

    word.sort()

    flag = True
    for i in range(n-1):
        if len(word[i]) < len(word[i+1]):
            if word[i+1].find(word[i]) == 0:
                flag = False
                break

    if flag == False: print('NO')
    else: print('YES')
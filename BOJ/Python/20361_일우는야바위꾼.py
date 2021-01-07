N, X, K = list(map(int, input().split()))

flag = [False] * (N + 1)
flag[X] = True

while 0 < K:
    A, B = list(map(int, input().split()))

    if flag[A] or flag[B]:
        if flag[A]:
            flag[A] = False
            flag[B] = True
        else:
            flag[B] = False
            flag[A] = True
    K -= 1

answer = 0
for i in range(1, N+1):
    if flag[i]:
        answer = i
        break

print(answer)
N, K = input().split()
N = int(N)
K = int(K)

arr = input()
visit = [False] * N
cnt = 0

for i in range(N):
    if arr[i] == 'H': continue

    flag = False
    idx = i - K

    if idx < 0: idx = 0

    while idx < i:
        if arr[idx] == 'H' and visit[idx] == False:
            visit[idx] = True
            flag = True
            cnt += 1

            break
        idx += 1

    if flag == True: continue

    idx = i + 1
    while idx < N and idx <= i + K:
        if arr[idx] == 'H' and visit[idx] == False:
            visit[idx] = True
            cnt += 1

            break
        idx += 1

print(cnt)
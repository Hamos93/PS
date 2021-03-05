n = int(input())

v = []
for i in range(n):
    v.append(list(map(int, input().split())))

# 금액순 내림차순 정렬
v.sort(key=lambda x:-x[0])
visit = [False] * 10001

pay = 0
for i in range(n):
    for j in range(v[i][1], 0, -1):
        if visit[j] == False:
            visit[j] = True
            pay += v[i][0]

            break

print(pay)
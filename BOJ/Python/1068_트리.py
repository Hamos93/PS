import sys

def dfs(node):
    global leaf
    visit[node] = True

    flag = True
    for next in graph[node]:
        if visit[next] == False:
            flag = False
            dfs(next)

    if flag: leaf += 1

N = int(input())

# 인접리스트
graph = [[] for _ in range(N)]

arr = list(map(int, sys.stdin.readline().split()))

root = -1
for i in range(N):
    node = arr[i]

    if node == -1: root = i
    else:
        graph[i].append(node)
        graph[node].append(i)

remove = int(input())
visit = [False] * N
visit[remove] = True

leaf = 0
if visit[root] == False: dfs(root)

print(leaf)
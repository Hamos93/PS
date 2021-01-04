import sys

N = int(sys.stdin.readline())
solution = [0] * N

input_list = list(map(int, sys.stdin.readline().split()))
for i in range(N):
    solution[i] = input_list[i]

solution.sort()

start = 0
end = N - 1
answer = 2000000000

solution1 = 0
solution2 = 0

while start < end:
    result = abs(solution[start] + solution[end])

    if result < answer:
        answer = result

        solution1 = solution[start]
        solution2 = solution[end]

    if abs(solution[start] + solution[end - 1]) <= abs(solution[start + 1] + solution[end]): end -= 1
    else: start += 1

print(solution1, solution2)
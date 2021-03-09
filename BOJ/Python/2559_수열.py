N, K = map(int, input().split())
arr = list(map(int, input().split()))

sum = 0
for i in range(K):
    sum += arr[i]

temperature = sum
for i in range(N-K):
    sum -= arr[i]
    sum += arr[i+K]

    temperature = max(temperature, sum)

print(temperature)
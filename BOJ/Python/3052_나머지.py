data = list()
for i in range(10):
    n = int(input())
    data.append(n % 42)

# set자료형은 중복을 허용하지 않으며, 순서X
data = set(data)
print(len(data))
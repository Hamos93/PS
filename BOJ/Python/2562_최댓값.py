data = list()

for i in range(9):
    data.append(int(input()))

answer = 0

max = max(data)
for i in range(9):
    if max == data[i]:
        answer = i
        break

print(max)
print(i+1)
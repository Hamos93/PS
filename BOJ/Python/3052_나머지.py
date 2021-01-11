s = set()

for i in range(10):
    A = int(input())
    s.add(A % 42)

print(len(list(s)))
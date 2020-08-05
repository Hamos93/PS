str = input()

for i in range(0, len(str)):
    print(ord(str[i]) - 64, end = ' ')
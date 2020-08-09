data = list()
for i in range(10):
    value = int(input())
    result = value % 42
    
    flag = True
    for i in data:
        if result == i:
            flag = False
            break

    if flag == True: data.append(result) 

print(len(data))
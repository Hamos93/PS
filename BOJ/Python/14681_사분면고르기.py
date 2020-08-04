x = int(input())
y = int(input())

if 0 < x and 0 < y: print("1")
elif x < 0 and 0 < y: print("2")
elif x < 0 and y < 0: print("3")
else: print("4")
def square ():
    n = 1
    while True:
        yield  n * n
        n += 1

for f in square():
    if f>100:
        break
    print(f)


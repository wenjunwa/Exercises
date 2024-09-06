def fibonacci ():
    num1, num2 = 0, 1
    while True:
        yield num1
        num1, num2 = num2, num1 + num2

for f in fibonacci():
    if f > 100:
        break
    print(f)
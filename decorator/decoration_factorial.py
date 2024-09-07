
def clean_it(func):
    def wrapper(n):
        if type(n) == int and n>0:
            return func(n)
        else:
            raise Exception("Argument is not an  positive integer.")
    return wrapper
        
@ clean_it
def factorial(number):
    result = 1
    for i in range(1, number):
        result *= i+1
    return result

print(factorial(6))

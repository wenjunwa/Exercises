import time

def time_it(func):
    def wrapper(*args, **kwargs):
        start = time.time()
        result = func(*args, **kwargs)
        end = time.time()
        print(func.__name__ + " took " + str((end - start)*1000) + " million secs")
        return result
    return wrapper

@time_it
def calculate_squares(number):

    result = []
    for i in range(1, number):
        result.append(i**2)

    return result

@time_it
def calculate_cubes(number):
    result = []
    for i in range(1, number):
        result.append(i**3)
    return result


calculate_cubes(10000)
calculate_squares(10000)


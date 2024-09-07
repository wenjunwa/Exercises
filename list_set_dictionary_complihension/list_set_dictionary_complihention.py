

integer = [0, 1,2,3,4]
binary = ["0", "01", "10", "11", "100"]

binary_dict = {integer : binary for integer, binary in zip(integer, binary)}
print(type(binary_dict))
print(binary_dict)

integer = [1, -1, 2, 3, 5, 0, -7]
additive_inverse = [(-i) for i in integer]
print(additive_inverse)

integer = [1, -1, 2, -2, 3, -3]
sq_set = set([(i*i) for i in integer])
print(sq_set)
# -*- coding: utf-8 -*-
"""
Created on Fri Sep  6 19:06:58 2024

@author: Vicky
"""

age = [1,2,3,4]
fro_age = frozenset(age)
print(type(fro_age))

set1 = {1,2,3,4,5}
set2 = {4,5,6,7,8}

print(set1 - set2)
print(set1|set2)
print(set1&set2)
print(set2 - set1)

for i in set1:
    print(i)
# -*- coding: utf-8 -*-
"""
Created on Thu Sep  5 08:48:14 2024

@author: Vicky
"""

class employee:
    def __init__(self, i, n):
        self.id = i
        self.name = n
        
    def Print(self):
        print(f"ID:\t\t {self.id}\nName:\t {self.name}")
        
emp = employee(1, 'wenjun')    
emp.Print()

del emp.id
try:
    print(f"employee id is: {emp.id}")
except AttributeError:
    print("'employee' object has no attribute 'id'")
    
del emp
try:
    emp.Print()
except NameError:
    print("name 'emp' is not defined")

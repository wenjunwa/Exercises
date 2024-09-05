# -*- coding: utf-8 -*-
"""
Created on Thu Sep  5 14:25:25 2024

@author: Vicky
"""
class AdultException (Exception):
    def __init__(self, value):
        self.value = value
        
    def __str_(self):
        return repr(self.value)
    
class person:
    def __init__(self, name, age):
        self.name = name
        self.age = age
    

    def get_minor_age(self):
        temp = self.age
        if temp > 17:
            raise(AdultException("greater or equal to 18"))
                   
        else:
            print(f"Age --> {temp}")
        
    def display(self):
        try:
            self.get_minor_age()
        except AdultException as e:
            print("This is an adult: ", e.value)
        finally:
            print(f"Name --> {self.name}")
            
if __name__ == "__main__":
    p = person("John", 18)
    p.display()
    p = person("Annie", 17)
    p.display()
    
   
        
    

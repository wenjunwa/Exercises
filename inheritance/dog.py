# -*- coding: utf-8 -*-
"""
Created on Thu Sep  5 09:04:28 2024

@author: Vicky
"""

class animal():
    def __init__(self, a,h, f):
        self.habitat = h
        self.food = f
        self.animal = a
        
    def Print_animal(self):
        print(f"{self.animal} lives at {self.habitat}. They eat {self.food}")
        
class dog(animal):
    def __init__(self, n, g):
        super().__init__('dog', 'Kennel', 'meat')
        self.name = n
        self.game = g
        
    def Print(self):
        print(f"{self.name} is a dog. {self.name} likes {self.game}!")
        
if __name__ == '__main__':
    a = dog('wangwang','fetch')
    a.Print_animal()
    a.Print()

        
    
# -*- coding: utf-8 -*-
"""
Created on Wed Sep  4 06:08:50 2024

@author: Vicky
"""

def circle(r):
    pie = 3.1415927
    area = pie*r*r
    circumference = 2*pie*r
    diameter = 2*r
    return round(area,2), round(circumference, 2), round(diameter, 2)

def Main():
    radius = float(input("what is the radius of your circle? "))
    area, circumference, diameter = circle(radius)
    print(f"area is {area}; \ncircumference is {circumference}; \nand diameter is {diameter}")

if __name__ =="__main__":
    Main()
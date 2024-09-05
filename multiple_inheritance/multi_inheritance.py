# -*- coding: utf-8 -*-
"""
Created on Thu Sep  5 13:25:22 2024

@author: Vicky
"""

class student:
    def __init__(self, n, a):
        self.name = n
        self.age = a
        
    def job_student(self):
        print(f"My name is {self.name}. I am learning coding.")

class teacher():
    def job_teacher (self):
        print("I am teaching coding.")
        
class youtuber(student, teacher):
    def job_youtober(self):
        print(f"myname is {self.name}. I teach coding on youtube!")

if __name__ == "__main__":
    p = youtuber("ww", 20)
    p.job_student()
    p.job_teacher()
    p.job_youtober()

    
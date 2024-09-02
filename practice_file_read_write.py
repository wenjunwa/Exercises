# -*- coding: utf-8 -*-
"""
Created on Sun Sep  1 17:48:44 2024

@author: Vicky
"""
"""
file handling:
    1) Normal way:
    f = open('filename', mode = 'r')
    # operation
    f.close()
    ---> if any exception happens befor f.close(), then f.close won't be
    able to be executed
    2) Using exception handling:
    try:
        f=open('filename', mode = 'r')
        #operations
    finally:
        f.close()
    ----> f.close() will be executed even exceptions happens
    3) with statement:
    with open('filename', mode = 'r') as f:
        #operations
    ---> with statement called __enter__() and __exit__()
        file is closed automatically
"""

try:
    bucket = {}
    tokens = []
    cnt = []
    f = open("poem.txt", "r")
    punc = [',\n', '.\n', '\n',',', '.', ';\n',';','-',':\n', ':']
    for line in f:
        t = line.split(' ')
        for item in t:
            for ele in item:
                if ele in punc:
                    item = item.replace(ele,'')
            tokens.append(item.lower())
finally:   
    f.close()
    
for item in tokens:
    if item in bucket:
        bucket[item] +=1
    else:
        bucket[item] =1

for item in bucket:
    cnt.append(bucket[item])
  
max_cnt = max(cnt)
for item in bucket:
    if bucket[item]== max_cnt:
        print(item)
    


"""

bucket = {}
tokens = []
cnt = []
punc = [',\n', '.\n', '\n',',', '.', ';\n',';','-',':\n', ':']
with open("poem.txt", "r") as f:
    for line in f:
        t = line.split(' ')
        for item in t:
            for ele in item:
                if ele in punc:
                    item = item.replace(ele,'')
            tokens.append(item.lower())
for item in tokens:
    if item in bucket:
        bucket[item] +=1
    else:
        bucket[item] =1
#print(bucket[''])
for item in bucket:
    cnt.append(bucket[item])
#print(cnt)  
max_cnt = max(cnt)
for item in bucket:
    if bucket[item]== max_cnt:
        print(item)
"""
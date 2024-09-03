# -*- coding: utf-8 -*-
"""
Created on Sun Sep  1 21:37:14 2024

@author: Vicky
"""
import csv

stocks = []
result = [['Company Name', 'PE Ratio', 'PB Ratio']]
with open('stocks.csv', 'r') as f:
    csvFile = csv.reader(f)
    for line in csvFile:
        stocks.append(line)
for i in range(1,len(stocks)):
    temp = [stocks[i][0]]
    temp.append(round(int(stocks[i][1])/int(stocks[i][2]),2))
    temp.append(round(int(stocks[i][1])/int(stocks[i][3]),2))
    result.append(temp)
with open('output_stocks.csv','w') as csv_f:
    csvWriter = csv.writer(csv_f)
    csvWriter.writerows(result)
    
    
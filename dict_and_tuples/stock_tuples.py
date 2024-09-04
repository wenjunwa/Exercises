
def opt (options):
    op = input("Would you like to print or add? ")
    while(op not in options):
        print(op, 'is not available now. please choose print or add.')
        op = input("Would you like to print or add? ")  
    return op

def operation(op, stocks):
    if op=='print':
        Print(stocks)
    elif op=='add':
        Add(stocks)

def Average (lst):
    return round(sum(lst)/len(lst),2)

def Print(dict):
    for element in dict:
        print(f"{element} ==> {dict[element]} ==> avg: {Average(dict[element])}")
    
def Add(dict):
    sticker = input("What is the stock sticker? ")
    price = input("What is the price? ")
    if sticker not in dict:
        dict[sticker] = price
    else:
        dict[sticker].append(price)
    
def main():
    stocks = {'info':[600,630,620],
              'ril': [1430, 1490, 1567],
              'mtl': [234,180,160]}    
    options = ['print', 'add']
    op = opt(options)
    operation(op,stocks)
    
        
if __name__ == '__main__':
    
    main()
    
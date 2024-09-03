
def options():
    
    user = input("Which one do you want to try? print, add, remove, or query: ")
       
    while (user not in inputs):
        print("please enter a selection from the options")
        user = input("Which one do you want to try? print, add, remove, or query: ")
    return user

def operations(user):
    if user == 'print':
        Print(dict)
        
    elif user == 'add':
        country = input("Which country to add? ")        
        Add(country)
        
    elif user == 'remove':
        country = input("which country to remove? ")
        Remove(country)
        
    else:
        country = input("which country to query? ")
        Query(country)

def Print(dict):
    for item in dict:
        print(item, "==>", dict[item])
        
def Add(country):
    if country not in dict:
        population = input("what is the population? ")
        dict[country] = population
        Print(dict)

    else:
        print("country already exists")
        

def Remove(country):
    if country in dict:
        del dict[country]
        Print(dict)
    else:
        print("Country does not exists.")
        
    
def Query(country):
    print("population of ", country, " is: ", dict[country])
    
if __name__ == "__main__":

    dict = {'China': 143,
            'India': 136,
            'USA': 32,
            'Pakistan': 21}
    
    inputs = ['print', 'add', 'remove', 'query']    
    user = options()    
    operations(user)
    
        
    
    
    


class Fibonacci:
    
    def __init__ (self, limit):
        self.num1 = 0
        self.num2 = 1
        self.cnt = 1
        self.limit = limit
        
    def __iter__(self):
        return self
    
    def __next__(self):
        if self.cnt < self.limit:
            num_new = self.num1 + self.num2
            self.num1 = self.num2
            self.num2 = num_new
            self.cnt += 1
            return num_new
        else:
            raise StopIteration
            
if __name__ == '__main__':
    f = Fibonacci(5)
    itr = iter(f)
    while True:
        try:
            print(next(itr))
        except StopIteration:
            break
    
            
    
    
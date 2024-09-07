
import argparse

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("physics",help= "physics mark")
    parser.add_argument("chemistry",help= "chemisty mark")
    parser.add_argument("maths",help= "math mark")
    
    args = parser.parse_args()
    a =int( args.physics)
    b = int(args.chemistry)
    c = int(args.maths)
    print(f"{a}, {b}, {c}")
    average = round((a+b+c)/3, 2)
    print("Average: ", average )
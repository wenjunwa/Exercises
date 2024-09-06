import java.util.ArrayList;
import java.util.Iterator;

public class Fibonacci {
    int num1;
    int num2;
    int limit;
    ArrayList<Integer> fib;
    
    public Fibonacci(int limit){
        this.num1 = 0;
        this.num2 = 1;
        this.limit = limit;
        this.fib = new ArrayList<>();
        fib.add(num1);
        fib.add(num2);
        fib_creator();
    }
    
    public ArrayList<Integer> get_fib(){
        return fib;
    }
    
    private void fib_creator(){
        int i = 0;
        while(i< this.limit){
            int num_new = this.num1 + this.num2;
            num1 = num2;
            num2 = num_new;
            this.fib.add(num_new);
            i++;          
        }
    } 
    
    public static void main(String args[]){
        Fibonacci f = new Fibonacci(5);
        ArrayList<Integer> lst = new ArrayList<>();
        lst.addAll(f.get_fib());
        
        Iterator itr = lst.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }       
    }
}

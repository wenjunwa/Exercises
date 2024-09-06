import java.util.ArrayList;
public class square_generator {
    int cnt;
    
    square_generator(int cnt){
        this.cnt = cnt;
    }
    
    public ArrayList<Integer> next_squre (){
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 1; i<= this.cnt; i++){
            lst.add(i * i);
        }
        return lst;
    }
    public static void main(String args[]){
        square_generator s = new square_generator(10);
        s.next_squre().forEach(System.out::println);
    }
    
}

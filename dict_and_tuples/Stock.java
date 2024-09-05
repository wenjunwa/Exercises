
import java.util.ArrayList;
import java.util.Scanner;
class pairs{
    private String sticker;
    private ArrayList<Double> price;
    
    pairs(){
        this.sticker = "";
        this.price = new ArrayList<>();
    }
    
    pairs(String s, ArrayList<Double> p){
        this.sticker = s;
        this.price = new ArrayList<>();
        this.price.addAll(p);
    }
    
    public String get_sticker(){
        return this.sticker;
    }
    
    public ArrayList<Double> get_price(){
        return this.price;
    }
    
    public void add_price (ArrayList<Double> p){
        this.price.addAll(p);
    }
    
    public double avg_price(){
        double sum = 0;
        for(double num: this.price){
            sum += num;
        }
        return Math.round(sum/this.price.size()*100)/100.0;
    }
}

public class Stock {
    ArrayList<pairs> stock;
    
    Stock (){
        this.stock = new ArrayList<>();
    }
    
    Stock(String s, ArrayList<Double> p){
        this.stock = new ArrayList<>();
        this.stock.add(new pairs(s,p));
    }
    
    public boolean isEmpty(){
        return this.stock.isEmpty();
    }
    
    public int size(){
        return this.stock.size();
    }
    
    public int get_index (String s){
        for(int i = 0; i< this.stock.size(); i++){
            if (stock.get(i).get_sticker().equals(s)){
                return i;
            }
        }
        return -1;
    }
    
    public boolean contains(String s){
       return get_index(s)>-1;
    }
    
    public void add(String s, ArrayList<Double> p){
        int index = get_index(s);
        if(index> -1){
           this.stock.get(index).add_price(p);
        }
        else{
           this.stock.add(new pairs(s,p));
        }
      
    }
    
    public void Print(){
        for(pairs i: this.stock){
            System.out.println(i.get_sticker() + " ==> " + i.get_price().toString() + " ==> " + i.avg_price());
        }
    }
    
        public static void main(String[] args) { 
        Stock sto = new Stock();
        initial_stock(sto);
        user_add(sto);
        }

    public static void initial_stock(Stock sto){        
        String[] s = new String[]{"info", "ril", "mtl"};
        double[][] arr = new double[][]{{600, 630, 620},
                                        {1430,1490,1567},
                                        {234,180,160}};
        add_to_stock(s,arr,sto);
        //sto.Print();
        }

    public static void user_add(Stock sto){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your stock sticker? ");
        String s = sc.nextLine();
        System.out.println("what is the price?");
        double price = sc.nextDouble();
        ArrayList<Double> p = new ArrayList<>();
        p.add(price);
        sto.add(s, p);
        sto.Print();        
    }

    public static void add_to_stock(String[] s, double[][] arr, Stock sto){
        for (int i =0; i< s.length; i++){
            sto.add(s[i], to_arrayList(arr[i]));
        }
    }    
    
    public static ArrayList<Double> to_arrayList (double[] arr){
        ArrayList<Double> temp = new ArrayList<>();
        for (double i : arr){
            temp.add(i);
        }
        return temp;
    }  
}

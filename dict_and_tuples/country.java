
import java.util.ArrayList;
import java.util.Scanner;

class pair{
    private String country;
    private int population;
    
    pair(){
        this.country = "";
        this.population = 0;
    }
    
    pair(String s, int p){
        this.country = s;
        this.population = p;
    }
    
    public String get_country(){
        return this.country;
    }
    
    public int get_population(){
        return this.population;
    }  
}

public class country {
    private ArrayList<pair> cp;
    
    country(){
        this.cp = new ArrayList<>();
    }
    
    country(String s, int p){
        pair temp = new pair(s,p);
        this.cp = new ArrayList<>();
        cp.add(temp);
    }
    
    public int size(){
        return this.cp.size();
    }
    
    public void Print (){
        for(pair i: this.cp){
            System.out.println(i.get_country()+"==>"+i.get_population());
        }
    }
    
    public int index(String s){
        int index = -1;
        for(int i = 0; i< this.cp.size(); i++){
            if (cp.get(i).get_country().equals(s))
                index = i;
        }
        return index;
    }
    
    public boolean isin(String s){
        return index(s) > -1;
    }
    
    public void add(String c, int p){
        pair temp = new pair(c,p);
        this.cp.add(temp);
    }
    
    public void remove(String s){
        int temp = index(s);
        this.cp.remove(temp);
    }
    
    public int query(String s){
        int temp = index(s);
        return this.cp.get(temp).get_population();
    }
    
    //test code
    public static void main(String[] args) { 
        country ex = new country();
        initialize_country(ex);
        Scanner sc = new Scanner(System.in);
        System.out.println("would you like to print, add, remove, or query? ");
        String input = sc.nextLine();
        operation(ex, input, sc);       
    }
    
    public static void initialize_country(country ex){
        String[] c = new String[]{"China", "India", "USA","Pakistan"};
        int[] p = new int[]{143,136,32,21};
        for (int i = 0; i< c.length; i++){
            ex.add(c[i], p[i]);
        }       
    }
    
    public static void operation(country ex, String input, Scanner sc){
        switch (input) {
            case "print":
                ex.Print();
                break;
            case "add":
                Add(ex,sc);
                break;
            case "remove":
                Remove(ex, sc);
                break;
            case "query":
                Query(ex, sc);
                break;
            default:
                System.out.println(input + " is not available. terminating.");
                break;
        }
    }
    
    public static void Add (country ex, Scanner sc){
        System.out.println("what is the country to add? ");
        String c = sc.nextLine();
        if (!(ex.isin(c))){
            System.out.println("what is the population? ");
            int p = sc.nextInt();
            ex.add(c, p);
            ex.Print();
        }
        else{
            System.out.println(c + " already exists. terminating");
        }
        
    }
    
    public static void Remove(country ex, Scanner sc){
        System.out.println("What is the country to remove? ");
        String c = sc.nextLine();
        if (ex.isin(c)){
            ex.remove(c);
            ex.Print();
        }
        else{
            System.out.println(c + " does exist. terminating");
        }
    }
    
    public static void Query(country ex, Scanner sc){
        System.out.println("which county to query? ");
        String s = sc.nextLine();
        if(ex.isin(s)){
            System.out.println("Population of " + s + " is " + ex.query(s));
        }
        else{
            System.out.println("No data regarding " + s + ". Terminating");
        }
    }
}

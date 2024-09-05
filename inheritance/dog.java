
public class dog extends animal {
    String name;
    String game;
    
    public dog(String n, String g){
        super("dog", "kernnel","meat");
        this.name = n;
        this.game = g;
    }
    
    public void print_dog (){
        System.out.println(this.name + " is a dog. " + this.name + " loves " + this.game + ".");
    }
    
    //test
    public static void main(String args[]){
        dog a = new dog("wangwang","fetch");
        a.Print();
        a.print_dog();
    }
    
}

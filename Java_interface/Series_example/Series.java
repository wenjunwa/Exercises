
public interface Series {
    int MAX = 10;
    String ERRORMSG = "Can not go above value: " + MAX;
    
    int getNext();
    
    default void printStuff(){
        System.out.println("Live from new York. it's saturday night");
    }
    static void Static_method(){
        System.out.println("this is a static class of Series interface.");
    }
    
}

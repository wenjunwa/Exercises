public class people {
    String name;
    int age;
    
    public people(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void get_minor_age(){
        if (this.age > 17){
            ex_handling();
        }
        else{
            System.out.println(this.name + " --> " + this.age);
            
        }
    }
    
    public void ex_handling(){
        try {
                throw new AdultException("greater or equal to 18");
            } catch (AdultException ex) {
                System.out.println("This is an adult: " + ex.getMessage());
            }finally{
                System.out.println("Name --> " + this.name);
            }
    }
    
    public static void main(String args[]){
        people p = new people("Jhon", 18);
        p.get_minor_age();
        p = new people("Annie", 17);
        p.get_minor_age();
    }
}

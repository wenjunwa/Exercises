
public class animal {
    String habitat;
    String food;
    String animal;
    
    animal(String a, String h, String f){
        this.animal = a;
        this.habitat = h;
        this.food = f;
    }

    public void Print(){
        System.out.println(this.animal + " lives at " + this.habitat + ". They eat " + food + ".");
    }
    
}

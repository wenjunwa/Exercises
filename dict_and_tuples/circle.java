import java.util.Scanner;
import java.lang.Math;
public class circle {
    private double radius;
    
    circle(){
        this.radius = 1;
    }
    
    circle(double radius){
        this.radius = radius;
    }
    
    public double area (){
        return (Math.round(Math.PI * this.radius * this.radius *100))/100.0;
    }
    
    public double circumference(){
        return (Math.round(2* Math.PI * this.radius * 100))/100.0;
    }
    
    public double diameter (){
        return (Math.round(2 * this.radius * 100))/100.0;
    }
    
    public double get_radius (){
        return Math.round(this.radius*100)/100.0;
    }
    
    public void set_radius(double radius){
        this.radius = radius;
    } 
    
    //test code
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your circle's radius? ");
        double radius = scan.nextDouble();
        circle c = new circle(radius);
        System.out.println("area: " + c.area() + "\nCircumference: " + c.circumference() + "\nDiameter: " + c.diameter());
        
    }
}


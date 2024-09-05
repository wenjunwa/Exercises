/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vicky
 */
public class employee {
    private int id;
    private String name;
    
    employee(int i, String n){
        this.id = i;
        this.name = n;
    }
    
    public void Print(){
        System.out.println("Id:\t" + this.id + "\nName:\t" + this.name);
    }
    
    public void set_id(int i){
        this.id = i;
    }
    
    public void set_name(String s){
        this.name = s;
    }
    
    public int get_id(){
        return this.id;
    }
    
    public String get_name(){
        return this.name;
    }
    
    public static void main(String[] args) { 
        employee emp = new employee(1,"wenjun");
        emp.Print();
        emp= null;
        try{
        emp.Print();
        }catch(NullPointerException e){
            System.out.println("No such object: " + e.getMessage());           
        }finally{
            System.out.println("propram completed");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vicky
 */
public class AdultException extends Exception {
    String value;
    
    AdultException(String value){
        super(value);
    }
    
}

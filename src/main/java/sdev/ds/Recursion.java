/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdev.ds;

/**
 *
 * @author JustJava
 */
public class Recursion {
    public static void main(String[] args) {
        int binary = 10111;
        System.out.println("Convert " + binary + " to decimal is: " + convert(binary));
          
    }
    
    //we asume we get an representation of an binaryNumber number under the form of a int
    //binaryNumber %10 gives us the last digit of the number 
    //binaryNumber /10 gives the next number for  the recursive call until we get to a number smaller then 10 witch gives binaryNumber/10 -gives zero
    public static int convert(int binaryNumber){
        
        //base condition
        if( binaryNumber == 0 ){
            return 0;
            
        } else {
            return  ( (binaryNumber%10) + ( 2 * convert(binaryNumber/10) ) );
        }
    }
}

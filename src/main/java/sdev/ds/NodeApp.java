/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdev.ds;

/**
 *
 * @author JustJava
 */
public class NodeApp {
    public static void main(String[] args) {
      
     //create appointments objects
     Appointment appointment1 = new Appointment("X202","Eddie Murphy","084 5342199","headaches","Dehydrated");
     Appointment appointment2 = new Appointment("X203","Jack Jony","086 6872199","vomiting","Covid");
     Appointment appointment3 = new Appointment("X204","John Cena","086 3563621","fever","Liver failure");
    
        System.out.println("Create a new node and add the first appointment as a element");
        Node <Appointment> firstApp = new Node <Appointment> (appointment1);
        System.out.println("First Node: " + firstApp.toString());
        
        System.out.println("-----------------------------------------------");
        System.out.println("\nCreate second node and add an appointment appointment as a element");
        Node <Appointment> secondApp = new Node <Appointment> (appointment2);
        System.out.println("Second Node: " + secondApp.toString());
        
        System.out.println("-----------------------------------------------");
        System.out.println("\nCreate a new node and add the first appointment as a element");
        Node <Appointment> thirdApp = new Node <Appointment> (appointment3);
        System.out.println("Third Node: " + thirdApp.toString());
        
        
        // link the nodes
        firstApp.next = secondApp;
        secondApp.next = thirdApp;

        System.out.println("-----------------------------------------------");
        System.out.println("Display the linked nodes");
        System.out.println("First Node: " + firstApp.toString());
        System.out.println("Second Node: " + secondApp.toString());
        System.out.println("Third Node: " + thirdApp.toString());
    
    
    }//main method
}//class

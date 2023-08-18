/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdev.ds;

/**
 *
 * @author JustJava
 */
public class Node <T> {
    
   Appointment appointment;
   Node next;
   
   //constructors

    public Node(Appointment appointment, Node next) {
        this.appointment = appointment;
        this.next = next;
    }
   
    // one parameter constructor, we set the link to next node to null

    public Node(Appointment appointment) {
        this.appointment = appointment;
        this.next = null;
    }

    public Node() {
    }
    
    //setters and getters

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    //toString

    @Override
    public String toString() {
        return "Node{" + "appointment=" + appointment + ", next=" + next + '}';
    }
    
    
   
   
   
   
   
   
}//class

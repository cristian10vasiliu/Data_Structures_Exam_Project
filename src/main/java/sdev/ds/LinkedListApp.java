/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdev.ds;

/**
 *
 * @author JustJava
 */
public class LinkedListApp {
    public static void main(String[] args) {
        
        //we create a new list
        LinkedList <Appointment> appointmentList = new LinkedList<>();
        
        System.out.println("Is Appointment List empty: " + appointmentList.isEmpty());
        System.out.println("Appointments: " + appointmentList.toString());
        System.out.println("First in the list: " + appointmentList.getFirst());
        System.out.println("Last in the list.last: " + appointmentList.getLast());
        
        
        //create 5 appointments
        Appointment appointment1 = new Appointment("X201","Eddie Murphy","084 5342199","headaches","Dehydrated");
        Appointment appointment2 = new Appointment("X202","Jack Jony","086 6872199","vomiting","Covid");
        Appointment appointment3 = new Appointment("X203","John Cena","086 3563621","fever","Liver failure");
        Appointment appointment4 = new Appointment("X204","Selena Amry","089 4321567","ichy eyes","Hay fever");
        Appointment appointment5 = new Appointment("X205","Vicky Sany","086 7437213","insomnia","Stress");
        Appointment appointment6 = new Appointment("X206","Joanne Wicka","086 4598734","tooth pain","Extraction required");
        
        //add a new appointment in the list
        appointmentList.add(appointment1);
        
        System.out.println("\n---------------------------------------------------");
        System.out.println("Add first appointment in the list");
        System.out.println("Is Appointment List empty: " + appointmentList.isEmpty());
        System.out.println("Appointments: " + appointmentList.toString());
        System.out.println("First in the list: " + appointmentList.getFirst());
        System.out.println("Last in the list.last: " + appointmentList.getLast());
        
        
        System.out.println("\n---------------------------------------------------");
        System.out.println("Appointment code " + appointment1.getPatientCode());
        System.out.println("remove first appointment in the list");
        System.out.println(appointmentList.remove("X201"));
        System.out.println("Is Appointment List empty: " + appointmentList.isEmpty());
        System.out.println("Appointments: " + appointmentList.toString());
        System.out.println("First in the list: " + appointmentList.getFirst());
        System.out.println("Last in the list.last: " + appointmentList.getLast());
         
        
        appointmentList.add(appointment2);
        System.out.println("\n---------------------------------------------------");
        System.out.println("Add second appointment in the list");
        System.out.println("Is Appointment List empty: " + appointmentList.isEmpty());
        System.out.println("Appointments: " + appointmentList.toString());
        System.out.println("First in the list: " + appointmentList.getFirst());
        System.out.println("Last in the list.last: " + appointmentList.getLast());
        
        appointmentList.add(appointment3);
        System.out.println("\n---------------------------------------------------");
        System.out.println("Add appointment in the list");
        System.out.println("Is Appointment List empty: " + appointmentList.isEmpty());
        System.out.println("Appointments: " + appointmentList.toString());
        System.out.println("First in the list: " + appointmentList.getFirst());
        System.out.println("Last in the list.last: " + appointmentList.getLast());
        
         appointmentList.add(appointment4);
        System.out.println("\n---------------------------------------------------");
        System.out.println("Add appointment in the list");
        System.out.println("Is Appointment List empty: " + appointmentList.isEmpty());
        System.out.println("Appointments: " + appointmentList.toString());
        System.out.println("First in the list: " + appointmentList.getFirst());
        System.out.println("Last in the list.last: " + appointmentList.getLast());
        
        appointmentList.add(appointment5);
        System.out.println("\n---------------------------------------------------");
        System.out.println("Add appointment in the list");
        System.out.println("Is Appointment List empty: " + appointmentList.isEmpty());
        System.out.println("Appointments: " + appointmentList.toString());
        System.out.println("First in the list: " + appointmentList.getFirst());
        System.out.println("Last in the list.last: " + appointmentList.getLast());
        
        appointmentList.add(appointment6);
        System.out.println("\n---------------------------------------------------");
        System.out.println("Add appointment in the list");
        System.out.println("Is Appointment List empty: " + appointmentList.isEmpty());
        System.out.println("Appointments: " + appointmentList.toString());
        System.out.println("First in the list: " + appointmentList.getFirst());
        System.out.println("Last in the list.last: " + appointmentList.getLast());
        
        
        //get apointment at index 3
        System.out.println("\n---------------------------------------------------");
        System.out.println("Appointment at position 3: " +"\n" + appointmentList.get(3));
        
        //remove the first appointment
        System.out.println("\n---------------------------------------------------");
        appointmentList.remove("X201");
        
        //remove the appointment with "xo3"
        System.out.println("\n---------------------------------------------------");
        
        
       // System.out.println(appointmentList.remove("X203"));
        System.out.println("Is Appointment List empty: " + appointmentList.isEmpty());
        System.out.println("Appointments: " + appointmentList.toString());
        System.out.println("First in the list: " + appointmentList.getFirst());
        System.out.println("Last in the list.last: " + appointmentList.getLast());
        
        System.out.println(appointmentList.remove("X206"));
        System.out.println("Is Appointment List empty: " + appointmentList.isEmpty());
        System.out.println("Appointments: " + appointmentList.toString());
        System.out.println("First in the list: " + appointmentList.getFirst());
        System.out.println("Last in the list.last: " + appointmentList.getLast());
        
        
    }//main method
}//class

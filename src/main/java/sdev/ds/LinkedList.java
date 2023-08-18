/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdev.ds;

/**
 *
 * @author JustJava
 */
public class LinkedList <T>{
    
     
    //pointers to first and last node
    Node<T> first;
    Node<T> last;
    
    //constructors
    //2 param constructor
    public LinkedList(Node<T> first, Node<T> last) {
        this.first = first;
        this.last = last;
    }
    //no param constructor,where we set the pointers to null;
    public LinkedList() {
        first = null;
        last = null;
    }
    
    // if the list is empty then the first element is null
    public boolean isEmpty(){
        return first == null;
    }
    
   //getters and setters

    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }
    
    
    
    
    //toString
    //if the list is empty  we print a message 
    //else we start with the first node , we store it in a string as long as the node is not empty/null
    //then hop to the next node  and if it is not empty we store it  and we continue until we get to the end of the list
    // added a variable to count and display the node number 
    @Override
    public String toString() {
        String str = "";
        int count = 1;
        Node<T> current = first;
        if(isEmpty()){
            return "The list is Empty!!";
        }else{
            while (current != null){
                str += "\n" + count + "." + current.toString();
                current = current.next;
                count++;
            }
            return str;
        }
    }//toString
    
    // method to add an element/appointment at the end of the list
     public void add(Appointment appointment){
        //if the list is empty then we add the node as first 
        //as is the only element in the list then he is the last element also
        
        Node<T> nodeToAdd = new Node<T> (appointment);
        if( isEmpty() ){
            first = nodeToAdd;
            last = first;
        }
        //if it is not empty add it at the end
        // we need the old last to point to the new inserted subject
        //and to update the last variable
        else {
            last.next = nodeToAdd;
            last = nodeToAdd;
        }
    }//add
     
     //we set the curent node as first
     //as the entry point in the linked list is the first element
     //we loop until we get to the element 
     //when i gets to index-1 the we hop to next element , which is the one we want
     //we increment i and the condition of the loop is not met anymore
     //so the current node is the one we want 
     //we return it a s a string
     public String get(int index){
        Node <T> current = first;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current.toString();
     }//get appointment at index
     
     // remove method
      public String remove(String target){
          Node current = first;
          int index = 0;
         // Appointment appointmentToRemove;
          //variable to track the index of the target
          // set a flag if we found the target appointment or not
          //we going to loop through the list and if the appointment is in the list
          //will set the value of found to true
          //if we get to the end of the list then found stays false
          boolean found = false;
          while (current != null){
            if ( !current.appointment.getPatientCode().equalsIgnoreCase(target)) {
                current = current.next;
                
            }
            else{
                found = true;
                break;
            }
        }
        //if the appointment with the target code is found then we remove it 
        //if not we inform that the the appointment is not in the list
         if(found == false){
            return "Appointment not found in the list!";
        } 
        else {
            current = first;
           // index = 1;
           //if the appointment is the first in the list
            if(first.appointment.getPatientCode().equalsIgnoreCase(target)) {
                first = first.next;
                
                //if the list had only one appointment and we removed it
                if(first == null){
                    
                    last = null;
                }
            }
            else{ //we hop until we get to the requred index/appointment as we know that the appointment is is the list
                while(!current.next.appointment.getPatientCode().equalsIgnoreCase(target)) {
                    index++;
                    current = current.next;
                }
                //now that we know the index we go to the element before index
                for (int i = 1; i <= (index - 1); i++) {
                    current = current.next;
                }
                
                //the current node needs to point to the node after the one we remove
                current.next = current.next.next;
                
                //if the node removed was the last then we need to update the last varable
                if(current.next == null){
                     last = current;
                }
                return "Appointment removed";
            }//else
        }
        return "Removed";
     
      }//remove
     
    
}//class

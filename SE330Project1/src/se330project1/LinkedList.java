/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se330project1;

/**
 *
 * @author it.student
 */
public class LinkedList {
    //Head pointer
    protected LinkedNode head = null;
    //Keeping track of the number of nodes.
    protected int numNodes = 0;
    
    //Default Constructor
    public LinkedList(){        
    }
    
    //Checking if the list is empty
    public boolean isEmpty(){
        //If head is null. Could also work if numNodes is zero, but this is
        //moire reliable.
        return (head == null);
    }
    
    public int getNumNodes(){
        return numNodes;
    }
    
    /* Returns the information in the requested node. No, I'm not making this a
    ** pseudo-array, whatever would give you that idea?
    */
    public Object getAtIndex(int node){
        //If the list isn't empty and you're asking for something in bounds
        if(!this.isEmpty() && node < numNodes){
            //Create a seeking pointer.
            LinkedNode seek = head;
            for(int i = 0; i < node; i++)
            {
                //Keep going forward until you're at the index you want
                seek = seek.next;
            }
            //Return the info within seek.
            return seek.info;
        }
        else{
            //return null otherwise
            return null;
        }
    }
    
    //Push the data to the list in the first entry
    public void push(Object input){
        head = new LinkedNode(input, head);
        numNodes++;
    }
    
    /*Pop the data in the top node of the list. If the list is empty,
    return null. */
    public Object pop(){
        if(!this.isEmpty()){
            Object data = head.info;
            head = head.next;
            numNodes--;
            return data;
        }
        else{
            return null;
        }
    }
}

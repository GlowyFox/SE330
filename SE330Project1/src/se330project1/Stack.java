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
public class Stack {
    //Head pointer
    protected LinkedNode head = null;
    
    //Empty constructor.
    public Stack(){     
    }
    
    //Push the data to the stack
    public void push(Object input){
        head = new LinkedNode(input, head);
    }
    
    /*Pop the data in the top node of the stack. If the stack is empty,
    return null. */
    public Object pop(){
        if(head != null){
            Object data = head.info;
            head = head.next;
            return data;
        }
        else{
            return null;
        }
    }
    
    //Get the data from the top node without removing it.
    public Object peek(){
        if(head != null){
            return head.info;
        }
        else{
            return null;
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab216;

/**
 *
 * @author it.student
 */
public class SLLNode {
    public Object info;
    public SLLNode next;
    
    //Default Constructor
    public SLLNode(){
        next = null; //Setting next to null by default.
    }
    //Constructor with data given.
    public SLLNode(Object inData){
        info = inData; //Setting the 'info' (data) to the input info.
        next = null; //Setting next to null by default.
    }
    //Cunstructor with data and next given.
    public SLLNode(Object inData, SLLNode nextNodePtr){
        info = inData; //Setting the 'info' (data) to the input info.
        next = nextNodePtr; //Setting next to the given next node.
    }
}

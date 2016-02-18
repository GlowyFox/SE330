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
public class LinkedNode {
    public Object info;
    public LinkedNode next;
    
    //Default Constructor
    public LinkedNode(){
        next = null; //Setting next to null by default.
    }
    //Constructor with data given.
    public LinkedNode(Object inData){
        info = inData; //Setting the 'info' (data) to the input info.
        next = null; //Setting next to null by default.
    }
    //Cunstructor with data and next given.
    public LinkedNode(Object inData, LinkedNode nextNodePtr){
        info = inData; //Setting the 'info' (data) to the input info.
        next = nextNodePtr; //Setting next to the given next node.
    }
}

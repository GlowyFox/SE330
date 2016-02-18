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
public class SLList {
    //Head pointer
    protected SLLNode head = null;
    //Seeking pointer
    protected SLLNode seek = null;
    //Number of elements in the list. Aids with avoiding 
    //trying to seek out of bounds.
    protected int numNodes = 0;
    
    //Default Constructor
    public SLList(){        
    }
    
    //Checking if the list is empty
    public boolean isEmpty(){
        //If head is null. Could also work if numNodes is zero, but this is
        //moire reliable.
        return (head == null);
    }
    
    //Returns the information in the 'head' node.
    //CHANGE THE RETURN TYPE IF THE DATA TYPE IS CHANGED
    public Object first(){
        //MAKE SURE THAT head IS NOT NULL
        if(!this.isEmpty()){
            return head.info;
        }
        else{
            //return null otherwise
            return null;
        }
    }
    
    //Outputs all of the data in the LinkedList to the output stream.
    public void printAll(java.io.PrintStream out){
        if(!this.isEmpty()){
            seek = head;
            for(int count = 1; seek != null; seek = seek.next, count++){
                out.print(count + ": ");
                out.print(seek.info);
                if(seek.next != null){
                    out.print("\n");
                }
            }
        }
        else{
            out.print("List is empty!");
        }
    }
    
    //Adds a node to the front of the list. O(1)
    public void addFront(Object nodeData){
        head = new SLLNode(nodeData, head);
        numNodes++;
    }
    
    //Finds the first instance of the given info.
    public Object findFirst(Object toFind){
        seek = head;
        for( ; seek != null && !toFind.equals(seek.info); seek = seek.next){}
        if(seek == null){
            return null;
        }
        else {
            return seek.info;
        }
    }
    
    //Removes head (in this case, removes pointers to it) and returns the 
    //data within. If working with memory directly, make sure to deallocate the 
    //memory.
    public Object removeHead(){
        Object data = head.info;
        //Really bugs me that I'm not freeing the memory manually..
        head = head.next;
        numNodes--; 
        return data;
    }
    
    //Removes the first node with the given data.
    public void removeFirst(Object toRemove){
        if(!this.isEmpty()){ //Avoiding working on an empty list.
            if(toRemove.equals(head.info)){
                //Just call deleteHead if the data is in the head node.
                removeHead(); 
            }
            else{
                //Making a temp pointer.. Thing. Java pointers are weird.
                SLLNode prevNode = head; 
                seek = head.next;
                for(; seek != null && !(seek.info.equals(toRemove)); 
                        prevNode = prevNode.next, seek = seek.next){}
                if(seek != null){
                    //This still feels so wrong..
                    prevNode.next = seek.next;
                    numNodes--;
                }
            }
        }
    }
    
    /* BEGIN NEW CODE*/
    
    public Object getAtIndex(int index){
        if(this.isEmpty() || index >= numNodes || index < 0){
            return null;
        }
        else{
            seek = head;
            for(int count = 0; count != index; count++){
                seek = seek.next;
            }
            return seek.info;
        }
    }
    public void removeAtIndex(int index){
        if(!(this.isEmpty() || index >= numNodes || index < 0)){
            if(index == 0){
                removeHead();
            }
            else{
                //Making a temp pointer.. Thing. Java pointers are weird.
                SLLNode prevNode = head; 
                seek = head.next;
                for(int count = 1; seek != null && count != index; 
                        prevNode = prevNode.next, seek = seek.next){}
                if(seek != null){
                    //This still feels so wrong..
                    prevNode.next = seek.next;                    
                    numNodes--;
                }
            }
        }
    }
    
    //Add a node before the nodes at the given index
    public void addBeforeIndex(int index, Object data){
        if(!(this.isEmpty() || index >= numNodes || index < 0)){
            if(index == 0){
                addFront(data);
            }
            else{
                //Making a temp pointer.. Thing. Java pointers are weird.
                SLLNode prevNode = head; 
                seek = head.next;
                for(int count = 1; seek != null && count != index; 
                        prevNode = prevNode.next, seek = seek.next){}
                
                                
                prevNode.next =  new SLLNode(data, seek); 
                numNodes++;                
            }
        }
    }
    
    //Add a node after the nodes at the given index
    public void addAfterIndex(int index, Object data){
        if(!(this.isEmpty() || index >= numNodes || index < 0)){
            if(index == 0){
                seek = head.next;
                head.next = new SLLNode(data, seek);
                numNodes++;
            }
            else{
                //Making a temp pointer.. Thing. Java pointers are weird.
                SLLNode prevNode = head; 
                seek = head.next;
                for(int count = 1; seek != null && count != index+1; 
                        prevNode = prevNode.next, seek = seek.next){}
                
                                    
                prevNode.next = new SLLNode(data, seek);
                numNodes++;                 
            }
        }
    }
    
    //Returns the number of nodes.
    public int getNumNodes(){
        return numNodes;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab216;
import java.util.Random;
import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author it.student
 */
public class Lab216 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a new SLList
        SLList myList = new SLList();
        // Create a random number generator.
        Random r = new Random();
        r.setSeed(r.nextLong());
        
        //Add some elements
        for(int i = 0; i < 5; i++)
        {
            myList.addFront(r.nextInt(100));
        }
        
        //Output the list.
        myList.printAll(System.out);
        System.out.print("\n");
        
        Scanner s = new Scanner(System.in);
        s.nextLine();
        
        //Add a new element after a random index.
        myList.addAfterIndex(r.nextInt(myList.getNumNodes()), r.nextInt(100));
        
        //Output the list.
        myList.printAll(System.out);  
        System.out.print("\n");
        s.nextLine();
        
        //Add a new element after a random index.
        myList.addAfterIndex(r.nextInt(myList.getNumNodes()), r.nextInt(100));
        
        //Output the list.
        myList.printAll(System.out);
        System.out.print("\n");
        s.nextLine();
        
        //Add a new element before a random index.
        myList.addBeforeIndex(r.nextInt(myList.getNumNodes()), r.nextInt(100));
        //Output the list.
        myList.printAll(System.out);
        System.out.print("\n");
        s.nextLine();
    }
    
}

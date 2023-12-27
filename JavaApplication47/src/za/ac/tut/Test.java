
package za.ac.tut;

import za.ac.tut.ladzi.Ladzi;

/**
 *
 * @author Ladzani_fabian
 */
public class Test implements Ladzi<String>{

    @Override
    public void hello(String name) {
       
        System.out.println("hello "+ name);
    }
    
}

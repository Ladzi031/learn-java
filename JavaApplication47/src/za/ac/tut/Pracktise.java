
package za.ac.tut;

import za.ac.tut.ladzi.Ladzi;

/**
 *
 * @author Ladzani_fabian
 */
public class Pracktise implements Ladzi<Integer>{

    @Override
    public void hello(Integer name) {
        System.out.println("you selected the number: "+ name);
    }
    
}

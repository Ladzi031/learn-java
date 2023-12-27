package oop.inheritace;

import opp.inheritance.TestSuper;

/**
 * @author Ladzani_fabian
 */
public class TestSub extends TestSuper{
    public String superString(){
        return "in the Sub-class now";
    }
    public String getSuperMethod(){
        return super.superString();
    }
}

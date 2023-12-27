
package oop.test;


public class Vehicle extends AbstractVehicle {

    private int x;

    public Vehicle() {
    }
    
    
    @Override
    public String somethingAbstract(){
        return "yeah we going abstract here!";
    }
    public Vehicle(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    
   
    
}

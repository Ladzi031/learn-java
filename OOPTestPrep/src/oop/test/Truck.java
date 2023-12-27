
package oop.test;


public class Truck extends Vehicle{
    private int z;
    public Truck() {
    }

    public Truck(int x) {
        super(x);
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

   
    public String specialTruckMethod(){
        return "I am a special truck method!";
    }
    @Override
    public String somethingAbstract(){
        return "something abstract in the truck class!";
    }
    
}

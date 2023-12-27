
package oop.test;


public class Car extends Vehicle implements CarFeaturesInter{
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public Car() {
    }

    public Car(int x) {
        super(x);
    }
    
    public String specialCarMethod(){
        return "I am speical car function";
    }

    @Override
   public String somethingAbstract(){
       return "something abstract in the car class!";
   }
   
   @Override
    public String getSomeInteraction(){
        return "yeah yeah i am interacting with people in this dumb res!";
    }
   
    
}

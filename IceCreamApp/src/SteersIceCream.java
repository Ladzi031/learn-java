public class SteersIceCream {
    private char holder;
    private char size;
    private boolean flake;
    private char dipSauce;

    public SteersIceCream() {
        this.holder = 'c';
        this.size = 'g';
        this.flake = false;
        this.dipSauce  = 'n';
    }

    public SteersIceCream(char size) {
        this.size = size;
        this.flake = false;
        this.dipSauce  = 'n';
        this.holder = 'c';
    }

    public SteersIceCream(char holder, char size) {
        this.holder = holder;
        this.size = size;
          this.flake = false;
        this.dipSauce  = 'n';
    }

    public SteersIceCream(char holder, char size, boolean flake, char dipSauce) {
        this.holder = holder;
        this.size = size;
        this.flake = flake;
        this.dipSauce = dipSauce;
    }

    public void setHolder(char holder) {
        this.holder = holder;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public void setFlake(boolean flake) {
        this.flake = flake;
    }

    public void setDipSauce(char dipSauce) {
        this.dipSauce = dipSauce;
    }

    public char getHolder() {
        return holder;
    }

    public char getSize() {
        return size;
    }

    public boolean isFlake() {
        return flake;
    }

    public char getDipSauce() {
        return dipSauce;
    }
    public double price(){
       char sizeOfIceCream = getSize();
       char holderTypeForIceCream = getHolder();
       boolean hasFlakes = isFlake();
       char selectedDeepSauceFlavour = getDipSauce();
       double price = 0.0;
       
        switch (sizeOfIceCream) {
            case 'g' -> price += 5.50;
            case 'm' -> price += 7.65;
            case 'l' -> price += 10.45;
            default -> throw new AssertionError();
        }
        switch(holderTypeForIceCream){
            case 'c' -> price += 1.25;
            case 'C' -> price += 2.75;
            default -> throw new AssertionError();
        }
        
       price += hasFlakes ? 2.00 : 0.0;
       price += selectedDeepSauceFlavour != 'n' ? 1.75 : 0.0;
        return price;
    }
    public String details(){
        String iceCreamDetails = "this deep sauce selected is "+getDipSauce() + " and the the type of holder for your ice cream is "+ getHolder()+ "and the size of you ice cream is "+  getSize()+ "the total price is R"+ price();
        return iceCreamDetails;
    }
}

package duke.choice;

public class ShopApp {
    public static void main(String[] args) {
        final double TAX = 0.2;
        double total = 0;
        Customer c1 = new Customer();
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        
        
        c1.name = "Pinky";
        c1.size = "s";
        System.out.println("hello "+ c1.name);
        
        int measurement = 3;
        
        //not clear requirements.
        switch (measurement){
            case 1:
            case 2:
            case 3:
                c1.size = "s";
            break;
            case 4:
            case 5:
            case 6:
                c1.size = "m";
            break;
            case 7:
            case 8:
            case 9:
                c1.size = "L";
            break;
            default:
                c1.size = "x";
        }
        
        item2.description = " Orange - T-Shirt ";
        item2.size = " S ";
        item2.price = 10.5;
        
        item1.description = " Blue jacket ";
        item1.size = " M ";
        item1.price = 20.9;
        
        Clothing[] items = {item1, item2};
        for(Clothing item: items){
            if(c1.size.equals(item.size)){
               total = total + item.price;
        System.out.println("item  is: "+item.description + item.size + item.price);  
            }
        }
        System.out.println(total);
        
//        System.out.println("item 1 is: "+ item1.description + item1.size + item1.price);
//        System.out.println("item 2 is: "+item2.description + item2.size + item2.price);
        
        //total = ((item2.price * 2) + item1.price)* (TAX + 1);
        
    }
}

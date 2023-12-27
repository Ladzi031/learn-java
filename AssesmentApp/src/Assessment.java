public class Assessment {
    private String code;
    private char type; 
    private double weight;

    public Assessment(String code) {
        this.code = code;
    }
    public Assessment(){}
    
    public Assessment(String code, char type, double weight) {
        this.code = code;
        this.type = type;
        this.weight = weight;
    }

    public void setType(char type) {
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCode() {
        return code;
    }

    public char getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }
    
    public String levelOfDifficulty(){
        return "inherited goods!";
        
    }

}

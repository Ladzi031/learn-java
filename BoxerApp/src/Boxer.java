public class Boxer {
    private String boxerName;
    private double boxerWeight;

    public Boxer() {
    }

    public Boxer(String boxerName, double boxerWeight) {
        this.boxerName = boxerName;
        this.boxerWeight = boxerWeight;
    }

    public String getBoxerName() {
        return boxerName;
    }

    public void setBoxerName(String boxerName) {
        this.boxerName = boxerName;
    }

    public double getBoxerWeight() {
        return boxerWeight;
    }

    public void setBoxerWeight(double boxerWeight) {
        this.boxerWeight = boxerWeight;
    }
    
    public String determineWeightCategory(){
        String weightCategory;
      double determineBoxerWeight = getBoxerWeight();
        if (determineBoxerWeight == 50.0 || determineBoxerWeight <= 65.0) {
            weightCategory = "Light";
        }else if (determineBoxerWeight == 65.0 || determineBoxerWeight <= 90.0){
            weightCategory  = "Middle";
        }else {
            weightCategory = "Heavy";
        }
        return weightCategory;
    }
}

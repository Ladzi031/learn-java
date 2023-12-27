public class Politician {
    private String surname;
    private String position;
    private String politicalParty;

     public Politician() {
     }

    public Politician(String surname, String position, String politicalParty) {
        this.surname = surname;
        this.position = position;
        this.politicalParty = politicalParty;
    }
    
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        this.politicalParty = politicalParty;
    }
    
    public boolean goodPolitician(int budget, double moneySpend){
        return true;
    }
}

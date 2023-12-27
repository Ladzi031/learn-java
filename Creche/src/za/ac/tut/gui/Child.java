
package za.ac.tut.gui;

public class Child {
    
    private String name;
    private String gender;

    public Child(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Child{" + "name=" + name + ", gender=" + gender + '}';
    }
    
    
}

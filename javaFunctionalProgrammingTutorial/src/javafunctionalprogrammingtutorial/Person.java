
package javafunctionalprogrammingtutorial;

/*
 * @author Ladzani_fabian
 */
class Person {
    private final String name;
    private final Gender gender;
    public Person(String name, Gender gender){
        this.name = name;
        this.gender = gender;
    }
    public Gender getGender(){
        return this.gender;
    }
    public String getName(){
        return this.name;
    }
}

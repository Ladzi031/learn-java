
package testing;


public abstract class TestingAbstract {
    private String name;
    public TestingAbstract(){
        
    }   
    public TestingAbstract(String name){
        this.name = name;
    }
    public abstract String hello();

    public String getName() {
        return "hello there "+ name;
    }
    
    
    
}

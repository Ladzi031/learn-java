
package testing;


public class TestingConcrete  extends TestingAbstract implements TestingInterface {

    public TestingConcrete(String name) {
        super(name);
    }
    
    
    @Override
    public String hello(){
        return "hello world! from abstract"; 
    }
    
    @Override
    public String helloInte(){
        return "hello from interface!";
    }
}

import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorldTest extends BasicTest {
    HelloWorld hw = new HelloWorld();

    @Test
    public void testMethod1(){
        hw.returnHello();
        Assert.assertNotNull(hw);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int ss = hw.addMethod(1, 1);
        Assert.assertEquals(ss, 2);
    }

    @Test
    public void testMethod3(){
        HelloWorld helloWorld = new HelloWorld();
        int ss = helloWorld.addMethod(6,3);
        Assert.assertEquals(ss,9);


    }


}
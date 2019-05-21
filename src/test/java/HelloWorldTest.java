import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String ss = hw.returnHello();
        Assert.assertNotNull(ss);
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
        int ss = helloWorld.addMethod(2,3);
        Assert.assertEquals(ss,8);
    }
}
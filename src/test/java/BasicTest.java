import org.testng.annotations.BeforeSuite;

public class BasicTest {


    @BeforeSuite (alwaysRun = true)
    public void prepared() throws Exception {
        FunctionsUtil.deleteFile("./target/coverage-reports");
        FunctionsUtil.deleteFile("./target/site");
        System.out.println("Test start");
    }
}

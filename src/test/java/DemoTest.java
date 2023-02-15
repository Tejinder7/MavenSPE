import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DemoTest {
    @Test
    public void test1(){
        System.out.println("This is test 1");
    }
    @Before
    public void before(){
        System.out.println("This is before");
    }
    @After
    public void after(){
        System.out.println("This is after");
    }
    @Test
    public void test2(){
        System.out.println("This is test 2");
    }
}

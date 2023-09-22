import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


//junit does not guarantee the order of execution of test cases


public class MyBeforeAfterTestCases {

    @BeforeEach
    void beforeEach() throws Exception {
        System.out.println("beforeEach");
    }

    @Test
    void test1(){
        System.out.println("test1");
    }
    @Test
    void test2(){
        System.out.println("test2");
    }
    @Test
    void test3(){
        System.out.println("test3");
    }
    @Test
    void test4(){
        System.out.println("test4");
    }

    @AfterEach
    void afterEach(){
        System.out.println("AfterEach");
    }


}

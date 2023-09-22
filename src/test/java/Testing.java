import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Testing {

    List<String> todos = Arrays.asList("Aws","azure","devops");
    @Test
    void test(){
    boolean test = todos.contains("Aws");
    boolean test2 = todos.contains("azure");

    Assertions.assertTrue(test);
    Assertions.assertTrue(test2);

    Assertions.assertEquals(3,todos.size());

    Assertions.assertArrayEquals(new int[]{1,2,3},new int[]{1,2,3});



    }


}

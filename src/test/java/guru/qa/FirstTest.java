package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {
    @Test
    void firstTest(){
        Assertions.assertTrue(1>2);
    }

    @Test
    void secontTest(){
        Assertions.assertTrue(3>1);
    }
}

package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewTest {
    @Test
    void NewTest() {

        int i = 3;
        System.out.println("This is the best test");
        Assertions.assertTrue(i > 2);
    }
}

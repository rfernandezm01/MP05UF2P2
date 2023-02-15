import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @ParameterizedTest

    @org.junit.jupiter.api.Test
    void main() {
    }
    @org.junit.jupiter.api.Test
    void getWidth_OK() {
        int width = 5;
        int height = 5;
        Main m = new Main();
        Assertions.assertEquals(width, m.getWidth());
    }

    @org.junit.jupiter.api.Test
    void getWidth_NEGATIVE() {
        int width = -1;
        int height = 5;
        Assertions.assertThrows(NegativeArraySizeException.class, () -> {
            new Main();
        });
    }

}
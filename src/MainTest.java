import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void calculator1() {
        double res=Main.Calculator(1.0, 2.0, '+');
        assertEquals(3.0, res);
    }
    @Test
    void calculator2() {
        double res=Main.Calculator(8.0, 2.0, '-');
        assertEquals(6.0, res);
    }
    @Test
    void calculator3() {
        double res=Main.Calculator(8.0, 2.0, '*');
        assertEquals(16.0, res);
    }
}
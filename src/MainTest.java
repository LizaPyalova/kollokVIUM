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

    @Test
    void sum() {
        assertEquals(5, Main.sum(1,4));
    }

    @Test
    void differ() {
        assertEquals(7, Main.differ(8,1));
    }

    @Test
    void differ1() {
        assertEquals(9.7, Main.differ(10,0.3));
    }

    @Test
    void differ2() {
        assertEquals(8.8, Main.differ(10,1.2));
    }

    @Test
    void multipl() {
        assertEquals(80, Main.multipl(5, 16));
    }

    @Test
    void multipl1() {
        assertEquals(11, Main.multipl(5.5, 2));
    }


    @Test
    void div() {
        assertEquals(5, Main.div(10, 2));
    }

    @Test
    void div1() {
        assertEquals(6.5, Main.div(13, 2));
    }

}
package demo.parallel;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {
    @org.junit.jupiter.api.Test
    void minus() {
        Complex c1 = new Complex(5, 4);
        Complex c2 = new Complex(2, 2);

        Complex result = c1.minus(c2);

        assertEquals(3.0, result.getReal(), 1e-10);
        assertEquals(2.0, result.getImaginary(), 1e-10);
    }
}
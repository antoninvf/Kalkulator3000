package testing;

import logic.Math;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testing {

    @Test
    void add() {
        assertEquals(10f, Math.add(5f, 5f));
        assertEquals(420f, Math.add(200f, 220f));
        assertEquals(27f, Math.add(12f, 15f));
    }

    @Test
    void subtract() {
        assertEquals(0f, Math.subtract(5f, 5f));
        assertEquals(5f, Math.subtract(10f, 5f));
        assertEquals(3f, Math.subtract(12f, 9f));
    }

    @Test
    void multiply() {
        assertEquals(25f, Math.multiply(5f, 5f));
        assertEquals(272f, Math.multiply(16f, 17f));
        assertEquals(63f, Math.multiply(7, 9f));
    }

    @Test
    void divide() {
        assertEquals(0f, Math.divide(5f, 0f));
        assertEquals(3f, Math.divide(27f, 9f));
        assertEquals(8f, Math.divide(80f, 10f));
    }

    @Test
    void power() {
        assertEquals(16f, Math.power(4f, 2f));
        assertEquals(512f, Math.power(8f, 3f));
        assertEquals(81f, Math.power(3f, 4f));
    }

    @Test
    void factorial() {
        assertEquals(120f, Math.factorial(5f));
        assertEquals(1f, Math.factorial(1f));
        assertEquals(5040f, Math.factorial(7f));
    }


}

import IntegerCalculator.IntegerCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerCalculatorTest {

    IntegerCalculator IntegerCalculator;

    @BeforeEach
    public void setUp () {
        IntegerCalculator = new IntegerCalculator();
    }

    @Test
    @DisplayName("It should add 2 integers together")
    public void shouldAddTwoIntegers() {
        int sum = IntegerCalculator.add(5, 6);
        assertNotNull(sum);
        assertEquals(11, sum);
    }

    @Test
    @DisplayName("It should add all integers in a list")
    public void shouldAddAllIntegers() {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        int sum = IntegerCalculator.addAll(integers);

        assertNotNull(integers);
        assertThat(sum, instanceOf(Integer.class));
        assertEquals(6, sum);
    }

    @Test
    @DisplayName("It should subtract 2 integers together")
    public void shouldSubtractTwoIntegers() {
        int difference = IntegerCalculator.subtract(10, 20);
        assertNotNull(difference);
        assertEquals(-10, difference);
    }

    @Test
    @DisplayName("It should subtract all integers from the first integer")
    public void shouldSubtractAllIntegersFromEachOther() {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(9);
        integers.add(1);

        int difference = IntegerCalculator.subtractAll(integers);

        assertNotNull(difference);
        assertEquals(10, integers.get(0));
        assertEquals(0, difference);
    }

    @Test
    @DisplayName("It should multiply 2 integers together")
    public void shouldMultiplyIntegers() {
        int product = IntegerCalculator.multiply(7, 8);
        assertNotNull(product);
        assertEquals(56, product);
    }

    @Test
    @DisplayName("It should multiply all integers together")
    public void shouldMultiplyAllIntegers() {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(10);
        integers.add(10);

        int product = IntegerCalculator.multiplyAll(integers);

        assertNotNull(product);
        assertEquals(10, integers.get(0));
        assertEquals(1000, product);
    }

    @Test
    @DisplayName("It should divide 2 integers together")
    public void shouldDivideIntegers() throws ArithmeticException {
        int quotient = IntegerCalculator.divide(34, 2);
        assertNotNull(quotient);
        assertEquals(17, quotient);

        int quotient2 = IntegerCalculator.divide(19, 2);
        assertNotNull(quotient);
        assertNotEquals(0, quotient2);
        assertEquals(9, quotient2);

        assertThrows(ArithmeticException.class, () -> {
            IntegerCalculator.divide(11, 0);
        });
    }

    @Test
    @DisplayName("It should divide all integers from the first integer")
    public void shouldDivideAllIntegers() {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1000);
        integers.add(10);
        integers.add(10);

        int quotient = IntegerCalculator.divideAll(integers);

        assertNotNull(quotient);
        assertEquals(10, quotient);
    }

    @Test
    @DisplayName("It should print a message")
    public void print() {
        String message = IntegerCalculator.print("zzz");

        assertNotNull(message);
        assertEquals("zzz", message);
    }
}

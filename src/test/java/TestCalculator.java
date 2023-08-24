import org.earlycareers.CalculatorOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculator {

    @Test
    void additionAssertion1() {
        CalculatorOperations calculator = new CalculatorOperations();
        Assertions.assertEquals(2.0,calculator.sum(1, 1));
    }

    @Test
    void additionAssertion2() {
        CalculatorOperations calculator = new CalculatorOperations();
        Assertions.assertEquals(5.0,calculator.sum(2, 3));
    }

    @Test
    void subtractionAssertion1() {
        CalculatorOperations calculator = new CalculatorOperations();
        Assertions.assertEquals(2.0,calculator.subtraction(4, 2));
    }

    @Test
    void subtractionAssertion2() {
        CalculatorOperations calculator = new CalculatorOperations();
        Assertions.assertEquals(5.0,calculator.subtraction(10, 5));
    }

    @Test
    void productAssertion1() {
        CalculatorOperations calculator = new CalculatorOperations();
        Assertions.assertEquals(10.0,calculator.product(2, 5));
    }

    @Test
    void productAssertion2() {
        CalculatorOperations calculator = new CalculatorOperations();
        Assertions.assertEquals(12.0,calculator.product(6, 2));
    }

    @Test
    void divisionAssertion1() {
        CalculatorOperations calculator = new CalculatorOperations();
        Assertions.assertEquals(0,calculator.division(4, 0));
    }

    @Test
    void divisionAssertion2() {
        CalculatorOperations calculator = new CalculatorOperations();
        Assertions.assertEquals(3,calculator.division(6, 2));
    }

    @Test
    void powerAssertion1() {
        CalculatorOperations calculator = new CalculatorOperations();
        Assertions.assertEquals(4,calculator.powerOf(2, 2));
    }

    @Test
    void powerAssertion2() {
        CalculatorOperations calculator = new CalculatorOperations();
        Assertions.assertEquals(27,calculator.powerOf(3, 3));
    }
}

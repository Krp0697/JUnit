import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    @DisplayName("Деление на ноль")
    void divideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.devide.apply(1, 0));
        assertEquals("java.lang.ArithmeticException: / by zero", exception.toString());
    }
    // Проверяет выбрасывается ли ошибка при делении на ноль

    @Test
    @DisplayName("Умножение")
    public void multiply() {
        int x = 2, y = 3;
        int expected = 6;
        int z = calculator.mulitply.apply(x, y);
        assertEquals(expected, z);
    }

    @Test
    @DisplayName("Положительное число")
    public void positive() {
        assertTrue(calculator.isPositive.test(5));
    }


    @Test
    @DisplayName("Отключение теста")
    @Disabled("Отключение")
    void disabled() throws Exception {
        throw new Exception("Break");
    }
}


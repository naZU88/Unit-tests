package task1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTestHW1 {
    private Calculator calculator;

    @BeforeAll
    static void beforeAll() {
        // Здесь могут быть глобальные операции инициализации
    }

    @AfterAll
    static void afterAll() {
        // Здесь могут быть глобальные операции завершения
    }

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    @DisplayName("Проверка на получение суммы со скидкой")
    void testSubtract() {
        assertEquals(800, calculator.calculateDiscount(1000, 20));
    }

    @Test
    @DisplayName("Проверка выбрасывания исключения")
    void testAssertThrows() {
        assertThrows(ArithmeticException.class, () -> calculator.calculateDiscount(0, -20));
    }

    @Test
    @DisplayName("Проверка с сообщением")
    void testAssertWithMessage() {
        assertEquals(980, calculator.calculateDiscount(1000, 2), "сумма с учетом скидки " +
                "должна быть равна 980");
    }

    @Test
    @DisplayName("Проверка с использованием лямбда-выражения для сообщения")
    void testAssertWithLambdaMessage() {
        assertEquals(980, calculator.calculateDiscount(1000, 2), () -> "сумма с учетом скидки " +
                "должна быть равна 980");
    }
}

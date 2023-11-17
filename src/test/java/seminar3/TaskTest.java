package seminar3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    Task task;
    @BeforeEach
    void setUp(){
        task = new Task();
    }
    @Test
    @DisplayName("Проверка четной переменной")
    void evenNumber() {
        assertTrue(task.evenOddNumber(6));
    }

    @Test
    @DisplayName("Проверка нечетной переменной")
    void oddNumber() {
        assertFalse(task.evenOddNumber(5));
    }

    @Test
    @DisplayName("Проверка числа в диапазоне от 25 до 100")
    void numberInInterval() {
        assertTrue(task.numberInInterval(25));
    }

    @Test
    @DisplayName("Проверка числа вне диапазона от 25 до 100")
    void numberOutInterval() {
        assertFalse(task.numberInInterval(0));
    }
}
package seminar6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WorkerWithListTest {

    WorkerWithList worker;

    //Перед проведением каждого теста мы обнуляем экземпляр класса, чтобы добиться изолированности
    @BeforeEach
    void setUp() {
        worker = new WorkerWithList();
    }

    // Данный тест проверяет метод определения среднего значения, а именно, правильно ли он вычисляет конечный результат
    @Test
    void averageValue() {
        ArrayList array = new ArrayList(2);
        array.add(1);
        array.add(9);
        assertEquals(5, worker.averageValue(array));

    }

    // Данный тест проверяет метод на выдачу верного кода при условии, что среднее значение первого списка больше
    @Test
    void compareTwoValuesFirstBigger() {
        ArrayList array1 = new ArrayList<Integer>(2);
        array1.add(1);
        array1.add(9);
        ArrayList array2 = new ArrayList(2);
        array2.add(2);
        array2.add(5);
        assertEquals(1, worker.compareTwoValues(array1, array2));

    }

    // Данный тест проверяет метод на выдачу верного кода при условии, что среднее значения спискв равны
    @Test
    void compareTwoValueDraw() {
        ArrayList array1 = new ArrayList(2);
        array1.add(1);
        array1.add(9);
        ArrayList array2 = new ArrayList(2);
        array2.add(5);
        array2.add(5);
        assertEquals(0, worker.compareTwoValues(array1, array2));

    }
}
package Semimar2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest extends Vehicle {

    Car car;
    @BeforeEach
    void setUp() {
        car = new Car();
    }

    @Test
    void testNumberOfWheels() {
        assertEquals(4, car.numWheels);
    }

    @Test
    void testTypeOfTransport(){
        assertEquals(true, car instanceof Vehicle);
    }

    @Test
    void testPark() {
        car.park();
        assertEquals(0, car.speed);
    }

    @Test
    void testTestDrive(){
        car.testDrive();
        assertEquals(60, car.speed);
    }

    @Override
    void testDrive() {

    }

    @Override
    void park() {

    }
}
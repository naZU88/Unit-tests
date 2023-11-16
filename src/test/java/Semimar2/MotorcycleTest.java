package Semimar2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest extends Vehicle {

    Motorcycle motorcycle;
    @BeforeEach
    void setUp() {
        motorcycle = new Motorcycle();
    }

    @Test
    void testNumberOfWheels() {
        assertEquals(2, motorcycle.numWheels);
    }

    @Test
    void testPark() {
        motorcycle.park();
        assertEquals(0, motorcycle.speed);
    }

    @Test
    void testTestDrive(){
        motorcycle.testDrive();
        assertEquals(75, motorcycle.speed);
    }

    @Override
    void testDrive() {

    }

    @Override
    void park() {

    }
}
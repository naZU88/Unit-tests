package Semimar2;

public class Car extends Vehicle {

    public int numWheels = 4;

    public int speed = 0;


    @Override
    public void testDrive(){
        this.speed = 60;
    }

    @Override
    public void park(){
        this.speed = 0;
    }
}

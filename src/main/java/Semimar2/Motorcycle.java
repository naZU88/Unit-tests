package Semimar2;

public class Motorcycle extends Vehicle {

    public int numWheels = 2;

    public int speed = 0;

    @Override
    public void testDrive(){
        this.speed = 75;
    }

    @Override
    public void park(){
        this.speed = 0;
    }


}

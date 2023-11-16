package Semimar2;

public abstract class Vehicle {


    public String Company;
    public String Model;
    public Integer yearRelease;
    public Integer numWheels;
    public Integer speed;


    abstract void testDrive();

    abstract void park();
}

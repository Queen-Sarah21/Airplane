package HelicopterBuilder;

import AirplaneBuilder.Airplane;
import AirplaneBuilder.IAirplaneBuilder;
import HelicopterBuilder.IHelicopterBuilder;

public class HelicopterEngineer {
    private IHelicopterBuilder iHelicopterBuilder;
    public HelicopterEngineer(IHelicopterBuilder iHelicopterBuilder){
        this.iHelicopterBuilder = iHelicopterBuilder;}

    public void constructHelicopter(){
        this.iHelicopterBuilder.setType();
        this.iHelicopterBuilder.setWeight();
        this.iHelicopterBuilder.setFirearms();
    }
    public Helicopter getHelicopter(){
        return this.iHelicopterBuilder.getHelicopter();
    }
}

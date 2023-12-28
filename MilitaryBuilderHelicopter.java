package HelicopterBuilder;

import AirplaneBuilder.Airplane;
import Enum.*;
public class MilitaryBuilderHelicopter implements IHelicopterBuilder {
    Helicopter helicopter;
    public MilitaryBuilderHelicopter(){
        this.helicopter = new Helicopter();
    }
    public void setType(){
        helicopter.setType(Type.MILITARY);
    }
    public void setWeight(){
        helicopter.setWeight(Weight.MIDDLE);
    }
    public void setFirearms(){
        helicopter.setHasFirearms(true);
    }
    public Helicopter getHelicopter(){
        return this.helicopter;
    }
}

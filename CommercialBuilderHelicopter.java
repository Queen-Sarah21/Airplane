package HelicopterBuilder;

import HelicopterBuilder.IHelicopterBuilder;
import Enum.*;
public class CommercialBuilderHelicopter implements IHelicopterBuilder {
    Helicopter helicopter;
    public CommercialBuilderHelicopter(){
        this.helicopter = new Helicopter();
    }
    public void setType(){
        helicopter.setType(Type.COMMERCIAL);
    }
    public void setWeight(){
        helicopter.setWeight(Weight.LIGHT);
    }
    public void setFirearms(){
        helicopter.setHasFirearms(false);
    }
    public Helicopter getHelicopter(){
        return this.helicopter;
    }
}

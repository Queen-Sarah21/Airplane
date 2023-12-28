package AirplaneBuilder;

import AirplaneBuilder.Airplane;
import AirplaneBuilder.IAirplaneBuilder;
import Enum.*;

public class MilitaryAirplaneBuilder implements IAirplaneBuilder {
    Airplane airplane;
    public MilitaryAirplaneBuilder(){
        this.airplane = new Airplane();
    }
    public void setType(){
        airplane.setType(Type.MILITARY);
    }
    public void setWeight(){
        airplane.setWeight(Weight.SUPERHEAVY);
    }
    public void setFirearms(){
        airplane.setHasFirearms(true);
    }
    public Airplane getAirplane(){
        return this.airplane;
    }

}

package AirplaneBuilder;

import AirplaneBuilder.Airplane;
import AirplaneBuilder.IAirplaneBuilder;
import Enum.*;
public class CommercialAirplaneBuilder implements IAirplaneBuilder {
    Airplane airplane;
    public CommercialAirplaneBuilder(){
        this.airplane = new Airplane();
    }
    public void setType(){
        airplane.setType(Type.COMMERCIAL);
    }
    public void setWeight(){
        airplane.setWeight(Weight.HEAVY);
    }
    public void setFirearms(){
        airplane.setHasFirearms(false);
    }
    public Airplane getAirplane(){
        return this.airplane;
    }
}

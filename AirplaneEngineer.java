package AirplaneBuilder;

import AirplaneBuilder.Airplane;
import AirplaneBuilder.IAirplaneBuilder;

public class AirplaneEngineer {
    private IAirplaneBuilder iAirplaneBuilder;
    public AirplaneEngineer(IAirplaneBuilder iAirplaneBuilder){
        this.iAirplaneBuilder = iAirplaneBuilder;}

    public void constructAirplane(){
        this.iAirplaneBuilder.setType();
        this.iAirplaneBuilder.setWeight();
        this.iAirplaneBuilder.setFirearms();
    }
    public Airplane getAirplane(){
        return this.iAirplaneBuilder.getAirplane();
    }

}

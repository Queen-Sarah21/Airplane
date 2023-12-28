package Factory;

import AirplaneBuilder.*;
import HelicopterBuilder.*;
public class CommercialFactory extends AbstractFactory {
    @Override
    public Airplane makeAirplane() {
        IAirplaneBuilder commercialAirplane = new CommercialAirplaneBuilder();
        AirplaneEngineer airplaneEngineer = new AirplaneEngineer(commercialAirplane);
        airplaneEngineer.constructAirplane();

        return airplaneEngineer.getAirplane();
    }

    public Helicopter makeHelicopter(){
        IHelicopterBuilder commercialHelicopter = new CommercialBuilderHelicopter();
        HelicopterEngineer helicopterEngineer = new HelicopterEngineer(commercialHelicopter);
        helicopterEngineer.constructHelicopter();

        return helicopterEngineer.getHelicopter();
    }
}

package Factory;

import AirplaneBuilder.*;
import HelicopterBuilder.*;

public class MilitaryFactory extends AbstractFactory {
    public Airplane makeAirplane() {
        IAirplaneBuilder militaryAirplane = new MilitaryAirplaneBuilder();
        AirplaneEngineer airplaneEngineer = new AirplaneEngineer(militaryAirplane);
        airplaneEngineer.constructAirplane();

        return airplaneEngineer.getAirplane();
    }

    public Helicopter makeHelicopter(){
        IHelicopterBuilder militaryHelicopter = new MilitaryBuilderHelicopter();
        HelicopterEngineer helicopterEngineer = new HelicopterEngineer(militaryHelicopter);
        helicopterEngineer.constructHelicopter();

        return helicopterEngineer.getHelicopter();
    }
}

package Factory;

import AirplaneBuilder.Airplane;
import HelicopterBuilder.Helicopter;
import Enum.*;
public abstract class AbstractFactory {

    static AbstractFactory commercialFactory = new CommercialFactory();
    static AbstractFactory militaryFactory = new MilitaryFactory();
    public static AbstractFactory factory(Type type){
        AbstractFactory factory = null;
        switch(type){
            case COMMERCIAL:
                factory = commercialFactory;
                break;
            case MILITARY:
                factory = militaryFactory;
                break;
        }
        return  factory;
    }
    public abstract Airplane makeAirplane();
    public abstract Helicopter makeHelicopter();
}

package HelicopterBuilder;

import AirplaneBuilder.Airplane;

public interface IHelicopterBuilder {

    void setType();
    void setWeight();
    void setFirearms();
    Helicopter getHelicopter();
}

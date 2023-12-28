package States.AircraftState;

import Aircraft.Aircraft;
import AirplaneBuilder.Airplane;

public class Repaired extends AircraftState{
    private static Repaired instance = new Repaired();
    public static Repaired Instance(){return instance;}
    public void changeAircraftState(Aircraft aircraft){
        aircraft.setCurrentAircraftState(Damaged.Instance());
        System.out.println("Aircraft exploded!");
    }
}

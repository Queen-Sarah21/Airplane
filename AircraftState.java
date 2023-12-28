package States.AircraftState;

import Aircraft.Aircraft;
import AirplaneBuilder.Airplane;

public class AircraftState {
    public void changeAircraftState(Aircraft aircraft){
        aircraft.setCurrentAircraftState(Repaired.Instance());
        System.out.println("Aircraft is completely repaired!");
    }
}

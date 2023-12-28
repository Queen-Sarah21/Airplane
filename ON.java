package States.EngineState;

import Aircraft.Aircraft;
import AirplaneBuilder.Airplane;
import States.AircraftState.Repaired;

public class ON extends EngineState{
    private static ON instance = new ON();
    public static ON Instance(){return instance;}
    public void triggerEngine(Aircraft aircraft) {
        aircraft.setCurrentEngineState(OFF.Instance());
        System.out.println("Engine turned OFF!");
    }
}

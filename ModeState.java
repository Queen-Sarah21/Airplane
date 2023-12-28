package States.StanceState;

import Aircraft.Aircraft;
import AirplaneBuilder.Airplane;
import States.EngineState.ON;

public class ModeState {
    public void changeMode(Aircraft aircraft){
        aircraft.setCurrentModeState(OnAir.Instance());
        System.out.println("Aircraft took off!");
    }
}

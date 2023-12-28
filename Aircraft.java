package Aircraft;

import States.AircraftState.AircraftState;
import States.EngineState.EngineState;
import States.StanceState.ModeState;

public class Aircraft {
    public void setCurrentAircraftState(AircraftState currentAircraftState) {}
    public void setCurrentEngineState(EngineState currentEngineState) {}
    public void setCurrentModeState(ModeState currentModeState) {}
    public void triggerEngine(){}
    public void changeMode(){}
    public void changeGeneralState(){}
    public void increaseAltitude(){}
    public void decreaseAltitude(){}
}

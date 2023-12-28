package States.StanceState;

import Aircraft.Aircraft;
import AirplaneBuilder.Airplane;

public class OnAir extends ModeState {
    private static OnAir instance = new OnAir();
    public static OnAir Instance(){return instance;}
    public void changeMode(Aircraft aircraft){
        aircraft.setCurrentModeState(OnGround.Instance());
        System.out.println("Aircraft landed!");
    }
}

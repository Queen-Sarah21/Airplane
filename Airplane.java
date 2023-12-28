package AirplaneBuilder;
import Aircraft.Aircraft;
import Enum.*;
import States.AircraftState.*;
import States.EngineState.*;
import States.StanceState.*;

public class Airplane extends Aircraft {

    private Type type;
    private Weight weight;
    private Boolean hasFirearms;
    private Altitude altitude;
    AircraftState currentAircraftState;
    EngineState currentEngineState;
    ModeState currentModeState;

    public Airplane(){
        this.currentAircraftState = Repaired.Instance();
        this.currentEngineState = OFF.Instance();
        this.currentModeState = OnGround.Instance();
        this.altitude = Altitude.LOW;
    }
    public void reset(){
        this.currentAircraftState = Repaired.Instance();
        this.currentEngineState = OFF.Instance();
        this.currentModeState = OnGround.Instance();
        this.altitude = Altitude.LOW;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public Boolean getHasFirearms() {
        return hasFirearms;
    }

    public void setHasFirearms(Boolean hasFirearms) {
        this.hasFirearms = hasFirearms;
    }

    public Altitude getAltitude() { return altitude;}

    public void setAltitude(Altitude altitude) {
        this.altitude = altitude;
    }

    public void setCurrentAircraftState(AircraftState currentAircraftState) {this.currentAircraftState = currentAircraftState;}
    public void setCurrentEngineState(EngineState currentEngineState) {
        this.currentEngineState = currentEngineState;
    }
    public void setCurrentModeState(ModeState currentModeState) {
        this.currentModeState = currentModeState;
    }

    public AircraftState getCurrentAircraftState() { return currentAircraftState;}

    public EngineState getCurrentEngineState() { return currentEngineState;}

    public ModeState getCurrentModeState() {return currentModeState;}

    public void triggerEngine(){ //depends on current engine state, if state is active, this method cannot be called
        this.currentEngineState.triggerEngine(this);
    }
    public void changeMode(){//depends on current stance state, if already took off, method cannot be
       this.currentModeState.changeMode(this);
    }
    public void changeGeneralState(){//depends on current aircraft state, if damaged, then repair. if repaired, then damage
        this.currentAircraftState.changeAircraftState(this);
    }
    public void increaseAltitude(){
        switch (this.altitude){
            case LOW -> this.altitude = Altitude.MID;
            case MID -> this.altitude = Altitude.HIGH;
            case HIGH -> {
                this.altitude = Altitude.LOW;
                changeGeneralState();
                System.out.println("You went too high!");
            }
        }
        System.out.println("Altitude increased!");
    }
    public void decreaseAltitude(){
        switch (this.altitude){
            case HIGH -> this.altitude = Altitude.MID;
            case MID -> this.altitude = Altitude.LOW;
            case LOW -> {
                changeGeneralState();
                System.out.println("You went too low!!");
            }
        }
        System.out.println("Altitude decreased!");

    }
    public boolean isDestroyed(){
        return this.currentAircraftState == Damaged.Instance();
    }
    public void airplaneDisplay() {
        System.out.println("================================= Airplane Display =================================");
        System.out.println("Type: " + getType());
        System.out.println("Weight: " + getWeight());
        System.out.println("Has Firearms: " + getHasFirearms());
        System.out.println("Current Aircraft State: " + currentAircraftState.getClass().getSimpleName());
        System.out.println("Current Engine State: " + currentEngineState.getClass().getSimpleName());
        System.out.println("Current Mode State: " + currentModeState.getClass().getSimpleName());
        System.out.println("Current altitude: " + altitude.toString());
    }


}

package States.EngineState;

import AirplaneBuilder.Airplane;

public class OFF extends EngineState{
    private static OFF instance = new OFF();

    public static OFF Instance(){return instance;}
}

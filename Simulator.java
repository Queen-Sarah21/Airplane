import AirplaneBuilder.Airplane;
import Factory.AbstractFactory;
import HelicopterBuilder.Helicopter;
import States.EngineState.ON;
import States.StanceState.OnAir;
import States.StanceState.OnGround;
import Enum.*;

import java.util.Scanner;

public class Simulator {
    public static void run(){
        AbstractFactory factory = AbstractFactory.factory(Type.MILITARY);
        Airplane militaryAirplane = factory.makeAirplane();
        factory = AbstractFactory.factory(Type.MILITARY);
        Helicopter militaryHelicopter = factory.makeHelicopter();
        factory = AbstractFactory.factory(Type.COMMERCIAL);
        Airplane commercialAirplane = factory.makeAirplane();
        factory = AbstractFactory.factory(Type.COMMERCIAL);
        Helicopter commercialHelicopter = factory.makeHelicopter();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=================================");
            System.out.println("Vehicle Control System");
            System.out.println("=================================");
            System.out.println("1. Airplane Operations");
            System.out.println("2. Helicopter Operations");
            System.out.println("3. Exit");
            System.out.print("\nSelect a vehicle: ");

            String vehicleChoice = scanner.nextLine();

            switch (vehicleChoice) {
                case "1":
                    while(true)
                    {
                        if(!airplaneTypeMenu(scanner, commercialAirplane, militaryAirplane)) {
                            break;
                        }
                    }
                    break;
                case "2":
                    while(true)
                    {
                        if(!helicopterTypeMenu(scanner, commercialHelicopter, militaryHelicopter)) {
                            break;
                        }
                    }
                    break;
                case "3":
                    System.out.println("Exiting the program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private static boolean airplaneTypeMenu(Scanner scanner, Airplane commercialAirplane, Airplane militaryAirplane) {
        System.out.println("\n=================================");
        System.out.println("Choose Airplane Type");
        System.out.println("=================================");
        System.out.println("1. Commercial Airplane");
        System.out.println("2. Military Airplane");
        System.out.println("3. Return to Main Menu");
        System.out.print("\nEnter your choice: ");

        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                airplaneMenu(commercialAirplane, scanner, Type.COMMERCIAL.toString());
                break;
            case "2":
                airplaneMenu(militaryAirplane, scanner, Type.MILITARY.toString());
                break;
            case "3":
                return false;
            default:
                System.out.println("Invalid choice, please try again.");
        }
        return true;
    }


    private static boolean helicopterTypeMenu(Scanner scanner, Helicopter commercialHelicopter, Helicopter militaryHelicopter) {
        System.out.println("\n=================================");
        System.out.println("Choose Helicopter Type");
        System.out.println("=================================");
        System.out.println("1. Commercial Helicopter");
        System.out.println("2. Military Helicopter");
        System.out.println("3. Return to Main Menu");
        System.out.print("\nEnter your choice: ");

        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                helicopterMenu(commercialHelicopter, scanner, Type.COMMERCIAL.toString());
                break;
            case "2":
                helicopterMenu(militaryHelicopter, scanner, Type.MILITARY.toString());
                break;
            case "3":
                return false;
            default:
                System.out.println("Invalid choice, please try again.");
        }
        return true;
    }

    private static void airplaneMenu(Airplane airplane, Scanner scanner, String type) {
        airplane.reset();
        while (true) {
            System.out.println("Press enter to continue");
            scanner.nextLine();
            System.out.println("\n=================================");
            System.out.println("Airplane Operations - " + type);
            System.out.println("=================================");
            System.out.println("1. Trigger Engine");
            System.out.println("2. Take off / Land");
            System.out.println("3. Increase Altitude");
            System.out.println("4. Decrease Altitude");
            System.out.println("5. Display information");
            System.out.println("6. Return to Airplane Type Selection");
            System.out.print("\nEnter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    if(airplane.getCurrentModeState() != OnGround.Instance()){
                        System.out.println("You cannot turn off the engine while flying!");
                    }
                    else airplane.triggerEngine();
                    break;
                case "2":
                    if(airplane.getCurrentEngineState() == ON.Instance()){
                        if(airplane.getCurrentModeState() == OnGround.Instance())
                            airplane.changeMode();
                        else if(airplane.getCurrentModeState() == OnAir.Instance() &&
                                airplane.getAltitude() != Altitude.LOW){
                            System.out.println("You need to be on low altitude to land!");
                        }
                        else airplane.changeMode();
                    }
                    else System.out.println("You need to turn the airplane on to be able to function!");
                    break;
                case "3":
                    if(airplane.getCurrentModeState() != OnGround.Instance()){
                        if(airplane.getCurrentEngineState() == ON.Instance()){
                            airplane.increaseAltitude();
                            System.out.println("Current altitude: " + airplane.getAltitude().toString());
                        }
                        else System.out.println("You need to turn the airplane on to be able to function!");
                    }
                    else System.out.println("You can't change altitude while on the ground! Take off first");
                    break;
                case "4":
                    if(airplane.getCurrentModeState() != OnGround.Instance()){
                        if(airplane.getCurrentEngineState() == ON.Instance()){
                            airplane.decreaseAltitude();
                            System.out.println("Current altitude: " + airplane.getAltitude().toString());
                        }
                        else System.out.println("You need to turn the airplane on to be able to function!");
                    }
                    else System.out.println("You can't change altitude while on the ground! Take off first");
                    break;
                case "5":
                    airplane.airplaneDisplay();
                    break;
                case "6":
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
            if(airplane.isDestroyed()){
                System.out.println("Your plane was destroyed! Press enter to start again!");
                scanner.nextLine();
                return;
            }
        }
    }

    private static void helicopterMenu(Helicopter helicopter, Scanner scanner, String type) {
        helicopter.reset();
        while (true) {
            System.out.println("Press enter to continue");
            scanner.nextLine();
            System.out.println("\n=================================");
            System.out.println("Helicopter Operations - " + type);
            System.out.println("=================================");
            System.out.println("1. Trigger Engine");
            System.out.println("2. Take off / Land");
            System.out.println("3. Increase Altitude");
            System.out.println("4. Decrease Altitude");
            System.out.println("5. Display information");
            System.out.println("6. Return to Helicopter Type Selection");
            System.out.print("\nEnter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    if(helicopter.getCurrentModeState() != OnGround.Instance()){
                        System.out.println("You cannot turn off the engine while flying!");
                    }
                    else helicopter.triggerEngine();
                    break;
                case "2":
                    if(helicopter.getCurrentEngineState() == ON.Instance()){
                        if(helicopter.getCurrentModeState() == OnGround.Instance())
                            helicopter.changeMode();
                        else if(helicopter.getCurrentModeState() == OnAir.Instance() &&
                                helicopter.getAltitude() != Altitude.LOW){
                            System.out.println("You need to be on low altitude to land!");
                        }
                        else helicopter.changeMode();
                    }
                    else System.out.println("You need to turn the Helicopter on to be able to function!");
                    break;
                case "3":
                    if(helicopter.getCurrentModeState() != OnGround.Instance()){
                        if(helicopter.getCurrentEngineState() == ON.Instance()){
                            helicopter.increaseAltitude();
                            System.out.println("Current altitude: " + helicopter.getAltitude().toString());
                        }
                        else System.out.println("You need to turn the Helicopter on to be able to function!");
                    }
                    else System.out.println("You can't change altitude while on the ground! Take off first");
                    break;
                case "4":
                    if(helicopter.getCurrentModeState() != OnGround.Instance()){
                        if(helicopter.getCurrentEngineState() == ON.Instance()){
                            helicopter.decreaseAltitude();
                            System.out.println("Current altitude: " + helicopter.getAltitude().toString());
                        }
                        else System.out.println("You need to turn the Helicopter on to be able to function!");
                    }
                    else System.out.println("You can't change altitude while on the ground! Take off first");
                    break;
                case "5":
                    helicopter.helicopterDisplay();
                    break;
                case "6":
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
            if(helicopter.isDestroyed()){
                System.out.println("Your Helicopter was destroyed! Press enter to start again!");
                scanner.nextLine();
                return;
            }
        }
    }
}

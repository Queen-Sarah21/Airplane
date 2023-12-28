Airplane Simulation Readme
Overview
This project is a simple airplane and helicopter simulation implemented in Java. It provides a basic control system for performing operations on airplanes and helicopters, such as triggering the engine, taking off or landing, changing altitude, and displaying information. The simulation includes different types of vehicles, such as commercial and military airplanes and helicopters.
Project Structure
The project is organized into several packages, each serving a specific purpose:
Aircraft: Contains the base class Aircraft and its states, including AircraftState, EngineState, and ModeState.
AirplaneBuilder: Defines the builders for creating airplanes, including IAirplaneBuilder, CommercialAirplaneBuilder, and MilitaryAirplaneBuilder.
HelicopterBuilder: Defines the builders for creating helicopters, including IHelicopterBuilder, CommercialBuilderHelicopter, and MilitaryBuilderHelicopter.
Enum: Contains enumerations for Altitude, Type, and Weight.
Factory: Implements the abstract factory pattern with AbstractFactory, CommercialFactory, and MilitaryFactory.
States: Contains different states for airplanes, such as Repaired and Damaged, as well as engine and mode states.
Simulator: The main class that runs the simulation, providing a console-based user interface for interacting with airplanes and helicopters.
How to Run
To run the simulation, execute the Simulator.run() method from the Main class. The program will prompt the user to choose between airplane and helicopter operations, and then further specify the type of vehicle (commercial or military). Once selected, the user can perform various operations on the chosen vehicle.
Vehicle Operations
Airplane Operations
Trigger Engine: Turn the engine on or off depending on the current state.
Take Off / Land: Change the mode of the airplane between on-ground and on-air states.
Increase Altitude: Increase the altitude of the airplane.
Decrease Altitude: Decrease the altitude of the airplane.
Display Information: View information about the current state of the airplane.
Return to Airplane Type Selection: Return to the main menu to choose a different type of airplane.
Helicopter Operations
Trigger Engine: Turn the engine on or off depending on the current state.
Take Off / Land: Change the mode of the helicopter between on-ground and on-air states.
Increase Altitude: Increase the altitude of the helicopter.
Decrease Altitude: Decrease the altitude of the helicopter.
Display Information: View information about the current state of the helicopter.
Return to Helicopter Type Selection: Return to the main menu to choose a different type of helicopter.
Vehicle Types
Commercial Airplane: A heavy airplane without firearms.
Military Airplane: A super-heavy airplane with firearms.
Commercial Helicopter: A light helicopter without firearms.
Military Helicopter: A middle-weight helicopter with firearms.
State Management
The simulation includes different states for vehicles, engines, and modes. These states are managed through the use of state design patterns, providing a flexible and extensible architecture.

Design Patterns
Abstract Factory: Used to create families of related or dependent objects without specifying their concrete classes. Implemented in the AbstractFactory, CommercialFactory, and MilitaryFactory classes.
Builder: Used to construct a complex object step by step. Implemented in the IAirplaneBuilder, CommercialAirplaneBuilder, MilitaryAirplaneBuilder, IHelicopterBuilder, CommercialBuilderHelicopter, and MilitaryBuilderHelicopter classes.
State Design Pattern: The simulation employs the State Design Pattern to manage the different states of the airplanes and helicopters. The key classes involved in this pattern are:
AircraftState: An abstract class defining the interface for different states of an aircraft. It has a method changeAircraftState that can transition the aircraft to a new state.
Damaged: A concrete class extending AircraftState representing the damaged state of an aircraft. It is a singleton class with a method Instance() to retrieve the instance.
Repaired: A concrete class extending AircraftState representing the repaired state of an aircraft. It is also a singleton class with a method Instance().
EngineState: An abstract class defining the interface for different states of an engine. It has a method triggerEngine that can change the engine state.
OFF: A concrete class extending EngineState representing the engine in the OFF state. It is a singleton class with a method Instance().
ON: A concrete class extending EngineState representing the engine in the ON state. It is also a singleton class with a method Instance().
ModeState: An abstract class defining the interface for different states of the mode (e.g., on-ground or on-air). It has a method changeMode to transition the mode state.
OnAir: A concrete class extending ModeState representing the on-air mode. It is a singleton class with a method Instance().
OnGround: A concrete class extending ModeState representing the on-ground mode. It is also a singleton class with a method Instance().

Dependencies
The project does not have any external dependencies beyond the standard Java libraries.

Contributors
This simulation project is created and maintained by Queen Sarah and team mates. Feel free to contribute, report issues, or suggest improvements by submitting a pull request.

License
This project is licensed under the MIT License. Feel free to use, modify, or distribute the code for personal or commercial purposes.


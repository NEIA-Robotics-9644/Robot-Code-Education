/*
    Represents the overall robot — connects high-level actions to subsystems.

    TODOS:
      1. Add a private RobotContainer field
      2. Add a constructor for Robot that:
           - prints when the Robot object is created
      3. Add an "init" function that:
           - creates a new RobotContainer
           - prints that initialization has started
      4. (Optional extension) Add a getter for the RobotContainer
         if other classes need access to subsystems
*/


public class Robot {

     private final RobotContainer robotContainer;

    // TODO 1: Add a RobotContainer field
      public RobotContainer getfucntion(){
          return RobotContainer
     }

    // TODO 2: Add a constructor for Robot
    public Robot() {

     Robot robot = new robot();
     System.out.pritnln("the Robot object is created ");

    }

    // TODO 3: Add an init() function that constructs the RobotContainer
    public void init() {
     RobotContainer robotContainer = new RobotContainer();
     System.out.pritnln("The initialization has started");
     robotContainer.getfucntion(); 

    }



    }

    // TODO 4: Add a getter for RobotContainer


import java.util.Scanner;
// Main.java
// Entry point for your simulated robot program.
//
// TODOs:
//  1. Create a Robot object and call its init() method. 
//  2. Use a Scanner to read user input from the console.
//  3. In a loop, let the user type "up", "down", "stop", or "exit".
//  4. Call the appropriate robot methods based on the command.
//
// 🔍 Java references:
//   - java.util.Scanner (for reading user input)
//   - switch statements (control flow)

public class Main {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            String userinput = inputScanner.nextLine(); 

            switch(userinput){
                case "lift arm" -> System.out.println("");
                case "lower arm" -> System.out.println("");
                case "stop arm" -> System.out.println("");
                case "Shutdown" -> System.out.println("");

            }



        }
        inputScanner.close();
        Robot robot = new Robot();
        robot.init();
        



        // TODO: create and initialize the robot

        // TODO: set up Scanner (look up this object type) and command loop
    }
}

package elevator_problem;

import java.util.Scanner;

public class Elevator_challange_main {
// while(true) {
	  public static void main(String[] args) throws InterruptedException {
		 while(true) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Choose mode:");
	        System.out.println("1. Automatic Mode (Rush hour simulation)");
	        System.out.println("2. Manual Mode (User input)");

	        int mode = scanner.nextInt();

	        switch (mode) {
	            case 1:
	                automaticElevator();
	                break;
	            case 2:
	                manualElevator();
	                break;
	            default:
	                System.out.println("Invalid mode choice.");
	        }
	      //  scanner.close();
		 }
	    }

	    static void automaticElevator() throws InterruptedException {
	        Elevator elevator = new Elevator();
	        elevator.lunchtimeElevatorRush();
	        elevator.start();
	    }

	    static void manualElevator() throws InterruptedException {
	        Elevator elevator = new Elevator();
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a starting floor 0 - 10");
	        int start = sc.nextInt();
	        System.out.println("Enter a destination floor 0 - 10");
	        int end = sc.nextInt();

	        elevator.callElevator(start, end);
	        elevator.start();
	    }
 
 
}

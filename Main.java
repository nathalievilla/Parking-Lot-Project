/*
*Nathalie Villa & Jeenal Shah
*Period 4
*Independent Study Project
*/


import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //initializes the parking array 
    int[][] parking = { { 1, 0, 0, 0, 0, 1, 0, 1 }, 
                        { 0, 1, 1, 1, 0, 1, 0, 1 }, 
                        { 0, 0, 1, 0, 0, 0, 1, 0 },
                        { 0, 1, 0, 0, 0, 0, 1, 1 }};

    Scanner iU = new Scanner(System.in);

    System.out.println(" Enter 1 for Car or Motorbike \n Enter 2 for Bus \n Enter 3 for Truck");
    int input = iU.nextInt();
    //loops through the for loop and prints the current parking lot
    System.out.println("\nCurrent Parking Lot: ");
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 8; j++) {
        System.out.print(parking[i][j] + " ");
      }
      System.out.println();
    }
    
  System.out.println("\nWhat row do you want to park in? Enter a number between 1 to 4.");
    int input2 = iU.nextInt();
//instantiate object of ParkingLot class
    ParkingLot car = new ParkingLot(parking, input, input2);

    System.out.println(car.park());
    System.out.println("New Parking Lot: ");

    //loops through the for loop and prints the new parking lot
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 8; j++) {
        System.out.print(parking[i][j] + " ");
      }
      System.out.println();
    }

  }
}
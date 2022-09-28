import java.util.Scanner;

class ParkingLot {
//declared instance variables needed
  private int[][] lot;
  private final int carMBike = 1;
  private final int bus = 2;
  private final int truck = 3;
  private int type;
  private int row;
  private int spotNum;
//checks for vacant spots for each vehicle
  private boolean check = false;
//constructor with parameters
  public ParkingLot(int[][] myLot, int myType, int myRow) {
    lot = myLot;
    type = myType;
    row = myRow;
  }
//compares the type of car input by the user to the values assigned in program
  public String park() {
    if (type == truck) {
      addTruck();

    } else if (type == bus) {
      addBus();

    } else if (type == carMBike) {
      addCarMBike();

    } else {
      check = false;
    }
//checks if there is a vacant spot in the row and prints out the spot otherwise tells the user to pick another one 
    if (check == false) {
      return "\nThis row is full. Please pick another row.";
    } else {
      return "\nYou can park at row " + row + " spot " + spotNum;
    }
  }
//adds a truck to the parking lot array
  public void addTruck() {
    //runs through the array starting at the user's input row
    for (int i = row - 1; i < row; i++) {
      for (int j = 0; j < lot[i].length; j++) {
        //checks for vacant spot for a truck type
        if (lot[i][j] == 0 && lot[i][j + 1] == 0 && lot[i][j + 2] == 0) {
          check = true;
          //returns the actual spot**(taking index into consideration)**
          spotNum = j + 1;
          //sets each index to 1 and reserves a spot for a truck
          for (int k = j; k <= j + 2; k++) {
            lot[i][k] = 1;
          }
          break;
        } else {
          check = false;
        }
      }
    }
  }
//adds a bus to the parking lot array
  public void addBus() {
    //runs through the array starting at the given row
    for (int i = row - 1; i < row; i++) {
      for (int j = 0; j < lot[i].length; j++) {
        //******only did +1 bc only takes up 2 spaces******
        //checks for vacant spot for a bus type
        if (lot[i][j] == 0 && lot[i][j + 1] == 0) {
          check = true;
          spotNum = j + 1;
          //sets the corresponding index to 1 to reserve spots 
          for (int k = j; k <= j + 1; k++) {
            lot[i][k] = 1;
          }
          break;
        } else {
          check = false;
          break;
        }
      }
    }
  }
//adds a car/motorbike to the parking lot array
  public void addCarMBike() {
    for (int i = row - 1; i < row; i++) {
      for (int j = 0; j < lot[i].length - 1; j++) {
        //checks for vacant spot for a car or motorbike type
        if (lot[i][j] == 0) {
          check = true;
          spotNum = j + 1;
          //sets index to 1 and reserves a spot for the vehicle in the parking lot
          lot[i][j] = 1;
          break;
        } else {
          check = false;
        }
      }
    }
  }

}

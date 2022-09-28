# Parking-Lot-Project
AP CSA Senior Project
Nathalie Villa 
AP Computer Science A

Our program, “Parking Spot Finder” can solve everyday problems that many people face. The program will be helpful as they will not have to spend time searching for a parking spot for their vehicles to be parked, but rather make their trips to the stores easier and make their stopovers faster.

First, we created several private variables: a 2D array lot of type int, an int variable type, and an int variable row. We also made several int variables using the keyword “final”: truck, bus, and carMBike. Each vehicle has a set number of spots they take up, depending on how large it is. We decided that the largest vehicles, trucks, take up three spots, followed by buses, taking up two spots, while cars and motorbikes take up only one spot.

Next, we created a ParkingLot() constructor with the parameters int[][] myLot, int myType, and int myRow. The constructor sets the instance variables lot, type, and row to these parameters.

To find out the available spots, we first need to prompt the user to enter the type of vehicle they have. We do this by using the scanner class and scanner object to get the user’s input. We import the Scanner class to create a Scanner object called iU, allowing the user to enter their type of vehicle. By initializing an object, we can use any method in the Scanner class. Our program used the nextInt() method to read the String input by the user and converted it to an int type. We used the variable input to store the integers, which were later accessed by the methods. In addition to the type of vehicle, we also needed to know which row of the parking lot they wanted to park in. We did the same thing and used the nextInt() method and stored the value in the variable input2 to be accessed later in the program.

After storing the values in the variables we started creating the methods to determine where each vehicle can park. We started off by creating the park() method in which we used if statements to compare the user's input to each vehicle type; each vehicle corresponded to the number of spots it took up. Once the program determines what vehicle the user has, it calls the appropriate method to add the vehicle. If the vehicle is a truck, it would call addTruck(), addBus() for a bus, and addCarMBike() for a car or motorbike. Otherwise, the boolean check would be set to false. After calling the appropriate method, we created another if statement to check the value of check. If false, the user needs to pick a different row to park in as the row they picked is full. While if true, the program prints out the row and spots the user can park in.

The addTruck() method uses a nested for loop to access every index in a given row. We used the row provided by the user to determine the limit for the outer loop and made the inner loop go through every index in that row, incrementing it by one each time. Before adding a truck, we had to check if each spot is empty or not by comparing each index to 0 or 1, where 0 is open, and 1 is occupied. We had instantiated an int variable called spotNum which would contain the spot number where the user can park their vehicle. Then we had also created a boolean variable called check, which changed from false to true when a vacant spot had been found. Then the if statement was used to check for 3 consecutive vacant spots (3 consecutive 0’s) in the row. If they were in a row, then the loop proceeded to set each index to 1 for the spots the truck would be parked in with the help of a for-loop. A similar approach was used for the addBus() and addCarMBike() as they had to follow the same procedure for setting the values in the array to 1 as the parking spots got taken.

 

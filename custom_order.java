// Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.Scanner;  // Needed for the Scanner class to read input

public class custom_order {

    // STEP 1 PRINTING HELLO WORLD TO CONSOLE
    public static void main(String[] args) {
        
      // System.out.println("Hello World!"); // print Hello World to console
        
    // TEST CODE
    
    // STEP 2 CREATE A SCANNER OBEJCT, DECLARE VARAIBLES, & PRINT STATEMENTS
	  
		Scanner keyboard = new Scanner (System.in);
		
		String firstName;// User's firstname
		String itemOrder; //item ordered 
		String frostingType; //frosting ordered
		String fillingType; //Filling Ordered 
		String toppings; //Toppings Ordered 
		String input; //User Input
		
		double cost = 15.00; //Cost of cake and cupcakes
		final double TAX_RATE = .08; //Sales tax rate
		double tax; //Amount of tax
	 
    // Introduce shop and prompt user to input first name
		System.out.println("Welcome to Java's Cake and Cupcake Shop");
		System.out.println("We make custom cakes with our secret cake batter!");
      

	  
	  
    // TEST CODE
    
    // STEP 3 INPUT YOUR NAME AND PREPARE TO VIEW MENU
		System.out.println("What is your first name? ");
		firstName = keyboard.nextLine();
		
		System.out.println(firstName +", please see our Menu below: ");
		System.out.println("\n");//Skips a line
   
	  
      
    // TEST CODE     
    
    // STEP 4 DISPLAY MENU
	
		System.out.println("_________________________________________________");
		System.out.println("      MENU         QUANTITY       BASE COST      ");
		System.out.println("_________________________________________________");
		System.out.println("      CAKE             1              $15        ");
		System.out.println("   Set Of Cupcakes     6              $15        ");
		System.out.println("_ _ _ _ _ _ _ _ _ _ __ _ _ _ _ _ _ _ _ _ _ _ _ _ _"); //10.109.237.37
		System.out.println("Frostings (Vanilla, Chocolate, Strawberry, Coco)");
		System.out.println("FIllings (Mocha, Mint, Lemon, Caramel, Vanilla");
		System.out.println("Toppings (Sprinkles, Cinnamon, Cocoa, Nuts)");
		System.out.println("___________________________________________________");

	
      

    // TEST CODE     
    
    // STEP 5 PROMPT USER TO ORDER

		System.out.println("Do you want CUPCAKES or a CAKE");
		itemOrder = keyboard.nextLine();
		
	  
	  
	  
      
    // TEST CODE
      
    // STEP 6 PROMPT USER TO CHOOSE FROSTING
		System.out.println("What type of FROSTING do you want? ");
		System.out.println("Vanilla, Chocolate, Strawberry of Coco ");
		frostingType = keyboard.nextLine();
		

   
	 
	 
	 
      
    //TEST CODE
      
    // STEP 7 PROMPT USER TO CHOOSE FILLING
	
		System.out.println("What type of filling do you want? ");
		System.out.println("Moncha, Mint, Lemon, Caramel, Vanilla ");
		fillingType = keyboard.nextLine();


	  
	  
      
    // TEST CODE
      
    // STEP 8 PROMPT USER TO CHOOSE TOPPINGS
		System.out.println("What Type of Toppings do you want? ");
		System.out.println("Sprinkles, Cinnamon, Coco, Nuts");
		toppings = keyboard.nextLine();
		


	
      
      
    // TEST CODE
      
    // STEP 9 DISPLAY ORDER CONFIRMATION
		System.out.println();
		System.out.println(firstName + " , your order is as follows: ");
		System.out.println("___________________________________________________");
		System.out.println("Item Ordered: " + itemOrder);
		System.out.println("Frosting: " + frostingType);
		System.out.println("Filling: "  + fillingType);
		System.out.println("Toppings: " + toppings);
		System.out.println("___________________________________________________");
		


      
	  
	  
	  
    
    // TEST CODE
      
    // STEP 10 DISPLAY COST AND SALES TAX
		System.out.printf("The cost of your order is: $%.2f\n", cost);
		tax = cost * TAX_RATE;
		System.out.printf("The tax is: $%.2f\n", tax);
		System.out.printf("The totaldue is: $%.2f\n", tax + cost);
  
    }   
}
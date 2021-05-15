import java.util.InputMismatchException;

/**
 * A test program for System class
 * 
 * @author	Student
 * @version 1.0 (31 May 2020)
 */

public class SystemTest {
	
	//Main method
	public static void main(String[] args) {
		
		boolean flag;// This variable is need for procedure that validates user's input
		
		//Extra lines for "decoration"
		java.lang.System.out.println();
		java.lang.System.out.println(">>>> Testing All Methods <<<<<");
		java.lang.System.out.println();
		
		//Creates an object with initial parameters Make, Model and Speed
		java.lang.System.out.println(" - Testing constructor ... ");
		System aa = new System("Intel", "Corei7", 3600);
		java.lang.System.out.println("- A new object \"aa\" is created with the following parameters: ");
		java.lang.System.out.println(aa.displayDetails());
		java.lang.System.out.println();

		//Sets additional  parameters Memory size, Hard Disk size and Purchase cost
		java.lang.System.out.println("- Settings the Memory size, Hard Disk size and Purchase Cost parameters: ");
		aa.setMemory(16000);			//Set RAM value to the object aa
		aa.setHardDisk(6000);			//Sets HD value to the object aa
		aa.setPurchaseCost(10000);		//Sets Purchase Cost value to the object aa
		java.lang.System.out.println(".......Done!");
		java.lang.System.out.println("- Object \"aa\" has been modified as follows: ");
		java.lang.System.out.println(aa.displayDetails()); //Calls method the displays all the parameters as a String
		java.lang.System.out.println();
		
		//Tests all the rest available methods one by one
		java.lang.System.out.println(" - Testing other methods: ");		
		java.lang.System.out.println("Get Make: " + aa.getMake());
		java.lang.System.out.println("Get Model: " + aa.getModel());
		java.lang.System.out.println("Get Processor Speed: " + aa.getProcessorSpeed());
		java.lang.System.out.println("Get Memory Size: " + aa.getMemorySize());		
		java.lang.System.out.println("Get HArd Disk Size: " + aa.getHardDiskSize());
		java.lang.System.out.println("Get Purchase Cost: " + aa.getPurchaseCost());		
		java.lang.System.out.println("Display All Details: " + aa.displayDetails());	
		java.lang.System.out.println("Check HD Status: " + aa.checkHDStatus());		
		java.lang.System.out.println("Check Memory Size: " + aa.goodMemorySize());		
		java.lang.System.out.println("Diagnose System: " + aa.diagnoseSystem());
		java.lang.System.out.println();
		
		//Changes existing parameters for an additional test
		java.lang.System.out.println("- Changing the existing  parameters for the object \"aa\": RAM = 32000, HD = 12.000 and Cost = 15.000 ");
		aa.setMemory(32000);			//Set a new RAM value to the object aa
		aa.setHardDisk(12000);			//Sets a new HD value to the object aa
		aa.setPurchaseCost(15000);		//Sets a new Purchase Cost value to the object aa
		java.lang.System.out.println(".......Done!");
		java.lang.System.out.println("- Object \"aa\" has been modified as follows: ");
		
		//Display all data for an object
		java.lang.System.out.println("----- 1. System Details -----");
		java.lang.System.out.println(aa.displayDetails()); // Prints System Details
		
		//Run diagnostic system test
		java.lang.System.out.println();
		java.lang.System.out.println("----- 2. System Status (Diagnose) -----");
		java.lang.System.out.println(aa.diagnoseSystem()); // Calls the Diagnose method

		//Changes existing parameters for an additional test
		java.lang.System.out.println("- Changing the existing parameters for the object \"aa\": RAM = 127, HD = 500");
		aa.setMemory(127);				//Set a new RAM value to the object aa
		aa.setHardDisk(500);			//Sets a new HD value to the object aa
		java.lang.System.out.println(".......Done!");
		java.lang.System.out.println("- Object \"aa\" has been modified as follows: ");
		java.lang.System.out.println("----- Modified System Details -----");
		java.lang.System.out.println(aa.displayDetails()); // Prints System Details
		java.lang.System.out.println();
		java.lang.System.out.println("----- Modified System Status (Diagnose) -----");
		java.lang.System.out.println(aa.diagnoseSystem()); // Calls the Diagnose method
		java.lang.System.out.println();
		
		//Changes existing parameters for an additional test
		java.lang.System.out.println("- Changing the existing parameters for the object \"aa\": RAM = 128, HD = 500");
		aa.setMemory(128);				//Set a new RAM value to the object aa
		aa.setHardDisk(500);			//Sets a new HD value to the object aa
		java.lang.System.out.println(".......Done!");
		java.lang.System.out.println("- Object \"aa\" has been modified as follows: ");
		java.lang.System.out.println("----- Modified System Details -----");
		java.lang.System.out.println(aa.displayDetails()); // Prints System Details
		java.lang.System.out.println();
		java.lang.System.out.println("----- Modified System Status (Diagnose) -----");
		java.lang.System.out.println(aa.diagnoseSystem()); // Calls the Diagnose method
		java.lang.System.out.println();
		
		//Changes existing parameters for an additional test
		java.lang.System.out.println("- Changing the existing parameters for the object \"aa\": RAM = 127, HD = 2001");
		aa.setMemory(127);				//Set a new RAM value to the object aa
		aa.setHardDisk(2001);			//Sets a new HD value to the object aa
		java.lang.System.out.println(".......Done!");
		java.lang.System.out.println("- Object \"aa\" has been modified as follows: ");
		java.lang.System.out.println("----- Modified System Details -----");
		java.lang.System.out.println(aa.displayDetails()); // Prints System Details
		java.lang.System.out.println();
		java.lang.System.out.println("----- Modified System Status (Diagnose) -----");
		java.lang.System.out.println(aa.diagnoseSystem()); // Calls the Diagnose method
		java.lang.System.out.println();
		
		//Changes existing parameters for an additional test
		java.lang.System.out.println("- Changing the existing parameters for the object \"aa\": RAM = 128, HD = 2001");
		aa.setMemory(128);				//Set a new RAM value to the object aa
		aa.setHardDisk(2001);			//Sets a new HD value to the object aa
		java.lang.System.out.println(".......Done!");
		java.lang.System.out.println("- Object \"aa\" has been modified as follows: ");
		java.lang.System.out.println("----- Modified System Details -----");
		java.lang.System.out.println(aa.displayDetails()); // Prints System Details
		java.lang.System.out.println();
		java.lang.System.out.println("----- Modified System Status (Diagnose) -----");
		java.lang.System.out.println(aa.diagnoseSystem()); // Calls the Diagnose method
		java.lang.System.out.println();
		
		//Changes existing parameters for an additional test
		java.lang.System.out.println("- Changing the existing parameters for the object \"aa\": RAM = 127, HD = 1999");
		aa.setMemory(127);				//Set a new RAM value to the object aa
		aa.setHardDisk(1999);			//Sets a new HD value to the object aa
		java.lang.System.out.println(".......Done!");
		java.lang.System.out.println("- Object \"aa\" has been modified as follows: ");
		java.lang.System.out.println("----- Modified System Details -----");
		java.lang.System.out.println(aa.displayDetails()); // Prints System Details
		java.lang.System.out.println();
		java.lang.System.out.println("----- Modified System Status (Diagnose) -----");
		java.lang.System.out.println(aa.diagnoseSystem()); // Calls the Diagnose method
		java.lang.System.out.println();
		
		//Runs "System Properties" method and displays system information 
		java.lang.System.out.println(">>>> Testing the displaySystemProperties method (Part B) <<<<<");
		java.lang.System.out.println("----- System Properties -----");
		java.lang.System.out.println(aa.displaySystemProperties());
		java.lang.System.out.println();
		java.lang.System.out.println();
		
		
		//###### TEXTUAL MENU PROGRAM TEST #########
		//Extra lines for decoration
		java.lang.System.out.println();
		java.lang.System.out.println();
		java.lang.System.out.println("###### TEXTUAL MENU ######");
		
		//Calls the Menu method and validate the users input for menu options
		do {
			flag = false;
			try {
				aa.displayMenu();  //Calls the method (Menu Program) that displays the menu and prompts users for input 
				}
			catch (InputMismatchException e) //Handles a java error
				{
				java.lang.System.out.println("Input is not valid"); // Print a message for users if a error is caught
				flag = true;
				}
			}
		while (flag == true);
			
	}
	
}
import java.util.Scanner;

/**
 * A program that tests and gets/sets system parameters
 * 
 * @author	Student
 * @version 1.0 (31 May 2020)
 */

public class System {
	
	//Declaring variables
	private String make;
	private String model;
	private int speed;
	private int memorySize;
	private double hardDiskSize;
	private double purchaseCost;
	
	//Constructor for new objects with variables initialized
	public System(String makeIn, String modelIn, int speedIn)
	{
		make = makeIn;
		model = modelIn;
		speed = speedIn;
	}
	
	//Method, sets memory size in Integer format
	public void setMemory(int memorySizeIn)
	{
		memorySize = memorySizeIn;
	}

	//Method, sets hard disk size in Double format
	public void setHardDisk(double hardDiskSizeIn)
	{
		hardDiskSize = hardDiskSizeIn;
	}
	
	//Method, sets purchase cost in $, Double format
	public void setPurchaseCost(double purchaseCostIn)
	{
		purchaseCost = purchaseCostIn;
	}
	
	//Method gets and returns value of the variable MAKE
	public String getMake()
	{
		return make;
	}
	
	//Method gets and returns value of the variable model
	public String getModel()
	{
		return model;
	}
	
	//Method gets and returns value of the variable speed
	public int getProcessorSpeed()
	{
		return speed;
	}
	
	//Method gets and returns value of the variable memorySize
	public int getMemorySize()
	{
		return memorySize;
	}
	
	//Method gets and returns value of the variable hardDiskSize
	public double getHardDiskSize()
	{
		return hardDiskSize;
	}
	
	//Gets "Purchase Cost" parameter for an object and return its value
	public double getPurchaseCost()
	{
		return purchaseCost;
	}
	
	
	//Method displays all the details of the system (calls all methods that return values) as a String.
	public String displayDetails()
	{
		return ("Make: " + getMake() + "\n" + "Model: " + getModel() + "\n" + "Processor speed (Mhz): " + getProcessorSpeed() + "\n" + "Memory size (MB): " + getMemorySize()
				+ "\n" + "Hard disk size (GB): " + getHardDiskSize() + "\n" + "Purchase cost ($): " + getPurchaseCost());
	}

	//Method checks the size of the hard drive and returns True/False, The output based on the "If" condition.
	public String checkHDStatus()
	{
		if (hardDiskSize < 2000) // if the size of HD is less then 2000 GB
		{
			return "low";
		}
		else return "OK";
	}
	
	//Method checks the size of the RAM and returns True/False, The output based on the "If" condition.
	public boolean goodMemorySize()
	{
		if (memorySize < 128) // if the size of RAM is less then 128 MB
		{
			return false;
		}
		else return true;
	}
	
	//Method runs two "check" methods above (checkHDStatus and goodMemorySize) and returns output as a String
	public String diagnoseSystem()
	{
		return ("Hard disk size: " + checkHDStatus() + "\n" + "Memory size OK: " + goodMemorySize());
		
	}
	
	//Method displays System properties as a String. The method uses java System class top get system information
	public String displaySystemProperties()
	{
		String osName = java.lang.System.getProperty("os.name"); // additional variable that get Operating System name using getProperty method of the Java System class
		String osNameOut;// variable that stores a String message
		
		//Condition that compares OS names and based on the comparison set value for the 
		if (osName.equals("Windows 10")) 
		{
			osNameOut = "Life is Good! OS is Windows 10"; //A positive message 
		}
		else if (osName.contentEquals("Linux"))
		{
			osNameOut = "We are lost, OS is Linux"; //A negative message
		}
		else 
			osNameOut = "It is OK, OS is Unknown"; //A neutral message
		
		//extra space 
		java.lang.System.out.println(); //generates extra line for visual perception
		
		//Returns a string that contains the output of all the getProperty queries
		return ("Message: " + osNameOut + "\n" +   //An output message based on the conditions
				"OS Architecture: " + java.lang.System.getProperty("os.arch") + "\n" +   //OS architecture query
				"OS Name: " + osName + "\n" +  											 //OS name variable
				"OS Version: " + java.lang.System.getProperty("os.version") + "\n" +     //OS version query
				"User Account Name: " + java.lang.System.getProperty("user.name") + "\n" +  //User name query
				"Java Version: " + java.lang.System.getProperty("java.version"));			//Java version query
		
	}
	
	//Additional method checks if input (String, Double or Integer) is convertible to Double
	public boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;   //returns true if it is convertible without errors              
        	}
        catch(NumberFormatException e) { 
            return false;  //if there is an error returns false
        }

    } 
	
	//Additional method checks if input (String, Double or Integer) is convertible to Integer
	public boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;   //return true if it is convertible without errors 
        }
        catch(NumberFormatException e) {  
            return false;  //if there is an error returns false
        } 

    }

	
	//###### TEXTUAL MENU PROGRAM #########
	//Method displays "menu" with options 1-5
	public void displayMenu()
	{
		Scanner sc=new Scanner(java.lang.System.in);
		int choice; //variable to store users' input
		
		//Display menu options repeatedly until exit
		do {
			java.lang.System.out.println();
			java.lang.System.out.println("- - - - - - - - - - - - - - - - - - -");
			java.lang.System.out.println("Choice 1 - Print System Details");
			java.lang.System.out.println("Choice 2 - Display System Properties");
			java.lang.System.out.println("Choice 3 - Diagnose System");
			java.lang.System.out.println("Choice 4 - Set Details");
			java.lang.System.out.println("Choice 5 - Quit the program");
			java.lang.System.out.println("");
			java.lang.System.out.println("\t" + "Enter your choice (1-5): "); 
			java.lang.System.out.println("");
			
			choice = sc.nextInt();//Takes input from users and store in the "choice" variable
			
			//Call methods depending in user input
			switch(choice) {
				
				//if 1 is entered, calls the SystemDetails method that returns all the details of the object created
				case 1:
					java.lang.System.out.println("");
					java.lang.System.out.println("###### System Details ######");
					java.lang.System.out.println(displayDetails()); 
					break;
				
				//if 2 is entered, calls the displaySystemProperties method that returns system properties as a printed String
				case 2:
					java.lang.System.out.println("");
					java.lang.System.out.println("###### System Properties ######");
					java.lang.System.out.println(displaySystemProperties());
					break;
				
				//if 3 is entered, calls the diagnoseSystem method that returns the result of the diagnosis	
				case 3:
					java.lang.System.out.println("");
					java.lang.System.out.println("###### Diagnose System ######");
					java.lang.System.out.println(diagnoseSystem());
					break;
				
				//if 4 is entered, prompts user to enter new values and calls appropriate "Set" method to store the new values	
				case 4:
					java.lang.System.out.println("");
					java.lang.System.out.println("###### Set Details ######");
					
					//Prompts a user to enter a value for Memory Size
					java.lang.System.out.println("");
					java.lang.System.out.println("\t" + "Memory Size (MB)): ");
					
					boolean flagRAM = true; // declares variable "flag" that controls when it is needed to exit the loop
					int memoryRam = 0;       //declares variable that stores the user's input
					
					
					//Prompts and validates the input (less than zero and numbers only)
					do {
						try {
							Scanner sc1 = new Scanner(java.lang.System.in);
							memoryRam = sc1.nextInt(); // Prompts for user's input

							//Condition that makes sure that the input is not a negative digit
							if (memoryRam < 0)
							{
								java.lang.System.out.println("ERROR: Invalid Entry - please provide a valid number");
								java.lang.System.out.println("");
								java.lang.System.out.println("\t" + "Memory Size (MB)): ");
							}
							else
								flagRAM = false; // Changes the flag to "false", since the input has passed the validation
							
						}
						catch (Exception e) //Handles a java error
						{
							java.lang.System.out.println("ERROR: Input is not valid"); // Print a message for users if a error is caught
							java.lang.System.out.println("");
							java.lang.System.out.println("\t" + "Memory Size (MB)): "); // Repeats the prompt
						}
						
					} while (flagRAM);
					
					setMemory(memoryRam); //Calls the Set method to store the input
					
					//Displays a message indicating a successful change
					java.lang.System.out.println("*** Memory Size Successfully set");
					java.lang.System.out.println();
				
					
					//Prompts a user to enter a value for Hard Disk Size
					java.lang.System.out.println("");
					java.lang.System.out.println("\t" + "Hard Disk size (GB)): ");
					
					double memoryHd = 0; //declares variable that stores the user's input
					boolean flagHD = true; // declares variable "flag" that controls when it is needed to exit the loop
					
					//Prompts and validates the input (less than zero and numbers only)
					do {
						try {
							Scanner sc1 = new Scanner(java.lang.System.in);
							memoryHd = sc1.nextDouble(); // Prompts for user's input

							//Condition that makes sure that the input is not a negative digit
							if (memoryHd < 0)
							{
								java.lang.System.out.println("ERROR: Invalid Entry - please provide a valid number");
								java.lang.System.out.println("");
								java.lang.System.out.println("\t" + "Hard Disk Size (GB)): ");
							}
							else
								flagHD = false; // Changes the flag to "false", since the input has passed the validation
								
						}
						catch (Exception e) //Handles a java error
						{
							java.lang.System.out.println("ERROR: Input is not valid"); // Print a message for users if a error is caught
							java.lang.System.out.println("");
							java.lang.System.out.println("\t" + "Hard Disk Size (GB)): "); // Repeats the prompt
						}
						
					} while (flagHD);
					
					setHardDisk(memoryHd); //Calls the Set method to store the input
					
					//Displays a message indicating a successful change
					java.lang.System.out.println("*** Hard Disk size Successfully set");
					java.lang.System.out.println();
					
					java.lang.System.out.println("All set, good to go!");
					break;
				
				//default choice if the user input is not in range 1-5
				default:
					if(choice != 5) 
						java.lang.System.out.println("Unknown option"); // prints "Unknown option"
			}
		
		//if 5 is entered, exits the program
		} while (choice != 5); //exit
		java.lang.System.out.println("Bye");


	}
}
	

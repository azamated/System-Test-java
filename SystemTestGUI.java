import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.Label; 
import javafx.scene.control.TextArea; 
import javafx.scene.control.TextField; 
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox; 
import javafx.scene.paint.Color; 
import javafx.scene.text.Font; 
import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.StackPane;

/**
 * A test program for System class with GUI
 * 
 * @author	Student
 * @version 1.0 (31 May 2020)
 */

// Creates a new class that extends Java FX Application class
public class SystemTestGUI extends Application {

	//Main method that launches graphics
	public static void main(String[] args) {
		
		launch(args);
	}

	//Creates GUI 
	@Override    
	public void start(Stage primaryStage) // Start a new Stage
	{         
		//Creates an object with initial parameters Make, Model and Speed
		System aa = new System("Intel", "Corei7", 6000);
		aa.setPurchaseCost(12000); // Set initial Purchase Cost value
		
		//Set Title
		primaryStage.setTitle("System Test GUI"); //Sets a title for the stage
		
		//Creates a new Text Area and sets its configuration: size, features, fonts and font size
		TextArea display = new TextArea();       
		display.setEditable(false);         
		display.setMinSize(350,130);         
		display.setMaxSize(350,130);
		display.setFont(Font.font("Arial", 14));
		
		//Creates a new text 
		Text programTitle = new Text();         
		programTitle.setText("'SYSTEM MENU - Make Your Choice'");   
		programTitle.setFont(Font.font ("Verdana", 25));
		programTitle.setFill(Color.DARKBLUE);
		
		//Creates a program title H-Box and sets its configuration: position and children, such as text
		HBox programTitleHBox = new HBox();
		programTitleHBox.setAlignment(Pos.TOP_CENTER);
		programTitleHBox.getChildren().add(programTitle);

		//###########################################################
		//Button #1 - > Print System Details - a new pop up window
		//###########################################################
		
		//Creates a text label for a button and sets its configuration: color and font
		Label printInfoLabel = new Label("     > Print System Details              ");         
		printInfoLabel.setTextFill(Color.BLACK);         
		printInfoLabel.setFont(Font.font("Arial", 20));  
		
		//Creates a Button #1 and sets its configuration:min width and name label
		Button printInfoButton = new Button();  
		printInfoButton.setMinWidth(80);
		printInfoButton.setText("1. Print");
		
		//Reacts on the action when a button is clicked - creates a new event handler that triggers a new pop up window (stage)
		printInfoButton.setOnAction(new EventHandler<ActionEvent>() {
            
			//Calls the handle method that calls other methods and builds graphics for the new pop up window
			@Override
            public void handle(ActionEvent event) {
            	display.setText(aa.displayDetails());//Calls a method to display system details in the main text area "display"
            	
            	
            	//Creates a new label "Make" and sets its configuration
            	Label lablel1 = new Label(" - Make: ");
            	lablel1.setTextFill(Color.DARKMAGENTA);
            	lablel1.setFont(Font.font("Arial",24));
            
            	//Creates a new text that contains a String returned by the method called 
                Text text1 = new Text();   
                text1.setText(aa.getMake()); //Calls the method getMake which returns a value of the make
                text1.setFill(Color.BLACK);
                text1.setFont(Font.font("Arial", 20));
        	
                //Create an HBOX sets its configuration to position text1 and text label1
        		HBox labelTextHBOX1 = new HBox(10);
        		labelTextHBOX1.setAlignment(Pos.BASELINE_LEFT);
        		labelTextHBOX1.getChildren().addAll(lablel1,text1);
                
        		
        		//Creates a new label "Model" and sets its configuration
            	Label lablel2 = new Label(" - Model: ");
            	lablel2.setTextFill(Color.DARKMAGENTA);
            	lablel2.setFont(Font.font("Arial",24));
            
            	//Creates a new text that contains a String returned by the method called 
                Text text2 = new Text();      
                text2.setText(aa.getModel()); //Calls the method getModel which returns a value of the model
                text2.setFill(Color.BLACK);
                text2.setFont(Font.font("Arial", 20));
             
                //Create an HBOX sets its configuration to position text2 and label2
        		HBox labelTextHBOX2 = new HBox(10);
                labelTextHBOX2.setAlignment(Pos.BASELINE_LEFT);        
                labelTextHBOX2.getChildren().addAll(lablel2,text2);          

                
                //Creates a new label "Processor Speed" and sets its configuration
            	Label lablel3 = new Label(" - Processor Speed (Mhz): ");
            	lablel3.setTextFill(Color.DARKMAGENTA);
            	lablel3.setFont(Font.font("Arial",24));
            
            	//Creates a new text that contains a String returned by the method called 
                Text text3 = new Text();      
                String s3=Integer.toString(aa.getProcessorSpeed());//Calls the method getProcessorSpeed which returns a value of the CPU speed
                text3.setText(s3); 
                text3.setFill(Color.BLACK);
                text3.setFont(Font.font("Arial", 20));
               
                //Create an HBOX sets its configuration to position text3 and label3
        		HBox labelTextHBOX3 = new HBox(10);
        		labelTextHBOX3.setAlignment(Pos.BASELINE_LEFT);
        		labelTextHBOX3.getChildren().addAll(lablel3,text3);
                
                 
        		//Creates a new label "Memory Size" and sets its configuration
            	Label lablel4 = new Label(" - Memory Size (MB): ");
            	lablel4.setTextFill(Color.DARKMAGENTA);
            	lablel4.setFont(Font.font("Arial",24));
            
            	//Creates a new text that contains a String returned by the method called 
                Text text4 = new Text();      
                String s4=Integer.toString(aa.getMemorySize());//Calls the method getMemorySize which retursn a value of the RAM
                text4.setText(s4); 
                text4.setFill(Color.BLACK);
                text4.setFont(Font.font("Arial", 20));
             
                //Create an HBOX and sets its configuration to position text4 and label4
        		HBox labelTextHBOX4 = new HBox(10);
        		labelTextHBOX4.setAlignment(Pos.BASELINE_LEFT);
        		labelTextHBOX4.getChildren().addAll(lablel4,text4);
        		
        		
        		//Creates a new label "HD Size" and sets its configuration
            	Label lablel5 = new Label(" - Hard disk size (GB): ");
            	lablel5.setTextFill(Color.DARKMAGENTA);
            	lablel5.setFont(Font.font("Arial",24));
            
            	//Creates a new text that contains a String returned by the method called 
                Text text5 = new Text();      
                String s5=Double.toString(aa.getHardDiskSize());//Calls the method getHardDiskSize which returns a value of the HD size
                text5.setText(s5); 
                text5.setFill(Color.BLACK);
                text5.setFont(Font.font("Arial", 20));
               
                //Create an HBOX and sets its configuration to position text5 and label5
        		HBox labelTextHBOX5 = new HBox(10);
        		labelTextHBOX5.setAlignment(Pos.BASELINE_LEFT);
        		labelTextHBOX5.getChildren().addAll(lablel5,text5);
        		
        		
        		//Creates a new label "Purchase Cost" and sets its configuration"
            	Label lablel6 = new Label(" - Purchase Cost ($): ");
            	lablel6.setTextFill(Color.DARKMAGENTA);
            	lablel6.setFont(Font.font("Arial",24));
            	
            	//Creates a new text that contains a String returned by the method called 
                Text text6 = new Text();      
                String s6=Double.toString(aa.getPurchaseCost());//Calls the method getHardDiskSize which returns a value of the HD size
                text6.setText(s6); 
                text6.setFill(Color.BLACK);
                text6.setFont(Font.font("Arial", 20));
                
                //Create an HBOX and sets its configuration to position text6 and label6
        		HBox labelTextHBOX6 = new HBox(10);
        		labelTextHBOX6.setAlignment(Pos.BASELINE_LEFT);
        		labelTextHBOX6.getChildren().addAll(lablel6,text6);
        		
        		
                //Create a new button "Refresh" and sets its configuration
                Button refreshParameters = new Button();  
                refreshParameters.setMinWidth(80);
                refreshParameters.setText("Refresh Details");
                
         		//Creates a new HBox for the "Refresh" button
         		HBox refreshParametersHBox = new HBox(10);
         		refreshParametersHBox.setAlignment(Pos.BOTTOM_CENTER);        
         		refreshParametersHBox.getChildren().add(refreshParameters);//adds the "refresh" button to the HBox
         		refreshParametersHBox.setStyle("-fx-padding:5");
         		
                //Creates a new action when the button is clicked
                refreshParameters.setOnAction(e -> {
            	
                //Gets a new value for RAM size
                String s4_1=Integer.toString(aa.getMemorySize());
                text4.setText(s4_1); 
                text4.setFill(Color.BLACK);
                text4.setFont(Font.font("Arial", 20));
               	labelTextHBOX4.getChildren().remove(1);//Removes the old text object from the HBox
               	labelTextHBOX4.getChildren().add(1, text4); //Add a new text object to the HBox
 
                //Gets a new value for HD size
           		String s4_2=Double.toString(aa.getHardDiskSize());
                text5.setText(s4_2); 
                text5.setFill(Color.BLACK);
                text5.setFont(Font.font("Arial", 20));
               	labelTextHBOX5.getChildren().remove(1);//Removes the old text object from the HBox
               	labelTextHBOX5.getChildren().add(1, text5);//Add a new text object to the HBox
                });
        		
        		
                //Creates a new button "Exit" for this pop up window
                Button exitButton = new Button();  
                exitButton.setMinWidth(80);
                exitButton.setText("EXIT");

        		//Creates a new HBox for the button
        		HBox windowExitHBox = new HBox(10);
        		windowExitHBox.setAlignment(Pos.BOTTOM_RIGHT);        
        		windowExitHBox.getChildren().addAll(exitButton);
        		windowExitHBox.setStyle("-fx-padding:15");


        		//Creates a new vertical container to hold all the objects       
        		VBox popUpWindow1 = new VBox(25);         
        		popUpWindow1.setAlignment(Pos.TOP_CENTER);
        		popUpWindow1.getChildren().addAll(labelTextHBOX1,labelTextHBOX2,labelTextHBOX3,labelTextHBOX4,labelTextHBOX5,labelTextHBOX6,refreshParametersHBox,windowExitHBox); // adds all the components
        		popUpWindow1.setSpacing(15); // Sets spacing between each component
        		popUpWindow1.setPadding(new Insets(20,20, 10,10)); //Sets padding for each component
                
                //Creates a new scene to hold the VBox                
                Scene popUpWindow1Scene = new Scene(popUpWindow1, 430,380, Color.ALICEBLUE);
                           
                //Creates a new stage to hold the scene
                Stage newPopUpWindow = new Stage();
                newPopUpWindow.setTitle("Print System Details");
                newPopUpWindow.setScene(popUpWindow1Scene);
                exitButton.setOnAction(x ->newPopUpWindow.hide()); //Creates an action for "Exit" button. Exits the window.

                //Set position of the pop up window, related to primary window.
                newPopUpWindow.setX(primaryStage.getX() + 500);
                newPopUpWindow.setY(primaryStage.getY() + 0);
                newPopUpWindow.show();
                
                              
            }
        });
		
		//Creates a new HBox to hold the button #1 and its label
		HBox printInfoHBox = new HBox(10);
		printInfoHBox.setAlignment(Pos.CENTER_LEFT);        
		printInfoHBox.getChildren().addAll(printInfoLabel, printInfoButton);
		
		//###########################################################
		//End of Button #1 configuration
		//###########################################################
		
		//###########################################################
		//Button #2 - > Display System Properties
		//###########################################################

		//Creates a text label for a button and sets its configuration: color and font
		Label displayInfoLabel = new Label("     > Display System Properties    ");         
		displayInfoLabel.setTextFill(Color.BLACK);
		displayInfoLabel.setFont(Font.font("Arial", 20)); 
			
		//Creates a Button #2 and sets its configuration: min width and name label
		Button displayInfoButton = new Button();
		displayInfoButton.setMinWidth(80);
		displayInfoButton.setText("2. Display");
		
		//Reacts on the action when a button is clicked - displays output of the String returned by the called method "displaySystemProperties"
		displayInfoButton.setOnAction( e -> display.setText(aa.displaySystemProperties()));
		
		//Creates a new HBox to hold the button #2 and its label
		HBox displayInfoHBox = new HBox(10);
		displayInfoHBox.setAlignment(Pos.CENTER_LEFT); 
		displayInfoHBox.getChildren().addAll(displayInfoLabel, displayInfoButton);
		
		//###########################################################
		//End of Button #2 configuration
		//###########################################################
		
		//###########################################################
		//Button #3 - > Diagnose System 
		//###########################################################		
		
		
		//Creates a text label for a button and sets its configuration: color and font 
		Label diagnoseSysLabel = new Label("     > Diagnose System                  ");         
		diagnoseSysLabel.setTextFill(Color.BLACK);         
		diagnoseSysLabel.setFont(Font.font("Arial", 20));  
				
		//Creates a Button #3 and sets its configuration: min width and name label 
		Button diagnoseSysButton = new Button();  
		diagnoseSysButton.setMinWidth(80);
		diagnoseSysButton.setText("3. Diagnose");

		//Reacts on the action when a button is clicked - displays output of the String returned by the called method "diagnoseSystem"
		diagnoseSysButton.setOnAction( e -> display.setText(aa.diagnoseSystem()));
				
		//Creates a new HBox to hold the button #3 and its label
		HBox diagnoseSysHBox = new HBox(10);
		diagnoseSysHBox.setAlignment(Pos.CENTER_LEFT);        
		diagnoseSysHBox.getChildren().addAll(diagnoseSysLabel, diagnoseSysButton);
		
		//###########################################################
		//End of Button #3 configuration
		//###########################################################
		
		//###########################################################
		//Button #4 - > Set Details  - a new pop up window
		//###########################################################
		
		
		//Creates a text label for a button and sets its configuration: color and font
		Label setDetailsLabel = new Label("     > Set Details                              ");         
		setDetailsLabel.setTextFill(Color.BLACK);         
		setDetailsLabel.setFont(Font.font("Arial", 20));  
				
		//Creates a Button #3 and sets its configuration: min width and name label 
		Button setDetailsButton = new Button();  
		setDetailsButton.setMinWidth(80);
		setDetailsButton.setText("4. Set Details");

		//Reacts on the action when a button is clicked - creates a new event handler that triggers a new pop up window (stage)
		setDetailsButton.setOnAction(new EventHandler<ActionEvent>() {
           
			//Calls the handle method that calls other methods and builds graphics for the new pop up window
			@Override
            public void handle(ActionEvent event) {
				
				//Creates new labels for set buttons
        		Label setRAM = new Label("      Memory, MB   ");         
        		setRAM.setTextFill(Color.RED);         
        		setRAM.setFont(Font.font("Arial", 18));         
        		Label setHD= new Label("      Hard Disk, GB");         
        		setHD.setTextFill(Color.RED);         
        		setHD.setFont(Font.font("Arial", 18));
        		
        		//Creates new text fields where users provide inputs
        		TextField setRAMField = new TextField();         
        		setRAMField.setMaxWidth(100);         
        		TextField setHDField = new TextField();         
        		setHDField.setMaxWidth(100); 
        		
        		//Creates a new button for set "memory size" parameter , the button validates the users' input by popping up an ALERT window indicating an error or success
				Button setButton1 = new Button();  
				setButton1.setMinWidth(100);
				setButton1.setText("Set RAM size");
				
				//Sets an action upon clicking on the button
				setButton1.setOnAction(new EventHandler<ActionEvent>() {
					
					//Calls the handle method that builds graphics for a new pop up window alert
					@Override
					public void handle(ActionEvent event) {
						
						Text alertRAM;//declares variable with type text
						
						//Checks if the input is not empty
						if(setRAMField.getText().isEmpty())
							{                         
								display.setText("ERROR: RAM value must be entered"); 			
								alertRAM = new Text();
								alertRAM.setText("ERROR: RAM value must be entered");
							}
						//Checks if the input a number
						else if(!aa.isInteger(setRAMField.getText())) //Calls a method that checks whether the input is integer
						{                         
							display.setText("ERROR: Invalid Entry"); 			
							alertRAM = new Text();
							alertRAM.setText("ERROR: Invalid Entry, enter a number");
						} 
						else {  		
							//Checks if the input is greater then 0
							if (Integer.parseInt(setRAMField.getText()) < 0)
							{
								display.setText("ERROR: Invalid Entry"); 			
								alertRAM = new Text();
								alertRAM.setText("ERROR: Invalid Entry");
							}
							else {
								//Convert  input to doubles and set the parameter
								aa.setMemory(Integer.parseInt(setRAMField.getText())); // Sets RAM value with the user's input
								//Displays result
								display.setText("SUCCESS!: RAM value is set");
								alertRAM = new Text();
								alertRAM.setText("SUCCESS!: RAM value is set");
							}

						}
		
						//Creates a new button for the Alert pop up window
						Button okButton = new Button();  
						okButton.setMinWidth(80);
						okButton.setText("OK");
						
						//Creates an H-Boxes for the OK button
						HBox exitButtonHBox = new HBox(10);
						exitButtonHBox.setAlignment(Pos.BOTTOM_CENTER);        
						exitButtonHBox.getChildren().addAll(okButton);
           
						//Create a new Stack pane to hold the text
						StackPane setRAMLayout = new StackPane();
       
						//Adds the text object to the stack pane
						setRAMLayout.getChildren().add(alertRAM);
     			
        				//Creates and configure a vertical container to hold all the components         
						VBox setRAMVBox = new VBox(25);         
						setRAMVBox.setAlignment(Pos.TOP_CENTER);
						setRAMVBox.getChildren().addAll(setRAMLayout,exitButtonHBox);
						setRAMVBox.setSpacing(20);
						setRAMVBox.setPadding(new Insets(20,20, 10,10));
        		
						//Creates  a new scene
						Scene setRAMScene = new Scene(setRAMVBox, 230, 100);	
		
						//Creates a new stage
						Stage setRAMStage = new Stage();
						setRAMStage.setTitle("Set RAM");
						setRAMStage.setScene(setRAMScene);
						okButton.setOnAction(x ->setRAMStage.hide()); //exit from sub menu

						// Set position of pop window window, related to primary window.
						setRAMStage.setX(primaryStage.getX() + 150);
						setRAMStage.setY(primaryStage.getY() + 150);
						setRAMStage.show();
					}
				});


				//Creates a new button for set "HD size" parameter , the button validates the users' input by popping up an ALERT window indicating an error or success
        		Button setButton2 = new Button();  
       			setButton2.setMinWidth(100);
        		setButton2.setText("Set HD size");
        		setButton2.setOnAction(new EventHandler<ActionEvent>() {
	
        			//Sets an action upon clicking on the button
        			@Override
        			public void handle(ActionEvent event) {
        				
        				Text alertHD;//declares variable with type text
  
        				//Checks if the input is not empty
        				if(setHDField.getText().isEmpty())
        				{                         
        					display.setText("ERROR: HD value must be entered"); 			
        					alertHD = new Text();
        					alertHD.setText("ERROR: HD value must be entered");
        				}
        				//Checks if the input a number
        				else if(!aa.isDouble(setHDField.getText()))
        				{                         
        					display.setText("ERROR: Invalid Entry"); 			
        					alertHD = new Text();
        					alertHD.setText("ERROR: Invalid Entry, enter a number");
        				} 
        				else {  		
        					//Checks if the input is greater then 0
        					if (Double.parseDouble(setHDField.getText()) < 0)
        					{
        						display.setText("ERROR: Invalid Entry"); 			
        						alertHD = new Text();  
        						alertHD.setText("ERROR: Invalid Entry");
        					}
        					else {
        						//Convert  input to the type double and set the parameter by calling the method
        						aa.setHardDisk(Double.parseDouble(setHDField.getText())); // Sets HD value with the user's input            
        						//Displays result
        						display.setText("SUCCESS!: HD value is set");
        						alertHD = new Text();
        						alertHD.setText("SUCCESS!: HD value is set");
        					}
        					
        				}
        				        		
        				//Creates a new OK button for sub menu
        				Button okButton = new Button();  
        				okButton.setMinWidth(80);
        				okButton.setText("OK");

        				//Creates a new H-Box for OK button
        				HBox exitButtonHBox = new HBox(10);
        				exitButtonHBox.setAlignment(Pos.BOTTOM_CENTER);        
        				exitButtonHBox.getChildren().addAll(okButton);
                   
        				//Creates a new stack pane for the label
        				StackPane setHDLayout = new StackPane();
               
        				//Adds the message label to the stack pane
        				setHDLayout.getChildren().add(alertHD);
             			
                		
        				//Creates and configure a vertical container to hold all the components         
        				VBox setHDVBox = new VBox(25);         
        				setHDVBox.setAlignment(Pos.TOP_CENTER);
        				setHDVBox.getChildren().addAll(setHDLayout,exitButtonHBox);
        				setHDVBox.setSpacing(20);
        				setHDVBox.setPadding(new Insets(20,20, 10,10));
                		
        				//Creates a new scene
        				Scene setHDScene = new Scene(setHDVBox, 230, 100);	
        		
                
        				//Creates a new stage
        				Stage setHDStage = new Stage();
        				setHDStage.setTitle("Set RAM");
        				setHDStage.setScene(setHDScene);
        				okButton.setOnAction(x ->setHDStage.hide()); //exit from sub menu

        				// Set position of the window, related to primary window.
        				setHDStage.setX(primaryStage.getX() + 150);
        				setHDStage.setY(primaryStage.getY() + 150);
        				setHDStage.show();
        			}
	    
        		});

        		//Creates a new for the new window "Set Details"
        		Button exitButton = new Button();  
        		exitButton.setMinWidth(80);
        		exitButton.setText("EXIT");
        				
        		//Creates a new H-Box for the label, text field and button for the "Set Memory size" functionality
        		HBox setButtonRAM = new HBox(10);
        		setButtonRAM.setAlignment(Pos.CENTER_LEFT);        
        		setButtonRAM.getChildren().addAll(setRAM, setRAMField,setButton1);
        		
        		//Create a new H-Box for the label, text field and button for the "Set hard Disk size" functionality
        		HBox setButtonHD = new HBox(10);
        		setButtonHD.setAlignment(Pos.CENTER_LEFT);        
        		setButtonHD.getChildren().addAll(setHD,setHDField,setButton2);
        		
        		//Create a new H-Box for the exit button
        		HBox windowExitHBox = new HBox(10);
        		windowExitHBox.setAlignment(Pos.BOTTOM_RIGHT);        
        		windowExitHBox.getChildren().addAll(exitButton);
 
        		// create and configure a vertical container to hold all the components: HBoxes        
        		VBox setDetailsVBox = new VBox(25);         
        		setDetailsVBox.setAlignment(Pos.TOP_CENTER);
        		setDetailsVBox.getChildren().addAll(setButtonRAM,setButtonHD,windowExitHBox);
        		setDetailsVBox.setSpacing(35);
        		setDetailsVBox.setPadding(new Insets(20,20, 10,10));
                                              
                //Set a new scene
        		Scene setDetailsScene = new Scene(setDetailsVBox,400,200,Color.ALICEBLUE);
                
         		                                
                // New window (Stage)
                Stage setDetailsWindow = new Stage();
                setDetailsWindow.setTitle("Set Details");
                setDetailsWindow.setScene(setDetailsScene);
                exitButton.setOnAction(x ->setDetailsWindow.hide()); //exit from sub menu

                // Set position of second window, related to primary window.
                setDetailsWindow.setX(primaryStage.getX() + -400);
                setDetailsWindow.setY(primaryStage.getY() + 0);
                setDetailsWindow.show();
               
            }
        });
		
		
		//Create a new H-Box for the "Set details" label and its button
		HBox setDetailsWindowHbox = new HBox(10);
		setDetailsWindowHbox.setAlignment(Pos.CENTER_LEFT);        
		setDetailsWindowHbox.getChildren().addAll(setDetailsLabel, setDetailsButton);
		
		//###########################################################
		//End of Button #4 configuration
		//###########################################################
		
		//###########################################################
		//Button #5 - > Exit from GUI
		//###########################################################
		
		//Creates a new button - Exit. The button closes the program
		Button exit = new Button();  
		exit.setMinWidth(80);
		exit.setText("5. EXIT");
		exit.setOnAction(e -> Platform.exit()); //Exits from GUI
		
		//Creates a new HBox for exit button
		HBox exitButton = new HBox(10);
		exitButton.setAlignment(Pos.BOTTOM_RIGHT);        
		exitButton.getChildren().add(exit);
		
		//###########################################################
		//End of Button #5 configuration
		//###########################################################
		
		//Creates and configures a vertical container to hold all the components: Main Title, label and buttons #1, #2, #3, Display, button #4 and the exit button       
		VBox root = new VBox(25);         
		root.setAlignment(Pos.TOP_CENTER);
		root.getChildren().addAll(programTitleHBox, printInfoHBox, displayInfoHBox, diagnoseSysHBox,display,setDetailsWindowHbox,exitButton);
		root.setSpacing(30);
		root.setPadding(new Insets(20,20, 10,10));
		
		//Create a new main window scene
		Scene scene = new Scene(root, 500, 500);
		
		//Associates the scene with the primary stage
		primaryStage.setScene(scene);
		
		//Shows the stage
		primaryStage.show();
		
						
	}
	
}
# system-test-java

### Assessment Task/s

### Part A

- Using Eclipse you should create a new System project.
- Within the project, create a System class
- Below is the class diagram for the System class:

```
System
```
- make : String
- model : String
- speed : int
- memorySize : int //in MB
- hardDiskSize : double //in GB
- purchaseCost : double
+System(String,String, int)
+setMemory(int)
+setHardDisk(double)
+setPurchaseCost(double)
+getMake():String
+getModel():String
+getProcessorSpeed():int
+displayDetails(): String
+checkHDStatus(): String
+goodMemorySize() : boolean
+diagnoseSystem(): String


```
System(String, String, int)
```
- The constructor should initialise the make, model and processor speed of the
    system.

```
getMake():String
```
```
getModel():String
```
```
getProcessorSpeed():int
```
- Methods to return attribute values.

```
setMemory(int)
```
```
setHardDisk(double)
```
```
setPurchaseCost(double)
```
- These methods should set the corresponding attributes.

```
displayDetails(): String
```
- This should display all the details of the system. These details should be output as
    a **String**.
**checkHDStatus(): String**
- This method should check if the hard disk size is below 2 (GB). If so, it should
return “low”, otherwise “OK”

```
goodMemorySize(): boolean
```
- This method should check if the ram memory size is below 128 (MB). If so it
    should return false, otherwise true

```
diagnoseSystem() : String
```
- This method should use both the checkHDStatus() and goodMemorySize() methods
    to return a **String** displaying appropriate messages as below:


```
Hard disk size = low
Memory size OK = false
```
```
Within your project create another class called SystemTest
```
- Create a ‘ **main’** method, which should create a System object and test all the
    methods.
- You should ‘set’ the details within the code.
- Compile and run the **SystemTest** class **from the command line**
- Evidence your source code and output in your assignment report.

```
Note – Your program should run from the command line i.e. independently of Eclipse.
```
### Part B – System properties

```
Java provides a System class with many useful static methods (e.g.
System.out.println()).
```
```
One of the methods provided in the System class is getProperty(argument). Details of
this and how it can be used can be found at:
http://java.sun.com/docs/books/tutorial/essential/environment/sysprop.html
Add a ‘ displaySystemProperties(): String’ method to your System class. This method
should display, in a String , the following properties:
```
- Operating System Architecture
- Operating System Name
- Operating System Version
- User Account Name
- Java Version.

```
The method should also output a positive message if the Operation System equals
‘Windows 10’, a negative message if the Operating System equals ‘Linux’ and a neutral
message for the rest of the operating systems.
```
```
Test the displaySystemProperties() method by calling it from the test class you wrote
in part A.
```

### Part C - Test class with textual menu

Amend your test class so that, after it initialises a System object, it presents the user
with the following textual menu in the console (use as many options as you have
implemented).

- Choice 1 – Print System Details
- Choice 2 - Display System Properties
- Choice 3 – Diagnose System
- Choice 4 – Set Details
- Choice 5 – Quit the program

This menu should be repeated until the user quits.

When Choice 4 is chosen, the memory size and hard disk size of the computer should
be interactively set. E.g. prompt the user to input the size of the memory and Hard
disk.

### Part D – Upgrade Part A – C to a GUI interface

Within your project create another class called **SystemTestGUI**

- Create a ‘ **main’** method, which should create a System object and test all the
    methods.
- Create a **graphical menu** based on the structure of your textual menu in Part C,
    providing appropriate user interaction for input and output.




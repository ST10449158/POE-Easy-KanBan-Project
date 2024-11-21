/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poepart.one;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class Login {
//     Scanner obj = new Scanner(System.in);
      //removed all scanners because we dont need the Scanner if we are using JOption
    
                String firstName;
                String lastName;
                String logUsername;
                String logPassword; 
                private String Username;
                private String Password;
                boolean Options;
                     
                    public void UserRegisteration(String firstName, String lastName, String Username, String Password){
                        //inform user that they have been registered
                JOptionPane.showMessageDialog(null,"Registration Complete! Please Login");
        
                //ask user to login

                  JOptionPane.showInputDialog("Enter username: ");
//                  logUsername = obj.nextLine();
                  //make sure that the username is validated 
                  if(Username.length()<= 5 && Username.contains("_")){

           JOptionPane.showMessageDialog(null,"Username successfully captured,proceed to enter password.");
        } 
            else{
                JOptionPane.showMessageDialog(null,"Error: Username must not exceed 5 characters and must contain an underscore.","ERROR",JOptionPane.ERROR_MESSAGE);
                JOptionPane.showInputDialog("Enter username: ");
                //Username = obj.nextLine();
                
            }    
                     
                      JOptionPane.showInputDialog("Enter password: ");
                      //logPassword = obj.nextLine();
                      //Password must be validated
                          if(Password.length() >= 8 && Password.matches(".*[~!@#$%^&*()_+=?/><].*")){
                        JOptionPane.showMessageDialog(null,"Password correct.");
                        JOptionPane.showMessageDialog(null,"All set, Welcome back " + firstName   + " " + lastName  +  " its great to see you again");
                                       
               }
               else{
                   JOptionPane.showMessageDialog(null,"Error: Password must at least have 8 characters and it must conatain a special character","ERROR",JOptionPane.ERROR_MESSAGE);
                   JOptionPane.showInputDialog("Enter password: ");
                   //Password = obj.nextLine();
  
            while (true){
            if (logUsername.equalsIgnoreCase(logUsername) && logPassword.equalsIgnoreCase(logPassword)){
               
            }else
            JOptionPane.showMessageDialog(null,"Username or Password incorrect, please try again.","ERROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showInputDialog("Enter username: ");
              //logUsername = obj.nextLine();
        
           JOptionPane.showInputDialog("Enter password: ");
              //logPassword = obj.nextLine();
              break;
               }
                    } 
                } 
                      //check if username is valid
                public boolean CheckUsername(String Username){
                while (true)
                if(Username.length()<= 5 && Username.contains("_")){
                    JOptionPane.showMessageDialog(null,"Username successfully captured,proceed to enter password.");
                  return true;
                } else {
                    JOptionPane.showMessageDialog(null,"Error: Username must not exceed 5 characters and must contain an underscore.","ERROR",JOptionPane.ERROR_MESSAGE);
                    
                     return false;
                }
                
            }
            //check if password is valid and has met the complexity requirements
                public boolean CheckPassword(String Password){
                while(true)
                if(Password.length() >= 8 && Password.matches(".*[~!@#$%^&*()_+=?/><].*")){
                    
                 }else {
                     JOptionPane.showMessageDialog(null,"Error: Password must be at least 8 characters long and contain a speacial charcter.","ERROR",JOptionPane.ERROR_MESSAGE);
    
                    return false;
                 }
            }
                        //create a method to register user
                        //check if users login credentials are correct (verify user)
                        public boolean LoginUser(String Login){
                        return Login.matches(Login);
         
            }  
            
               
                public String Options(){ //part 2
        
//    Scanner myObj = new Scanner(System.in);
               //we dont need the Scanner if we are using JOption
               //or else the JOption will not work because the input is expected in the console.
               AddingTasks MyObj = new AddingTasks();

        int option;
        do {
            //Display a welcome message 
            JOptionPane.showMessageDialog(null,"Welcome to EasykanBan!");
            
            //Menu Feature
            String input = JOptionPane.showInputDialog(null, 
                """ 
                Please select the following options:
                1. Add tasks
                2. Show report
                3. Quit
                Please enter the option of your choice: """,
                "Welcome to EasyKanban", JOptionPane.QUESTION_MESSAGE);
            
            
            if (input != null) { // Check if the user did cancel the dialog
                try {
                    option = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    option = 0; 
                }
            } else {
                option = 3; // If the user cancels, set option to 3 to quit
            }
            
            //Selected Option will execute other features
            switch(option) {
                case 1: //if users choose 1 they can add tasks and task details will be displayed
                    
                    
                     String number = JOptionPane.showInputDialog("How many tasks would you like to add? ");
                     int inputNumber = Integer.parseInt(number);
                     int counter = 0;
                     counter++;
                     //inputNumber++;
                     do{
                         
                     
                      for (int i = 0; i < inputNumber; i++) {
                          String TaskName = "Login Feature";
                          String TaskDescription = "Create Login to authenticate users";
                          String DevsDetails = "Robyn Harrison";
                          int TaskDuration = 8;
                          String TaskID ;//autogenerated
                          String Status = "To Do";
                      }
                     
                          int i = 0;
                          i++;
                     String name = JOptionPane.showInputDialog("What is the name of task"+ counter);
                    
                     String description = JOptionPane.showInputDialog("Write a task description, NB: It should not exceed 50 characters");
                     if(description.length() <=50){
                     JOptionPane.showMessageDialog(null, "Task successfully captured.");         
                    }else {
                        JOptionPane.showInputDialog("Please enter a task description with less than 50 characters");
                     }
                     
                     String devsDetails = JOptionPane.showInputDialog("Enter your first and last name: ","Developers Details" );
                     
                     String duration = JOptionPane.showInputDialog("Task Duration: ","Hours");
                     int inputDuration = Integer.parseInt(duration);
                     inputDuration++;
                    
                     String id;
                    // should be generated automatically
                    id = name.substring(0,2).toUpperCase()+ ":" + number + ":" +
                    devsDetails.substring(devsDetails.length() -3).toUpperCase();
                    
                    JOptionPane.showMessageDialog(null,"Task ID is: "+id,"TaskID",1);
                    
                    Task myobj = new Task("Task name",0,"task description","Developers details",0,"Task ID", "task Status"  );       
    
                    //the user has to choose the task status
                    myobj.getStatus();
                    String getTaskStatus = JOptionPane.showInputDialog(null,
                            
                """ 
                Please select the following options:
                1. To Do
                2. Doing
                3. Done
                Please enter the option of your choice: """,
                
                
                "Welcome to EasyKanban", JOptionPane.QUESTION_MESSAGE);
                    int TaskStatus = Integer.parseInt(getTaskStatus);
                    String status = "";
                    
                    switch(TaskStatus){
                    case 1: 
                        status="To Do";
                            break;
                            
                            case 2: 
                        status="Doing";
                            break;
                            
                            case 3: 
                        status="Done";
                        
                            break;
                }
                    //displaying of tasks at the end 
                    Task Myobj = new Task(name,inputNumber,description,devsDetails,inputDuration,id,status);
                    JOptionPane.showInputDialog(Myobj.displayingTasks());
                    counter++;
                     } while (counter <= inputNumber);
                     
                {
                    int[] Taskduration = new int[inputNumber];
                    JOptionPane.showMessageDialog(null, "Total hours for all tasks:" + Task.returnTotalHours(Taskduration));
                   
                }
                    break;

                case 2://if they choose 2 they should be able to see reports
                    
                    //part 3                    
                    //Give a report.
                    //search for tasks.
                    //Case statements.
                    //show task with the longest duration.
                    String options;
                    options = JOptionPane.showInputDialog(null, """
        Please select the following options:
        1. Display all the tasks with the status of Done.
        2. Display the longest task duration.
        3. Search for a Task.
        4. Search for Tasks assigned to a developer
        5. Delete a Task
        6. Display a report of all captured Tasks.
        7. Go back to the Main Menu""","Show Report", 1);

        switch(options){
            
        case "1" : Report.DisplayDoneTasks();
        break;
        case "2" : Report.LongestTaskDuration(); 
        break;
        case "3" : Report.SearchForTask();;
        break;
        case "4" : Report.DevelopersTasks();
        break;
        case "5" : Report.DeleteTasks();
        break;
        case "6" : Report.DisplayTaskReport();
        break;
        case "7" : {

        while(!"7".equals(options));
}
        }
        
                 break;

                case 3: //the program should stop if the user quits,presses the X or cancel
                    JOptionPane.showMessageDialog(null, "Exiting the program....");
                    break;
                default: //if the choose something wrong the program should return a error message and back yo the menu
                    JOptionPane.showMessageDialog(null, "Invalid option. Please select again.");
            }       
        }  while(option != 3); //program runs until user quits
           return null;
    } 
}

    



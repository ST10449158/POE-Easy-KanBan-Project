/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poepart.one;
import java.util.Scanner;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class PoePartOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Create a scanner so that users can add their inputs
//        Scanner obj = new Scanner(System.in);
       
        String firstName;
        String lastName;
        String Username;
        String Password;
        
        //removed all scanners because we dont need the Scanner if we are using JOption
        // Prompt user for their firstname and surname
        
        //Display a welcome message 
             JOptionPane.showMessageDialog(null, 
                "WELCOME!");
            
       firstName = JOptionPane.showInputDialog("Enter your First name: ");    
     
       lastName = JOptionPane.showInputDialog("Enter your Last name: ");
        
       JOptionPane.showInternalMessageDialog(null,"Almost done, let's get you registered.");

        // Ask user to create their username and password
                while (true) {
                   Username = JOptionPane.showInputDialog("Enter your Username: ");

                    // Validate the username
                    if (Username.length() <= 5 && Username.contains("_")) {
                       JOptionPane.showInternalMessageDialog(null,"Username successfully captured, proceed to enter password.");
                        break;
                    } else {
                        JOptionPane.showInternalMessageDialog(null,null,"Username must not exceed 5 characters and must contain an underscore.",JOptionPane.ERROR_MESSAGE);
                    }
                }

        while (true) {
           Password = JOptionPane.showInputDialog("Enter your Password: ");
            
            // Validate the password using regular expression
            if (Password.length() >= 8 && Password.matches(".*[~!@#$%^&*()_+=?/<>].*")) {
                JOptionPane.showInternalMessageDialog(null,"Password Corrcelty formated");
                
                //create an access key (instance) for my LOGIN class 
                //so that once this part has successfully being done they can continue to login
                Login myObj = new Login();
                myObj.UserRegisteration(firstName, lastName, Username, Password);
                myObj.Options();

                 //instance for my TASK class
            Task myobj = new Task("Task name",0,"task description","Developers details",0,"Task ID", "task Status"  );
            
            //instance for my ADDING TASKS class
            AddingTasks Myobj = new AddingTasks();
            
            //displays JOption without minimizing the IDE
            final JDialog dialog = new JDialog();
            dialog.setAlwaysOnTop(true);
            
            //instance for my REPORT class
            Report obj = new Report();
            obj.DisplayDoneTasks();
            

             /*
            Myobj.addTask(new AddingTasks("Task" + (i + 1)));
           
}
              //displaying tasks
              JOptionPane.showMessageDialog(null, "taskName");
              Myobj.displayTask();
              
              //getting tasks
              Task task = Myobj.getTask(1);
              System.out.println("Task ID 1: ");
              System.out.println(task);
              
              //remove tasks
              System.out.println("TaskID 1 has been removed");
              Myobj.removeTask(1);

                String taskName = "Implement Login Feature";
                int taskNumber = 0; 
                String taskDescription = "Create a login feature for the application.";
                String devsDetails = "Rebecca Manthata, Developer";
                int taskDuration = 0;
                String taskID ; 
                String taskStatus ;

       */
             
                break;
            }
            else {
                JOptionPane.showInternalMessageDialog(null,null,"Error: Password must be at least 8 characters long and contain a special character.",JOptionPane.ERROR_MESSAGE);
            }
        
        } 
} 
   
}




    
    
    

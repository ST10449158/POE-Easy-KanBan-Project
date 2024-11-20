/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poepart.one;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class Task{
    
    private String name;
    private int number;
    private String description;
    private String devsDetails;
    int i;
    static private int duration;
    private String id;
    private String status;
    String[] TaskNames;
    String[] Description;
    String[] Developer;
    String[] TaskStatus;
    String[] TaskID;

    //Constructor
    public Task(String name, int number, String description, String devsDetails, int duration, String id, String status) {
    this.name = name;
    this.number = 0;
    number++;
    this.description = description;
    this.devsDetails = devsDetails;
    this.duration = duration;
    this.id = id;
    this.status = status;
}
      //condition for Task description
    public boolean CheckTaskDescription(){
        if(description.length() <=50){
            JOptionPane.showMessageDialog(null, "Task successfully captured.");
            return true;
        }else {
            JOptionPane.showInputDialog("Please enter a task description with less than 50 characters");
             return false;
        }
       
    }
    
    //this code will automatically create a task id
    public String createTaskID(){
       id = name.substring(0,2).toUpperCase()+ ":" + number + ":" +
                devsDetails.substring(devsDetails.length() -3).toUpperCase();
        JOptionPane.showMessageDialog(null,"This is the taskID: "+id,"TaskID",1);
        return id;
                }
    
    //print task details after user is done adding the task details
    public String printTaskDetails(){
    String details = "TaskNumber:" + number +  "\nTask name:" + name +  "\nTask Description:" 
        + description + "\nDeveloper:" + devsDetails + "\nTask Duration:" + duration + "hours" 
            +  "\n Task ID:" + id + "\nTaskStatus:" + status +  "" ;
        return details;
}
    public static int returnTotalHours(int[] taskDurations) {
    int total = 0;
    for (int hours : taskDurations) {
        total += hours; 
    }
    return total; 
}
    //properties are the Getters and Setters(they are used to get and return values)
            public String getName() { return name; }
            public void setName(String name) { this.name = name; }

            public int getNumber() { return number; }
            public void setNumber(int number) { this.number = number; }

            public String getDescription() { return description; }
            public void setDescription(String description) { this.description = description; }

            public String getDevsDetails() { return devsDetails; }
            public void setDevsDetails(String devsDetails) { this.devsDetails = devsDetails; }

            public int getDuration() { return duration; }
            public void setDuration(int duration) { this.duration = duration; }

            public String getID() { return id; }
            public void setID(String id) { this.id = id; }

            public String getStatus() { return status; }
            public void setStatus(String status) { this.status = status; }

            //display task details after user is done adding the task details
            public String displayingTasks() {
            String details = "TaskNumber:" + number +  "\nTask name:" + name +  "\nTask Description:" 
                    + description + "\nDeveloper:" + devsDetails + "\nTask Duration:" + duration + "hours" +   "\n Task ID:" + id + "\nTaskStatus:" + status +  "" ;
                    return details;
        } 

/*
What's left to add in part 2: 
1.the part where the task is with its details is displayed.~DONE~
2.the hour thingie. how to calculate the hours.~videos are confusing~
3.the part where the ID is created(how to automate it).~DONE BUT ITS DISPLAYING UNDER NAME~ : ~FIXED IT~
4.the task 1 and task 2 JUnit testing.~DONE~
5.GitHub:but its not neccessary.
*/



       
        }
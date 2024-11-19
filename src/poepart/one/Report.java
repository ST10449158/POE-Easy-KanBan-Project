/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poepart.one;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class Report {
    //part 3 methods and populated arrays
 
public static String[] TaskNames = new String[3];
public static String[] Description = new String[4];
public static String[] Developer  = new String[4];
public static String[] TaskStatus  = new String[4];
public static String[] TaskID  = new String[4];
public static int[] TaskNumbers  = new int[4];
public static int[] TasksDuration  = new int[4];


        public static void DisplayDoneTasks(){ 
            
            for(int i = 0; i < TaskStatus.length; i++){
            if(TaskStatus[i].equals("Done")){
        JOptionPane.showMessageDialog(null,"Developer Details: "+ Developer[i]+"\nTask Name :"
        + TaskNames[i]+ "\nTask Duration : " + TasksDuration[i]+ "hrs" + "\nTask Status: " + TaskStatus[i],"Task Status",1);
            }
            
     }
        }
        public static void LongestTaskDuration(){
            
            int longestTask = TasksDuration[0];
            int subScript = 0;
            for(int i = 0; i < TasksDuration.length; i++){
            if(longestTask < TasksDuration[i]){
            longestTask= TasksDuration[i];
            subScript = i;
    
}
            }
        JOptionPane.showMessageDialog(null, "Developer Details: " + Developer[subScript]+ "\nTask Duration: "
                 + longestTask + "hrs","Task with longest duration",1);
        }
        
        public static void SearchForTask(){
        String TaskName;

        
        for(int i = 0; i < TaskNames.length; i++){
            
            
        if(TaskNames[i].equalsIgnoreCase("TaskNames")){
        JOptionPane.showMessageDialog(null,"Task Name : " + Developer[i] + "\nTask Status:" 
                +TaskStatus[i],"Developer Task",1);
        }
  }
        }
        
        public static void DevelopersTasks(){
            String devTask;
            devTask = JOptionPane.showInputDialog(null, "Please enter the full name of the developer: ",
            "Task assigned to developer", 1);
            for(int i = 0; i < Developer.length; i++){
            if(Developer[i].equalsIgnoreCase(devTask)){
            JOptionPane.showMessageDialog(null,"Developer Details : " + Developer[i]+ "\nTask Name: "
            + TaskNames[i] + "\nTask Status:" + TaskStatus[i],"Developer Task",1);
       }
  }    
       } 
       
        public static void DeleteTasks(){
            
        String nameOfTask;
        int indexLess = 0;
        String[]newTaskName;
        int[]newTaskNumber;
        String[]newdescription;
        String[]newDeveloper;
        int[]newDuration;
        String[]newID;
        String[]newStatus;
        
//        TaskID = new String[TaskID.length-1];
//        TaskStatus = new String[TaskStatus.length-1];
//        TasksDuration= new int[TasksDuration.length-1];
//        TaskNames = new String[TaskNames.length-1];
//        TaskNumbers = new int[TaskNumbers.length-1];
//        Developer= new String[Developer.length-1];
//        Description = new String[Description.length-1];        
        
         String taskname = JOptionPane.showInputDialog(null, "Please write the name of the Task you want to delete.", "Delete a Task", 2);
//        Integer.parseInt(TaskNames);
        
        for(int i = 0; i < TaskNames.length; i++){
            
        if(!TaskNames[i].equalsIgnoreCase(taskname)){
        TaskNames[indexLess] = TaskNames[i];
        TaskNumbers[indexLess] = TaskNumbers[i];
        Description[indexLess] = Description[i];
        Developer[indexLess] = Developer[i];
        TasksDuration[indexLess] = TasksDuration[i];
        TaskID[indexLess] = TaskID[i];
        TaskStatus[indexLess] = TaskStatus[i];
        indexLess++;
        }
        }
        JOptionPane.showMessageDialog(null, "The Task has been deleted", "Successfully Deleted", 1);
        
} 
        public static void DisplayTaskReport(){
            for(int i = 0; i < TaskNames.length; i++){
        JOptionPane.showMessageDialog(null,"Task Name: " + TaskNames[i] + "\nTask number:" + TaskNumbers[i]
                + "\nTask Description: " + Description[i] + "\nDeveloper Details: " + Developer[i] + "\nTask Duration:"
                + TasksDuration[i] + "hours" + "\nTask ID: " + TaskID[i]+ "\nTask Status: " + TaskStatus[i] ,"Task Report",1);
}
    
} 
}

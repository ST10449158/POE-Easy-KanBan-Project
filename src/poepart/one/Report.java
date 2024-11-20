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
 
    static String[] Developer = {"Mike Smith", "Edward Harrington", "Samantha Paulson", "Glenda Oberholzer"};
    static String[] TaskNames = {"Create Login", " Create Add Features", "Create Reports", "Add Arrays"};
    static int[] TaskID = {1, 2, 3, 4};
    static int[] TasksDuration = {5, 8, 2, 11};
    static  String[] TaskStatus = {"To Do", "Doing", "Done", "To Do"};
    static int TaskNumbers[];
    static String Description[];


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
       
        for(int i = 0; i < TaskNames.length; i++){
            JOptionPane.showInputDialog("Enter Task you want to search");
        String[]Developer={"Mike Smith","Edward Harrison","Samantha Paulson","Glenda Oberholzer"};
        String[]TaskNames ={"Create Login","Create Add Features","Create Reports","Add Arrays"};
        String[]TaskStatus ={"To Do","Doing","Done","To Do"};
        int[]TaskNumbers= {1,2,3,4};
        String[] Description = {"Login functionality for the system.","Adding extra features to the app.",
            "Creating reports for analysis.","Adding array functionality."};
        int[] TasksDuration = {5, 8, 2, 11};
            
       
            if (TaskNames[i].equalsIgnoreCase("taskNameToSearch")) {
               
                // Display task details
                JOptionPane.showMessageDialog(
                        null,
                        "Task Name: " + TaskNames[i] +"\nDeveloper: " + Developer[i] + "\nTask Status: " + TaskStatus[i] +
                                "\nTask Duration: " + TasksDuration[i] + " hours" + "\nDescription: " + Description[i],
                        "Task Found", JOptionPane.INFORMATION_MESSAGE);
              
        }else {
            JOptionPane.showMessageDialog(null,"Task not found","Developer Task",1);
        } break;
  }  
        }
        
        public static void DevelopersTasks(){
            String devTask;
            devTask = JOptionPane.showInputDialog(null, "Please enter the full name of the developer: ",
            "Task assigned to developer", 1);
            for(int i = 0; i < Developer.length; i++){
            if(Developer[i].equalsIgnoreCase(devTask)){
            JOptionPane.showMessageDialog(null,"Developer Details : " + Developer[i]+ "\nTask Name: "
            + TaskNames[i] + "\nTask Status: " + TaskStatus[i],"Developer Task: ",1);
       }
  }    
       } 
       
        public static void DeleteTasks(){
            
        String[]Developer={"Mike Smith","Edward Harrison","Samantha Paulson","Glenda Oberholzer"};
        String[]TaskNames ={"Create Login","Create Add Features","Create Reports","Add Arrays"};
        String[]TaskStatus ={"To Do","Doing","Done","To Do"};
        int[]TaskNumbers= {1,2,3,4};
        String[] Description = {"Login functionality for the system.","Adding extra features to the app.",
            "Creating reports for analysis.","Adding array functionality."};
        int[] TasksDuration = {5, 8, 2, 11};
        
        for (int i = 0; i < TaskNames.length; i++) {
        if (TaskNames[i].equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null,"Task Name " + TaskNames[i] + "successfully deleted.");
            TaskNames[i] = null; 
            return;
        }
    }
    System.out.println("Task not found.");
}
        public static void DisplayTaskReport(){
        String[]Developer={"Mike Smith","Edward Harrison","Samantha Paulson","Glenda Oberholzer"};
        String[]TaskNames ={"Create Login","Create Add Features","Create Reports","Add Arrays"};
        String[]TaskStatus ={"To Do","Doing","Done","To Do"};
        int[]TaskNumbers= {1,2,3,4};
        String[] Description = {"Login functionality for the system.","Adding extra features to the app.",
            "Creating reports for analysis.","Adding array functionality."};
        int[] TasksDuration = {5, 8, 2, 11};
        
            for(int i = 0; i < TaskNames.length; i++){
        JOptionPane.showMessageDialog(null,"Task Name: " + TaskNames[i] + "\nTask number:" + TaskNumbers[i]
                + "\nTask Description: " + Description[i] + "\nDeveloper Details: " + Developer[i] + "\nTask Duration:"
                + TasksDuration[i] + "hours" + "\nTask ID: " + TaskID[i]+ "\nTask Status: " + TaskStatus[i] ,"Task Report",1);
}
        
}
}
//        public static String[]
        
//      at poepart.one.Report.DisplayTaskReport(Report.java:117)
//	at poepart.one.Login.Options(Login.java:262)
//	at poepart.one.PoePartOne.main(PoePartOne.java:64)
        
//        Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "poepart.one.Report.TaskNumbers" is null
//	at poepart.one.Report.DisplayTaskReport(Report.java:117)
//	at poepart.one.Login.Options(Login.java:262)
//	at poepart.one.PoePartOne.main(PoePartOne.java:64)
       

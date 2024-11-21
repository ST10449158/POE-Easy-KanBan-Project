/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package poepart.one;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RC_Student_lab
 */
public class ReportTest {
    
    Login myObj = new Login();
    Task myobj = new Task("Task name",0,"task description","Developers details",0,"Task ID", "task Status"  );
    AddingTasks Myobj = new AddingTasks();
    Report obj = new Report();       
    
    public ReportTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
    @Test
    public void TestDisplayDoneTasks() {
        String[]Developer={"Mike Smith","Edward Harrison","Samantha Paulson","Glenda Oberholzer"};
        String[]TaskName ={"Create Login","Create Add Features","Create Reports","Add Arrays"};
        String[]Status ={"To Do","Doing","Done","To Do"};
        int[]duration ={5,8,2,11};
        Report.DisplayDoneTasks();
        }

    @Test
    public void TestLongestTaskDuration() {
        String[]Developer={"Mike Smith","Edward Harrison","Samantha Paulson","Glenda Oberholzer"};
        int[]duration ={5,8,2,11};
        Report.DisplayDoneTasks(); 
    }

    @Test
    public void TestSearchForTask() {
        String[]Developer={"Mike Smith","Edward Harrison","Samantha Paulson","Glenda Oberholzer"};
        String[]TaskName ={"Create Login","Create Add Features","Create Reports","Add Arrays"};
        String[]Status ={"To Do","Doing","Done","To Do"};
        int[]duration ={5,8,2,11};
        Report.SearchForTask();
        
    }

    @Test
    public void TestDevelopersTasks() {
        String[]Developer={"Mike Smith","Edward Harrison","Samantha Paulson","Glenda Oberholzer"};
        String[]TaskName ={"Create Login","Create Add Features","Create Reports","Add Arrays"};
        String[]Status ={"To Do","Doing","Done","To Do"};
        Report.DevelopersTasks();
    }

   
    @Test
    public void TestDeleteTasks() {
        
        String[]Developer={"Mike Smith","Edward Harrison","Samantha Paulson","Glenda Oberholzer"};
        String[]TaskName ={"Create Login","Create Add Features","Create Reports","Add Arrays"};
        String[]Status ={"To Do","Doing","Done","To Do"};
        String task = "Create Reports";
        Report.DeleteTasks();
        
    }

    
    @Test
    public void TestDisplayTaskReport() {
        String[]Developer={"Mike Smith","Edward Harrison","Samantha Paulson","Glenda Oberholzer"};
        String[]TaskName ={"Create Login","Create Add Features","Create Reports","Add Arrays"};
        String[]Status ={"To Do","Doing","Done","To Do"};
        Report.DisplayTaskReport();
    }
    
}

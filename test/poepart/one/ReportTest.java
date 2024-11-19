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

    /**
     * Test of DisplayDoneTasks method, of class Report.
     */
    @Test
    public void TestDisplayDoneTasks() {
    }

    /**
     * Test of LongestTaskDuration method, of class Report.
     */
    @Test
    public void TestLongestTaskDuration() {
        
    }

    /**
     * Test of SearchForTask method, of class Report.
     */
    @Test
    public void TestSearchForTask() {
        
    }

    /**
     * Test of DevelopersTasks method, of class Report.
     */
    @Test
    public void TestDevelopersTasks() {
        
    }

   
    @Test
    public void TestDeleteTasks() {
        
    }

    /**
     * Test of DisplayTaskReport method, of class Report.
     */
    @Test
    public void TestDisplayTaskReport() {
        
    }
    
}

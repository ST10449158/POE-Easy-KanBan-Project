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
public class TaskTest {
    Login obj = new Login();
    Task myobj = new Task("Task name",0,"task description","Developers details",0,"Task ID", "task Status"  );       
    
    AddingTasks Myobj = new AddingTasks();
    public TaskTest() {
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
     * Test of CheckTaskDescription method, of class Task.
     */
    @Test

    public void CheckValidTaskDescription() {
        Task myobj = new Task("Login Feature",1,"Create login to authenticate users","Robyn Harrison",8,"Task ID", "To Do"  );       
     
        String description = "Create login to authenticate users";
        assertTrue(description,myobj.CheckTaskDescription());
        assertEquals(description,myobj.getDescription());
        
    }
    
    @Test
    public void CheckInvalidTaskDescription(){
         Task myobj = new Task("Login Feature",1,"Create login to authenticate usershhhhhhhhhhhhhhhhhhhhhhhh","Robyn Harrison",8,"Task ID", "To Do"  );       
    
        String description  = "Create login to authenticate usershhhhhhhhhhhhhhhhhhhhhhhh";
        assertFalse(description,myobj.CheckTaskDescription());
        assertEquals(description,myobj.getDescription());
        
    }

    @Test 
    public void CheckCreateTaskID(){
        Task myobj = new Task("Login Feature",1,"Create login to authenticate users","Robyn Harrison",8,"Task ID", "To Do"  );       
    
        String name = "Login feature";
        int number = 0;
        number++;
        String description = "Create login to authenticate users" ;
        String devsDetails = "Robyn Harrison";
        String ID = "LO:0:SON";
        int duration = 8;
        String id = myobj.createTaskID();
        String status = myobj.getStatus();
        assertEquals(id, id);
    
    }
    
    @Test
     public void CheckCreateTaskID2(){
        Task myobj = new Task("Add Task Feature",1,"Create Add Task feature to add task users","Mike Smith",10,"Task ID", "Doing"  );       
    
        String name = "Add Task feature";
        int number = 0;
        number++;
        String description = "Create Add Task feature to add task users" ;
        String devsDetails = "Mike Smith";
        String ID = "AD:0:ITH";
        int duration = 10;
        String id = myobj.createTaskID();
        String status = myobj.getStatus();
        assertEquals(ID, id);
    
    }
    
    @Test
    public void ReturnTotalHours(){
        Task myobj = new Task("Login Feature",1,"Create login to authenticate users","Robyn Harrison",8,"Task ID", "To Do"  );  
        int duration = 8;
        assertEquals(duration,myobj.getDuration());
        
    }
    
} 
  //REFERENCES
  //https://youtu.be/6RcjjpgOj5c?si=b1zaY67eaPg1Djjr (how to use assertEquals)
  //https://eur03.safelinks.protection.outlook.com/?url=https%3A%2F%2Fyoutu.be%2FQEF62Fm81h4%3Fsi%3D2pCSPLwfI1gr5FFX&data=05%7C02%7CST10449158%40rcconnect.edu.za%7C51bbb54805b2444ee41a08dced567e25%7Ce10c8f44f469448fbc0dd781288ff01b%7C0%7C0%7C638646202962430803%7CUnknown%7CTWFpbGZsb3d8eyJWIjoiMC4wLjAwMDAiLCJQIjoiV2luMzIiLCJBTiI6Ik1haWwiLCJXVCI6Mn0%3D%7C0%7C%7C%7C&sdata=Y7mbHzOX04aOy0slWfXR4tPlVWYRBqhcSVEWhHciVgU%3D&reserved=0
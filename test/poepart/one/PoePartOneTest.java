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
public class PoePartOneTest {
     Login obj = new Login();
    public PoePartOneTest() {
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
     * Test of main method, of class PoePartOne.
     */
     @Test
     public void TestValidUsername(){
         assertTrue("Username should be valid",obj.CheckUsername("kyl_1"));
    }

    @Test
    public void TestInvalidUsername(){
        assertFalse("Username should be valid",obj.CheckUsername("kyle!!!!!"));
    }
    @Test
    public void TestInvalidUsernameNoUnderscore(){
        assertFalse("Username should be vail.",obj.CheckUsername("Ch&&sec@ke99!"));
    }

    @Test
    public void TestValidPassword(){
        assertTrue("Password should be valid",obj.CheckPassword("P@ssw0rd"));
    }

    @Test
    public void TestInvalidPassword() {
       assertFalse("Password should be vaild.",obj.CheckPassword("passwrd"));
    }

    @Test
    public void LoginWithCorrectLoginDetails() {
        String Username = "kyl_1";
        String Password = "Ch&&sec@ke99!";
        assertTrue("Login should succeed with the correct login details.",obj.LoginUser(Username));
    }

    @Test
    public void LoginWithIncorrectLoginDetails() {
        String Username = "kyl_1";
        String Password = "Ch&&sec@ke99!";
       
    }
    
   }


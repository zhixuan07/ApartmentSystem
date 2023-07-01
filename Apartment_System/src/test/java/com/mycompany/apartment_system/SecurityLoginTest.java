/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.apartment_system;



import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author zhixu
 */
public class SecurityLoginTest {
    
       SecurityLogin guard ;
       SecurityHomeUI home;
    public SecurityLoginTest() {
        
    }

   @BeforeEach
    public void setup() {
        guard = new SecurityLogin();
        home = new SecurityHomeUI();
    }

    @org.junit.jupiter.api.Test
    public void testLoginValid(){
    String validUsername = "GUARD";
     String validPassword = "GUARD111";
     
     guard.guardUsername.setText(validUsername);
     guard.guardPassword.setText(validPassword);
     guard.triggerLogin();
     assertTrue(guard.isLoggedIn());
     System.out.println("Login success");
}
    
    @org.junit.jupiter.api.Test
    public void testAddVisitor(){
    String name = "george";
     String plate_number = "LMN3933";
     String ic ="020110070279";
     String contact ="01746131824";
     String reason = "visit friend";
     String unit = "A-1-1";
     
    home.visitorNameTextField.setText(name);
    home.visitorICTextField.setText(ic);
    home.visitorContactTextField.setText(contact);
    home.visitReasonTextField.setText(reason);
    home.residentUnitListBox.setSelectedItem(unit);
    home.visitorCarPlateTextField.setText(plate_number);
     home.triggerSaveVisitor();
     assertTrue(home.isSaveVisitor());
     System.out.println("Save visitor success");
}
    @org.junit.jupiter.api.Test
    public void testCaptureTime(){
     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
     LocalTime localTime = LocalTime.now();
        
      String format = dtf.format(localTime);
     String result = home.getCurrentTime();
     
     assertEquals(format,result);
     System.out.println("Capture time successfully");
    }
    @org.junit.jupiter.api.Test
    public void testloadVistorRecord(){
     home.load_data();
     boolean isLoad = home.isLoad();
     assertTrue(isLoad);
     System.out.println("Load visitor record successfully");
    }
    /**
     * Test of triggerLogin method, of class SecurityLogin.
     */
    @Test
    public void testTriggerLogin() {
        System.out.println("triggerLogin");
        SecurityLogin instance = new SecurityLogin();
        instance.triggerLogin();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLoggedIn method, of class SecurityLogin.
     */
    @Test
    public void testIsLoggedIn() {
        System.out.println("isLoggedIn");
        SecurityLogin instance = new SecurityLogin();
        boolean expResult = false;
        boolean result = instance.isLoggedIn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class SecurityLogin.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SecurityLogin.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.apartment_system;

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
public class ManagerLoginNewTest {
    ManagerLoginNew my ;
    public ManagerLoginNewTest() {
        
    }

   @BeforeEach
    public void setup() {
        my = new ManagerLoginNew();
    }

    @org.junit.jupiter.api.Test
    public void testLoginValid(){
    String validUsername = "admin";
     String validPassword = "admin";
     
     my.username_input.setText(validUsername);
     my.password_field.setText(validPassword);
     my.triggerLogin();
     assertTrue(my.isLoggedIn());
     System.out.println("Login success");
}

    /**
     * Test of close method, of class ManagerLoginNew.
     */
    @org.junit.jupiter.api.Test
    public void testClose() {
        System.out.println("close");
        ManagerLoginNew instance = new ManagerLoginNew();
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ManagerLoginNew.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ManagerLoginNew.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.apartment_system;

import javax.swing.JTable;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
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
    ManagerMainPage managermain ;
    public ManagerLoginNewTest() {
        
    }

   @BeforeEach
    public void setup() {
        my = new ManagerLoginNew();
        managermain = new ManagerMainPage();
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
    @org.junit.jupiter.api.Test
    public void testLoginInvalid(){
    String validUsername = "admin";
     String validPassword = "admin22";
     
     my.username_input.setText(validUsername);
     my.password_field.setText(validPassword);
     my.triggerLogin();
     assertFalse(my.isLoggedIn());
     System.out.println("Test passed");
}
    
    
    @Test
    public void testAddResidentAccount(){
    String username = "A-1-4";
    String unit = "A-1-4";
    String email ="test@yahoo.com";
    String password = "test";
    managermain.triggerOpenAddAccountPanel();
    managermain.username_input.setText(username);
    managermain.residentUnitInput.setSelectedItem(unit);
    managermain.email_input.setText(email);
    managermain.password_input.setText(password);
    
    
    
    managermain.triggerAddReisdentAccount();
    
    assertTrue(managermain.isCreatedAccount());
    System.out.println("Test passed");
    }
    @Test 
    public void testLoadResidentBill(){
     String validUsername = "admin";
     String validPassword = "admin";
     
     my.username_input.setText(validUsername);
     my.password_field.setText(validPassword);
     my.triggerLogin();
     
     managermain.triggerOpenBillPanel();
     assertTrue(managermain.isLoadBill());
    
    System.out.println("Test passed");
    }
    
    @Test 
    public void testSearchVisitor(){
    String input = "jason";
    String category = "name";
    
    managermain.SearchByListVisitor.setSelectedItem(category);
    managermain.searchVisitorInput.setText(input);
    managermain.triggerSearchVisitor();
    assertTrue(managermain.isVisitorSearched());
    
    System.out.println("Test passed");
    }
    @Test 
    public void testGenerateVisitorReport(){
    managermain.triggerOpenBillPanel();
    String month = "06";
    String year = "2023";
    managermain.visitorReportMonthSelection.setSelectedItem(month);
    managermain.visitorReportYearSelection.setSelectedItem(year);
    
    managermain.triggerGenerateReport();
    assertTrue(managermain.isGeneratedReport());
    
    System.out.println("Test passed");
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

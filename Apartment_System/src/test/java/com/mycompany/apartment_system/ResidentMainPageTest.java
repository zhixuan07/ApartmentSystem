/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.apartment_system;

import java.sql.ResultSet;
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
public class ResidentMainPageTest {
    ResidentLoginNew Rlogin;
    ResidentMainPage RMain ;
    public ResidentMainPageTest() {
    }

   @BeforeEach
    public void setup() {
        Rlogin = new ResidentLoginNew();
        RMain= new ResidentMainPage();
    }

    @Test 
    public void testResidentLogin(){
        String username = "A-1-1";
        String password = "123";
        Rlogin.residentUsernameInput.setText(username);
        Rlogin.residentPasswordInput.setText(password);
        Rlogin.triggerLogin();
        assertTrue(Rlogin.isLoggedIn());
        System.out.println("Test passed");
    }
    
    /**
     * Test of loadResident method, of class ResidentMainPage.
     */
    @Test
    public void testLoadResident() {
        System.out.println("loadResident");
        ResidentMainPage instance = new ResidentMainPage();
        instance.loadResident();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadResident2 method, of class ResidentMainPage.
     */
    @Test
    public void testLoadResident2() {
        System.out.println("loadResident2");
        ResidentMainPage instance = new ResidentMainPage();
        instance.loadResident2();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadPendingPayment method, of class ResidentMainPage.
     */
    @Test
    public void testLoadPendingPayment() {
        System.out.println("loadPendingPayment");
        ResidentMainPage instance = new ResidentMainPage();
        instance.loadPendingPayment();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadHistoryPayment method, of class ResidentMainPage.
     */
    @Test
    public void testLoadHistoryPayment() {
        System.out.println("loadHistoryPayment");
        ResidentMainPage instance = new ResidentMainPage();
        instance.loadHistoryPayment();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentMaintancePayment method, of class ResidentMainPage.
     */
    @Test
    public void testGetCurrentMaintancePayment() {
        System.out.println("getCurrentMaintancePayment");
        ResidentMainPage instance = new ResidentMainPage();
        ResultSet expResult = null;
        ResultSet result = instance.getCurrentMaintancePayment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentPassword method, of class ResidentMainPage.
     */
    @Test
    public void testGetCurrentPassword() throws Exception {
        System.out.println("getCurrentPassword");
        String sql = "";
        Object[] params = null;
        ResidentMainPage instance = new ResidentMainPage();
        ResultSet expResult = null;
        ResultSet result = instance.getCurrentPassword(sql, params);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of payByCredit method, of class ResidentMainPage.
     */
    @Test
    public void testPayByCredit() {
        System.out.println("payByCredit");
        String type = "";
        ResidentMainPage instance = new ResidentMainPage();
        instance.payByCredit(type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paySinkingByCredit method, of class ResidentMainPage.
     */
    @Test
    public void testPaySinkingByCredit() {
        System.out.println("paySinkingByCredit");
        ResidentMainPage instance = new ResidentMainPage();
        instance.paySinkingByCredit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadManagementForum method, of class ResidentMainPage.
     */
    @Test
    public void testLoadManagementForum() {
        System.out.println("loadManagementForum");
        ResidentMainPage instance = new ResidentMainPage();
        instance.loadManagementForum();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadResidentForum method, of class ResidentMainPage.
     */
    @Test
    public void testLoadResidentForum() {
        System.out.println("loadResidentForum");
        ResidentMainPage instance = new ResidentMainPage();
        instance.loadResidentForum();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadManagementReply method, of class ResidentMainPage.
     */
    @Test
    public void testLoadManagementReply() {
        System.out.println("loadManagementReply");
        String forum_id = "";
        ResidentMainPage instance = new ResidentMainPage();
        instance.loadManagementReply(forum_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadResidentReply method, of class ResidentMainPage.
     */
    @Test
    public void testLoadResidentReply() {
        System.out.println("loadResidentReply");
        String forum_id = "";
        ResidentMainPage instance = new ResidentMainPage();
        instance.loadResidentReply(forum_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadNotification method, of class ResidentMainPage.
     */
    @Test
    public void testLoadNotification() {
        System.out.println("loadNotification");
        ResidentMainPage instance = new ResidentMainPage();
        instance.loadNotification();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAlphabetic method, of class ResidentMainPage.
     */
    @Test
    public void testIsAlphabetic() {
        System.out.println("isAlphabetic");
        String input = "";
        boolean expResult = false;
        boolean result = ResidentMainPage.isAlphabetic(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNumeric method, of class ResidentMainPage.
     */
    @Test
    public void testIsNumeric() {
        System.out.println("isNumeric");
        String input = "";
        boolean expResult = false;
        boolean result = ResidentMainPage.isNumeric(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ResidentMainPage.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ResidentMainPage.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

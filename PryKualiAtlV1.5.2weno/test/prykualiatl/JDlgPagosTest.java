/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prykualiatl;

import javax.swing.JTextField;
import junit.framework.TestCase;

/**
 *
 * @author Orus
 */
public class JDlgPagosTest extends TestCase {
    
    public JDlgPagosTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of muestra method, of class JDlgPagos.
     */
    public void testMuestra() {
        System.out.println("muestra");
        JDlgPagos instance = null;
        instance.muestra();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class JDlgPagos.
     */
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JDlgPagos.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJTxtBuscar method, of class JDlgPagos.
     */
    public void testGetJTxtBuscar() {
        System.out.println("getJTxtBuscar");
        JDlgPagos instance = null;
        JTextField expResult = null;
        JTextField result = instance.getJTxtBuscar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJTxtBuscar method, of class JDlgPagos.
     */
    public void testSetJTxtBuscar() {
        System.out.println("setJTxtBuscar");
        JTextField JTxtBuscar = null;
        JDlgPagos instance = null;
        instance.setJTxtBuscar(JTxtBuscar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

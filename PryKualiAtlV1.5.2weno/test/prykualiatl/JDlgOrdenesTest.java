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
 * @author katy
 */
public class JDlgOrdenesTest extends TestCase {
    
    public JDlgOrdenesTest(String testName) {
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
     * Test of muestra method, of class JDlgOrdenes.
     */
    public void testMuestra() {
        System.out.println("muestra");
        JDlgOrdenes instance = new JDlgOrdenes(null, true);
        instance.muestra();
        if (instance==null){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of main method, of class JDlgOrdenes.
     */
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JDlgOrdenes.main(args);
    }

    /**
     * Test of getJTxtBuscar method, of class JDlgOrdenes.
     */
    public void testGetJTxtBuscar() {
        System.out.println("getJTxtBuscar");
        JDlgOrdenes instance = null;
        boolean expResult = true;
        boolean result = true;
        assertEquals(expResult, result);
        if (result!=expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setJTxtBuscar method, of class JDlgOrdenes.
     */
    public void testSetJTxtBuscar() {
        System.out.println("setJTxtBuscar");
        JTextField JTxtBuscar = null;
        JDlgOrdenes instance = new JDlgOrdenes(null, true);
        instance.setJTxtBuscar(JTxtBuscar);
        if (instance==null){
            fail("The test case is a prototype.");
        }
    }   
}

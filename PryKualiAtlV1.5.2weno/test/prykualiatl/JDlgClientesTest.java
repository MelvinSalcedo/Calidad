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
 * @author jhunior
 */
public class JDlgClientesTest extends TestCase {
    
    public JDlgClientesTest(String testName) {
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
     * Test of muestra method, of class JDlgClientes.
     */
    public void testMuestra() {
        System.out.println("muestra");
        JDlgClientes instance = new JDlgClientes(null, true);
        instance.muestra();
    }

    /**
     * Test of main method, of class JDlgClientes.
     */
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JDlgClientes.main(args);
    }

    /**
     * Test of getJTxtBuscar method, of class JDlgClientes.
     */
    public void testGetJTxtBuscar() {
        System.out.println("getJTxtBuscar");
        JDlgClientes instance = new JDlgClientes(null, true);
        JTextField expResult = null;
        JTextField result = instance.getJTxtBuscar();
        assertEquals(expResult, result);
    }
    /**
     * Test of setJTxtBuscar method, of class JDlgClientes.
    */
    public void testSetJTxtBuscar() {
        System.out.println("setJTxtBuscar");
        JTextField JTxtBuscar = null;
        JDlgClientes instance = new JDlgClientes(null, true);
        instance.setJTxtBuscar(JTxtBuscar);
        if (instance==null){
            fail("The test case is a prototype.");
        }
    }
}

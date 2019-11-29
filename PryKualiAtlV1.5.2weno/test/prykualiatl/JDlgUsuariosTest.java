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
public class JDlgUsuariosTest extends TestCase {
    
    public JDlgUsuariosTest(String testName) {
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
     * Test of muestra method, of class JDlgUsuarios.
     */
    public void testMuestra() {
        System.out.println("muestra");
        JDlgUsuarios instance = new JDlgUsuarios(null, true);
        instance.muestra();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getJTxtBuscar method, of class JDlgUsuarios.
     */
    public void testGetJTxtBuscar() {
        System.out.println("getJTxtBuscar");
        JDlgUsuarios instance = new JDlgUsuarios(null, true) ;
        System.out.println("--->>" +instance.getJTxtBuscar());
        JTextField expResult = instance.getJTxtBuscar();
        JTextField result =instance.getJTxtBuscar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setJTxtBuscar method, of class JDlgUsuarios.
     */
    public void testSetJTxtBuscar() {
        System.out.println("setJTxtBuscar");
        JTextField JTxtBuscar = null;
        JDlgUsuarios instance = new JDlgUsuarios(null, true);
        instance.setJTxtBuscar(JTxtBuscar);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

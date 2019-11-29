/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prykualiatl;

import javax.swing.JTextField;
import junit.framework.TestCase;
import org.junit.Assert;
/**
 *
 * @author jhunior
 */
public class JDlgPagosTest extends TestCase{
    private JDlgPagos instance;
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
        JDlgPagos instance = new JDlgPagos(null,true);
        instance.muestra();
    }

    /**
     * Test of main method, of class JDlgPagos.
     */
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JDlgPagos.main(args);
    }

    /**
     * Test of getJTxtBuscar method, of class JDlgPagos.
     */
    public void testGetJTxtBuscar() {
        System.out.println("getJTxtBuscar");
        instance = new JDlgPagos(null,true);
        JTextField expResult = instance.getJTxtBuscar();
        JTextField result = instance.getJTxtBuscar();
        System.out.println("aquiiii:   "+result);
        assertEquals(expResult, result);
    }

    /**
     * Test of setJTxtBuscar method, of class JDlgPagos.
     */
    public void testSetJTxtBuscar() {
        System.out.println("setJTxtBuscar");
        JTextField JTxtBuscar = null;
        JDlgPagos instance = new JDlgPagos(null,true);
        instance.setJTxtBuscar(JTxtBuscar);
    }
}

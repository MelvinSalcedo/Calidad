/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prykualiatl;

import junit.framework.TestCase;

/**
 *
 * @author Orus
 */
public class bdDatosTest extends TestCase {
    
    public bdDatosTest(String testName) {
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
     * Test of Conectar method, of class bdDatos.
     */
    public void testConectar() {
        System.out.println("Conectar");
        bdDatos instance = new bdDatos();
        instance.Conectar();
    }

    /**
     * Test of Consultar method, of class bdDatos.
     */
    public void testConsultar() {
        System.out.println("Consultar");
        String strSQL = "";
        bdDatos instance = new bdDatos();
        Object[][] expResult = null;
        
        Object[][] result = null;//instance.Consultar(strSQL);
        
        assertEquals(expResult, result);
    }    
}

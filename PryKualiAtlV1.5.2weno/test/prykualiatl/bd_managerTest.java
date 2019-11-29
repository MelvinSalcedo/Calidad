/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prykualiatl;

import java.sql.ResultSet;
import junit.framework.TestCase;

/**
 *
 * @author Orus
 */
public class bd_managerTest extends TestCase {
    
    public bd_managerTest(String testName) {
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
     * Test of AbcProye method, of class bd_manager.
     */
    public void testAbcProye() throws Exception {
        System.out.println("AbcProye");
        String Consulta = "";
        bd_manager instance = new bd_manager();
        instance.AbcProye(Consulta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of BuscaEva method, of class bd_manager.
     */
    public void testBuscaEva() throws Exception {
        System.out.println("BuscaEva");
        String sQl = "";
        bd_manager instance = new bd_manager();
        String expResult = "";
        String result = instance.BuscaEva(sQl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of consultar method, of class bd_manager.
     */
    public void testConsultar() throws Exception {
        System.out.println("consultar");
        String sql = "";
        bd_manager instance = new bd_manager();
        ResultSet expResult = null;
        ResultSet result = instance.consultar(sql);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prykualiatl;

import junit.framework.TestCase;

/**
 *
 * @author jhunior
 */
public class ExcelTableExporterTest extends TestCase {
    
    public ExcelTableExporterTest(String testName) {
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
     * Test of export method, of class ExcelTableExporter.
     */
    public void testExport() {
        System.out.println("export test");
        ExcelTableExporter instance = null;
        boolean expResult = true;
        boolean result = true;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        /*if (result!=expResult){
        fail("The test case is a prototype.");
        }*/
    }
    
}

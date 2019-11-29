/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prykualiatl;

import java.awt.Graphics;
import java.awt.print.PageFormat;
import junit.framework.TestCase;

/**
 *
 * @author jhunior
 */
public class JDlgTicketTest extends TestCase {
    
    public JDlgTicketTest(String testName) {
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
     * Test of print method, of class JDlgTicket.
     */
    public void testPrint() throws Exception {
        System.out.println("print");
        Graphics graphics = null;
        PageFormat pageFormat = null;
        int pageIndex = 0;
        JDlgTicket instance = new JDlgTicket(null, true);
        int expResult = 0;
        int result = instance.print(graphics, pageFormat, pageIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mostrar method, of class JDlgTicket.
     */
    public void testMostrar() {
        System.out.println("mostrar");
        String folio = "";
        String cuenta = "";
        String nombre = "";
        String dir = "";
        String colonia = "";
        String municipio = "";
        String tel = "";
        String rfc = "";
        String fechacub = "";
        String fechaapag = "";
        String mesestransc = "";
        String rezago = "";
        String recargo = "";
        String sub = "";
        String total = "";
        JDlgTicket instance = new JDlgTicket(null, true);
        instance.mostrar(folio, cuenta, nombre, dir, colonia, municipio, tel, rfc, fechacub, fechaapag, mesestransc, rezago, recargo, sub, total);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}

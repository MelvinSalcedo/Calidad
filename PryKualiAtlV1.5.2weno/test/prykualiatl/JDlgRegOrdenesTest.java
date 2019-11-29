/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prykualiatl;

import junit.framework.TestCase;

/**
 *
 * @author katy
 */
public class JDlgRegOrdenesTest extends TestCase {
    
    public JDlgRegOrdenesTest(String testName) {
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
     * Test of ActivaBotones method, of class JDlgRegOrdenes.
     */
    public void testActivaBotones() {
        System.out.println("ActivaBotones");
        boolean cal = false;
        boolean p = false;
        boolean i = false;
        boolean c = false;
        JDlgRegOrdenes instance = new JDlgRegOrdenes(null, true);
        instance.ActivaBotones(cal, p, i, c);
        // TODO review the generated test code and remove the default call to fail.
         if (instance==null){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of LimpiaCajas method, of class JDlgRegOrdenes.
     */
    public void testLimpiaCajas() {
        System.out.println("LimpiaCajas");
        JDlgRegOrdenes instance = new JDlgRegOrdenes(null, true);
        instance.LimpiaCajas();
        // TODO review the generated test code and remove the default call to fail.
         if (instance==null){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of mostrar method, of class JDlgRegOrdenes.
     */
    public void testMostrar() {
        System.out.println("mostrar");
        String noordenn = "";
        String fechaa = "";
        String tipoo = "";
        String inspectorr = "";
        String nocuentaa = "";
        String nombree = "";
        String diree = "";
        String coloniaa = "";
        String munii = "";
        String telee = "";
        String rfcc = "";
        String mot = "";
        JDlgRegOrdenes instance = new JDlgRegOrdenes(null, true);
        instance.mostrar(noordenn, fechaa, tipoo, inspectorr, nocuentaa, nombree, diree, coloniaa, munii, telee, rfcc, mot);
        // TODO review the generated test code and remove the default call to fail.
         if (instance==null){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of mostrar1 method, of class JDlgRegOrdenes.
     */
    public void testMostrar1() {
        System.out.println("mostrar1");
        String guar = "";
        JDlgRegOrdenes instance = new JDlgRegOrdenes(null, true);
        instance.mostrar1(guar);
        // TODO review the generated test code and remove the default call to fail.
         if (instance==null){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of ultimoregistro method, of class JDlgRegOrdenes.
     */
    public void testUltimoregistro() {
        System.out.println("ultimoregistro");
        JDlgRegOrdenes instance = new JDlgRegOrdenes(null, true);
        instance.ultimoregistro();
        // TODO review the generated test code and remove the default call to fail.
         if (instance==null){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of main method, of class JDlgRegOrdenes.
     */
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JDlgRegOrdenes.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}

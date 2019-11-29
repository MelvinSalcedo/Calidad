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
public class JDlgRegClienteTest extends TestCase {
    
    public JDlgRegClienteTest(String testName) {
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
     * Test of mostrar method, of class JDlgRegCliente.
     */
    public void testMostrar() {
        System.out.println("mostrar");
        String cuenta = "";
        String nombre = "";
        String dato = "";
        String telefono = "";
        String rfc = "";
        String colonia = "";
        String comunidad = "";
        String municipio = "";
        String codigopostal = "";
        String tarifa = "";
        String fechas = "";
        JDlgRegCliente instance = new JDlgRegCliente(null, true);
        instance.mostrar(cuenta, nombre, dato, telefono, rfc, colonia, comunidad, municipio, codigopostal, tarifa, fechas);
        if (instance==null){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of mostrar1 method, of class JDlgRegCliente.
     */
    public void testMostrar1() {
        System.out.println("mostrar1");
        String guar = "";
        //JDlgRegCliente instance = null;
        JDlgRegCliente instance = new JDlgRegCliente(null, true);
        instance.mostrar1(guar);
        if (instance==null){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of LimpiaCajas method, of class JDlgRegCliente.
     */
    public void testLimpiaCajas() {
        System.out.println("LimpiaCajas");
        JDlgRegCliente instance = new JDlgRegCliente(null, true);
        instance.LimpiaCajas();
        if (instance==null){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of ultimoregistro method, of class JDlgRegCliente.
     */
    public void testUltimoregistro() {
        System.out.println("ultimoregistro");
        //JDlgRegCliente instance = null;
        JDlgRegCliente instance = new JDlgRegCliente(null, true);
        instance.ultimoregistro();
        if (instance==null){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of main method, of class JDlgRegCliente.
     */
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JDlgRegCliente instance = new JDlgRegCliente(null, true);
        JDlgRegCliente.main(args);
        if (instance==null){
            fail("The test case is a prototype.");
        }
    }
}

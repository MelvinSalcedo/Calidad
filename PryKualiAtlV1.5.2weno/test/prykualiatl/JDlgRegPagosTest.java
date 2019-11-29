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
public class JDlgRegPagosTest extends TestCase {
    
    public JDlgRegPagosTest(String testName) {
        super(testName);
    }
    /**
     * Test of LimpiaCajas method, of class JDlgRegPagos.
     */
    public void testLimpiaCajas() {
        System.out.println("LimpiaCajas");
        JDlgRegPagos instance = new JDlgRegPagos(null, true);
        instance.LimpiaCajas();
        // TODO review the generated test code and remove the default call to fail.
        if (instance==null){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of mostrar method, of class JDlgRegPagos.
     */
    public void testMostrar() {
        System.out.println("mostrar");
        String clvfolioo = "1";
        String nombree = "1";
        String diree = "direccion";
        String te = "123";
        String coloniaa = "colonia1";
        String munii = "municipalidad 1";
        String rfcc = "123";
        String tar = "123";
        String nocuentaa = "10";
        String fechacubiertaa = "11-11-2019";
        String mesestranscurridoss = "0";
        String fechadepagoa = "12-11-2019";
        String rezagoo = "0";
        String pagocalculadoo = "100";
        String recargoo = "0";
        String totall = "100";
        String fecharegis = "11-10-2019";
        JDlgRegPagos instance = new JDlgRegPagos(null, true);
        instance.mostrar(clvfolioo, nombree, diree, te, coloniaa, munii, rfcc, tar, nocuentaa, fechacubiertaa, mesestranscurridoss, fechadepagoa, rezagoo, pagocalculadoo, recargoo, totall, fecharegis);
        // TODO review the generated test code and remove the default call to fail.
        if (instance==null){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of mostrar1 method, of class JDlgRegPagos.
     */
    public void testMostrar1() {
        System.out.println("mostrar1");
        String guar = "";
        JDlgRegPagos instance = new JDlgRegPagos(null, true);
        instance.mostrar1(guar);
        // TODO review the generated test code and remove the default call to fail.
        if (instance==null){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of ultimoregistro method, of class JDlgRegPagos.
     */
    public void testUltimoregistro() {
        System.out.println("ultimoregistro");
        JDlgRegPagos instance = new JDlgRegPagos(null, true);
        instance.ultimoregistro();
        // TODO review the generated test code and remove the default call to fail.
        if (instance==null){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of ultimafecha method, of class JDlgRegPagos.
     */
    public void testUltimafecha() {
        System.out.println("ultimafecha");
        JDlgRegPagos instance = new JDlgRegPagos(null, true);
        instance.ultimafecha();
        // TODO review the generated test code and remove the default call to fail.
        if (instance==null){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of calcular method, of class JDlgRegPagos.
     */
    
    public void testCalcular() {
        System.out.println("calcular");
        JDlgRegPagos instance = new JDlgRegPagos(null, true);
        instance.calcular();
        // TODO review the generated test code and remove the default call to fail.
        if (instance==null){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of main method, of class JDlgRegPagos.
     */
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JDlgRegPagos.main(args);
    }
    
}

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
public class JDlgBackupTest extends TestCase {
    
    public JDlgBackupTest(String testName) {
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
     * Test of seleccionar method, of class JDlgBackup.
     */
    public void testSeleccionar() {
        System.out.println("seleccionar");
        JDlgBackup instance = new JDlgBackup(null,true);
        
        System.out.println("nda");
        instance.seleccionar();
    }
    /**
     * Test of main method, of class JDlgBackup.
     */
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JDlgBackup.main(args);
    }    
}

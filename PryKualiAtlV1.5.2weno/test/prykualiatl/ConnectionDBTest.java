/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prykualiatl;

import javax.swing.table.DefaultTableModel;
import junit.framework.TestCase;
import org.junit.*;

/**
 *
 * @author jhunior
 */
public class ConnectionDBTest extends TestCase {
    
    public ConnectionDBTest(String testName) {
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
     * Test of doConnection method, of class ConnectionDB.
     */
    public void testDoConnection() {
        System.out.println("doConnection");
        ConnectionDB instance = new ConnectionDB();
        instance.doConnection();
    }
    
    public void testGetModelBySqlCommand() {
        System.out.println("getModelBySqlCommand");
        String SqlCmd = "";
        ConnectionDB instance = new ConnectionDB();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.getModelBySqlCommand(SqlCmd);
        assertEquals(expResult, result);
    }

    public void testGetCellBySqlCommand() {
        System.out.println("getCellBySqlCommand");
        String SqlCmd = "";
        ConnectionDB instance = new ConnectionDB();
        String expResult = "";
        String result = instance.getCellBySqlCommand(SqlCmd);
        Assert.assertEquals(expResult, result);
    }

    /**
     * Test of UpdateCommand method, of class ConnectionDB.
     */
    public void testUpdateCommand() {
        System.out.println("UpdateCommand");
        String SqlCmd = "";
        ConnectionDB instance = new ConnectionDB();
        instance.UpdateCommand(SqlCmd);
    }

    /**
     * Test of CloseConnectionDB method, of class ConnectionDB.
     */
    public void testCloseConnectionDB() {
        System.out.println("CloseConnectionDB");
        ConnectionDB instance = new ConnectionDB();
        instance.CloseConnectionDB();
    }
    
}

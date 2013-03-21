/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import javax.swing.JTable;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Ed_Acer
 */
public class MyTableModelTest {
    String[] colHeading = {"Chosen Molecules", "Time", "Rate (m/s)", "Molecular Weight (MW)"};
        String[][] data = {{"", "", "", ""},
            {"", "", "", ""}};
        JTable table = new JTable(new MyTableModel(data, colHeading));
    
    public MyTableModelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getColumnClass method, of class MyTableModel.
     */
    @Test
    public void testGetColumnClass() {
        System.out.println("getColumnClass");
        int column = 0;
        Class expResult = String.class ;
        Class result = table.getColumnClass(column);
        assertEquals(expResult, result);

    }

    /**
     * Test of isCellEditable method, of class MyTableModel.
     */
    @Test
    public void testIsCellEditable() {
        System.out.println("isCellEditable");
        int row = 0;
        int column = 0;
        boolean expResult = true;
        boolean result = table.isCellEditable(row, column);
        assertEquals(expResult, result);

    }
}

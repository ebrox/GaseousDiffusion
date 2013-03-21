/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import java.awt.Container;
import javax.swing.JTable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ed_Acer
 */
public class GaseousDiffusionTest {
    
    public GaseousDiffusionTest() {
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
     * Test of addComponentsToPane method, of class GaseousDiffusion.
     */
    @Test
    public void testAddComponentsToPane() {
        System.out.println("addComponentsToPane");
        Container pane = new Container();
        GaseousDiffusion.addComponentsToPane(pane);

    }

    /**
     * Test of clearTable method, of class GaseousDiffusion.
     */
    @Test
    public void testClearTable() {
        System.out.println("clearTable");
        JTable table = new JTable();
        GaseousDiffusion.clearTable(table);

    }

    /**
     * Test of main method, of class GaseousDiffusion.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GaseousDiffusion.main(args);

    }
}

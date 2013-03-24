/**
 * Programmers: Chase McCowan & Ed Broxson 
 * Date: 03/21/2013 
 * Purpose: Test GaseousDiffusion Class
 */
package layout;

import java.awt.Container;
import javax.swing.JTable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
}

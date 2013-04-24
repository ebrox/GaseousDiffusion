/**
 * Programmers: Chase McCowan & Ed Broxson 
 * Date: 03/21/2013 
 * Purpose: Test GaseousDiffusion Class
 */
package layout;

import javax.swing.JTable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


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
     * Test of clearTable method, of class GaseousDiffusion.
     */
    @Test
    public void testClearTable() {
        System.out.println("clearTable");
        JTable table = new JTable();
        GaseousDiffusion.clearTable(table);

    }

    /**
     * Test of destroy method, of class GaseousDiffusion.
     */
    @Test
    public void testDestroy() {
        System.out.println("destroy");
        GaseousDiffusion instance = new GaseousDiffusion();
        instance.destroy();

    }

    /**
     * Test of init method, of class GaseousDiffusion.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        GaseousDiffusion instance = new GaseousDiffusion();
        instance.init();

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

    /**
     * Test of setTableTime1 method, of class GaseousDiffusion.
     */
    @Test
    public void testSetTableTime1() {
        System.out.println("setTableTime1");
        int id = 0;
        GaseousDiffusion instance = new GaseousDiffusion();
        instance.setTableTime1(id);

    }

    /**
     * Test of start method, of class GaseousDiffusion.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        GaseousDiffusion instance = new GaseousDiffusion();
        instance.start();

    }
}

/*
 * Programmers: Ed Broxson & Chase McCowan 
 * Date: 03/14/2013 
 * Purpose: Test GasChamber Class.
 */
package layout;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class GasChamberTest {
    
     private GasChamber gt = new GasChamber();
    
    public GasChamberTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {   
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        // setup variables for first and second particles to test mw1, mw2,
        // time1, time2, vel1, vel2, color1, color2
        gt.particleFill(2, 5);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of draw method, of class GasChamber.
     */
    @Test
    public void testDraw() {
        // not sure how to test this processing based class
        System.out.println("draw");
        GasChamber instance = new GasChamber();
        instance.draw();

    }

    /**
     * Test of getColor1 method, of class GasChamber.
     */
    @Test
    public void testGetColor1() {
        System.out.println("getColor1");
        int[] expResult = {255, 0, 0};
        int[] result = gt.getColor1();
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of getColor2 method, of class GasChamber.
     */
    @Test
    public void testGetColor2() {
        System.out.println("getColor2");
        int[] expResult = {0, 0, 255};
        int[] result = gt.getColor2();
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of getFRate method, of class GasChamber.
     */
    @Test
    public void testGetFRate() {
        System.out.println("getFRate");
        GasChamber instance = new GasChamber();
        int expResult = 85;
        int result = instance.getFRate();
        assertEquals(expResult, result);

    }

    /**
     * Test of getMw1 method, of class GasChamber.
     */
    @Test
    public void testGetMw1() {
        System.out.println("getMw1");
        int expResult = 40;
        int result = gt.getMw1();
        assertEquals(expResult, result);

    }

    /**
     * Test of getMw2 method, of class GasChamber.
     */
    @Test
    public void testGetMw2() {
        System.out.println("getMw2");
        int expResult = 16;
        int result = gt.getMw2();
        assertEquals(expResult, result);

    }

    /**
     * Test of getNumParts method, of class GasChamber.
     */
    @Test
    public void testGetNumParts() {
        System.out.println("getNumParts");
        GasChamber instance = new GasChamber();
        int expResult = 40;
        int result = instance.getNumParts();
        assertEquals(expResult, result);

    }

    /**
     * Test of getTime1 method, of class GasChamber.
     */
    @Test
    public void testGetTime1() {
        System.out.println("getTime1");
        double expResult = 6.0;
        double result = GasChamber.getTime1();
        assertEquals(expResult, result, 0.0);
 
    }

    /**
     * Test of getTime2 method, of class GasChamber.
     */
    @Test
    public void testGetTime2() {
        System.out.println("getTime2");
        double expResult = 3.5;
        double result = GasChamber.getTime2();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of getVel1 method, of class GasChamber.
     */
    @Test
    public void testGetVel1() {
        System.out.println("getVel1");
        float expResult = 0.3162277660168379f;
        float result = gt.getVel1();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of getVel2 method, of class GasChamber.
     */
    @Test
    public void testGetVel2() {
        System.out.println("getVel2");
        float expResult = 0.5f;
        float result = gt.getVel2();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of isbStop method, of class GasChamber.
     */
    @Test
    public void testIsbStop() {
        System.out.println("isbStop");
        GasChamber instance = new GasChamber();
        boolean expResult = false;
        boolean result = instance.isbStop();
        assertEquals(expResult, result);

    }

    /**
     * Test of isGateOpen method, of class GasChamber.
     */
    @Test
    public void testIsGateOpen() {
        System.out.println("isGateOpen");
        GasChamber instance = new GasChamber();
        boolean expResult = false;
        boolean result = instance.isGateOpen();
        assertEquals(expResult, result);

    }

    /**
     * Test of keyPressed method, of class GasChamber.
     */
    @Test
    public void testKeyPressed() {
        System.out.println("keyPressed");
        GasChamber instance = new GasChamber();
        instance.keyPressed();
        
    }

    /**
     * Test of particleFill method, of class GasChamber.
     */
    @Test
    public void testParticleFill() {
        System.out.println("particleFill");
        int part1 = 0;
        int part2 = 3;
        GasChamber instance = new GasChamber();
        instance.particleFill(part1, part2);

    }

    /**
     * Test of setbStop method, of class GasChamber.
     */
    @Test
    public void testSetbStop() {
        System.out.println("setbStop");
        boolean bStop = true;
        GasChamber instance = new GasChamber();
        instance.setbStop(bStop);

    }

    /**
     * Test of setColor1 method, of class GasChamber.
     */
    @Test
    public void testSetColor1() {
        System.out.println("setColor1");
        int[] color1 = {50, 50, 50};
        GasChamber instance = new GasChamber();
        instance.setColor1(color1);

    }

    /**
     * Test of setColor2 method, of class GasChamber.
     */
    @Test
    public void testSetColor2() {
        System.out.println("setColor2");
        int[] color2 = {25, 25, 25};
        GasChamber instance = new GasChamber();
        instance.setColor2(color2);

    }

    /**
     * Test of setFRate method, of class GasChamber.
     */
    @Test
    public void testSetFRate() {
        System.out.println("setFRate");
        int fRate = 100;
        GasChamber instance = new GasChamber();
        instance.setFRate(fRate);

    }

    /**
     * Test of setGateOpen method, of class GasChamber.
     */
    @Test
    public void testSetGateOpen() {
        System.out.println("setGateOpen");
        boolean gateOpen = true;
        GasChamber instance = new GasChamber();
        instance.setGateOpen(gateOpen);

    }

    /**
     * Test of setMw1 method, of class GasChamber.
     */
    @Test
    public void testSetMw1() {
        System.out.println("setMw1");
        int mw1 = 0;
        GasChamber instance = new GasChamber();
        instance.setMw1(mw1);

    }

    /**
     * Test of setMw2 method, of class GasChamber.
     */
    @Test
    public void testSetMw2() {
        System.out.println("setMw2");
        int mw2 = 20;
        GasChamber instance = new GasChamber();
        instance.setMw2(mw2);

    }

    /**
     * Test of setNumParts method, of class GasChamber.
     */
    @Test
    public void testSetNumParts() {
        System.out.println("setNumParts");
        int numParts = 0;
        GasChamber instance = new GasChamber();
        instance.setNumParts(numParts);

    }

    /**
     * Test of setTime1 method, of class GasChamber.
     */
    @Test
    public void testSetTime1() {
        System.out.println("setTime1");
        double time1 = 0.0;
        GasChamber.setTime1(time1);

    }

    /**
     * Test of setTime2 method, of class GasChamber.
     */
    @Test
    public void testSetTime2() {
        System.out.println("setTime2");
        double time2 = 90.0;
        GasChamber.setTime2(time2);

    }

    /**
     * Test of setup method, of class GasChamber.
     */
    @Test
    public void testSetup() {
        // not sure how to test this processing based class
        System.out.println("setup");
        GasChamber instance = new GasChamber();
        instance.setup();

    }
}

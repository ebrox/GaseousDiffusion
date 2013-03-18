/*
 * Programmers: Ed Broxson & Chase McCowan 
 * Date: 03/14/2013 
 * Purpose: Test Element Class.
 */
package layout;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import processing.core.PVector;


public class ElementTest {
    
    public ElementTest() {
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
     * Test of checkEdges method, of class Element.
     */
    @Test
    public void testCheckEdges() {
        System.out.println("checkEdges");
        Element instance = new Element();
        instance.checkEdges();

    }

    /**
     * Test of getDiameter method, of class Element.
     */
    @Test
    public void testGetDiameter() {
        System.out.println("getDiameter");
        Element instance = new Element();
        float expResult = 10.0F;
        float result = instance.getDiameter();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of isGateOpen method, of class Element.
     */
    @Test
    public void testIsGateOpen() {
        System.out.println("isGateOpen");
        boolean expResult = false;
        boolean result = Element.isGateOpen();
        assertEquals(expResult, result);

    }

    /**
     * Test of getHeight method, of class Element.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Element instance = new Element();
        float expResult = 200.0F;
        float result = instance.getHeight();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of getIsSecondWinner method, of class Element.
     */
    @Test
    public void testGetIsSecondWinner() {
        System.out.println("getIsSecondWinner");
        boolean expResult = false;
        boolean result = Element.getIsSecondWinner();
        assertEquals(expResult, result);

    }

    /**
     * Test of getIsWinner method, of class Element.
     */
    @Test
    public void testGetIsWinner() {
        System.out.println("getIsWinner");
        boolean expResult = false;
        boolean result = Element.getIsWinner();
        assertEquals(expResult, result);

    }

    /**
     * Test of getLocation method, of class Element.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        Element instance = new Element();
        PVector expResult = new PVector(90, 100);
        PVector result = instance.getLocation();
        assertEquals(expResult, result);

    }

    /**
     * Test of getMag method, of class Element.
     */
    @Test
    public void testGetMag() {
        System.out.println("getMag");
        Element instance = new Element();
        float expResult = 1.0F;
        float result = instance.getMag();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of getStartBoxWidth method, of class Element.
     */
    @Test
    public void testGetStartBoxWidth() {
        System.out.println("getStartBoxWidth");
        Element instance = new Element();
        float expResult = 200.0F;
        float result = instance.getStartBoxWidth();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of getVelocity method, of class Element.
     */
    @Test
    public void testGetVelocity() {
        System.out.println("getVelocity");
        Element instance = new Element();
        PVector expResult = new PVector(1, 1);
        PVector result = instance.getVelocity();
        assertEquals(expResult, result);

    }

    /**
     * Test of getWidth method, of class Element.
     */
    @Test
    public void testGetWidth() {
        System.out.println("getWidth");
        Element instance = new Element();
        float expResult = 775.0F;
        float result = instance.getWidth();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of setDiameter method, of class Element.
     */
    @Test
    public void testSetDiameter() {
        System.out.println("setDiameter");
        float diameter = 0.0F;
        Element instance = new Element();
        instance.setDiameter(diameter);

    }

    /**
     * Test of setGateOpen method, of class Element.
     */
    @Test
    public void testSetGateOpen() {
        System.out.println("setGateOpen");
        boolean gateOpen = true;
        Element.setGateOpen(gateOpen);

    }

    /**
     * Test of setHeight method, of class Element.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        float height = 0.0F;
        Element instance = new Element();
        instance.setHeight(height);

    }

    /**
     * Test of setIsSecondWinner method, of class Element.
     */
    @Test
    public void testSetIsSecondWinner() {
        System.out.println("setIsSecondWinner");
        boolean isSecondWinner = true;
        Element.setIsSecondWinner(isSecondWinner);

    }

    /**
     * Test of setIsWinner method, of class Element.
     */
    @Test
    public void testSetIsWinner() {
        System.out.println("setIsWinner");
        boolean isWinner = true;
        Element.setIsWinner(isWinner);

    }
    
    /**
     * Test of setLocation method, of class Element.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        PVector location = new PVector(10, 10);
        Element instance = new Element();
        instance.setLocation(location);

    }
    
    /**
     * Test of setMag method, of class Element.
     */
    @Test
    public void testSetMag() {
        System.out.println("setMag");
        float mag = 0.0F;
        Element instance = new Element();
        instance.setMag(mag);

    }

    /**
     * Test of setStartBoxWidth method, of class Element.
     */
    @Test
    public void testSetStartBoxWidth() {
        System.out.println("setStartBoxWidth");
        float startBoxWidth = 0.0F;
        Element instance = new Element();
        instance.setStartBoxWidth(startBoxWidth);

    }

    /**
     * Test of setVelocity method, of class Element.
     */
    @Test
    public void testSetVelocity() {
        System.out.println("setVelocity");
        PVector velocity = new PVector(10, 10);
        Element instance = new Element();
        instance.setVelocity(velocity);

    }

    /**
     * Test of setWidth method, of class Element.
     */
    @Test
    public void testSetWidth() {
        System.out.println("setWidth");
        float width = 0.0F;
        Element instance = new Element();
        instance.setWidth(width);

    }

    /**
     * Test of update method, of class Element.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Element[] particles = new Element[2];
        particles[0] = new Element(95, 55, 1, 4, 1, 0, particles);
        particles[1] = new Element(105, 155, -1, 6, 1, 1, particles);        
        particles[0].update();

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmicalc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author comqsjb
 */
public class BMIDataTest {
    
    public BMIDataTest() {
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
     * Test of getHeight method, of class BMIData.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        BMIData instance = new BMIData();
        float expResult = 0.0F;
        float result = instance.getHeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testSetHeightNegative() {
        System.out.println("testSetHeightNegative");
        BMIData instance = new BMIData();
        instance.setHeight(-1);
        float expResult = 0.0F;
        float result = instance.getHeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setHeight method, of class BMIData.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        float height = 0.0F;
        BMIData instance = new BMIData();
        instance.setHeight(height);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getWeight method, of class BMIData.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        BMIData instance = new BMIData();
        float expResult = 0.0F;
        float result = instance.getWeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setWeight method, of class BMIData.
     */
    @Test
    public void testSetWeight() {
        System.out.println("setWeight");
        float weight = 0.0F;
        BMIData instance = new BMIData();
        instance.setWeight(weight);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}

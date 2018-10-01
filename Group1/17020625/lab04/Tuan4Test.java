/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan4;

import Tuan4.Tuan4;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CCNE
 */
public class Tuan4Test {
    
    public Tuan4Test() {
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
     * Test of main method, of class Tuan3.
     */
   

    /**
     * Test of max2so method, of class Tuan3.
     */
    @Test
    public void testMax2so() {
        System.out.println("max2so");
        int a = 1;
        int b = 3;
        int expResult = 3;
        int result = Tuan4.max2so(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
  @Test
    public void testMax2so1() {
        System.out.println("max2so");
        int a = 2;
        int b = 4;
        int expResult = 4;
        int result = Tuan4.max2so(a, b);
        assertEquals(expResult, result);
        
        
    }
      @Test
    public void testMax2so2() {
        System.out.println("max2so");
        int a = 1;
        int b = 4;
        int expResult = 4;
        int result = Tuan4.max2so(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
      @Test
    public void testMax2so3() {
        System.out.println("max2so");
        int a = 2;
        int b = 8;
        int expResult = 8;
        int result = Tuan4.max2so(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
      @Test
    public void testMax2so4() {
        System.out.println("max2so");
        int a = 8;
        int b = 9;
        int expResult = 9;
        int result = Tuan4.max2so(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
 
    
    @Test
    public void testSmallarray() {
        System.out.println("smallarray");
        int[] arr = {1 ,2 ,3};
        int expResult = 1;
        int result = Tuan4.smallarray(arr);
        assertEquals(expResult, result);
        
        
    }
    @Test
    public void testSmallarray1() {
        System.out.println("smallarray");
        int[] arr = {3,33,333};
        int expResult = 3;
        int result = Tuan4.smallarray(arr);
        assertEquals(expResult, result);
        
        
    }

    @Test
    public void testSmallarray2() {
        System.out.println("smallarray");
        int[] arr = {11,111,1111};
        int expResult = 11;
        int result = Tuan4.smallarray(arr);
        assertEquals(expResult, result);
        
        
    }

    @Test
    public void testSmallarray3() {
        System.out.println("smallarray");
        int[] arr = {12,123,1234};
        int expResult = 12;
        int result = Tuan4.smallarray(arr);
        assertEquals(expResult, result);
        
        
    }

    @Test
    public void testSmallarray4() {
        System.out.println("smallarray");
        int[] arr = {45,456,4567};
        int expResult = 45;
        int result = Tuan4.smallarray(arr);
        assertEquals(expResult, result);
        
        
    }


    
    @Test
    public void testBMI() {
        System.out.println("BMI");
        double height = 1.2;
        double weight = 3.5;
        String expResult = "Beo phi";
        String result = Tuan4.BMI(height, weight);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testBMI1() {
        System.out.println("BMI");
        double height = 4.5;
        double weight = 6.7;
        String expResult = "Beo phi";
        String result = Tuan4.BMI(height, weight);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testBMI2() {
        System.out.println("BMI");
        double height = 3.4;
        double weight = 6.7;
        String expResult = "Beo phi";
        String result = Tuan4.BMI(height, weight);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testBMI3() {
        System.out.println("BMI");
        double height = 3.4;
        double weight = 5.2;
        String expResult = "Beo phi";
        String result = Tuan4.BMI(height, weight);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testBMI4() {
        System.out.println("BMI");
        double height = 6.8;
        double weight = 6.4;
        String expResult = "Beo phi";
        String result = Tuan4.BMI(height, weight);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
   
    
    
}

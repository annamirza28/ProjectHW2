/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import com.itexpert.homework.firstprojectnb.Rectangle;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Ana
 */
public class ReclangleTest {
    Rectangle rect ;
    public ReclangleTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

  @BeforeMethod
    public void setUpMethod() throws Exception {
        // Initialize test data before each test method
        rect = new Rectangle(2.0, 8.0);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        // Cleanup after each test method
    }

    @Test
    public void testArea() {
        // Area = length * width = 2.0 * 8.0 = 16.0
        assertEquals(rect.calculateArea(), 16.0);
    }

    @Test
    public void testPerimeter() {
        // Perimeter = 2 * (length + width) = 2 * (2.0 + 8.0) = 20.0
        assertEquals(rect.calculatePerimeter(), 20.0);
    }
}
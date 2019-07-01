/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculatordemo.Calculator;
import com.sun.javafx.geom.AreaOp;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fa15-bse-046
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
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
    
    @Test
    public void testAdd()
    {
        Calculator obj = new Calculator();
        assertEquals(29,obj.sum(20, 9));
    }
    @Test
    public void testMinus()
    {
        Calculator obj = new Calculator();
        assertEquals(11,obj.sub(20, 9));
    }
     @Test
    public void testMultiply()
    {
        Calculator obj = new Calculator();
        assertEquals(9,obj.mult(3, 3));
    }
      @Test
    public void testDivision()
    {
        Calculator obj = new Calculator();
        assertEquals(1,obj.division(20, 20));
    }       
        
      

    

    public void TestAddition(){
        
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

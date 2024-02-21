/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_course_registration_system;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class FeeTest {
    
    public FeeTest() {
    }
    public int gradepoints;
    boolean check ()
    {
    if (gradepoints > 50)
    {return true;}
    else 
    {return false;}
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
     * Test of fee method, of class Fee.
     */
    @Test
    public void testFee() {
        gradepoints = 55;
        assertEquals(true,check());
    }
    
}

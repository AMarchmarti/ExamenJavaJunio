package org.lasencinas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test_instance(){
       Cereales eyeholes = new Eyeholes();

       Eyeholes eye = new Eyeholes("Eyeholes", 25.0f);

       assertEquals(eye.nombre(), "Eyeholes");

       assertTrue(eyeholes instanceof Cereales);

       assertTrue(eyeholes instanceof Item);
    }
}

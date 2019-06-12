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
       Eyeholes eyeholes = new Eyeholes();

       assertTrue(eyeholes instanceof Cereales);

       assertTrue(eyeholes instanceof Item);

       Cereales cereales = new Eyeholes();

       assertEquals(cereales, eyeholes);
    }
}

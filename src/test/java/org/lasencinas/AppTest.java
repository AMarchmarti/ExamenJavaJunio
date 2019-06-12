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
    public void test_instance_Eyehole(){
       Cereales eyeholes = new Eyeholes();

       Eyeholes eye = new Eyeholes("Eyeholes", 25.0f);

       assertEquals(eye.nombre(), "Eyeholes");

       assertTrue(eyeholes instanceof Cereales);

       assertTrue(eyeholes instanceof Item);
    }

    @Test
    public void test_instance_Bebidas(){

        Bebidas bebida = new FleebJuice();

        Bebidas bebidas = new TurbulentJuice("Turbulent juuuuuice", 30.0f);

        assertTrue(bebida instanceof Item);

        assertTrue(bebidas instanceof Bebidas);

        assertTrue(bebidas.nombre().equals("Turbulent juuuuuice"));

        assertTrue(bebidas.pvp() == 30.0f);

        assertTrue(bebida.empaquetado().envoltorio().equals("Tubo"));
    }

    @Test
    public void test_empaquetar(){
        Cereales cereales = new Eyeholes();
        Packing packing = new Tubo("Tuberia");

        Caja caja = new Caja("Caja");

        assertEquals("Tuberia", packing.envoltorio());

        assertTrue(caja instanceof Packing);

        assertEquals("Caja", cereales.empaquetado().envoltorio());
    }

    @Test
    public void test_Smiggles(){
        Cereales cereales = new Smiggles();

        Smiggles smiggles = new Smiggles("Smiggles", 30.0f);

        assertEquals(smiggles.nombre(), "Smiggles");

        assertEquals(smiggles.pvp(), 30.0f, 0);

        assertTrue(smiggles instanceof Item);
        assertTrue(smiggles instanceof Cereales);
    }


}

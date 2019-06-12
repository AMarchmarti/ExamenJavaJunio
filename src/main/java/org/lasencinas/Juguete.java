package org.lasencinas;

import javax.crypto.spec.DESedeKeySpec;

public class Juguete extends Eyeholes {

    public Juguete() {
        super();
    }

    public Juguete(String nombre, Float pvp) {
        super(nombre, pvp);
    }

    @Override
    public String nombre() {
        return super.nombre();
    }

    @Override
    public Float pvp() {
        return super.pvp();
    }

    @Override
    public Packing empaquetado() {
        return super.empaquetado();
    }
}

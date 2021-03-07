import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Actividad0628Test {

    @Test
    public void fuera() {
        Actividad0628 objetoBase = new Actividad0628();
        assertEquals(0, objetoBase.jugandoALosDardos(-9, 9));
    }

    @Test
    public void enBordeCirculoExterno() {
        Actividad0628 objetoBase = new Actividad0628();
        assertEquals(1, objetoBase.jugandoALosDardos(0, 10));
    }

    @Test
    public void enBordeCirculoMedio() {
        Actividad0628 objetoBase = new Actividad0628();
        assertEquals(5, objetoBase.jugandoALosDardos(-5, 0));
    }

    @Test
    public void enBordeCirculoInterior() {
        Actividad0628 objetoBase = new Actividad0628();
        assertEquals(10, objetoBase.jugandoALosDardos(0, -1));
    }

    @Test
    public void enElCentro() {
        Actividad0628 objetoBase = new Actividad0628();
        assertEquals(10, objetoBase.jugandoALosDardos(0, 0));
    }

    @Test
    public void cercaDelCentro() {
        Actividad0628 objetoBase = new Actividad0628();
        assertEquals(10, objetoBase.jugandoALosDardos(-0.1, -0.1));
    }

    @Test
    public void justoEnElCirculoInterior() {
        Actividad0628 objetoBase = new Actividad0628();
        assertEquals(10, objetoBase.jugandoALosDardos(0.7, 0.7));
    }

    @Test
    public void justoFueraDelCirculoInterior() {
        Actividad0628 objetoBase = new Actividad0628();
        assertEquals(5, objetoBase.jugandoALosDardos(0.8, -0.8));
    }

    @Test
    public void justoEnElCirculoMedio() {
        Actividad0628 objetoBase = new Actividad0628();
        assertEquals(5, objetoBase.jugandoALosDardos(-3.5, 3.5));
    }

    @Test
    public void justoFueraDelCirculoMedio() {
        Actividad0628 objetoBase = new Actividad0628();
        assertEquals(1, objetoBase.jugandoALosDardos(-3.6, -3.6));
    }


    @Test
    public void justoEnElCirculoExterior() {
        Actividad0628 objetoBase = new Actividad0628();
        assertEquals(1, objetoBase.jugandoALosDardos(-7.0, 7.0));
    }

    @Test
    public void justoFueraDelCirculoExterior() {
        Actividad0628 objetoBase = new Actividad0628();
        assertEquals(0, objetoBase.jugandoALosDardos(7.1, -7.1));
    }

    @Test
    public void posicionEntreElCirculoInteriorYElMedio() {
        Actividad0628 objetoBase = new Actividad0628();
        assertEquals(5, objetoBase.jugandoALosDardos(0.5, -4));
    }
}

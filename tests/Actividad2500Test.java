import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Actividad2500Test {

    @Test
    public void testCadenaVacia() {
        assertEquals("", new Actividad2500().darleVueltaAPalabra(""));
    }

    @Test
    public void testPalabra() {
        assertEquals("tobor", new Actividad2500().darleVueltaAPalabra("robot"));
    }

    @Test
    public void testPalabraConMayuscula() {
        assertEquals("nemaR", new Actividad2500().darleVueltaAPalabra("Ramen"));
    }

    @Test
    public void testPalabrasConSimbolosDePuntuacion() {
        assertEquals("!yrgnuh m'I", new Actividad2500().darleVueltaAPalabra("I'm hungry!"));
    }

    @Test
    public void testPalindromo() {
        assertEquals("racecar", new Actividad2500().darleVueltaAPalabra("racecar"));
    }

    @Test
    public void testPalabraConNumeroDeLetrasPares() {
        assertEquals("reward", new Actividad2500().darleVueltaAPalabra("drawer"));
    }

    @Test
    public void testNull() {
        assertEquals(null, new Actividad2500().darleVueltaAPalabra(null));
    }
}

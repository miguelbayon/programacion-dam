import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Actividad0885Test {

    @Test
    public void testCadenaVacia() {
        Actividad0885 objetoBase = new Actividad0885();
        assertEquals("", objetoBase.darleVueltaAPalabraAlternativamente("", 1));
    }

    @Test
    public void testPalabra() {
        Actividad0885 objetoBase = new Actividad0885();
        assertEquals("tobor", objetoBase.darleVueltaAPalabraAlternativamente("robot", 1));
    }

    @Test
    public void testPalabraConMayuscula() {
        Actividad0885 objetoBase = new Actividad0885();
        assertEquals("nemaR", objetoBase.darleVueltaAPalabraAlternativamente("Ramen", 1));
    }

    @Test
    public void testPalabrasConSimbolosDePuntuacion() {
        Actividad0885 objetoBase = new Actividad0885();
        assertEquals("!yrgnuh m'I", objetoBase.darleVueltaAPalabraAlternativamente("I'm hungry!", 1));
    }

    @Test
    public void testPalindromo() {
        Actividad0885 objetoBase = new Actividad0885();
        assertEquals("racecar", objetoBase.darleVueltaAPalabraAlternativamente("racecar", 1));
    }

    @Test
    public void testPalabraConNumeroDeLetrasPares() {
        Actividad0885 objetoBase = new Actividad0885();
        assertEquals("reward", objetoBase.darleVueltaAPalabraAlternativamente("drawer", 1));
    }

    @Test
    public void testNull() {
        Actividad0885 objetoBase = new Actividad0885();
        assertEquals(null, objetoBase.darleVueltaAPalabraAlternativamente(null, 1));
    }

    @Test
    public void testCadenaVaciaVariasVeces() {
        Actividad0885 objetoBase = new Actividad0885();
        assertEquals("", objetoBase.darleVueltaAPalabraAlternativamente("", 2));
        assertEquals("", objetoBase.darleVueltaAPalabraAlternativamente("", 3));
        assertEquals("", objetoBase.darleVueltaAPalabraAlternativamente("", 4));
    }

    @Test
    public void testPalabraVariasVeces() {
        Actividad0885 objetoBase = new Actividad0885();
        assertEquals("toborrobot", objetoBase.darleVueltaAPalabraAlternativamente("robot", 2));
        assertEquals("toborrobottobor", objetoBase.darleVueltaAPalabraAlternativamente("robot", 3));
        assertEquals("toborrobottoborrobot", objetoBase.darleVueltaAPalabraAlternativamente("robot", 4));
        assertEquals("toborrobottoborrobottobor", objetoBase.darleVueltaAPalabraAlternativamente("robot", 5));
    }

    @Test
    public void testPalabraConMayusculaVariasVeces() {
        Actividad0885 objetoBase = new Actividad0885();
        assertEquals("nemaRRamen", objetoBase.darleVueltaAPalabraAlternativamente("Ramen", 2));
        assertEquals("nemaRRamennemaR", objetoBase.darleVueltaAPalabraAlternativamente("Ramen", 3));
        assertEquals("nemaRRamennemaRRamen", objetoBase.darleVueltaAPalabraAlternativamente("Ramen", 4));
    }

    @Test
    public void testPalabrasConSimbolosDePuntuacionVariasVeces() {
        Actividad0885 objetoBase = new Actividad0885();
        assertEquals("!yrgnuh m'II'm hungry!", objetoBase.darleVueltaAPalabraAlternativamente("I'm hungry!", 2));
        assertEquals("!yrgnuh m'II'm hungry!!yrgnuh m'I", objetoBase.darleVueltaAPalabraAlternativamente("I'm hungry!", 3));
        assertEquals("!yrgnuh m'II'm hungry!!yrgnuh m'II'm hungry!", objetoBase.darleVueltaAPalabraAlternativamente("I'm hungry!", 4));
    }

    @Test
    public void testPalindromoVariasVeces() {
        Actividad0885 objetoBase = new Actividad0885();
        assertEquals("racecarracecar", objetoBase.darleVueltaAPalabraAlternativamente("racecar", 2));
        assertEquals("racecarracecarracecar", objetoBase.darleVueltaAPalabraAlternativamente("racecar", 3));
        assertEquals("racecarracecarracecarracecar", objetoBase.darleVueltaAPalabraAlternativamente("racecar", 4));
    }

    @Test
    public void testPalabraConNumeroDeLetrasParesVariasVeces() {
        Actividad0885 objetoBase = new Actividad0885();
        assertEquals("rewarddrawer", objetoBase.darleVueltaAPalabraAlternativamente("drawer", 2));
        assertEquals("rewarddrawerreward", objetoBase.darleVueltaAPalabraAlternativamente("drawer", 3));
        assertEquals("rewarddrawerrewarddrawer", objetoBase.darleVueltaAPalabraAlternativamente("drawer", 4));
    }

    @Test
    public void testNullVariasVeces() {
        Actividad0885 objetoBase = new Actividad0885();
        assertEquals(null, objetoBase.darleVueltaAPalabraAlternativamente(null, 2));
        assertEquals(null, objetoBase.darleVueltaAPalabraAlternativamente(null, 3));
        assertEquals(null, objetoBase.darleVueltaAPalabraAlternativamente(null, 4));
    }
    
    @Test
    public void testPalabrasAleatorias() {
        Actividad0885 objetoBase = new Actividad0885();
        assertEquals("adnocanAAnacondaadnocanAAnacondaadnocanAAnacondaadnocanAAnacondaadnocanAAnaconda", objetoBase.darleVueltaAPalabraAlternativamente("Anaconda", 10));
        assertEquals("adnocanAAnacondaadnocanAAnacondaadnocanAAnacondaadnocanAAnacondaadnocanAAnacondaadnocanAAnaconda", objetoBase.darleVueltaAPalabraAlternativamente("Anaconda", 12));
        assertEquals("adnocanAAnacondaadnocanAAnacondaadnocanAAnacondaadnocanAAnacondaadnocanAAnacondaadnocanAAnacondaadnocanAAnacondaadnocanAAnacondaadnocanAAnacondaadnocanAAnaconda", objetoBase.darleVueltaAPalabraAlternativamente("Anaconda", 20));
    }
}

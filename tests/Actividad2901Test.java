import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class Actividad2901Test {

    @Test
    public void testValoresNormales() {
        Actividad2901 objetoBase = new Actividad2901();
        assertEquals(90, objetoBase.sumaDeMultiplos(2, 20));
        assertEquals(18, objetoBase.sumaDeMultiplos(3, 12));
        assertEquals(4950, objetoBase.sumaDeMultiplos(1, 100));
        assertEquals(390, objetoBase.sumaDeMultiplos(5, 65));
    }
    
    @Test
    public void testValoresAnormales() {
        Actividad2901 objetoBase = new Actividad2901();
        assertEquals(-1, objetoBase.sumaDeMultiplos(-5, 32));
        assertEquals(-1, objetoBase.sumaDeMultiplos(0, 100));
        assertEquals(-1, objetoBase.sumaDeMultiplos(3, 100));
        assertEquals(-1, objetoBase.sumaDeMultiplos(8, 100));
    }    
}

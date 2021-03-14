import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Actividad2501Tests {

    private Actividad2501 objetoBase;

    @BeforeEach
    public void setup() {
        objetoBase = new Actividad2501();
    }

    @Test
    public void cero() {
        int input = 0;
        assertTrue(objetoBase.esNumeroBelkiano(input));
    }

    @Test
    public void digitoUnicoSi() {
        int input = 5;
        assertTrue(objetoBase.esNumeroBelkiano(input));
    }

    @Test
    public void dosDigitosNo() {
        int input = 10;
        assertFalse(objetoBase.esNumeroBelkiano(input));
    }

    @Test
    public void tresDigitosSi() {
        int input = 153;
        assertTrue(objetoBase.esNumeroBelkiano(input));
    }

    @Test
    public void tresDigitosNo() {
        int input = 100;
        assertFalse(objetoBase.esNumeroBelkiano(input));
    }

    @Test
    public void cuatroDigitosSi() {
        int input = 9474;
        assertTrue(objetoBase.esNumeroBelkiano(input));
    }

    @Test
    public void cuatroDigitosNo() {
        int input = 9475;

        assertFalse(objetoBase.esNumeroBelkiano(input));
    }

    @Test
    public void sieteDigitosSi() {
        int input = 9926315;
        assertTrue(objetoBase.esNumeroBelkiano(input));
    }

    @Test
    public void sieteDigitosNo() {
        int input = 9926314;
        assertFalse(objetoBase.esNumeroBelkiano(input));
    }
}
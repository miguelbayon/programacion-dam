import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Actividad4101Test {

    private Actividad4101 objetoBase;

    @BeforeEach
    public void setup() {
        objetoBase = new Actividad4101();
    }

    @Test
    public void test01() {
        assertFalse(objetoBase.esAnoBisiesto(2015));
    }

    @Test
    public void test02() {
        assertFalse(objetoBase.esAnoBisiesto(1970));
    }

    @Test
    public void test03() {
        assertTrue(objetoBase.esAnoBisiesto(1996));
    }

    @Test
    public void test04() {
        assertTrue(objetoBase.esAnoBisiesto(1960));
    }

    @Test
    public void test05() {
        assertFalse(objetoBase.esAnoBisiesto(2100));
    }

    @Test
    public void test06() {
        assertFalse(objetoBase.esAnoBisiesto(1900));
    }

    @Test
    public void test07() {
        assertTrue(objetoBase.esAnoBisiesto(2000));
    }

    @Test
    public void test08() {
        assertTrue(objetoBase.esAnoBisiesto(2400));
    }

    @Test
    public void test09() {
        assertFalse(objetoBase.esAnoBisiesto(1800));
    }

}

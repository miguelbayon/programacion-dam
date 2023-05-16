import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Actividad3709Test
{
    @Test
    public void testDiferentesPalabras() {
        Actividad3709 a = new Actividad3709();
        assertEquals(-1, a.getIndiceMesotopico(""));
        assertEquals(1, a.getIndiceMesotopico("a"));
        assertEquals(1, a.getIndiceMesotopico("A"));
        assertEquals(4, a.getIndiceMesotopico("f"));
        assertEquals(1, a.getIndiceMesotopico("a"));
        assertEquals(2, a.getIndiceMesotopico("at"));
        assertEquals(12, a.getIndiceMesotopico("zoo"));
        assertEquals(6, a.getIndiceMesotopico("street"));
        assertEquals(22, a.getIndiceMesotopico("quirky"));
        assertEquals(41, a.getIndiceMesotopico("OxyphenButazone"));
        assertEquals(8, a.getIndiceMesotopico("pinata"));
        assertEquals(-1, a.getIndiceMesotopico(""));
        assertEquals(87, a.getIndiceMesotopico("abCdefghijklMnopqrstuvWxyz"));
    }
}

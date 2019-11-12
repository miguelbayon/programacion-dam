import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Actividad0621Test
{
    @Test
    public void tes01()
    {
        Actividad0621 a = new Actividad0621();
        assertEquals(false, a.esPalindromo("primera"));
    }
}

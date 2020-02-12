import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Actividad2007Test {

    @Test
    public void test01() {
        Actividad2007 ejercici1 = new Actividad2007();

        ArrayList<String> origen = new ArrayList<>(Arrays.asList("Mesa","Silla","Ordenador","Futbolin","Libros","Berenjenas"));
        String resultadoEsperado = "Berenjenas,Ordenador,Futbolin,Libros,Silla,Mesa";
        assertEquals(resultadoEsperado, ejercici1.devolverEnOrden(origen));
    }

    @Test
    public void test02() {
        Actividad2007 ejercici1 = new Actividad2007();

        origen = new ArrayList<>(Arrays.asList("Mesas","Silla","Ordenador","Esquinera","Libros","Berenjenas"));
        resultadoEsperado = "Berenjenas,Esquinera,Ordenador,Libros,Silla,Mesas";
        assertEquals(resultadoEsperado, ejercici1.devolverEnOrden(origen));
    }

    @Test
    public void test03() {
        Actividad2007 ejercici1 = new Actividad2007();    

        origen = new ArrayList<>();
        resultadoEsperado = "";
        assertEquals(resultadoEsperado, ejercici1.devolverEnOrden(origen));        
    }
}

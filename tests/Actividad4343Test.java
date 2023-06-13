import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Actividad4343Test {
    
    @Test
    public void test01() {
        Actividad4343 objetoBase = new Actividad4343("29");
        long resultadoEsperado = 18;
        long resultadoObtenido = objetoBase.encontrarProductoMasAlto(2);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
    
    @Test
    public void test02() {
        Actividad4343 objetoBase = new Actividad4343("0123456789");
        long resultadoEsperado = 72;
        long resultadoObtenido = objetoBase.encontrarProductoMasAlto(2);
        assertEquals(resultadoEsperado, resultadoObtenido);
    } 
    
    @Test
    public void test03() {
        Actividad4343 objetoBase = new Actividad4343("576802143");
        long resultadoEsperado = 48;
        long resultadoObtenido = objetoBase.encontrarProductoMasAlto(2);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }       

    @Test
    public void test04() {
        Actividad4343 objetoBase = new Actividad4343("0123456789");
        long resultadoEsperado = 504;
        long resultadoObtenido = objetoBase.encontrarProductoMasAlto(3);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }  
    
    @Test
    public void test05() {
        Actividad4343 objetoBase = new Actividad4343("1027839564");
        long resultadoEsperado = 270;
        long resultadoObtenido = objetoBase.encontrarProductoMasAlto(3);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }  
    
    @Test
    public void test06() {
        Actividad4343 objetoBase = new Actividad4343("0123456789");
        long resultadoEsperado = 15120;
        long resultadoObtenido = objetoBase.encontrarProductoMasAlto(5);
        assertEquals(resultadoEsperado, resultadoObtenido);
    } 

    @Test
    public void test07() {
        Actividad4343 objetoBase = new Actividad4343("73167176531330624919225119674426574742355349194934");
        long resultadoEsperado = 23520;
        long resultadoObtenido = objetoBase.encontrarProductoMasAlto(6);
        assertEquals(resultadoEsperado, resultadoObtenido);
    } 
    
    @Test
    public void test08() {
        Actividad4343 objetoBase = new Actividad4343("0000");
        long resultadoEsperado = 0;
        long resultadoObtenido = objetoBase.encontrarProductoMasAlto(2);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }   

    @Test
    public void test09() {
        Actividad4343 objetoBase = new Actividad4343("99099");
        long resultadoEsperado = 0;
        long resultadoObtenido = objetoBase.encontrarProductoMasAlto(3);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }   

    @Test
    public void test10() {
        Actividad4343 objetoBase = new Actividad4343("123");
        long resultadoEsperado = -1;
        long resultadoObtenido = objetoBase.encontrarProductoMasAlto(4);
        assertEquals(resultadoEsperado, resultadoObtenido);
    } 

    @Test
    public void test11() {
        Actividad4343 objetoBase = new Actividad4343("");
        long resultadoEsperado = -1;
        long resultadoObtenido = objetoBase.encontrarProductoMasAlto(0);
        assertEquals(resultadoEsperado, resultadoObtenido);
    } 

    @Test
    public void test12() {
        Actividad4343 objetoBase = new Actividad4343("123");
        long resultadoEsperado = -1;
        long resultadoObtenido = objetoBase.encontrarProductoMasAlto(0);
        assertEquals(resultadoEsperado, resultadoObtenido);
    } 

    @Test
    public void test13() {
        Actividad4343 objetoBase = new Actividad4343("");
        long resultadoEsperado = -1;
        long resultadoObtenido = objetoBase.encontrarProductoMasAlto(1);
        assertEquals(resultadoEsperado, resultadoObtenido);
    } 

    @Test
    public void test14() {
        Actividad4343 objetoBase = new Actividad4343("123");
        long resultadoEsperado = -1;
        long resultadoObtenido = objetoBase.encontrarProductoMasAlto(0);
        assertEquals(resultadoEsperado, resultadoObtenido);
    } 

    @Test
    public void test15() {
        Actividad4343 objetoBase = new Actividad4343("");
        long resultadoEsperado = -1;
        long resultadoObtenido = objetoBase.encontrarProductoMasAlto(-1);
        assertEquals(resultadoEsperado, resultadoObtenido);
    } 

}

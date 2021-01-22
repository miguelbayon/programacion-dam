import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Actividad7201_00
{
    @Test
    public void test00_01()
    {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("", gestorTa1.devolverTareas());
        gestorTa1.agregarTarea("Hacer la cama");
        assertEquals("Hacer la cama\n", gestorTa1.devolverTareas());
        gestorTa1.agregarTarea("Estudiar programación");
        assertEquals("Hacer la cama\nEstudiar programación\n", gestorTa1.devolverTareas());
        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals("Hacer la cama\nEstudiar programación\nComprar el pan\n", gestorTa1.devolverTareas());
    }

    @Test
    public void test00_02()
    {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals(0, gestorTa1.getNumeroTareas());
        gestorTa1.agregarTarea("Hacer la cama");
        assertEquals(1, gestorTa1.getNumeroTareas());
        gestorTa1.agregarTarea("Estudiar programaciรณn");
        assertEquals(2, gestorTa1.getNumeroTareas());
        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals(3, gestorTa1.getNumeroTareas());
    }   

    @Test
    public void test00_03()
    {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals(0, gestorTa1.getNumeroTareas2());
        gestorTa1.agregarTarea("Hacer la cama");
        assertEquals(1, gestorTa1.getNumeroTareas2());
        gestorTa1.agregarTarea("Estudiar programaciรณn");
        assertEquals(2, gestorTa1.getNumeroTareas2());
        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals(3, gestorTa1.getNumeroTareas2());
    }   

    @Test
    public void test00_04()
    {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("", gestorTa1.getTareaMasAntigua());        
        gestorTa1.agregarTarea("Dormir la siesta");
        gestorTa1.agregarTarea("Comprar pan");
        gestorTa1.agregarTarea("Hacer la colada");
        assertEquals("Dormir la siesta", gestorTa1.getTareaMasAntigua());
    }       
}

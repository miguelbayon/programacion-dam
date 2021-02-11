import org.junit.Test;

import static org.junit.Assert.*;

public class Actividad7201Test_03
{
    @Test
    public void test03_01() {
        GestorTareas gestorTa1 = new GestorTareas();

        assertEquals(false, gestorTa1.eliminarTarea(1));

        gestorTa1.agregarTarea("Hacer la cama");
        assertEquals("1. Hacer la cama\n", gestorTa1.getListadoTareas());
        assertEquals(false, gestorTa1.eliminarTarea(2));
        assertEquals(true, gestorTa1.eliminarTarea(1));
        assertEquals("", gestorTa1.getListadoTareas());

        gestorTa1.agregarTarea("Hacer la cama");
        gestorTa1.agregarTarea("Estudiar programación");
        assertEquals("1. Hacer la cama\n2. Estudiar programación\n", gestorTa1.getListadoTareas());
        assertEquals(false, gestorTa1.eliminarTarea(3));
        assertEquals(true, gestorTa1.eliminarTarea(1));
        assertEquals("1. Estudiar programación\n", gestorTa1.getListadoTareas());
        assertEquals(false, gestorTa1.eliminarTarea(2));
        assertEquals(true, gestorTa1.eliminarTarea(1));
        assertEquals("", gestorTa1.getListadoTareas());

        gestorTa1.agregarTarea("Hacer la cama");
        gestorTa1.agregarTarea("Estudiar programación");
        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals("1. Hacer la cama\n2. Estudiar programación\n3. Comprar el pan\n", gestorTa1.getListadoTareas());
        assertEquals(true, gestorTa1.eliminarTarea(2));
        assertEquals("1. Hacer la cama\n2. Comprar el pan\n", gestorTa1.getListadoTareas());
        assertEquals(false, gestorTa1.eliminarTarea(3));
        assertEquals(true, gestorTa1.eliminarTarea(1));
        assertEquals("1. Comprar el pan\n", gestorTa1.getListadoTareas());
        assertEquals(false, gestorTa1.eliminarTarea(3));
        assertEquals(true, gestorTa1.eliminarTarea(1));
        assertEquals("", gestorTa1.getListadoTareas());
    }

    @Test
    public void test03_02() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("", gestorTa1.getPrimeraTareaConElTexto("pan"));

        gestorTa1.agregarTarea("Hacer la cama");
        assertEquals("", gestorTa1.getPrimeraTareaConElTexto("pan"));
        assertEquals("Hacer la cama", gestorTa1.getPrimeraTareaConElTexto("cama"));

        gestorTa1.agregarTarea("Estudiar programación");
        assertEquals("", gestorTa1.getPrimeraTareaConElTexto("pan"));
        assertEquals("Hacer la cama", gestorTa1.getPrimeraTareaConElTexto("cama"));
        assertEquals("Estudiar programación", gestorTa1.getPrimeraTareaConElTexto("programación"));

        gestorTa1.agregarTarea("Estudiar bases de datos");
        assertEquals("", gestorTa1.getPrimeraTareaConElTexto("pan"));
        assertEquals("Estudiar programación", gestorTa1.getPrimeraTareaConElTexto("Estudiar"));
        assertEquals("Estudiar programación", gestorTa1.getPrimeraTareaConElTexto("programación"));

        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals("Comprar el pan", gestorTa1.getPrimeraTareaConElTexto("pan"));
        assertEquals("Estudiar programación", gestorTa1.getPrimeraTareaConElTexto("Estudiar"));
        assertEquals("Estudiar programación", gestorTa1.getPrimeraTareaConElTexto("programación"));
    }
    
    @Test
    public void test03_03() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("", gestorTa1.getListadoTareasWhile());
        gestorTa1.agregarTarea("Hacer la cama");
        assertEquals("1. Hacer la cama\n", gestorTa1.getListadoTareasWhile());
        gestorTa1.agregarTarea("Estudiar programación");
        assertEquals("1. Hacer la cama\n2. Estudiar programación\n", gestorTa1.getListadoTareasWhile());
        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals("1. Hacer la cama\n2. Estudiar programación\n3. Comprar el pan\n",
                gestorTa1.getListadoTareasWhile());
    }

    @Test
    public void test03_04() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("", gestorTa1.getPrimeraTareaConElTextoWhile("pan"));

        gestorTa1.agregarTarea("Hacer la cama");
        assertEquals("", gestorTa1.getPrimeraTareaConElTexto("pan"));
        assertEquals("Hacer la cama", gestorTa1.getPrimeraTareaConElTextoWhile("cama"));

        gestorTa1.agregarTarea("Estudiar programación");
        assertEquals("", gestorTa1.getPrimeraTareaConElTextoWhile("pan"));
        assertEquals("Hacer la cama", gestorTa1.getPrimeraTareaConElTextoWhile("cama"));
        assertEquals("Estudiar programación", gestorTa1.getPrimeraTareaConElTextoWhile("programación"));

        gestorTa1.agregarTarea("Estudiar bases de datos");
        assertEquals("", gestorTa1.getPrimeraTareaConElTextoWhile("pan"));
        assertEquals("Estudiar programación", gestorTa1.getPrimeraTareaConElTextoWhile("Estudiar"));
        assertEquals("Estudiar programación", gestorTa1.getPrimeraTareaConElTextoWhile("programación"));

        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals("Comprar el pan", gestorTa1.getPrimeraTareaConElTextoWhile("pan"));
        assertEquals("Estudiar programación", gestorTa1.getPrimeraTareaConElTextoWhile("Estudiar"));
        assertEquals("Estudiar programación", gestorTa1.getPrimeraTareaConElTextoWhile("programación"));
    }
}

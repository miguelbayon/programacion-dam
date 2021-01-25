import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Actividad7201Test_01
{
    @Test
    public void test01_01() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("", gestorTa1.getListadoTareas());
        gestorTa1.agregarTarea("Hablar");
        assertEquals("1. Hablar\n", gestorTa1.getListadoTareas());
        gestorTa1.agregarTarea("Jugar");
        gestorTa1.agregarTarea("Comer");
        assertEquals("1. Hablar\n2. Jugar\n3. Comer\n", gestorTa1.getListadoTareas());
    }

    @Test
    public void test01_02() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("[]", gestorTa1.getTareasEnUnaSolaLinea());
        gestorTa1.agregarTarea("Hacer la cama");
        assertEquals("[Hacer la cama]", gestorTa1.getTareasEnUnaSolaLinea());
        gestorTa1.agregarTarea("Estudiar programacion");
        assertEquals("[Hacer la cama, Estudiar programacion]", gestorTa1.getTareasEnUnaSolaLinea());
        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals("[Hacer la cama, Estudiar programacion, Comprar el pan]", gestorTa1.getTareasEnUnaSolaLinea());
    }

    @Test
    public void test01_03() {
        GestorTareas gestorTa2 = new GestorTareas();
        assertEquals(false, gestorTa2.existeTareaConElTexto("cama"));
        assertEquals(false, gestorTa2.existeTareaConElTexto("pan"));
        assertEquals(false, gestorTa2.existeTareaConElTexto("moto"));
        gestorTa2.agregarTarea("Hacer la cama");
        assertEquals(true, gestorTa2.existeTareaConElTexto("cama"));
        assertEquals(false, gestorTa2.existeTareaConElTexto("pan"));
        assertEquals(false, gestorTa2.existeTareaConElTexto("moto"));
        gestorTa2.agregarTarea("Estudiar programacion");
        assertEquals(true, gestorTa2.existeTareaConElTexto("cama"));
        assertEquals(false, gestorTa2.existeTareaConElTexto("pan"));
        assertEquals(false, gestorTa2.existeTareaConElTexto("moto"));
        gestorTa2.agregarTarea("Comprar el pan");
        assertEquals(true, gestorTa2.existeTareaConElTexto("cama"));
        assertEquals(true, gestorTa2.existeTareaConElTexto("pan"));
        assertEquals(false, gestorTa2.existeTareaConElTexto("moto"));
    } 
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Actividad7201Test_04
{
    @Test
    public void test04_01_getPrimerasTareas() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("", gestorTa1.getPrimerasTareas(0));
        assertEquals("", gestorTa1.getPrimerasTareas(1));
        assertEquals("", gestorTa1.getPrimerasTareas(2));

        gestorTa1.agregarTarea("Hacer la cama");
        assertEquals("", gestorTa1.getPrimerasTareas(0));
        assertEquals("1. Hacer la cama\n", gestorTa1.getPrimerasTareas(1));
        assertEquals("1. Hacer la cama\n", gestorTa1.getPrimerasTareas(2));

        gestorTa1.agregarTarea("Estudiar programación");
        assertEquals("", gestorTa1.getPrimerasTareas(0));
        assertEquals("1. Hacer la cama\n", gestorTa1.getPrimerasTareas(1));
        assertEquals("1. Hacer la cama\n2. Estudiar programación\n", gestorTa1.getPrimerasTareas(2));
        assertEquals("1. Hacer la cama\n2. Estudiar programación\n", gestorTa1.getPrimerasTareas(3));

        gestorTa1.agregarTarea("Estudiar bases de datos");
        assertEquals("", gestorTa1.getPrimerasTareas(0));
        assertEquals("1. Hacer la cama\n", gestorTa1.getPrimerasTareas(1));
        assertEquals("1. Hacer la cama\n2. Estudiar programación\n", gestorTa1.getPrimerasTareas(2));
        assertEquals("1. Hacer la cama\n2. Estudiar programación\n3. Estudiar bases de datos\n",
                gestorTa1.getPrimerasTareas(3));

        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals("", gestorTa1.getPrimerasTareas(0));
        assertEquals("1. Hacer la cama\n", gestorTa1.getPrimerasTareas(1));
        assertEquals("1. Hacer la cama\n2. Estudiar programación\n", gestorTa1.getPrimerasTareas(2));
        assertEquals("1. Hacer la cama\n2. Estudiar programación\n3. Estudiar bases de datos\n",
                gestorTa1.getPrimerasTareas(3));
        assertEquals("1. Hacer la cama\n2. Estudiar programación\n3. Estudiar bases de datos\n4. Comprar el pan\n",
                gestorTa1.getPrimerasTareas(4));
        assertEquals("1. Hacer la cama\n2. Estudiar programación\n3. Estudiar bases de datos\n4. Comprar el pan\n",
                gestorTa1.getPrimerasTareas(5));
    }


    @Test
    public void test04_02_hayTareaConElTextoEficiente() {
        GestorTareas gestorTa2 = new GestorTareas();
        assertEquals(false, gestorTa2.hayTareaConElTextoEficiente("cama"));
        assertEquals(false, gestorTa2.hayTareaConElTextoEficiente("pan"));
        assertEquals(false, gestorTa2.hayTareaConElTextoEficiente("moto"));
        gestorTa2.agregarTarea("Hacer la cama");
        assertEquals(true, gestorTa2.hayTareaConElTextoEficiente("cama"));
        assertEquals(false, gestorTa2.hayTareaConElTextoEficiente("pan"));
        assertEquals(false, gestorTa2.hayTareaConElTextoEficiente("moto"));
        gestorTa2.agregarTarea("Estudiar programacion");
        assertEquals(true, gestorTa2.hayTareaConElTextoEficiente("cama"));
        assertEquals(false, gestorTa2.hayTareaConElTextoEficiente("pan"));
        assertEquals(false, gestorTa2.hayTareaConElTextoEficiente("moto"));
        gestorTa2.agregarTarea("Comprar el pan");
        assertEquals(true, gestorTa2.hayTareaConElTextoEficiente("cama"));
        assertEquals(true, gestorTa2.hayTareaConElTextoEficiente("pan"));
        assertEquals(false, gestorTa2.hayTareaConElTextoEficiente("moto"));
    }

    @Test
    public void test04_03_getTareasConElTexto() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("No se encontraron coincidencias", gestorTa1.getTareasConElTexto("estudiar"));
        assertEquals("No se encontraron coincidencias", gestorTa1.getTareasConElTexto("comprar"));
        assertEquals("No se encontraron coincidencias", gestorTa1.getTareasConElTexto("ar"));
        assertEquals("No se encontraron coincidencias", gestorTa1.getTareasConElTexto("jugar"));

        gestorTa1.agregarTarea("Hacer la cama");
        gestorTa1.agregarTarea("Comprar el pan");
        gestorTa1.agregarTarea("Comprar las entradas del festival");
        gestorTa1.agregarTarea("Estudiar programacion");

        assertEquals("Estudiar programacion\n1", gestorTa1.getTareasConElTexto("Estudiar"));
        assertEquals("Comprar el pan\nComprar las entradas del festival\n2", gestorTa1.getTareasConElTexto("Comprar"));
        assertEquals("Comprar el pan\nComprar las entradas del festival\nEstudiar programacion\n3",
                gestorTa1.getTareasConElTexto("ar"));
        assertEquals("No se encontraron coincidencias", gestorTa1.getTareasConElTexto("jugar"));
    }

    @Test
    public void test04_04_eliminaPrimeraTareaConElTexto() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals(false, gestorTa1.eliminaPrimeraTareaConElTexto("Jugar"));

        gestorTa1.agregarTarea("Jugar al futbol");
        gestorTa1.agregarTarea("Estudiar programacion");
        gestorTa1.agregarTarea("Hacer la cama");

        assertEquals("1. Jugar al futbol\n2. Estudiar programacion\n3. Hacer la cama\n", gestorTa1.getListadoTareas());
        assertEquals(true, gestorTa1.eliminaPrimeraTareaConElTexto("Jugar"));
        assertEquals("1. Estudiar programacion\n2. Hacer la cama\n", gestorTa1.getListadoTareas());

        assertEquals(false, gestorTa1.eliminaPrimeraTareaConElTexto("doblar"));
        assertEquals("1. Estudiar programacion\n2. Hacer la cama\n", gestorTa1.getListadoTareas());

        assertEquals(true, gestorTa1.eliminaPrimeraTareaConElTexto("la"));
        assertEquals("1. Estudiar programacion\n", gestorTa1.getListadoTareas());

        gestorTa1.agregarTarea("Hacer la cama");
        gestorTa1.agregarTarea("Recoger la habitacion");

        assertEquals(true, gestorTa1.eliminaPrimeraTareaConElTexto("la"));
        assertEquals("1. Estudiar programacion\n2. Recoger la habitacion\n", gestorTa1.getListadoTareas());

        assertEquals(true, gestorTa1.eliminaPrimeraTareaConElTexto("programacion"));
        assertEquals("1. Recoger la habitacion\n", gestorTa1.getListadoTareas());

        assertEquals(false, gestorTa1.eliminaPrimeraTareaConElTexto("programacion"));
        assertEquals("1. Recoger la habitacion\n", gestorTa1.getListadoTareas());

        assertEquals(true, gestorTa1.eliminaPrimeraTareaConElTexto("coger"));
        assertEquals("", gestorTa1.getListadoTareas());

        assertEquals(false, gestorTa1.eliminaPrimeraTareaConElTexto("programacion"));
        assertEquals("", gestorTa1.getListadoTareas());
    }

    @Test
    public void test04_05_eliminaTodasLasTareasConElTexto() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals(0, gestorTa1.eliminaTodasLasTareasConElTexto("Jugar"));

        gestorTa1.agregarTarea("Jugar al futbol");
        gestorTa1.agregarTarea("Estudiar programacion");
        gestorTa1.agregarTarea("Hacer la cama");

        assertEquals(1, gestorTa1.eliminaTodasLasTareasConElTexto("Jugar"));
        assertEquals("1. Estudiar programacion\n2. Hacer la cama\n" , gestorTa1.getListadoTareas());

        assertEquals(0, gestorTa1.eliminaTodasLasTareasConElTexto("doblar"));
        assertEquals("1. Estudiar programacion\n2. Hacer la cama\n" , gestorTa1.getListadoTareas());

        assertEquals(1, gestorTa1.eliminaTodasLasTareasConElTexto("Hacer"));
        assertEquals("1. Estudiar programacion\n" , gestorTa1.getListadoTareas());

        gestorTa1.agregarTarea("Hacer la cama");
        gestorTa1.agregarTarea("Hacer la cena");
        assertEquals(2, gestorTa1.eliminaTodasLasTareasConElTexto("Hacer"));
        assertEquals("1. Estudiar programacion\n" , gestorTa1.getListadoTareas());

        gestorTa1.agregarTarea("Hacer la cama");
        gestorTa1.agregarTarea("Hacer la cena");
        gestorTa1.agregarTarea("Hacer el desayuno");
        gestorTa1.agregarTarea("Llamar a mi amigo");
        gestorTa1.agregarTarea("Hacer la comida");
        assertEquals(4, gestorTa1.eliminaTodasLasTareasConElTexto("Hacer"));
        assertEquals("1. Estudiar programacion\n2. Llamar a mi amigo\n" , gestorTa1.getListadoTareas());
    }
}

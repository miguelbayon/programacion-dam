import org.junit.Test;

import static org.junit.Assert.*;

public class Actividad7201Test_05
{

    @Test
    public void test05_01_editarTarea() {
        GestorTareas gestorTa1 = new GestorTareas();

        assertEquals(false, gestorTa1.editarTarea(0, "Comprar un ordenador"));

        gestorTa1.agregarTarea("Jugar al furbol");
        gestorTa1.agregarTarea("Estudiar prog");
        gestorTa1.agregarTarea("Hacer la cma");
        assertEquals("1. Jugar al furbol\n2. Estudiar prog\n3. Hacer la cma\n" , gestorTa1.getListadoTareas());

        assertEquals(true, gestorTa1.editarTarea(2, "Estudiar programación"));
        assertEquals("1. Jugar al furbol\n2. Estudiar programación\n3. Hacer la cma\n" , gestorTa1.getListadoTareas());

        assertEquals(false, gestorTa1.editarTarea(-5, "Jugar al fútbol"));
        assertEquals(false, gestorTa1.editarTarea(5, "Jugar al fútbol"));
        assertEquals(false, gestorTa1.editarTarea(0, "Jugar al fútbol"));
        assertEquals(false, gestorTa1.editarTarea(4, "Jugar al fútbol"));

        assertEquals(true, gestorTa1.editarTarea(1, "Jugar al fútbol"));
        assertEquals("1. Jugar al fútbol\n2. Estudiar programación\n3. Hacer la cma\n" , gestorTa1.getListadoTareas());

        assertEquals(true, gestorTa1.editarTarea(3, "Hacer la cama"));
        assertEquals("1. Jugar al fútbol\n2. Estudiar programación\n3. Hacer la cama\n" , gestorTa1.getListadoTareas());
    }

    @Test
    public void test05_02_marcarComoCompletada_getListaTareasCompletadasYNoCompletadas_() {
        GestorTareas gestorTa1 = new GestorTareas();

        gestorTa1.agregarTarea("Jugar al futbol");
        gestorTa1.agregarTarea("Estudiar programacion");
        gestorTa1.agregarTarea("Hacer la cama");
        assertEquals("1. Jugar al futbol\n2. Estudiar programacion\n3. Hacer la cama\n", gestorTa1.getListaTareasCompletadasYNoCompletadas());

        assertEquals(true, gestorTa1.marcarComoCompletada(1));
        assertEquals("1. [x] Jugar al futbol\n2. Estudiar programacion\n3. Hacer la cama\n", gestorTa1.getListaTareasCompletadasYNoCompletadas());

        assertEquals(false, gestorTa1.marcarComoCompletada(10));
        assertEquals("1. [x] Jugar al futbol\n2. Estudiar programacion\n3. Hacer la cama\n", gestorTa1.getListaTareasCompletadasYNoCompletadas());

        assertEquals(true, gestorTa1.marcarComoCompletada(3));
        assertEquals("1. [x] Jugar al futbol\n2. Estudiar programacion\n3. [x] Hacer la cama\n", gestorTa1.getListaTareasCompletadasYNoCompletadas());

        assertEquals(false, gestorTa1.marcarComoCompletada(10));
        assertEquals("1. [x] Jugar al futbol\n2. Estudiar programacion\n3. [x] Hacer la cama\n", gestorTa1.getListaTareasCompletadasYNoCompletadas());

        assertEquals(true, gestorTa1.marcarComoCompletada(2));
        assertEquals("1. [x] Jugar al futbol\n2. [x] Estudiar programacion\n3. [x] Hacer la cama\n", gestorTa1.getListaTareasCompletadasYNoCompletadas());

        assertEquals(false, gestorTa1.marcarComoCompletada(10));
        assertEquals("1. [x] Jugar al futbol\n2. [x] Estudiar programacion\n3. [x] Hacer la cama\n", gestorTa1.getListaTareasCompletadasYNoCompletadas());

        assertEquals(false, gestorTa1.marcarComoCompletada(2));
        assertEquals("1. [x] Jugar al futbol\n2. [x] Estudiar programacion\n3. [x] Hacer la cama\n", gestorTa1.getListaTareasCompletadasYNoCompletadas());
    }
}
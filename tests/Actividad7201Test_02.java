import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Actividad7201Test_02
{
    @Test
    public void test02_01() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("", gestorTa1.getTareasImportantes());
        gestorTa1.agregarTarea("Hacer la cama importante");
        assertEquals("1. Hacer la cama importante\n", gestorTa1.getTareasImportantes());
        gestorTa1.agregarTarea("Estudiar");
        assertEquals("1. Hacer la cama importante\n", gestorTa1.getTareasImportantes());
        gestorTa1.agregarTarea("Comprar el pan Importante");
        assertEquals("1. Hacer la cama importante\n3. Comprar el pan Importante\n", gestorTa1.getTareasImportantes());
        gestorTa1.agregarTarea("Comprar entradas IMPORTANTE");
        assertEquals("1. Hacer la cama importante\n3. Comprar el pan Importante\n4. Comprar entradas IMPORTANTE\n",
                gestorTa1.getTareasImportantes());
        gestorTa1.agregarTarea("Contestar emails ImPortantE");
        assertEquals(
                "1. Hacer la cama importante\n3. Comprar el pan Importante\n4. Comprar entradas IMPORTANTE\n5. Contestar emails ImPortantE\n",
                gestorTa1.getTareasImportantes());
    }

    @Test
    public void test02_02() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("", gestorTa1.getTareasImpares());
        gestorTa1.agregarTarea("Hacer la cama");
        assertEquals("1. Hacer la cama\n", gestorTa1.getTareasImpares());
        gestorTa1.agregarTarea("Estudiar");
        assertEquals("1. Hacer la cama\n", gestorTa1.getTareasImpares());
        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals("1. Hacer la cama\n3. Comprar el pan\n", gestorTa1.getTareasImpares());
        gestorTa1.agregarTarea("Comprar entradas");
        assertEquals("1. Hacer la cama\n3. Comprar el pan\n", gestorTa1.getTareasImpares());
        gestorTa1.agregarTarea("Contestar emails");
        assertEquals("1. Hacer la cama\n3. Comprar el pan\n5. Contestar emails\n", gestorTa1.getTareasImpares());
    }

}

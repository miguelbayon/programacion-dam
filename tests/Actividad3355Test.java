import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Actividad3355Test {

    @Test
    public void testMetodo06y07() {
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
    public void testMetodo10() {
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
    public void testMetodo11() {
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
    public void testMetodo12() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("", gestorTa1.getTareaMasAntigua());
        gestorTa1.agregarTarea("Dormir la siesta");
        gestorTa1.agregarTarea("Comprar pan");
        gestorTa1.agregarTarea("Hacer la colada");
        assertEquals("Dormir la siesta", gestorTa1.getTareaMasAntigua());
    }

    @Test
    public void testMetodo14() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("", gestorTa1.getListadoTareas());
        gestorTa1.agregarTarea("Hablar");
        assertEquals("1. Hablar\n", gestorTa1.getListadoTareas());
        gestorTa1.agregarTarea("Jugar");
        gestorTa1.agregarTarea("Comer");
        assertEquals("1. Hablar\n2. Jugar\n3. Comer\n", gestorTa1.getListadoTareas());
    }

    @Test
    public void testMetodo16() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals("[]", gestorTa1.getTareasEnUnaSolaLinea());
        gestorTa1.agregarTarea("Hacer la cama");
        assertEquals("[Hacer la cama]", gestorTa1.getTareasEnUnaSolaLinea());
        gestorTa1.agregarTarea("Estudiar programación");
        assertEquals("[Hacer la cama, Estudiar programación]", gestorTa1.getTareasEnUnaSolaLinea());
        gestorTa1.agregarTarea("Comprar el pan");
        assertEquals("[Hacer la cama, Estudiar programación, Comprar el pan]", gestorTa1.getTareasEnUnaSolaLinea());
    }

    @Test
    public void testMetodo18() {
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

    @Test
    public void testMetodo19() {
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
    public void testMetodo21() {
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

    @Test
    public void testMetodo23() {
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
    public void testMetodo24() {
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
    public void testMetodo26() {
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
    public void testMetodo28() {
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

    @Test
    public void testMetodo30() {
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
    public void testMetodo32() {
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
    public void testMetodo33() {
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
    public void testMetodo35() {
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
    public void testMetodo36() {
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
/*
    @Test
    public void testMetodo37() {
        GestorTareas gestorTa1 = new GestorTareas();
        assertEquals(0, gestorTa1.eliminaTodasLasTareasConElTextoFoEach("Jugar"));

        gestorTa1.agregarTarea("Jugar al futbol");
        gestorTa1.agregarTarea("Estudiar programacion");
        gestorTa1.agregarTarea("Hacer la cama");

        assertEquals(1, gestorTa1.eliminaTodasLasTareasConElTextoFoEach("Jugar"));
        assertEquals("1. Estudiar programacion\n2. Hacer la cama\n" , gestorTa1.getListadoTareas());

        assertEquals(0, gestorTa1.eliminaTodasLasTareasConElTextoFoEach("doblar"));
        assertEquals("1. Estudiar programacion\n2. Hacer la cama\n" , gestorTa1.getListadoTareas());        

        assertEquals(1, gestorTa1.eliminaTodasLasTareasConElTextoFoEach("Hacer"));
        assertEquals("1. Estudiar programacion\n" , gestorTa1.getListadoTareas());        

        gestorTa1.agregarTarea("Hacer la cama");
        gestorTa1.agregarTarea("Hacer la cena");
        assertEquals(2, gestorTa1.eliminaTodasLasTareasConElTextoFoEach("Hacer"));        
        assertEquals("1. Estudiar programacion\n" , gestorTa1.getListadoTareas());     

        gestorTa1.agregarTarea("Hacer la cama");
        gestorTa1.agregarTarea("Hacer la cena");
        gestorTa1.agregarTarea("Hacer el desayuno");        
        gestorTa1.agregarTarea("Llamar a mi amigo");
        gestorTa1.agregarTarea("Hacer la comida");        
        assertEquals(4, gestorTa1.eliminaTodasLasTareasConElTextoFoEach("Hacer"));
        assertEquals("1. Estudiar programacion\n2. Llamar a mi amigo\n" , gestorTa1.getListadoTareas());          
    } */  
    
    @Test
    public void testMetodo38() {
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
    public void testMetodo39y40() {
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

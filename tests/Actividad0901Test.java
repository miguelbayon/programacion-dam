import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GranjaTest {

    private String obtenido;

    @Test
    void testEstadoInicialPorPantalla() {
        Granja granja = new Granja();
        Pollo polloNormal = new Pollo(1,false);
        Pollo polloModificado = new Pollo(2,true);
        Pato patoNormal = new Pato(3, false);
        Pato patoModificado = new Pato(4, true);
        Cerdo cerdoNormal = new Cerdo(5, 4);
        Cerdo cerdoDeRaza = new Cerdo(6, 8);
        Vaca vacaNormal = new Vaca(7, 3);
        Vaca vacaDeRaza = new Vaca(8, 9);

        System.out.println("Estado inicial de la granja:");
        System.out.println(polloNormal);
        System.out.println(polloModificado);
        System.out.println(patoNormal);
        System.out.println(patoModificado);
        System.out.println(cerdoNormal);
        System.out.println(cerdoDeRaza);
        System.out.println(vacaNormal);
        System.out.println(vacaDeRaza);

    }

    @Test
    void testEstadoInicialComprobaciones() {
        Granja granja = new Granja();
        Pollo polloNormal = new Pollo(1,false);
        Pollo polloModificado = new Pollo(2,true);
        Pato patoNormal = new Pato(3, false);
        Pato patoModificado = new Pato(4, true);
        Cerdo cerdoNormal = new Cerdo(5, 4);
        Cerdo cerdoDeRaza = new Cerdo(6, 8);
        Vaca vacaNormal = new Vaca(7, 3);
        Vaca vacaDeRaza = new Vaca(8, 9);

        String esperado = "" +
                "[POLLO]: ID: 1 - Peso: 1 kg. - Puntos de vida: 100 - Modificado geneticamente: No\n" +
                "[POLLO]: ID: 2 - Peso: 1 kg. - Puntos de vida: 100 - Modificado geneticamente: Si\n" +
                "[PATO ]: ID: 3 - Peso: 2 kg. - Puntos de vida: 100 - Modificado geneticamente: No\n" +
                "[PATO ]: ID: 4 - Peso: 2 kg. - Puntos de vida: 100 - Modificado geneticamente: Si\n" +
                "[CERDO]: ID: 5 - Peso: 15 kg. - Puntos de vida: 100 - Calidad de raza: 4\n" +
                "[CERDO]: ID: 6 - Peso: 15 kg. - Puntos de vida: 100 - Calidad de raza: 8\n" +
                "[VACA ]: ID: 7 - Peso: 25 kg. - Puntos de vida: 100 - Calidad de raza: 3\n" +
                "[VACA ]: ID: 8 - Peso: 25 kg. - Puntos de vida: 100 - Calidad de raza: 9\n";
        String obtenido = "" + polloNormal + "\n" + polloModificado + "\n" + patoNormal + "\n" + patoModificado + "\n" + cerdoNormal + "\n" + cerdoDeRaza + "\n" + vacaNormal + "\n" + vacaDeRaza + "\n";
        assertEquals(esperado, obtenido);

    }



    @Test
    void testAlimentarPorPantalla() {
        Granja granja = new Granja();
        Pollo polloNormal = new Pollo(1,false);
        Pollo polloModificado = new Pollo(2,true);
        Pato patoNormal = new Pato(3, false);
        Pato patoModificado = new Pato(4, true);
        Cerdo cerdoNormal = new Cerdo(5, 4);
        Cerdo cerdoDeRaza = new Cerdo(6, 8);
        Vaca vacaNormal = new Vaca(7, 3);
        Vaca vacaDeRaza = new Vaca(8, 9);

        System.out.println("Estado inicial de la granja:");

        System.out.println(polloNormal);
        System.out.println(polloModificado);
        System.out.println(patoNormal);
        System.out.println(patoModificado);
        System.out.println(cerdoNormal);
        System.out.println(cerdoDeRaza);
        System.out.println(vacaNormal);
        System.out.println(vacaDeRaza);

        System.out.println();
        granja.alimentar(polloNormal);

        System.out.println();
        granja.alimentar(polloModificado);

        System.out.println();
        granja.alimentar(patoNormal);

        System.out.println();
        granja.alimentar(patoModificado);

        System.out.println();
        granja.alimentar(cerdoNormal);

        System.out.println();
        granja.alimentar(cerdoDeRaza);

        System.out.println();
        granja.alimentar(vacaNormal);

        System.out.println();
        granja.alimentar(vacaDeRaza);

    }

    @Test
    void testAlimentarComprobaciones() {
        Granja granja = new Granja();
        Pollo polloNormal = new Pollo(1,false);
        Pollo polloModificado = new Pollo(2,true);
        Pato patoNormal = new Pato(3, false);
        Pato patoModificado = new Pato(4, true);
        Cerdo cerdoNormal = new Cerdo(5, 4);
        Cerdo cerdoDeRaza = new Cerdo(6, 8);
        Vaca vacaNormal = new Vaca(7, 3);
        Vaca vacaDeRaza = new Vaca(8, 9);

        String esperado = "" +
                "[POLLO]: ID: 1 - Peso: 1 kg. - Puntos de vida: 100 - Modificado geneticamente: No\n" +
                "[POLLO]: ID: 2 - Peso: 1 kg. - Puntos de vida: 100 - Modificado geneticamente: Si\n" +
                "[PATO ]: ID: 3 - Peso: 2 kg. - Puntos de vida: 100 - Modificado geneticamente: No\n" +
                "[PATO ]: ID: 4 - Peso: 2 kg. - Puntos de vida: 100 - Modificado geneticamente: Si\n" +
                "[CERDO]: ID: 5 - Peso: 15 kg. - Puntos de vida: 100 - Calidad de raza: 4\n" +
                "[CERDO]: ID: 6 - Peso: 15 kg. - Puntos de vida: 100 - Calidad de raza: 8\n" +
                "[VACA ]: ID: 7 - Peso: 25 kg. - Puntos de vida: 100 - Calidad de raza: 3\n" +
                "[VACA ]: ID: 8 - Peso: 25 kg. - Puntos de vida: 100 - Calidad de raza: 9\n";
        String obtenido = "" + polloNormal + "\n" + polloModificado + "\n" + patoNormal + "\n" + patoModificado + "\n" + cerdoNormal + "\n" + cerdoDeRaza + "\n" + vacaNormal + "\n" + vacaDeRaza + "\n";
        assertEquals(esperado, obtenido);


        granja.alimentar(polloNormal);
        granja.alimentar(polloModificado);
        granja.alimentar(patoNormal);
        granja.alimentar(patoModificado);
        granja.alimentar(cerdoNormal);
        granja.alimentar(cerdoDeRaza);
        granja.alimentar(vacaNormal);
        granja.alimentar(vacaDeRaza);

        esperado = "" +
                "[POLLO]: ID: 1 - Peso: 2 kg. - Puntos de vida: 90 - Modificado geneticamente: No\n" +
                "[POLLO]: ID: 2 - Peso: 2 kg. - Puntos de vida: 98 - Modificado geneticamente: Si\n" +
                "[PATO ]: ID: 3 - Peso: 3 kg. - Puntos de vida: 90 - Modificado geneticamente: No\n" +
                "[PATO ]: ID: 4 - Peso: 3 kg. - Puntos de vida: 97 - Modificado geneticamente: Si\n" +
                "[CERDO]: ID: 5 - Peso: 17 kg. - Puntos de vida: 90 - Calidad de raza: 4\n" +
                "[CERDO]: ID: 6 - Peso: 17 kg. - Puntos de vida: 98 - Calidad de raza: 8\n" +
                "[VACA ]: ID: 7 - Peso: 27 kg. - Puntos de vida: 90 - Calidad de raza: 3\n" +
                "[VACA ]: ID: 8 - Peso: 27 kg. - Puntos de vida: 99 - Calidad de raza: 9\n";

        obtenido = "" + polloNormal + "\n" + polloModificado + "\n" + patoNormal + "\n" + patoModificado + "\n" + cerdoNormal + "\n" + cerdoDeRaza + "\n" + vacaNormal + "\n" + vacaDeRaza + "\n";
        assertEquals(esperado, obtenido);

    }

    @Test
    void testVacunarPorPantalla() {
        Granja granja = new Granja();
        Pollo polloNormal = new Pollo(1,false);
        Pollo polloModificado = new Pollo(2,true);
        Cerdo cerdoNormal = new Cerdo(5, 4);
        Cerdo cerdoDeRaza = new Cerdo(6, 8);
        Vaca vacaNormal = new Vaca(7, 3);
        Vaca vacaDeRaza = new Vaca(8, 9);

        System.out.println("Estado inicial de la granja:");


        System.out.println(polloNormal);
        System.out.println(polloModificado);
        System.out.println(cerdoNormal);
        System.out.println(cerdoDeRaza);
        System.out.println(vacaNormal);
        System.out.println(vacaDeRaza);

        System.out.println();
        System.out.println("___Pollo normal___");

        System.out.println();
        granja.alimentar(polloNormal);
        System.out.println();
        granja.alimentar(polloNormal);
        System.out.println();
        granja.alimentar(polloNormal);
        System.out.println();
        granja.vacunar(polloNormal);

        System.out.println();
        System.out.println("___Pollo modificado___");

        System.out.println();
        granja.alimentar(polloModificado);
        System.out.println();
        granja.alimentar(polloModificado);
        System.out.println();
        granja.alimentar(polloModificado);
        System.out.println();
        granja.vacunar(polloModificado);

        System.out.println();
        System.out.println("___Cerdo normal___");

        System.out.println();
        granja.alimentar(cerdoNormal);
        System.out.println();
        granja.alimentar(cerdoNormal);
        System.out.println();
        granja.alimentar(cerdoNormal);
        System.out.println();
        granja.vacunar(cerdoNormal);

        System.out.println();
        System.out.println("___Cerdo de raza___");

        System.out.println();
        granja.alimentar(cerdoDeRaza);
        System.out.println();
        granja.alimentar(cerdoDeRaza);
        System.out.println();
        granja.alimentar(cerdoDeRaza);
        System.out.println();
        granja.vacunar(cerdoDeRaza);

        System.out.println();
        System.out.println("___Vaca normal___");

        System.out.println();
        granja.alimentar(vacaNormal);
        System.out.println();
        granja.alimentar(vacaNormal);
        System.out.println();
        granja.alimentar(vacaNormal);
        System.out.println();
        granja.vacunar(vacaNormal);

        System.out.println();
        System.out.println("___Vaca de raza___");

        System.out.println();
        granja.alimentar(vacaDeRaza);
        System.out.println();
        granja.alimentar(vacaDeRaza);
        System.out.println();
        granja.alimentar(vacaDeRaza);
        System.out.println();
        granja.vacunar(vacaDeRaza);

    }

    @Test
    void testVacunarComprobaciones() {
        Granja granja = new Granja();
        Pollo polloNormal = new Pollo(1,false);
        Pollo polloModificado = new Pollo(2,true);
        Cerdo cerdoNormal = new Cerdo(5, 4);
        Cerdo cerdoDeRaza = new Cerdo(6, 8);
        Vaca vacaNormal = new Vaca(7, 3);
        Vaca vacaDeRaza = new Vaca(8, 9);

        String esperado = "" +
                "[POLLO]: ID: 1 - Peso: 1 kg. - Puntos de vida: 100 - Modificado geneticamente: No\n" +
                "[POLLO]: ID: 2 - Peso: 1 kg. - Puntos de vida: 100 - Modificado geneticamente: Si\n" +
                "[CERDO]: ID: 5 - Peso: 15 kg. - Puntos de vida: 100 - Calidad de raza: 4\n" +
                "[CERDO]: ID: 6 - Peso: 15 kg. - Puntos de vida: 100 - Calidad de raza: 8\n" +
                "[VACA ]: ID: 7 - Peso: 25 kg. - Puntos de vida: 100 - Calidad de raza: 3\n" +
                "[VACA ]: ID: 8 - Peso: 25 kg. - Puntos de vida: 100 - Calidad de raza: 9\n";
        String obtenido = "" + polloNormal + "\n" + polloModificado + "\n" + cerdoNormal + "\n" + cerdoDeRaza + "\n" + vacaNormal + "\n" + vacaDeRaza + "\n";
        assertEquals(esperado, obtenido);

        //Pollo normal
        granja.alimentar(polloNormal);
        granja.alimentar(polloNormal);
        granja.alimentar(polloNormal);
        granja.vacunar(polloNormal);

        esperado = "" +
                "[POLLO]: ID: 1 - Peso: 4 kg. - Puntos de vida: 80 - Modificado geneticamente: No\n" +
                "[POLLO]: ID: 2 - Peso: 1 kg. - Puntos de vida: 100 - Modificado geneticamente: Si\n" +
                "[CERDO]: ID: 5 - Peso: 15 kg. - Puntos de vida: 100 - Calidad de raza: 4\n" +
                "[CERDO]: ID: 6 - Peso: 15 kg. - Puntos de vida: 100 - Calidad de raza: 8\n" +
                "[VACA ]: ID: 7 - Peso: 25 kg. - Puntos de vida: 100 - Calidad de raza: 3\n" +
                "[VACA ]: ID: 8 - Peso: 25 kg. - Puntos de vida: 100 - Calidad de raza: 9\n";

        obtenido = "" + polloNormal + "\n" + polloModificado + "\n" + cerdoNormal + "\n" + cerdoDeRaza + "\n" + vacaNormal + "\n" + vacaDeRaza + "\n";
        assertEquals(esperado, obtenido);

        //Pollo modificado
        granja.alimentar(polloModificado);
        granja.alimentar(polloModificado);
        granja.alimentar(polloModificado);
        granja.vacunar(polloModificado);

        esperado = "" +
                "[POLLO]: ID: 1 - Peso: 4 kg. - Puntos de vida: 80 - Modificado geneticamente: No\n" +
                "[POLLO]: ID: 2 - Peso: 4 kg. - Puntos de vida: 100 - Modificado geneticamente: Si\n" +
                "[CERDO]: ID: 5 - Peso: 15 kg. - Puntos de vida: 100 - Calidad de raza: 4\n" +
                "[CERDO]: ID: 6 - Peso: 15 kg. - Puntos de vida: 100 - Calidad de raza: 8\n" +
                "[VACA ]: ID: 7 - Peso: 25 kg. - Puntos de vida: 100 - Calidad de raza: 3\n" +
                "[VACA ]: ID: 8 - Peso: 25 kg. - Puntos de vida: 100 - Calidad de raza: 9\n";

        obtenido = "" + polloNormal + "\n" + polloModificado + "\n" + cerdoNormal + "\n" + cerdoDeRaza + "\n" + vacaNormal + "\n" + vacaDeRaza + "\n";
        assertEquals(esperado, obtenido);

        //Cerdo normal
        granja.alimentar(cerdoNormal);
        granja.alimentar(cerdoNormal);
        granja.alimentar(cerdoNormal);
        granja.vacunar(cerdoNormal);

        esperado = "" +
                "[POLLO]: ID: 1 - Peso: 4 kg. - Puntos de vida: 80 - Modificado geneticamente: No\n" +
                "[POLLO]: ID: 2 - Peso: 4 kg. - Puntos de vida: 100 - Modificado geneticamente: Si\n" +
                "[CERDO]: ID: 5 - Peso: 21 kg. - Puntos de vida: 90 - Calidad de raza: 4\n" +
                "[CERDO]: ID: 6 - Peso: 15 kg. - Puntos de vida: 100 - Calidad de raza: 8\n" +
                "[VACA ]: ID: 7 - Peso: 25 kg. - Puntos de vida: 100 - Calidad de raza: 3\n" +
                "[VACA ]: ID: 8 - Peso: 25 kg. - Puntos de vida: 100 - Calidad de raza: 9\n";

        obtenido = "" + polloNormal + "\n" + polloModificado + "\n" + cerdoNormal + "\n" + cerdoDeRaza + "\n" + vacaNormal + "\n" + vacaDeRaza + "\n";
        assertEquals(esperado, obtenido);

        //Cerdo de raza
        granja.alimentar(cerdoDeRaza);
        granja.alimentar(cerdoDeRaza);
        granja.alimentar(cerdoDeRaza);
        granja.vacunar(cerdoDeRaza);

        esperado = "" +
                "[POLLO]: ID: 1 - Peso: 4 kg. - Puntos de vida: 80 - Modificado geneticamente: No\n" +
                "[POLLO]: ID: 2 - Peso: 4 kg. - Puntos de vida: 100 - Modificado geneticamente: Si\n" +
                "[CERDO]: ID: 5 - Peso: 21 kg. - Puntos de vida: 90 - Calidad de raza: 4\n" +
                "[CERDO]: ID: 6 - Peso: 21 kg. - Puntos de vida: 100 - Calidad de raza: 8\n" +
                "[VACA ]: ID: 7 - Peso: 25 kg. - Puntos de vida: 100 - Calidad de raza: 3\n" +
                "[VACA ]: ID: 8 - Peso: 25 kg. - Puntos de vida: 100 - Calidad de raza: 9\n";

        obtenido = "" + polloNormal + "\n" + polloModificado + "\n" + cerdoNormal + "\n" + cerdoDeRaza + "\n" + vacaNormal + "\n" + vacaDeRaza + "\n";
        assertEquals(esperado, obtenido);

        //Vaca normal
        granja.alimentar(vacaNormal);
        granja.alimentar(vacaNormal);
        granja.alimentar(vacaNormal);
        granja.vacunar(vacaNormal);

        esperado = "" +
                "[POLLO]: ID: 1 - Peso: 4 kg. - Puntos de vida: 80 - Modificado geneticamente: No\n" +
                "[POLLO]: ID: 2 - Peso: 4 kg. - Puntos de vida: 100 - Modificado geneticamente: Si\n" +
                "[CERDO]: ID: 5 - Peso: 21 kg. - Puntos de vida: 90 - Calidad de raza: 4\n" +
                "[CERDO]: ID: 6 - Peso: 21 kg. - Puntos de vida: 100 - Calidad de raza: 8\n" +
                "[VACA ]: ID: 7 - Peso: 31 kg. - Puntos de vida: 100 - Calidad de raza: 3\n" +
                "[VACA ]: ID: 8 - Peso: 25 kg. - Puntos de vida: 100 - Calidad de raza: 9\n";

        obtenido = "" + polloNormal + "\n" + polloModificado + "\n" + cerdoNormal + "\n" + cerdoDeRaza + "\n" + vacaNormal + "\n" + vacaDeRaza + "\n";        assertEquals(esperado, obtenido);

        //Vaca de raza
        granja.alimentar(vacaDeRaza);
        granja.alimentar(vacaDeRaza);
        granja.alimentar(vacaDeRaza);
        granja.vacunar(vacaDeRaza);

        esperado = "" +
                "[POLLO]: ID: 1 - Peso: 4 kg. - Puntos de vida: 80 - Modificado geneticamente: No\n" +
                "[POLLO]: ID: 2 - Peso: 4 kg. - Puntos de vida: 100 - Modificado geneticamente: Si\n" +
                "[CERDO]: ID: 5 - Peso: 21 kg. - Puntos de vida: 90 - Calidad de raza: 4\n" +
                "[CERDO]: ID: 6 - Peso: 21 kg. - Puntos de vida: 100 - Calidad de raza: 8\n" +
                "[VACA ]: ID: 7 - Peso: 31 kg. - Puntos de vida: 100 - Calidad de raza: 3\n" +
                "[VACA ]: ID: 8 - Peso: 31 kg. - Puntos de vida: 100 - Calidad de raza: 9\n";

        obtenido = "" + polloNormal + "\n" + polloModificado + "\n" + cerdoNormal + "\n" + cerdoDeRaza + "\n" + vacaNormal + "\n" + vacaDeRaza + "\n";
        assertEquals(esperado, obtenido);


    }
}

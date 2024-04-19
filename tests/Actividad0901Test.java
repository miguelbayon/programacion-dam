import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Actividad0901Test {

    private String obtenido;

    @Test
    void testEstadoInicial() {
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
    void testEstadoInicial2() {import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GranjaTest {

    private String obtenido;

    @Test
    void testEstadoInicial() {
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
    void testEstadoInicial2() {
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
    void testAlimentar() {
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
    void testAlimentar2() {
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
}

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
    void testAlimentar() {
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
    void testAlimentar2() {
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
}

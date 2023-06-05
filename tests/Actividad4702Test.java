import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Actividad4702Test {

    @Test
    public void test01ColeccionesLlenas4Aprobadas()
    {
        Alumno alumno1 = new Alumno("Juan Alonso", 10, 10, 7);     //
        Alumno alumno2 = new Alumno("Maria Rodriguez", 7, 7, 7);   //
        Alumno alumno3 = new Alumno("Pedro Sadia", 9, 7, 4);       //
        Alumno alumno4 = new Alumno("Barbara Bajo", 10, 10, 10);   //
        Alumno alumno5 = new Alumno("Carlos Cañas", 4, 9, 9);      //
        Alumno alumno6 = new Alumno("Roberto Colado", 8, 9, 7);    //
        Alumno alumno7 = new Alumno("Nacho Gonzalez", 1, 2, 7);    //
        Alumno alumno8 = new Alumno("Laura Perez", 7, 9, 8);       //
        Alumno alumno9 = new Alumno("David Lozano", 10, 10, 10);   //
        Alumno alumno10 = new Alumno("Simon Cordero", 5, 7, 6);    //
        Alumno alumno11 = new Alumno("Olga Garcia", 6, 7, 8);      //
        Alumno alumno12 = new Alumno("Pepe Ferrandez", 10, 10, 4); //

        ArrayList<Alumno> grupo1 = new ArrayList<Alumno>();
        grupo1.add(alumno1);
        grupo1.add(alumno2);
        grupo1.add(alumno3);
        grupo1.add(alumno4);

        ArrayList<Alumno> grupo2 = new ArrayList<Alumno>();
        grupo2.add(alumno5);
        grupo2.add(alumno6);
        grupo2.add(alumno7);
        grupo2.add(alumno8);
        grupo2.add(alumno9);
        grupo2.add(alumno10);
        grupo2.add(alumno11);
        grupo1.add(alumno12);


        Actividad4702 objetoBase = new Actividad4702();
        ArrayList<Alumno> resultadoEsperado = new ArrayList<>();
        ArrayList<Alumno> resultadoObtenido = objetoBase.obtenerAlumnosOrdenadosPorNotaMediaSoloSiHanAprobado(grupo1, grupo2, 4);
        assertArrayEquals(resultadoEsperado.toArray(), resultadoObtenido.toArray());

    }

    @Test
    public void test01ColeccionesLlenas3Aprobadas()
    {
        Alumno alumno1 = new Alumno("Juan Alonso", 10, 10, 7);     //
        Alumno alumno2 = new Alumno("Maria Rodriguez", 7, 7, 7);   //
        Alumno alumno3 = new Alumno("Pedro Sadia", 9, 7, 4);       //
        Alumno alumno4 = new Alumno("Barbara Bajo", 10, 10, 10);   //
        Alumno alumno5 = new Alumno("Carlos Cañas", 4, 9, 9);      //
        Alumno alumno6 = new Alumno("Roberto Colado", 8, 9, 7);    //
        Alumno alumno7 = new Alumno("Nacho Gonzalez", 1, 2, 7);    //
        Alumno alumno8 = new Alumno("Laura Perez", 7, 9, 8);       //
        Alumno alumno9 = new Alumno("David Lozano", 10, 10, 10);   //
        Alumno alumno10 = new Alumno("Simon Cordero", 5, 7, 6);    //
        Alumno alumno11 = new Alumno("Olga Garcia", 6, 7, 8);      //
        Alumno alumno12 = new Alumno("Pepe Ferrandez", 10, 10, 4); //

        ArrayList<Alumno> grupo1 = new ArrayList<Alumno>();
        grupo1.add(alumno1);
        grupo1.add(alumno2);
        grupo1.add(alumno3);
        grupo1.add(alumno4);

        ArrayList<Alumno> grupo2 = new ArrayList<Alumno>();
        grupo2.add(alumno5);
        grupo2.add(alumno6);
        grupo2.add(alumno7);
        grupo2.add(alumno8);
        grupo2.add(alumno9);
        grupo2.add(alumno10);
        grupo2.add(alumno11);
        grupo1.add(alumno12);


        Actividad4702 objetoBase = new Actividad4702();
        ArrayList<Alumno> resultadoEsperado = new ArrayList<>(Arrays.asList(alumno9, alumno4, alumno1, alumno8, alumno6, alumno11, alumno2, alumno10));
        ArrayList<Alumno> resultadoObtenido = objetoBase.obtenerAlumnosOrdenadosPorNotaMediaSoloSiHanAprobado(grupo1, grupo2, 3);
        assertArrayEquals(resultadoEsperado.toArray(), resultadoObtenido.toArray());

    }

    @Test
    public void test01ColeccionesLlenas2Aprobadas()
    {
        Alumno alumno1 = new Alumno("Juan Alonso", 10, 10, 7);     //
        Alumno alumno2 = new Alumno("Maria Rodriguez", 7, 7, 7);   //
        Alumno alumno3 = new Alumno("Pedro Sadia", 9, 7, 4);       //
        Alumno alumno4 = new Alumno("Barbara Bajo", 10, 10, 10);   //
        Alumno alumno5 = new Alumno("Carlos Cañas", 4, 9, 9);      //
        Alumno alumno6 = new Alumno("Roberto Colado", 8, 9, 7);    //
        Alumno alumno7 = new Alumno("Nacho Gonzalez", 1, 2, 7);    //
        Alumno alumno8 = new Alumno("Laura Perez", 7, 9, 8);       //
        Alumno alumno9 = new Alumno("David Lozano", 10, 10, 10);   //
        Alumno alumno10 = new Alumno("Simon Cordero", 5, 7, 6);    //
        Alumno alumno11 = new Alumno("Olga Garcia", 6, 7, 8);      //
        Alumno alumno12 = new Alumno("Pepe Ferrandez", 10, 10, 4); //

        ArrayList<Alumno> grupo1 = new ArrayList<Alumno>();
        grupo1.add(alumno1);
        grupo1.add(alumno2);
        grupo1.add(alumno3);
        grupo1.add(alumno4);

        ArrayList<Alumno> grupo2 = new ArrayList<Alumno>();
        grupo2.add(alumno5);
        grupo2.add(alumno6);
        grupo2.add(alumno7);
        grupo2.add(alumno8);
        grupo2.add(alumno9);
        grupo2.add(alumno10);
        grupo2.add(alumno11);
        grupo1.add(alumno12);


        Actividad4702 objetoBase = new Actividad4702();
        ArrayList<Alumno> resultadoEsperado = new ArrayList<>(Arrays.asList(alumno9, alumno4, alumno1, alumno8, alumno6, alumno12, alumno11, alumno5, alumno2, alumno10, alumno3));
        ArrayList<Alumno> resultadoObtenido = objetoBase.obtenerAlumnosOrdenadosPorNotaMediaSoloSiHanAprobado(grupo1, grupo2, 2);
        assertArrayEquals(resultadoEsperado.toArray(), resultadoObtenido.toArray());

    }

    @Test
    public void test02ColeccionesVacias()
    {
        ArrayList<Alumno> grupo1 = new ArrayList<Alumno>();
        ArrayList<Alumno> grupo2 = new ArrayList<Alumno>();

        Actividad4702 objetoBase = new Actividad4702();
        ArrayList<Alumno> resultadoEsperado = new ArrayList<>();
        ArrayList<Alumno> resultadoObtenido = objetoBase.obtenerAlumnosOrdenadosPorNotaMediaSoloSiHanAprobado(grupo1, grupo2, 3);
        assertArrayEquals(resultadoEsperado.toArray(), resultadoObtenido.toArray());
    }
}

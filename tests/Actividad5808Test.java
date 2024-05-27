import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Actividad5808Test {

    @Test
    public void test01() {
        Actividad5808 Actividad5808 = new Actividad5808();
        assertEquals("Equipo                         |  J |  G |  E |  P |  P\n",
                Actividad5808.mostrarClasificacion());
    }

    @Test
    public void test02() {
        Actividad5808 Actividad5808 = new Actividad5808();
        Actividad5808.indicarResultados("Real Madrid;FC Barcelona;gana");
        assertEquals("Equipo                         |  J |  G |  E |  P |  P\n"
                        + "Real Madrid                    |  1 |  1 |  0 |  0 |  3\n"
                        + "FC Barcelona                   |  1 |  0 |  0 |  1 |  0\n",
                Actividad5808.mostrarClasificacion());
    }

    @Test
    public void test03() {
        Actividad5808 Actividad5808 = new Actividad5808();
        Actividad5808.indicarResultados("FC Barcelona;Real Madrid;pierde");
        assertEquals("Equipo                         |  J |  G |  E |  P |  P\n"
                        + "Real Madrid                    |  1 |  1 |  0 |  0 |  3\n"
                        + "FC Barcelona                   |  1 |  0 |  0 |  1 |  0\n",
                Actividad5808.mostrarClasificacion());
    }

    @Test
    public void test04() {
        Actividad5808 Actividad5808 = new Actividad5808();
        Actividad5808.indicarResultados("FC Barcelona;Real Madrid;gana");
        assertEquals("Equipo                         |  J |  G |  E |  P |  P\n"
                        + "FC Barcelona                   |  1 |  1 |  0 |  0 |  3\n"
                        + "Real Madrid                    |  1 |  0 |  0 |  1 |  0\n",
                Actividad5808.mostrarClasificacion());
    }

    @Test
    public void test05() {
        Actividad5808 Actividad5808 = new Actividad5808();
        Actividad5808.indicarResultados("Real Madrid;FC Barcelona;empata");
        assertEquals("Equipo                         |  J |  G |  E |  P |  P\n"
                        + "Real Madrid                    |  1 |  0 |  1 |  0 |  1\n"
                        + "FC Barcelona                   |  1 |  0 |  1 |  0 |  1\n",
                Actividad5808.mostrarClasificacion());
    }

    @Test
    public void test06() {
        Actividad5808 Actividad5808 = new Actividad5808();
        Actividad5808.indicarResultados("Real Madrid;FC Barcelona;gana\n" + "Real Madrid;FC Barcelona;gana");
        assertEquals("Equipo                         |  J |  G |  E |  P |  P\n"
                        + "Real Madrid                    |  2 |  2 |  0 |  0 |  6\n"
                        + "FC Barcelona                   |  2 |  0 |  0 |  2 |  0\n",
                Actividad5808.mostrarClasificacion());
    }

    @Test
    public void test07() {
        Actividad5808 Actividad5808 = new Actividad5808();
        Actividad5808.indicarResultados("Real Madrid;FC Barcelona;pierde\n" + "Real Madrid;FC Barcelona;gana");
        assertEquals("Equipo                         |  J |  G |  E |  P |  P\n"
                        + "Real Madrid                    |  2 |  1 |  0 |  1 |  3\n"
                        + "FC Barcelona                   |  2 |  1 |  0 |  1 |  3\n",
                Actividad5808.mostrarClasificacion());
    }

    @Test
    public void test08() {
        Actividad5808 Actividad5808 = new Actividad5808();
        Actividad5808.indicarResultados("Real Madrid;FC Barcelona;gana\n" + "FC Barcelona;Atletico Madrid;gana\n"
                + "Atletico Madrid;Real Madrid;pierde");
        assertEquals("Equipo                         |  J |  G |  E |  P |  P\n"
                        + "Real Madrid                    |  2 |  2 |  0 |  0 |  6\n"
                        + "FC Barcelona                   |  2 |  1 |  0 |  1 |  3\n"
                        + "Atletico Madrid                |  2 |  0 |  0 |  2 |  0\n",
                Actividad5808.mostrarClasificacion());
    }

    @Test
    public void test09() {
        Actividad5808 Actividad5808 = new Actividad5808();
        Actividad5808.indicarResultados("Real Madrid;FC Barcelona;gana\n" + "Valencia FC;Atletico Madrid;empata\n"
                + "Valencia FC;Real Madrid;gana\n" + "Atletico Madrid;FC Barcelona;pierde\n"
                + "FC Barcelona;Valencia FC;pierde\n" + "Real Madrid;Atletico Madrid;gana");
        assertEquals("Equipo                         |  J |  G |  E |  P |  P\n"
                        + "Valencia FC                    |  3 |  2 |  1 |  0 |  7\n"
                        + "Real Madrid                    |  3 |  2 |  0 |  1 |  6\n"
                        + "FC Barcelona                   |  3 |  1 |  0 |  2 |  3\n"
                        + "Atletico Madrid                |  3 |  0 |  1 |  2 |  1\n",
                Actividad5808.mostrarClasificacion());
    }

    @Test
    public void test10() {
        Actividad5808 Actividad5808 = new Actividad5808();
        Actividad5808.indicarResultados("Real Madrid;FC Barcelona;pierde\n" + "Valencia FC;Real Madrid;pierde\n"
                + "Atletico Madrid;FC Barcelona;empata\n" + "Real Madrid;Atletico Madrid;gana");
        assertEquals("Equipo                         |  J |  G |  E |  P |  P\n"
                        + "Real Madrid                    |  3 |  2 |  0 |  1 |  6\n"
                        + "FC Barcelona                   |  2 |  1 |  1 |  0 |  4\n"
                        + "Atletico Madrid                |  2 |  0 |  1 |  1 |  1\n"
                        + "Valencia FC                    |  1 |  0 |  0 |  1 |  0\n",
                Actividad5808.mostrarClasificacion());
    }

    @Test
    public void test11() {
        Actividad5808 Actividad5808 = new Actividad5808();
        Actividad5808.indicarResultados("Atletico Madrid;Valencia FC;gana\n" + "Real Madrid;FC Barcelona;gana\n"
                + "Valencia FC;Real Madrid;pierde\n" + "Atletico Madrid;FC Barcelona;gana\n"
                + "FC Barcelona;Valencia FC;gana\n" + "Real Madrid;Atletico Madrid;empata");
        assertEquals("Equipo                         |  J |  G |  E |  P |  P\n"
                        + "Real Madrid                    |  3 |  2 |  1 |  0 |  7\n"
                        + "Atletico Madrid                |  3 |  2 |  1 |  0 |  7\n"
                        + "FC Barcelona                   |  3 |  1 |  0 |  2 |  3\n"
                        + "Valencia FC                    |  3 |  0 |  0 |  3 |  0\n",
                Actividad5808.mostrarClasificacion());
    }
}
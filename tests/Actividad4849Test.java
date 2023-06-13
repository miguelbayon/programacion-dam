import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Actividad4849Test {

    @Test
    public void test1() {
        Actividad4849 objetoBase = new Actividad4849();
        assertEquals(true, objetoBase.esPalabraExtrayente("abcdcbg"));
    }

    @Test
    public void test2() {
        Actividad4849 objetoBase = new Actividad4849();
        assertEquals(true, objetoBase.esPalabraExtrayente("abccia"));
    }

    @Test
    public void test3() {
        Actividad4849 objetoBase = new Actividad4849();
        assertEquals(false, objetoBase.esPalabraExtrayente("abcdaaa"));
    }

    @Test
    public void test4() {
        Actividad4849 objetoBase = new Actividad4849();
        assertEquals(true, objetoBase.esPalabraExtrayente("gggfgig"));
    }

    @Test
    public void test5() {
        Actividad4849 objetoBase = new Actividad4849();
        assertEquals(false, objetoBase.esPalabraExtrayente("gggffff"));
    }

    @Test
    public void test6() {
        Actividad4849 objetoBase = new Actividad4849();
        assertEquals(true, objetoBase.esPalabraExtrayente("GIGGG"));
    }

    @Test
    public void test7() {
        Actividad4849 objetoBase = new Actividad4849();
        assertEquals(true, objetoBase.esPalabraExtrayente("ggggi"));
    }

    @Test
    public void test8() {
        Actividad4849 objetoBase = new Actividad4849();
        assertEquals(false, objetoBase.esPalabraExtrayente("ggggg"));
    }

    @Test
    public void test9() {
        Actividad4849 objetoBase = new Actividad4849();
        assertEquals(false, objetoBase.esPalabraExtrayente("gggfggg"));
    }

    @Test
    public void test10() {
        Actividad4849 objetoBase = new Actividad4849();
        assertEquals(false, objetoBase.esPalabraExtrayente("1234312"));
    }

    @Test
    public void test19() {
        Actividad4849 objetoBase = new Actividad4849();
        assertEquals(false, objetoBase.esPalabraExtrayente(""));
    }

    @Test
    public void test20() {
        Actividad4849 objetoBase = new Actividad4849();
        assertEquals(false, objetoBase.esPalabraExtrayente(null));
    }

}
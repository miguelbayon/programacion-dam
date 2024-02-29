import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Actividad8935Test {
    @Test
    public void basic() {
    	Actividad8935 objetoBase = new Actividad8935();
        assertEquals("PNG", objetoBase.convetirATerminoInformatico("Portable Network Graphics"));                
    }
    
    @Test
    public void lowercaseWords() {
    	Actividad8935 objetoBase = new Actividad8935();
        assertEquals("ROR", objetoBase.convetirATerminoInformatico("Ruby on Rails"));                
    }
    
    @Test
    public void punctuation() {
    	Actividad8935 objetoBase = new Actividad8935();
        assertEquals("FIFO", objetoBase.convetirATerminoInformatico("First In, First Out"));                
    }
    
    @Test
    public void nonAcronymAllCapsWord() {
    	Actividad8935 objetoBase = new Actividad8935();    	
        assertEquals("GIMP", objetoBase.convetirATerminoInformatico("GNU Image Manipulation Program"));                
    }
    
    @Test
    public void punctuationWithoutWhitespace() {
    	Actividad8935 objetoBase = new Actividad8935();    	
        assertEquals("CMOS", objetoBase.convetirATerminoInformatico("Complementary metal-oxide semiconductor"));              
    }
    
    @Test
    public void veryLongAbbreviation() {
    	Actividad8935 objetoBase = new Actividad8935();    	
        assertEquals("ROTFLSHTMDCOALM", objetoBase.convetirATerminoInformatico("Rolling On The Floor Laughing So Hard That My Dogs Came Over And Licked Me"));               
    }
    
    @Test
    public void consecutiveDelimiters() {
    	Actividad8935 objetoBase = new Actividad8935();    	
        assertEquals("SIMUFTA", objetoBase.convetirATerminoInformatico("Something - I made up from thin air"));             
    }  

    @Test
    public void apostrophes() {
    	Actividad8935 objetoBase = new Actividad8935();    	
        assertEquals("HC", objetoBase.convetirATerminoInformatico("Halley's Comet"));             
    }
    
    @Test
    public void underscoreEmphasis() {
    	Actividad8935 objetoBase = new Actividad8935();    	
        assertEquals("TRNT", objetoBase.convetirATerminoInformatico("The Road _Not_ Taken"));
    }
    
    @Test
    public void nullTest() {
    	Actividad8935 objetoBase = new Actividad8935();    	
        assertEquals(null, objetoBase.convetirATerminoInformatico(null));
    }
    
    @Test
    public void emptyString() {
    	Actividad8935 objetoBase = new Actividad8935();    	
        assertEquals("", objetoBase.convetirATerminoInformatico(""));           
    }    
}

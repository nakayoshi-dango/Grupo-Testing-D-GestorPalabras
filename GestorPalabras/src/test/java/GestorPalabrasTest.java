import com.gestorpalabras.GestorPalabras;
import org.junit.Test;
import static junit.framework.TestCase.*;
public class GestorPalabrasTest {
    //Método contarVocales
    //Francisco
    @Test
    public void sinTildes() throws Exception {
        GestorPalabras ges = new GestorPalabras();
        assertEquals(5, ges.contarVocales("murcielagojjjj"));
    }

    @Test
    public void conTildes() throws Exception {
        GestorPalabras ges = new GestorPalabras();
        assertEquals(5, ges.contarVocales("murciélagojjjjj"));
    }

    @Test
    public void mayusculas() throws Exception {
        GestorPalabras ges = new GestorPalabras();
        assertEquals(3, ges.contarVocales("PATATAqqqqq"));
    }

    @Test
    public void tildesMayusculasYMinusculas() throws Exception {
        GestorPalabras ges = new GestorPalabras();
        assertEquals(3, ges.contarVocales("pátÁtáttttt"));
    }
    //Método InvertirPalabra
    //Daniel
    
    @Test
    public void sinTildes() throws Exception {
        GestorPalabras gp = new GestorPalabras();
        assertEquals("aloh", gp.invertirPalabra("hola"));
        assertEquals("inad", gp.invertirPalabra("dani"));
    }
    
    @Test
    public void conTildes() throws Exception {
        GestorPalabras gp = new GestorPalabras();
        assertEquals("sóida", gp.invertirPalabra("adiós"));
        assertEquals("lobrá", gp.invertirPalabra("árbol"));
    }
    
    @Test
    public void mayusculas() throws Exception {
        GestorPalabras gp = new GestorPalabras();
        assertEquals("NAUJ", gp.invertirPalabra("JUAN"));
        assertEquals("AMSI", gp.invertirPalabra("ISMA"));
    }
    
    @Test
    public void tildesMayusculasMinusculas() throws Exception {
        GestorPalabras gp = new GestorPalabras();
        assertEquals("nóiva oravlÁ", gp.invertirPalabra("Álvaro avión"));
    }
    
    @Test
    public void numeros() throws Exception {
        GestorPalabras gp = new GestorPalabras();
        assertEquals("4321", gp.invertirPalabra("1234"));
        assertEquals("123", gp.invertirPalabra("321"));
    }
    
    @Test
    public void simbolos() throws Exception {
        GestorPalabras gp = new GestorPalabras();
        assertEquals("&%$", gp.invertirPalabra("$%&"));
        assertEquals(")(/", gp.invertirPalabra("/()"));
    }
}

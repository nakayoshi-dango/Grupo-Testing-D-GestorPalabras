import com.gestorpalabras.GestorPalabras;
import org.junit.Test;
import static junit.framework.TestCase.*;
public class GestorPalabrasTest {
    //Método contarVocales
    
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
}

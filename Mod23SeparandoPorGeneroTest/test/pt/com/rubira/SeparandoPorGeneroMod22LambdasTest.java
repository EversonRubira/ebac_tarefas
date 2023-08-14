
package pt.com.rubira;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class SeparandoPorGeneroMod22LambdasTest {

    @Test
    public void testGeneroFemininos() {
        SelecionandoGenero separandoPorGenero = new SelecionandoGenero();

        separandoPorGenero.adicionarNome("Everson Rubira", "M");
        separandoPorGenero.adicionarNome("Arthur Rubira", "M");
        separandoPorGenero.adicionarNome("Claudia Teixeira", "F");
        separandoPorGenero.adicionarNome("Reni Farias", "F");
        separandoPorGenero.adicionarNome("Maria Paula", "NB");


        assertTrue(separandoPorGenero.getNomesFemininos().contains("Claudia Teixeira"));
        assertTrue(separandoPorGenero.getNomesFemininos().contains("Reni Farias"));

    }
}
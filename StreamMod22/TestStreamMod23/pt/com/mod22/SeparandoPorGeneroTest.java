package pt.com.mod22;

import org.junit.Test;

public class SeparandoPorGeneroTest {

    @Test
    public void deveSelecionarApenasOGeneroFeminino() {

        SeparandoPorGenero separandoPorGenero = new SeparandoPorGenero();
        separandoPorGenero.filtraGeneroFeminino();

    }
}
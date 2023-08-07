package pt.com.rubira;

import org.junit.Test;
import org.junit.Assert;


public class TestClientTest {

   @Test
    public void testeClasseClient (){
        TestClient cli = new TestClient();
        cli.setNome("Everson Rubira");
        cli.setIdade(50);
        cli.setProfissao("Desenvolvedor");


        Assert.assertEquals("Everson Rubira", cli.getNome());
        Assert.assertEquals(50, cli.getIdade());
        Assert.assertEquals("Desenvolvedor", cli.getProfissao());

    }
}
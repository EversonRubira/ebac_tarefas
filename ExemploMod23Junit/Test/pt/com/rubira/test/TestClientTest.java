package pt.com.rubira.test;

import org.junit.Assert;
import org.junit.Test;
import pt.com.rubira.TestClient;

public class TestClientTest {

    @Test
    public void testeClasseClient (){
        TestClient cli = new TestClient();
        cli.AddName("Everson Rubira");

        Assert.assertEquals("Everson Rubira", cli.getNome());






    }
}

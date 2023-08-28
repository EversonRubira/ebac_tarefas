package pt.com.rubira.test;

import org.junit.Assert;
import org.junit.Test;

public class SecondTest {


    @Test
    public void TestNotEquals(){
        String nome = "Everson Rubira";
        Assert.assertNotEquals("Everson rubira", nome);
    }
}

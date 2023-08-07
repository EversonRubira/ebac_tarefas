package pt.com.rubira.test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstTestTest {

    @Test
    public void Test(){
        String nome = "Everson Rubira";
        Assert.assertEquals("Everson Rubira", nome);
    }

    @Test
    public void TestNotEquals(){
        String nome = "Everson Rubira";
        Assert.assertNotEquals("Everson rubira", nome);
    }

}
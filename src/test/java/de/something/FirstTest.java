package de.something;

import org.junit.Assert;
import org.junit.Test;

public class FirstTest {


    @Test
    public void firstTest() throws Exception {

        Assert.assertTrue(false);
    }

    @Test
    public void secondTest() throws Exception {
        SomeObject someObject = new SomeObject();
        someObject.doSomething();
        Assert.assertEquals(true, someObject.check());
    }
}

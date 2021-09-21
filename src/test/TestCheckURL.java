package test;

import main.CheckString;
import org.junit.Assert;
import org.junit.Test;

public class TestCheckURL {
    @Test
    public void checkURLTest1() {
        Assert.assertTrue(CheckString.isURL("https://datatracker.ietf.org/doc/html/rfc2822#section-3.4"));
    }

    @Test
    public void checkURLTest2() {
        Assert.assertTrue(CheckString.isURL("http://www.example.com"));
    }
    @Test
    public void checkURLTest3() {
        Assert.assertTrue(CheckString.isURL("new.vyatsu.ru/account/obr/rasp/?login=yes"));
    }
    @Test
    public void checkURLTest4() {
        Assert.assertFalse(CheckString.isURL("http://a.com"));
    }
    @Test
    public void checkURLTest5() {
        Assert.assertFalse(CheckString.isURL("JustText"));
    }
}

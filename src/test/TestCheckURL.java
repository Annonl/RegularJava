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
    @Test
    public void checkURLTest6() {

        Assert.assertFalse(CheckString.isURL("http://www.-example-.com"));
    }
    @Test
    public void checkURLTest7() {

        Assert.assertFalse(CheckString.isURL("164.184.154.1"));
    }
    @Test
    public void checkURLTest8() {

        Assert.assertFalse(CheckString.isURL("http://www.exam..ple.com"));
    }
    @Test
    public void checkURLTest9() {

        Assert.assertTrue(CheckString.isURL("https://github.com/Annonl/RegularJava"));
    }
    @Test
    public void checkURLTest10() {

        Assert.assertTrue(CheckString.isURL("https://yandex.ru/images/search?text=%D0%B0%D0%BB%D1%84%D0%B0%D0%B2%D0%B8%D1%82"));
    }
}

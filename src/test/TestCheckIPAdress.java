package test;

import main.CheckString;
import org.junit.Assert;
import org.junit.Test;

public class TestCheckIPAdress {
    @Test
    public void checkIPAdressTest1() {
        Assert.assertTrue(CheckString.isIpAdress("219.156.1.20"));
    }

    @Test
    public void checkIPAdressTest2() {
        Assert.assertTrue(CheckString.isIpAdress("255.255.255.255"));
    }

    @Test
    public void checkIPAdressTest3() {
        Assert.assertTrue(CheckString.isIpAdress("0.0.0.0"));
    }

    @Test
    public void checkIPAdressTest4() {
        Assert.assertFalse(CheckString.isIpAdress("254.255.256.257"));
    }

    @Test
    public void checkIPAdressTest5() {
        Assert.assertFalse(CheckString.isIpAdress("219 .156 .1 .201"));
    }

}

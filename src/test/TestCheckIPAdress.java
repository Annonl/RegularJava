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
    @Test
    public void checkIPAdressTest6() {
        Assert.assertFalse(CheckString.isIpAdress("254.255.255.2."));
    }
    @Test
    public void checkIPAdressTest7() {
        Assert.assertFalse(CheckString.isIpAdress(".254.255.25.25"));
    }
    @Test
    public void checkIPAdressTest8() {
        Assert.assertFalse(CheckString.isIpAdress("254.255.25.212.123"));
    }
    @Test
    public void checkIPAdressTest9() {
        Assert.assertTrue(CheckString.isIpAdress("151.84.204.202"));
    }
    @Test
    public void checkIPAdressTest10() {
        Assert.assertTrue(CheckString.isIpAdress("83.57.251.87"));
    }

}

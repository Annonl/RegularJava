package test;

import main.CheckString;
import org.junit.Assert;
import org.junit.Test;

public class TestCheckStrongPassword {

    @Test
    public void checkStrongPasswordTest1() {
        Assert.assertTrue(CheckString.isStrongPassword("C00l_Pass"));
    }

    @Test
    public void checkStrongPasswordTest2() {
        Assert.assertTrue(CheckString.isStrongPassword("SupperPas1"));
    }
    @Test
    public void checkStrongPasswordTest3() {
        Assert.assertFalse(CheckString.isStrongPassword("Cool_pass"));
    }
    @Test
    public void checkStrongPasswordTest4() {
        Assert.assertFalse(CheckString.isStrongPassword("C00l"));
    }
    @Test
    public void checkStrongPasswordTest5() {
        Assert.assertFalse(CheckString.isStrongPassword("Ab1Avc2"));
    }
    @Test
    public void checkStrongPasswordTest6() {
        Assert.assertFalse(CheckString.isStrongPassword("StrongPassword"));
    }
    @Test
    public void checkStrongPasswordTest7() {
        Assert.assertFalse(CheckString.isStrongPassword("123456789"));
    }
    @Test
    public void checkStrongPasswordTest8() {
        Assert.assertTrue(CheckString.isStrongPassword("WeWe1234"));
    }
    @Test
    public void checkStrongPasswordTest9() {
        Assert.assertTrue(CheckString.isStrongPassword("1muVcjkEfy"));
    }
    @Test
    public void checkStrongPasswordTest10() {
        Assert.assertTrue(CheckString.isStrongPassword("uS9bP3ey7XMWgUa6HZ0R2vlP"));
    }
}

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
}

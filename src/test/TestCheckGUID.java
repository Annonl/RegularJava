package test;

import main.CheckString;
import org.junit.Assert;
import org.junit.Test;

public class TestCheckGUID {

    @Test
    public void checkGUIDTest1() {
        Assert.assertTrue(CheckString.isGUID("3c948923-611c-4333-b463-27db24e8e7a7"));
    }

    @Test
    public void checkGUIDTest2() {
        Assert.assertTrue(CheckString.isGUID("{c17fe09c-5a41-40a0-a81e-3c64264602b5}"));
    }
    @Test
    public void checkGUIDTest3() {
        Assert.assertFalse(CheckString.isGUID("{g17fe09c-5a41-40a0-a81e-3c64264602b5}"));
    }
    @Test
    public void checkGUIDTest4() {
        Assert.assertFalse(CheckString.isGUID("e02fd0e400fd090Aca300d00a0038ba0"));
    }
    @Test
    public void checkGUIDTest5() {
        Assert.assertFalse(CheckString.isGUID("c17fe09c-5a41-40a0a81e-3c64264602b5"));
    }
}

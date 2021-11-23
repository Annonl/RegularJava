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
    @Test
    public void checkGUIDTest6() {
        Assert.assertFalse(CheckString.isGUID("This is GUID: 75e46c59-7733-411f-98be-ae8150eb0e86"));
    }
    @Test
    public void checkGUIDTest7() {
        Assert.assertFalse(CheckString.isGUID("75e46c59-7733-411f-98be-ae8150eb0e86}"));
    }
    @Test
    public void checkGUIDTest8() {
        Assert.assertTrue(CheckString.isGUID("75e46c59-7733-411f-98be-ae8150eb0e86"));
    }
    @Test
    public void checkGUIDTest9() {
        Assert.assertTrue(CheckString.isGUID("{fa264fd0-812e-480c-8ffd-2b3bb3ef614e}"));
    }
    @Test
    public void checkGUIDTest10() {
        Assert.assertTrue(CheckString.isGUID("0e7d31e5-8ad1-4dba-b8c9-8424c1b99819"));
    }
}

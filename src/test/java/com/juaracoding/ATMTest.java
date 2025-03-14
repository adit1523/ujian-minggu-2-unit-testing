package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ATMTest {
    private ATM atm;

    @BeforeMethod
    public void awal(){
        atm = new ATM(1000);
    }
    @Test
    public void testLihatSaldo(){
        Assert.assertEquals(atm.lihatSaldo(),1000.0);
    }
    @Test
    public void testSetorUang(){
        atm.setorUang(700);
        Assert.assertEquals(atm.lihatSaldo(),1700.0);
    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSetorUangNegatif(){
        atm.setorUang(-1000);
    }
    @Test
    public void testTarikUang(){
        atm.tarikUang(300);
        Assert.assertEquals(atm.lihatSaldo(),700.0);
    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTarikUangLebihDariSaldo(){
        atm.tarikUang(1800);
    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testTarikUangNegatif(){
        atm.setorUang(-1000);

    }
}

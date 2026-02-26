/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.test;

import org.junit.Test;
import static org.junit.Assert.*;
import vut.data.Property;
import vut.data.RentProperty;
import vut.data.SellProperty;

/**
 *
 * @author 223092274
 */
public class PropertyMethodsTester {
    
//    public PropertyMethodsTester() {
//    }
            Property objSProperty = new SellProperty();
            Property objRProperty = new RentProperty();
            SellProperty objPayable = new SellProperty();
            RentProperty objComm = new RentProperty();




    @Test
    public void testSetPropertyCodeMethod1() {
        objSProperty.setPropertyCode("123456g");
        assertEquals("123456g",objSProperty.getPropertyCode());
    }
    
    
     @Test
    public void testSetPropertyCodeMethod2() {
        objSProperty.setPropertyCode("123g456");
        assertEquals("123g456",objSProperty.getPropertyCode());
    }
    
     @Test
    public void testSetPropertyCodeMethod3() {
        objSProperty.setPropertyCode("123456");
        assertEquals("123456",objSProperty.getPropertyCode());
    }
    
    
    @Test
    public void testSetPropertyCodeMethod4() {
        objRProperty.setPropertyCode("22t3345677");
        assertEquals("22t3345677",objRProperty.getPropertyCode());
    }
    
     
    @Test
    public void testSetPropertyCodeMethod5() {
        objRProperty.setPropertyCode("22t33456776");
        assertEquals("22t33456776",objRProperty.getPropertyCode());
    }
    
     
    @Test
    public void testSetPropertyCodeMethod6() {
        objRProperty.setPropertyCode("22133456776");
        assertEquals("22133456776",objRProperty.getPropertyCode());
    }
    
    
     @Test
    public void testCalculateAmountPayableMethod1() {
         objPayable.setSellingPrice(65000000);
        assertEquals(65000000,objPayable.getSellingPrice(),0.0);
        
    }
    
     @Test
    public void testCalculateAmountPayableMethod2() {
         objPayable.setSellingPrice(7500000);
        assertEquals(7500000,objPayable.getSellingPrice(),0.0);
    }
    
     @Test
    public void testCalculateAmountPayableMethod3() {
         objPayable.setSellingPrice(221776);
        assertEquals(221776,objPayable.getSellingPrice(),0.0);
    }
    
    
    
     @Test
    public void testCalculateAmountPayableMethod4() {
         objPayable.setSellingPrice(2133456776);
        assertEquals(133456776,objPayable.getSellingPrice(),0.0);
    }
    
    
    @Test
    public void testCalculateCommissionMethod1() {
         objComm.setRentAmount(1800000);
        assertEquals(1800000,objComm.getRentAmount(),0.0);
    }
    
    
    @Test
    public void testCalculateCommissionMethod2() {
        objComm.setRentAmount(1200000);
        assertEquals(1200000,objComm.getRentAmount(),0.0);
    }
    
    @Test
    public void testCalculateCommissionMethod3() {
        objComm.setRentAmount(1820000);
        assertEquals(1820000,objComm.getRentAmount(),0.0);
    }
    
    
    @Test
    public void testCalculateCommissionMethod4() {
         objComm.setRentAmount(72000);
        assertEquals(720000,objComm.getRentAmount(),0.0);
    }
}

package com.krups.testing.m2;

import org.junit.Assert;
import org.junit.Test;

public class CafeTest {

    @Test
    public void canBrewEspresso() {
        //Given
        Cafe cafe = new Cafe();
        cafe.restockBeans(7);
        //When
        Coffee coffee = cafe.brew(CoffeeType.Espresso);

        //Then
        Assert.assertEquals(CoffeeType.Espresso, coffee.getType());
        Assert.assertEquals(0, coffee.getMilk());
        Assert.assertEquals(7, coffee.getBeans());

//        System.out.println(toString());

//        System.out.println(cafe.equals(cafe));
    }
}

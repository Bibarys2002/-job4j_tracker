package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public  void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        a.distance(b);
        double expected = 2;
        Assert.assertEquals(expected, expected, 0.01);    }
    /* @Test
    public void whenThis30Another50ThenAnotherLoadEqual80() {
        Battery charger = new Battery(30);
        Battery another = new Battery(50);
        charger.exchange(another);
        int expected = 80;
        assertThat(another.about()).isEqualTo("My charge: " + expected + "%");
    }*/

    @Test
    public void when00to21then3() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 1);
        a.distance(b);
        double expected = 2.23;
        Assert.assertEquals(expected, expected, 0.01);
    }

    @Test
    public void when02to20then2dot83() {
        Point a = new Point(0, 2);
        Point b = new Point(2, 0);
        a.distance(b);
        double expected = 2.83;
        Assert.assertEquals(expected, expected, 0.01);
    }

    @Test
    public void when12to00the3() {
        Point a = new Point(1, 2);
        Point b = new Point(0, 0);
        a.distance(b);
        double expected = 2.23;
        Assert.assertEquals(expected, expected, 0.01);
    }

}
package com.barclays;

import org.junit.Test;


import static junit.framework.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void shouldCalculatePerimeter() {
        Rectangle rectangle=new Rectangle(5,4);
        assertEquals(18.0,rectangle.perimeter());
    }

    @Test
    public void shouldCalculateArea() {
        Rectangle rectangle = new Rectangle(5, 4);
        assertEquals(20.0, rectangle.area());
    }

}
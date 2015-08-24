package com.barclays;


import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class SquareTest {

    @Test
    public void shouldCalculateArea() {
        Square square=new Square(5);
        assertEquals(25, square.area());
    }

    @Test
    public void shouldCalculatePerimeter(){
        Square square=new Square(5);
        assertEquals(20, square.perimeter());
    }
}
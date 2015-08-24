package com.barclays;

public class Square {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public double area()
    {
        return this.side*this.side;
    }

    public double perimeter()
    {
        return 4*(this.side);
    }
}

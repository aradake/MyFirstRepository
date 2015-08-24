package com.barclays;

public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }

    public double perimeter()
    {
        return 2*(this.length+this.width);
    }

   public double area()
   {
      return (this.length*this.width);
   }
}

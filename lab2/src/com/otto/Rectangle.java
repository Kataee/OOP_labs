package com.otto;

public class Rectangle {

    //Egységbezárás (encapsulation)
    //Attributes (tulajdonságok)

    private double length, width;

    //Methods

    //Constructor - initialization
    //bármennyi konstruktorunk lehet
    //new használatakor hívódik meg

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //Getters

    public double getArea() {
        return length*width;
    }

    public double getPerimeter() {
        return 2*(length+width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    /*
    @Override
    public String toString() {
        return getWidth() + getLength(), getArea(), getPerimeter();
    }

     */
}






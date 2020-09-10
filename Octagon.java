package com.codewithjono;

public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon>{



    private double side = 1.0;


       //constructor here
    public Octagon(int side){
        this.side = side;
    }

    // get and set methods below

    public void setSide(double newSide){
        side = newSide;
    }

        // get the area of the octogons
    @Override
    public double getArea() {

        double area = (2+4/Math.sqrt(2)) * side * side;
        return area;
    }
    public double getSide(){
        return side;
    }
        // method to getPerimeter
    @Override
    public double getPerimeter() {
        double perimeter = side * 8;
        return perimeter;
    }
        // compare the sizes of the perimter of octagons
    @Override
    public int compareTo(Octagon o) {
        return Double.compare(getArea(), o.getArea());
    }

    // clone method to clone the octagons
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

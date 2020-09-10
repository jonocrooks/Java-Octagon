package com.codewithjono;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        // enter side of octagon length as 5
        Octagon octagonOne = new Octagon(5);

	    // printing out the octagonOne area and perimeter

        System.out.println("The area of the octagonOne is: " + octagonOne.getArea());
        System.out.println("The perimeter of the octagoneOne is: " +octagonOne.getPerimeter());

        // cloning octagonOne with octagonTwo
        Octagon octagonTwo = (Octagon)octagonOne.clone();

        // printing out the octagonTwo area and perimeter
        System.out.println("The area of octagonTwo is: " + octagonTwo.getArea());
        System.out.println("The perimeter of octagonTwo is: " + octagonTwo.getPerimeter());

        // comparing the sizes of octagonOne and octagonTwo
        int compareResult = (octagonOne.compareTo(octagonTwo));

        if (compareResult < 0)
            System.out.println("The octagon is smaller than its clone octagon");
        else if (compareResult > 0)
            System.out.println("the octagon is bigger than its clone octagon");
        else
            System.out.println("Both octagonOne and octagonTwo are equal octagons");
    }
}

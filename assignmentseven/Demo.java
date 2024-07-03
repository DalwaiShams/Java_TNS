package com.shams.javassignments.assignmentseven;

public class Demo {
 public static void main(String[] args) {
     // Using different constructors of IceCream class
     Icecream iceCream1 = new Icecream(); // Using no-argument constructor
     Icecream iceCream2 = new Icecream("Chocolate"); // Using constructor with one argument
     Icecream iceCream3 = new Icecream("Strawberry", 35); // Using constructor with two arguments

     // Displaying information about ice creams
     System.out.println("Ice Cream 1: \nFlavor = " + iceCream1.getFlavor() + ", Price = " + iceCream1.getPrice()+" Rs");
     System.out.println("\nIce Cream 2: \nFlavor = " + iceCream2.getFlavor() + ", Price = " + iceCream2.getPrice()+" Rs");
     System.out.println("\nIce Cream 3: \nFlavor = " + iceCream3.getFlavor() + ", Price = " + iceCream3.getPrice()+" Rs");
 }
}

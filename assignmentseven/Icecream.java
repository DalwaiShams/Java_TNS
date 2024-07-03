package com.shams.javassignments.assignmentseven;

public class Icecream {
 private String flavor;
 private double price;

 // Constructor no parameters
 public Icecream() {
     this.flavor = "Vanilla";
     this.price = 10;
 }

 // Constructor One parameter
 public Icecream(String flavor) {
     this.flavor = flavor;
     this.price = 20; // Default price
 }

 // Constructor Two parameters
 public Icecream(String flavor, double price) {
     this.flavor = flavor;
     this.price = price;
 }
 // Getter methods
 public String getFlavor() {
     return flavor;
 }
 public double getPrice() {
     return price;
 }
}

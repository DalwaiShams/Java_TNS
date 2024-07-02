package com.shams.javassignments.assignmentfive;

public class Arzaan extends TaxPayer{
	public Arzaan(double salary) {
        super(salary);
    }
    public double calTax() {
        if (salary <= 50000) {
            return salary * 0.05;
        } else {
            return salary * 0.10;
        }
    }
}

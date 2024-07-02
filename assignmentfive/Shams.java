package com.shams.javassignments.assignmentfive;

public class Shams extends TaxPayer{
	public Shams(double salary) {
        super(salary);
    }

    public double calTax() {
        return salary * 0.2;
    }
}

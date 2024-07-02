package com.shams.javassignments.assignmentfive;

import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Shams's salary: ");
        double ShamsSalary = scanner.nextDouble();
        TaxPayer shams = new Shams(ShamsSalary);
        
        System.out.print("Enter Arzaan's salary: ");
        double ArzaanSalary = scanner.nextDouble();
        TaxPayer arzaan = new Arzaan(ArzaanSalary);

        System.out.println("Payable tax for Shams:");
        shams.totalTax();

        System.out.println("Payable tax for Arzaan:");
        arzaan.totalTax();

        scanner.close();
    }
}




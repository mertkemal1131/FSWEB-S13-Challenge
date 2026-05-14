package org.example;

import org.example.enums.Plan;

public class Main {

    public static void main(String[] args) {
        workWithData();
    }

    public static void workWithData() {
        Healthplan basicPlan = new Healthplan(1, "A Sigorta", Plan.BASIC);
        System.out.println(basicPlan.toString());


        String[] healthplans = new String[2];
        Employee employee = new Employee(101, "Ali Veli", "ali@test.com", "1234", healthplans);

        employee.addHealthPlan(0, basicPlan.getName());
        employee.addHealthPlan(0, "Z Sigorta"); // Dolu index kontrolü
        employee.addHealthPlan(5, "X Sigorta"); // Geçersiz index kontrolü

        System.out.println(employee.toString());


        String[] developers = new String[3];
        Company company = new Company(1, "Tech Corp", 50000.50, developers);

        company.setGiro(-100);

        company.addEmployee(0, employee.getFullName());

        System.out.println(company.toString());
    }
}
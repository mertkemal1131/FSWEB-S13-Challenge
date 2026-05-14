package org.example;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        setGiro(giro);
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        try {
            if (developerNames[index] == null) {
                developerNames[index] = name;
            } else {
                System.out.println("İlgili index dolu: " + index);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Geçersiz index: " + index);
        }
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getGiro() { return giro; }
    public void setGiro(double giro) {
        if (giro < 0) {
            this.giro = 0;
            System.out.println("Giro 0'dan küçük olamaz, 0'a eşitlendi.");
        } else {
            this.giro = giro;
        }
    }
    public String[] getDeveloperNames() { return developerNames; }
    public void setDeveloperNames(String[] developerNames) { this.developerNames = developerNames; }

    @Override
    public String toString() {
        return "Company{id=" + id + ", name='" + name + "', giro=" + giro + ", developers=" + Arrays.toString(developerNames) + "}";
    }
}
package com.company.people;

import java.util.ArrayList;
import java.util.List;

public class Employees extends People {
    private List<Employees> employeesList = new ArrayList<Employees>();
    private int employeeNumber;
    private String jobTitle;
    private String hireDate;
    private int hours;

    public Employees(int age, String name, char gender, String race, int employeeNumber, String jobTitle, String hireDate, int hours) {
        super(age, name, gender, race);
        this.employeeNumber = employeeNumber;
        this.jobTitle = jobTitle;
        this.hireDate = hireDate;
        this.hours = hours;
    }

    public int getEmployeeNumber() {

        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    public void addEmployee (Employees newEmployee) {
        employeesList.add(newEmployee);
        System.out.println(newEmployee.getName() + " is being mind controlled");
    }
}

package com.Streams;

import java.util.Objects;

public class Employee {

    private String name;
    private int id;
    private double salary;
    private String dept;
    private String location;

    public Employee(String name, int id, double salary,String dept,String location) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.dept = dept;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(dept, employee.dept) && Objects.equals(location, employee.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, salary, dept, location);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}


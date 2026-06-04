package com.sortingorder;

import java.util.Comparator;

public class Employee implements Comparator<Employee>  {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.salary-o2.salary;
    }

}

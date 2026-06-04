package com.sortingorder;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

    public class EmployeeMain {
        public static void main(String[] args) {
            List<Employee> employeeList = Arrays.asList(new Employee(101, "Mark", 22000),
                    new Employee(122, "Adam", 15000),
                    new Employee(135, "Chris", 27000),
                    new Employee(114, "Tim", 26000),
                    new Employee(105, "David", 23000),
                    new Employee(100, "Glenn", 25000));

            Collections.sort(employeeList,Comparator.comparing(e->e.salary));
            Collections.sort(employeeList,Comparator.comparing(e->e.id));
            Collections.sort(employeeList,Comparator.comparing(e->e.name));
            for (Employee e : employeeList) {
                System.out.println(e);
            }


        }
    }



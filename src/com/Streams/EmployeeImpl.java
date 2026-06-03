package com.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeImpl {
    public static void main(String[] args) {
        List<Employee> empList = List.of(
                new Employee("Max",12998,15000.00,"Development","Hyderabad"),
                new Employee("Chris",10768,16000.00,"Testing","Mumbai"),
                new Employee("Tim",12455,17000.00,"Analyst","Bangalore"),
                new Employee("James",15664,18000.00,"Management","chennai"),
                new Employee("David",17865,19000.00,"Devops","pune"),
                new Employee("Kane",10956,20000.00,"Social Media","Noida"),
                new Employee("Steve",14875,21000.00,"IT","Delhi"),
                new Employee("Gorge",11956,22000.00,"Production","Kolkata"));

        for (Employee emp : empList){
            System.out.println(emp);
        }

      empList.stream().filter(e->e.getSalary()>18000)
        .forEach(e-> System.out.println(e.getName()));

      empList.stream().filter(e->e.getSalary()>15000)
              .forEach(e-> System.out.println(e.getSalary()));

      empList.stream().filter(e->e.getSalary()>18000)
              .forEach(e-> System.out.println(e.getId()));

      empList.stream().map(m->m.getName()
              .length()).forEach(l-> System.out.println(l));

      empList.stream().map(m->m.getName()
                .length()).forEach(System.out::println);

      empList.stream().map(e->{
            e.setSalary(e.getSalary()+3000);
            return e;
        })
            .filter(e->e.getSalary()>18000).forEach(System.out::println);







    }
}

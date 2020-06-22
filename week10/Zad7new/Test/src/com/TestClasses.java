package com;

import cla.*;

import java.time.LocalDate;

public class TestClasses {


    public static void main(String[] args) {
        Person person = new Person("Nicole", "str. 1", "088612111" , "nicole@abv.bg");
        Student student = new Student("Pavel", "str. 2 ", "0874444152", "blaa@gmail.com", Student.Status.FRESHMAN);
        Employee employee = new Employee("Someone", "str. 3", "0894555221", "idk@dhd.com", "Office 1", 5000, LocalDate.of(1999,10,3));
        Faculty faculty = new Faculty("Someone22", "str. 4", "0894745221", "idk@dhd.com", "Office 2", 2000, LocalDate.of(2005,5,3), "09:00 - 17:00", "rank 1");
        Staff staff = new Staff("Someone333", "str. 5", "08942369821", "hahha@dhd.com", "Office 3", 5000, LocalDate.of(2015,10,17), "title 11");

        System.out.printf(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}

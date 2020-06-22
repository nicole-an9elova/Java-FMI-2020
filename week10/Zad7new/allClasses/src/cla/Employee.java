package cla;

import cla.Person;

import java.time.LocalDate;

public class Employee extends Person {

    private String office;
    private double salary;
    private LocalDate dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, LocalDate dateHired) {
        super(name, address, phoneNumber, emailAddress);
        setOffice(office);
        setSalary(salary);
        setDateHired(dateHired);
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        if(office != null) {
            this.office = office;
        }else{
            this.office = "";
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary > 0.0){
            this.salary = salary;
        }else{
            this.salary = 0.0;
        }
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(LocalDate dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString(){
        return String.format("Class cla.Employee - %s", super.toString());
    }
}

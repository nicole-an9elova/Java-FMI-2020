package cla;

import java.time.LocalDate;

public class Faculty extends Employee {

    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, LocalDate dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        setOfficeHours(officeHours);
        setRank(rank);
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        if(officeHours != null) {
            this.officeHours = officeHours;
        }else{
            this.officeHours = "";
        }
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        if(rank != null) {
            this.rank = rank;
        }else{
            this.rank = "";
        }
    }

    @Override
    public String toString(){
        return String.format("Class cla.Faculty - %s", super.toString());
    }
}

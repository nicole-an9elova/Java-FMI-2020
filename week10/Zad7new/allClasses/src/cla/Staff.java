package cla;

import java.time.LocalDate;

public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, LocalDate dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        setTitle(title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title != null) {
            this.title = title;
        }else{
            this.title = "";
        }
    }

    @Override
    public String toString(){
        return String.format("Class cla.Staff - %s", super.toString());
    }
}

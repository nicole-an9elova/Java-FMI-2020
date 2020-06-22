package cla;

public class Student extends Person {

    public enum Status{
        FRESHMAN,
        SOPHOMORE,
        JUNIOR,
        SENIOR
    }
    private Status status;

    public Student(String name, String address, String phoneNumber, String emailAddress, Status status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    @Override
    public String toString(){
        return String.format("Class cla.Student - %s", super.toString());
    }
}

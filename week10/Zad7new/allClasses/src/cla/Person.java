package cla;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        setName(name);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setEmailAddress(emailAddress);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
        else{
            this.name = "";
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address != null) {
            this.address = address;
        }else{
            this.address = "";
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber !=  null){
            this.phoneNumber = phoneNumber;
        } else {
            this.phoneNumber = "";
        }
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        if(emailAddress != null) {
            this.emailAddress = emailAddress;
        }else{
            this.emailAddress = "";
        }
    }

    @Override
    public String toString(){
        return String.format("Class cla.Person - Name: %s", getName());
    }


}

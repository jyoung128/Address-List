package edu.cscc;

public class PersonAddress extends Address {
    private String personName;

    public PersonAddress(String streetAddress, String city, String state, String zip, String personName) {
        super(streetAddress, city, state, zip);
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void printLabel() {
        System.out.println(personName+"\n"+streetAddress+"\n"+city+", "+state+"  "+zip);
    }
}

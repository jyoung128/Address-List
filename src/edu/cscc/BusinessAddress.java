package edu.cscc;

public class BusinessAddress extends Address {
    private String businessName;
    private String address2;

    public BusinessAddress(String streetAddress, String city, String state, String zip, String businessName, String address2) {
        super(streetAddress, city, state, zip);
        this.businessName = businessName;
        this.address2 = address2;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public void printLabel() {
        if (address2 == null || address2 == "" && streetAddress == null || streetAddress == "") {
            System.out.println(businessName + "\n" + city + ", " + state + "  " + zip);
        } else if (address2 == null || address2 == "") {
            System.out.println(businessName + "\n" + streetAddress + "\n" + city + ", " + state + "  " + zip);
        } else if (streetAddress == null || streetAddress == "") {
            System.out.println(businessName + "\n" + address2 + "\n" + city + ", " + state + "  " + zip);
        } else {
            System.out.println(businessName + "\n" + address2 + "\n" + streetAddress + "\n" + city + ", " + state + "  " + zip);
        }
    }
}

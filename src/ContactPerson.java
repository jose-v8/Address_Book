import java.util.Scanner;

class  Address {
    private String houseNumber;
    private String streetName;
    private String city;
    private String state;
    private int zip;

    Address(String houseNumber, String streetName, String city, String state, int zip) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    String getHouseNumber() { return houseNumber;};
    String getStreetName () { return streetName;};
    String getCity() {return city;};
    String getState() {return state;};
    int getZip(){return zip;};
}



public   class ContactPerson {
    private String firstName;
    private String lastName;
    private Address address;
    private int countryCode;
    private int phoneNumber;
    private String email;

    ContactPerson(String firstName, String lastName, Address address, int countryCode, int phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.countryCode = countryCode;
        this.phoneNumber=phoneNumber;
        this.email = email;
    }

    public String getFirstName() {return this.firstName;}
    String getLastName()  {return this.lastName;};
    Address getAddress() {return this.address;};
    int getCountryCode() {return countryCode;};
    int getPhoneNumber() {return phoneNumber;};
    String getEmail()   {return email;};


    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n" +
                "Address: " + address.getHouseNumber() + ", " + address.getStreetName() + ", " + address.getCity() + ", " + address.getState() + " - " + address.getZip() + "\n" +
                "Country Code: " + countryCode + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "Email: " + email;}




}



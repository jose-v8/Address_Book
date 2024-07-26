

import java.util.Scanner;

class Address {
    String houseNumber;
    String streetName;
    String city;
    String state;
    int zip;

    Address(String houseNumber, String streetName, String city, String state, int zip) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
}

class Contact {
    String firstName;
    String lastName;
    Address address;
    int countryCode;
    int phoneNumber;
    String email;

    Contact(String firstName, String lastName, Address address, int countryCode,int phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.countryCode = countryCode;
        this.phoneNumber=phoneNumber;
        this.email = email;
    }


    public String toString() {
            return "Name: " + firstName + " " + lastName + "\n" +
            "Address: " + address.houseNumber + ", " + address.streetName + ", " + address.city + ", " + address.state + " - " + address.zip + "\n" +
            "Country Code: " + countryCode + "\n" +
            "Phone Number: " + phoneNumber + "\n" +
            "Email: " + email;}
}

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book program");

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the following details to create a contact ");

        System.out.print("Enter the firstname: ");
        String firstName = inp.next();

        System.out.print("Enter the lastname: ");
        String lastName = inp.next();

        inp.nextLine();

        System.out.print("Enter the house number: ");
        String houseNumber = inp.nextLine();

        System.out.print("Enter the street Name: ");
        String streetName = inp.nextLine();

        System.out.print("Enter the city: ");
        String city = inp.nextLine();

        System.out.print("Enter the state: ");
        String state = inp.nextLine();

        System.out.print("Enter the zip: ");
        int zip = inp.nextInt();

        System.out.print("Enter the country code: ");
        int countryCode = inp.nextInt();

        System.out.print("Phone number");
        int phoneNumber=inp.nextInt();

        inp.nextLine();

        System.out.print("Enter the email: ");
        String email = inp.nextLine();

        Address address = new Address(houseNumber, streetName, city, state, zip);
        Contact contact = new Contact(firstName, lastName, address, countryCode,phoneNumber, email);

        System.out.println("\nContact Details:");
        System.out.println(contact);
    }
}



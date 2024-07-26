import java.util.Scanner;

public class AddressBook {
    ContactPerson addContact()
    {
        Scanner inp=new Scanner(System.in);

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
        ContactPerson  contact = new ContactPerson(firstName, lastName, new Address(houseNumber, streetName, city, state, zip), countryCode,phoneNumber, email);
        System.out.println("The user is added....");

        System.out.println(contact);
        return contact;


    }
//    void displayContact()
//    {
//    }


}

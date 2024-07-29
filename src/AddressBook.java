import java.util.*;


public class AddressBook {
    static ArrayList<ContactPerson> allContacts;

    static Dictionary<String , ArrayList<ContactPerson>> dictContactPerson =new Hashtable<>();





    void addContact()
    {
        Scanner inp=new Scanner(System.in);

        System.out.println("Select the category");
        System.out.print("1). Friends\n2). Family\n3). Create custom\n Enter your choice :");
        int category=inp.nextInt();
        inp.nextLine();
        String categoryName="Family";
        if (category==1) {
            categoryName="Friends";
        } else if (category==2) {
            categoryName="Family";
        }
        else if (category==3)
        {
            System.out.print("Enter the address book name :");
            categoryName=inp.nextLine();

        }

        if (dictContactPerson.get(categoryName)==null)
        {
            allContacts= new ArrayList<ContactPerson>();

        }
        else {
            allContacts=dictContactPerson.get(categoryName);
        }

        System.out.print("Enter the firstname       : ");
        String firstName = inp.next();

        System.out.print("Enter the lastname        : ");
        String lastName = inp.next();

        inp.nextLine();

        System.out.print("Enter the house number    : ");
        String houseNumber = inp.nextLine();

        System.out.print("Enter the street Name     : ");
        String streetName = inp.nextLine();

        System.out.print("Enter the city            : ");
        String city = inp.nextLine();

        System.out.print("Enter the state           : ");
        String state = inp.nextLine();

        System.out.print("Enter the zip             : ");
        int zip = inp.nextInt();

        System.out.print("Enter the country code    : ");
        int countryCode = inp.nextInt();

        System.out.print("Phone number              : ");
        int phoneNumber=inp.nextInt();

        inp.nextLine();

        System.out.print("Enter the email           : ");
        String email = inp.nextLine();

        Address address = new Address(houseNumber, streetName, city, state, zip);
        ContactPerson  contact = new ContactPerson(firstName, lastName, new Address(houseNumber, streetName, city, state, zip), countryCode,phoneNumber, email);
        allContacts.add(contact);
        dictContactPerson.put(categoryName,allContacts);

        System.out.println("\nThe user is added....");

        System.out.println(dictContactPerson.get(categoryName));







    }

    void displayContact()
    {
        int n=0;

//        System.out.println(dictContactPerson.keys());
        Enumeration<String> enu=dictContactPerson.keys();

        while (enu.hasMoreElements())
        {
//            System.out.println(enu.nextElement());
            String categoryName =enu.nextElement();
            allContacts=dictContactPerson.get(categoryName);
            for(ContactPerson details:allContacts)
            {
                n+=1;
                System.out.println("Entry number "+n+" belongs to category "+categoryName);
                System.out.println();
                System.out.println(details+"\n");
            }


        }






    }

    void editContact()
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the name of the person to edit the contact ");
        System.out.print("Enter the first name :");
        String firstName=inp.next();
        System.out.print("\nEnter the last name :");
        String lastName=inp.next();

        Enumeration <String> enu = dictContactPerson.keys();

        while (enu.hasMoreElements())
        {
            String categoryName=enu.nextElement();
            int pos=findDetails(firstName,lastName);
            if (pos==-1)
            {
                System.out.println("The entry with the name "+ firstName+" "+lastName+" is not found");

            }
            else
            {
                System.out.println("The corresponding value is found..\nThe entries of the particular member is :");

                System.out.println(allContacts.get(pos));

                System.out.println("Choose the field you want to edit :");
                int choice;
                do {
                    System.out.println("1.) First Name ");
                    System.out.println("2.) Last Name  ");
                    System.out.println("3.) Address    ");
                    System.out.println("4.) Country code");
                    System.out.println("5.) Phone Number");
                    System.out.println("6.) email        ");
                    System.out.println("7.) No edits required");

                    choice =inp.nextInt();

                    switch (choice){
                        case 1 -> {
                            System.out.print("Enter the new first Name :");
                            String newFirstName =inp.next();
                            allContacts.get(pos).setFirstName(newFirstName);
                            System.out.print("\n after change :");
                            System.out.println(allContacts.get(pos));
                        }
                        case 2->{
                            System.out.print("Enter the new Last Name :");
                            String newLastName =inp.next();
                            allContacts.get(pos).setLastName(newLastName);
                        }
                        case 3->{

                            int changeAddressAction;
                            do {
                                System.out.print("Select which part of address to be modified:\n1). House number\n2). Street name\n3). city\n4). State\n5). Zip\n6).No edits required or finished editing\n"  );
                                changeAddressAction=inp.nextInt();
                                switch (changeAddressAction){
                                    case 1->{
                                        System.out.print("Enter the new House number :");
                                        String newHouseNumber =inp.next();
                                        allContacts.get(pos).setHouseNumber(newHouseNumber);}
                                    case 2->{
                                        System.out.print("Enter the new Street name  :");
                                        String newStreetName =inp.next();
                                        allContacts.get(pos).setStreetName(newStreetName);
                                    }
                                    case 3->{
                                        System.out.print("Enter the new city name    :");
                                        String newCityName =inp.next();
                                        allContacts.get(pos).setCity(newCityName);
                                    }
                                    case 4->{
                                        System.out.print("Enter the new State name   :");
                                        String newStateName=inp.nextLine();
                                        allContacts.get(pos).setSate(newStateName);
                                    }
                                    case 5->{
                                        System.out.print("Enter the new zip          :");
                                        int newZip=inp.nextInt();
                                        allContacts.get(pos).setZip(newZip);
                                    }

                                }
                            }while(changeAddressAction<6);
                            System.out.print("\n after change :\n");
                            System.out.println(allContacts.get(pos));

                        }

                        case 4->{
                            System.out.print("Enter the new Country Code :");
                            int newCountryCode =inp.nextInt();
                            allContacts.get(pos).setCountryCode(newCountryCode);
                            System.out.print("\n after change :");
                            System.out.println(allContacts.get(pos));
                        }
                        case 5->{
                            System.out.print("Enter the new Phone number :");
                            int newPhoneNumber=inp.nextInt();
                            allContacts.get(pos).setPhoneNumber(newPhoneNumber);
                        }
                        case 6->{
                            System.out.print("Enter the new email  :");
                            String newEmail=inp.next();
                            allContacts.get(pos).setEmail(newEmail);
                        }
                        case 7->{
                            return;
                        }
                    }
                }while (choice <8);
            }
        }


    }

    int findDetails(String firstName,String lastName)
    {
        int pos=-1;
        for (ContactPerson personDetails: allContacts)
        {

            if (personDetails.getFirstName().equals(firstName) && personDetails.getLastName().equals(lastName))
           {
               pos+=1;
               return pos;
           }
           else
               pos+=1;
        }

        return -1;
    }

    void deleteContact()
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the name of the person to delete the contact ");
        System.out.print("Enter the first name :");
        String firstName=inp.next();
        System.out.print("\nEnter the last name :");
        String lastName=inp.next();

        int pos=findDetails(firstName,lastName);

        if (pos==-1)
        {
            System.out.println("The entry with the name "+ firstName+" "+lastName+" is not found");

        }
        else {
            System.out.println("The corresponding value is found..\nThe entries of the particular member is :");
            System.out.println(allContacts.get(pos));
            allContacts.remove(pos);
            System.out.println("The person is succesfully removed from the contacts");
        }
        }
}

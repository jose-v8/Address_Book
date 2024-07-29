


import java.util.Scanner;



public class AddressBookMain {
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book program");
        Scanner inp = new Scanner(System.in);

        boolean repeat=true;
        while(repeat)
        {
            System.out.println();
            System.out.println();
            System.out.println("Select the required function: ");
            System.out.println("1). Add a new contact ");
            System.out.println("2). View contact");
            System.out.println("3). Edit the contact");
            System.out.println("4). Delete the contact");
            System.out.println("0). To exit the program\n");
            System.out.print("Enter your choice :: ");
            int action= inp.nextInt();
            System.out.println();



            switch (action)
            {
                case 1->{System.out.println("Enter the following details ");AddressBook p=new AddressBook();p.addContact();}
                case 2->{System.out.println("Displaying the details");AddressBook p=new AddressBook();p.displayContact();}
                case 3->{System.out.println();AddressBook p=new AddressBook();p.editContact();}
                case 4->{System.out.println();AddressBook p= new AddressBook();p.deleteContact();}
                case 0->{System.out.println("Exiting the program......");repeat=false;}
            }

        }

    }
}



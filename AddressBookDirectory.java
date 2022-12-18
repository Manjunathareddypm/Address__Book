package com.Address_Book;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookDirectory {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<PersonsDetails> record = new ArrayList<PersonsDetails>();


    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        while (true) {
            System.out.println("--------------WELCOME TO ADDRESS BOOK-------------");
            System.out.println("1. To create new contact \n 2. Displaying contact \n 3. edit \n 4. quit ");
            System.out.print("enter any number specified above to perform the operation:");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    addressBook.createNewContact(record);
                    break;
                case 2:
                    addressBook.displayAllContacts(record);
                    break;
                case 3:
                    addressBook.editContactDetails(record);
                    break;
                case 4:
                    System.out.println("Thank you");
                    System.exit(0);
                default:
                    System.out.println("please enter the correct choice");

            }
        }
    }
}
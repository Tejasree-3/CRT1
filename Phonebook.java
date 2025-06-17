import java.util.HashMap;
import java.util.Scanner;
public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Options:");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. List All Contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    phoneBook.put(name, phoneNumber);
                    System.out.println("Contact added.");
                    break;
                case 2:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    if (phoneBook.containsKey(searchName)) {
                        System.out.println("Phone number: " + phoneBook.get(searchName));
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 3:
                    if (phoneBook.isEmpty()) {
                        System.out.println("Phone book is empty.");
                    } else {
                        System.out.println("All contacts:");
                        phoneBook.forEach((key, value) -> System.out.println(key + ": " + value));
                    }
                    break;
                case 4:
                    System.out.println("Exiting.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
    }
}



	 


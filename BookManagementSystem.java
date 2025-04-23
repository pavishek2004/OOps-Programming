package oopsProgramming;

import java.util.Scanner;

public class BookManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        int choice;
        
        do {
            System.out.println("\n===== Book Management System =====");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. Replace book details");
            System.out.println("4. Search for a book");
            System.out.println("5. Display all books");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    
                    Book newBook = new Book(id, title, author);
                    library.addBook(newBook);
                    break;
                    
                case 2:
                    System.out.print("Enter Book ID to remove: ");
                    int removeId = scanner.nextInt();
                    library.removeBook(removeId);
                    break;
                    
                case 3:
                    System.out.print("Enter Book ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new Title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter new Author: ");
                    String newAuthor = scanner.nextLine();
                    
                    library.replaceBook(updateId, newTitle, newAuthor);
                    break;
                    
                case 4:
                    System.out.print("Enter Book ID to search: ");
                    int searchId = scanner.nextInt();
                    Book foundBook = library.searchBook(searchId);
                    
                    if (foundBook != null) {
                        System.out.println("Book found: " + foundBook);
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;
                    
                case 5:
                    library.displayBooks();
                    break;
                    
                case 0:
                    System.out.println("Exiting Book Management System. Goodbye!");
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
        } while (choice != 0);
        
        scanner.close();
    }
}
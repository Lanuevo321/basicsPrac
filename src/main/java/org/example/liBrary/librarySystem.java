package org.example.liBrary;

import java.util.ArrayList;
import java.util.Scanner;



class Book{
    int id;
    String Title;
    String Author;
    Boolean borrowed = false;

    Book(int id, String Title, String Author){
        this.id = id;
        this.Title = Title;
        this.Author = Author;
        this.borrowed = false;
    }
}




public class librarySystem {

    static ArrayList<Book> database = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);


    public static void Main(){
        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();


            switch (choice){
                case 1:
                    addbooks();
                    break;
                case 2:
                    viewbooks();
                    break;
                case 3:
                    borrowbooks();
                    break;
                case 4:
                    returnbooks();
                    break;
                case 5:
                    System.out.println("Thank you for using the Library System!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        }while (choice !=5);
    }



    static void addbooks(){
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Book Title: ");
        String Title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String Author = sc.nextLine();

        database.add(new Book(id, Title, Author));
        System.out.println("Book added successfully!");
    }


    static void viewbooks(){
        if (database.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\n--- Available Books ---");
        for (Book book : database) {
            System.out.println(
                    "ID: " + book.id + " | Title: " + book.Title +
                            " | Author: " + book.Author +
                            " | Status: " + (book.borrowed ? "Borrowed" : "Available")
            );
        }
    }


    static void borrowbooks(){
        System.out.print("Enter Book ID to borrow: ");
        int id = sc.nextInt();

        for (Book book : database) {
            if (book.id == id) {
                if (!book.borrowed) {
                    book.borrowed = true;
                    System.out.println("Book borrowed successfully!");
                } else {
                    System.out.println("Book is already borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }


    static void returnbooks(){
        System.out.print("Enter Book ID to return: ");
        int id = sc.nextInt();

        for (Book book : database) {
            if (book.id == id) {
                if (book.borrowed) {
                    book.borrowed = false;
                    System.out.println("Book returned successfully!");
                } else {
                    System.out.println("This book was not borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }


}

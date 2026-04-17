package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //You will only need ONE scanner
        Scanner device = new Scanner(System.in);

        // Create 20 Book objects manually in an array
        //Or have ChatGPT help you
        Book[] books = {
                new Book(1, "978-0001", "The Silent Forest", true, "Alice"),
                new Book(2, "978-0002", "Java Basics", false, ""),
                new Book(3, "978-0003", "The Lost City", true, "Bob"),
                new Book(4, "978-0004", "Clean Code", false, ""),
                new Book(5, "978-0005", "Mystery of Night", true, "Chris"),
                new Book(6, "978-0006", "Data Structures", false, ""),
                new Book(7, "978-0007", "The Last Kingdom", true, "Diana"),
                new Book(8, "978-0008", "Algorithms 101", false, ""),
                new Book(9, "978-0009", "Hidden Truths", true, "Evan"),
                new Book(10, "978-0010", "Design Patterns", false, ""),
                new Book(11, "978-0011", "Dark Waters", true, "Fiona"),
                new Book(12, "978-0012", "Spring Boot Guide", false, ""),
                new Book(13, "978-0013", "Ancient Ruins", true, "George"),
                new Book(14, "978-0014", "Microservices", false, ""),
                new Book(15, "978-0015", "The Final Hour", true, "Hannah"),
                new Book(16, "978-0016", "Operating Systems", false, ""),
                new Book(17, "978-0017", "Broken Paths", true, "Ian"),
                new Book(18, "978-0018", "Networking Basics", false, ""),
                new Book(19, "978-0019", "Shadows Rising", true, "Jake"),
                new Book(20, "978-0020", "Cloud Computing", false, "")
        };

        //This while loop runs forever
        //That means the program will run until we tell it to stop.
        while (true) {
            //Show a menu to the user
            //Use the scanner to take in the user input
            //For example
            System.out.println("\n=== BOOK STORE HOME SCREEN ===");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int userInput = device.nextInt();

            //Now use if statements depending on what the person typed
            //How many possibilities are there? Write your if statement structure first
            if (userInput == 1){

            } else if(userInput == 2){

            } else if(userInput == 3){

            }else{
                System.out.println("User incorrect input");
            }


            //Loop through your array of books and use if statements
            //Do we show all books? Only checked-in books?


            //How do we exit the program?
            //This command kills the program at whatever point its at.
            System.exit(0);
        }

    }
}
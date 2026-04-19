package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //SCANNER: reader<-
        Scanner reader = new Scanner(System.in);

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

        while (true) {
            System.out.println("\n=== BOOK STORE HOME SCREEN ===");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            //user input for menu
            int userInput = reader.nextInt();
            reader.nextLine();// clearing

            //if choice of AVAILABLE BOOKS
            if (userInput == 1){

                //looping through books
                for (Book book : books) {
                    //printing books when they are not checkout "simplify"
                    if (!book.isCheckedOut()) {
                        //ID ISBN AND TITLE
                        System.out.println("Book ID: " + book.getId() + " | ISBN: " + book.getIsbn() + " | Title: " +  book.getTitle());//need a way to check if books is checked out
                    }
                }

                    //prompt the user to check out a book
                System.out.println("Would you like to checkout a book? (Y)es or (N)o?");
                String checkOut = reader.nextLine().toUpperCase();


                while (checkOut.equals("Y")){
                    //ask for book
                    System.out.println("Enter the book ID from the list above");
                    int bookID = reader.nextInt();
                    reader.nextLine();
                    //ask for name
                    System.out.println("Sure that's great! What is your name?");
                    String name = reader.nextLine();

                    //loop through books again
                    //variable to see if found DEFENSIVE
                    boolean available = false;
                    for (Book book : books){
                        // if the book id matches another book && is available. check out book and assign name
                        if(book.getId() == bookID && !book.isCheckedOut()){
                            //calling and changing checkout status to a name
                            book.checkOut(name);
                            System.out.println("Book with ID number " + bookID + " is now rented to " + name);
                            available =true;
                            break;
                        }
                    }
                    if (!available){
                        System.out.println("Sorry.. either we do not have this book" +
                                " or it is currently checked out to another guest.");
                    }
                }



            } else if(userInput == 2){
                //show checked out books
                for (Book book : books) {
                    if (book.isCheckedOut()) {
                        //ID ISBN TITLE NAME
                        System.out.println("Book Id: " + book.getId() + " | ISBN: " + book.getIsbn() + " | Title: " +
                                book.getTitle() + " | Checkout to: " + book.getCheckedOutTo());
                    }
                }

                    System.out.println("Would you like to check in a book? ( Y or N)");
                    String checkInBook = reader.nextLine().toUpperCase();

                    if (checkInBook.equals("Y")){
                        System.out.println("What is the book ID number?");
                        int checkInID = reader.nextInt();
                        reader.nextLine();

                        //variable
                        boolean found = false;
                        for (Book book : books){
                            // if there is an id that matches the input and is checkout
                            if (book.getId() == checkInID && book.isCheckedOut()) {
                                book.checkIn();
                                System.out.println(book.getTitle() + " has been returned!");
                                found = true;
                                break;
                            }

                        }
                        if (!found)
                            System.out.println("Sorry we did not recognize that entry...");
                    }else{
                        break;
                    }




            } else {
                System.exit(0);
                System.out.println("User incorrect input");
            }


            //Loop through your array of books and use if statements
            //Do we show all books? Only checked-in books?


            //How do we exit the program?
            //This command kills the program at whatever point its at.

        }

    }
}
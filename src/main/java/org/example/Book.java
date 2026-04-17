package org.example;

public class Book {
    //put in your properties, constructor, getters/setters
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    //constructor
    public Book(int id, String isbn, String title,boolean isCheckedOut, String checkedOutTo){
        this.id=id;
        this.isbn = isbn;
        this.title=title;
        this.isCheckedOut=isCheckedOut;
        this.checkedOutTo=checkedOutTo;
    }

    //these are the custom methods you'll need to check in and
    //check out a book.
    public void checkOut(String name) {
    }

    public void checkIn() {
    }
}

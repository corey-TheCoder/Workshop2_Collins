package org.example;

public class Book {
    //put in your properties, constructor, getters/setters
    public int id;
    public String isbn;
    public  String title;
    public boolean isCheckedOut;
    public String checkedOutTo;

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

    @Override
    public String toString(){
        return"ID: " + id + " ISBN: " + isbn +
                " | Title: " + title + " | Checkout: " + isCheckedOut +
                " | Checked out to:  " + checkedOutTo;
    }
}

package org.example;

public class Book {
    //put in your properties, constructor, getters/setters
    private int id;
    private String isbn;
    private  String title;
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

    //GETTER SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    //these are the custom methods you'll need to check in and
    //check out a book.
    public void checkOut(String name) {
        //chaning calues
        this.isCheckedOut = true;
        this.checkedOutTo = name;
    }

    public void checkIn() {
        this.isCheckedOut=false;
        this.checkedOutTo="";
    }

    @Override
    public String toString(){
        return"ID: " + id + " ISBN: " + isbn +
                " | Title: " + title + " | Checkout: " + isCheckedOut +
                " | Checked out to:  " + checkedOutTo;
    }
}

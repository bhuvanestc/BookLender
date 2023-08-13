package org.example;


public class Book {
    private String title;
    private String author;
    private Boolean available;
    private Person borrower;

    public Person getBorrower() {

        return borrower;
    }

    public void setBorrower(Person borrower) {
        this.borrower = borrower;
        if(borrower!= null)
        {
            this.available=false;
        }else{
            this.available =true;
        }
    }
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }




    public void showPerson() {
        if (borrower != null) {
            System.out.println("The Book " + title + " is currently borrowed by "+ borrower.getPersonId() + ":" +
                    borrower.getFirstName() + " " + borrower.getLastName());
        } else {
            System.out.println(title+ " the book is currently available " );

        }
    }



}

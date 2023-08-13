package org.example;
import java.util.ArrayList;
import java.util.List;
public class Person {
    private int personId;
    private String firstName;
    private String lastName;
    private List<Book> booksBorrowed;



    public List<Book> getBooksBorrowed() {
        return booksBorrowed;
    }

    public void setBooksBorrowed()
    {
        this.booksBorrowed = new ArrayList<Book>();
    }
    public Person(int personId, String firstName, String lastName) {
       setPersonId(personId);
       setFirstName(firstName);
       setLastName(lastName);
       setBooksBorrowed();
    }


    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        if (personId == 0) throw new IllegalArgumentException("PersonID was null.");
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) throw new IllegalArgumentException("Firstname was null.");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) throw new IllegalArgumentException("Lastname was null.");
        this.lastName = lastName;
    }

    public void loanBook(Book book)
    {
       booksBorrowed.add(book);
       book.setBorrower(this);

    }
    public String displayBooks()
    {
        System.out.println(firstName+" "+lastName+" "+"has borrowed the following books ");
        for (Book book : booksBorrowed) {
            System.out.println(book.getTitle());
        }
        return null;

    }

}


package org.example;


public class App 
{
    public static void main( String[] args )
    {
        Person person1 = new Person(1, "Smith", "Gustavsberg");
        Person person2 = new Person(2, "Johnson", "Svensson");

        Book book1 = new Book("Ikigai", "F. Scott Fitzgerald");
        Book book2 = new Book("Atomic Habits", "James Clare");
        Book book3 = new Book("The Secret" ,"Rhonda Byrne");

        person1.loanBook(book1);
        person2.loanBook(book2);
        person2.loanBook(book3);

        person1.displayBooks();
        person2.displayBooks();

        book1.showPerson();
        book2.showPerson();
        book3.showPerson();

    }
}

package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
 class BookTest {
     @Test
     void testBookSetup()
     {
         Book book = new Book("Test Title","Test Author");
         assertNotNull(book.getTitle());
         assertEquals("Test Title",book.getTitle());
         assertEquals("Test Author",book.getAuthor());
         assertNull(book.getAvailable());
         assertNull(book.getBorrower());
     }
     @Test
     void testBookBorrow(){
         Person person = new Person (1,"Bhuvana","Chandran");
         Book book =new Book("Test Title","Test Author");

         person.loanBook(book);
         assertFalse(book.getAvailable());
         assertEquals(person, book.getBorrower());
         person.displayBooks();
     }







}

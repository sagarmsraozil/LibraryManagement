import java.util.List;

public class Book {
    public String bookTitle;
    public String bookAuthor;
    public String bookIdentifier;
    public boolean isAvailable;
    public Category category;

    public Book(String bookTitle, String bookAuthor, String bookIdentifier, boolean isAvailable,Category c){
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookIdentifier = bookIdentifier;
        this.isAvailable = isAvailable;
        this.category = c;
    }

    public void setBookDetails(String bookTitle, String bookAuthor, String bookIdentifier){
         this.bookTitle = bookTitle;
         this.bookIdentifier =bookIdentifier;
         this.bookAuthor = bookAuthor;
    }

    public void getBookDetails(){
        System.out.println("Book Title: "+ this.bookTitle + "\n" + "Book Author: "+ this.bookAuthor + "\n" + "Book identifier: " + this.bookIdentifier + "\n" + "Genere: "+category.name);
    }

    public void markAsBorrowed(){
            this.isAvailable = false;
    }

    public void markAsReturned(){
            this.isAvailable = true;
    }

    public void changeCategory(Category c){
        this.category = c;
    }
}

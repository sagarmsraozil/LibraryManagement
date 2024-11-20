
public class Book {
    public String bookTitle;
    public String bookAuthor;
    public String bookIdentifier;
    public boolean isAvailable;

    public Book(String bookTitle, String bookAuthor, String bookIdentifier, boolean isAvailable){
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookIdentifier = bookIdentifier;
        this.isAvailable = isAvailable;
    }

    public void setBookDetails(String bookTitle, String bookAuthor, String bookIdentifier){
         this.bookTitle = bookTitle;
         this.bookIdentifier =bookIdentifier;
         this.bookAuthor = bookAuthor;
    }

    public void getBookDetails(){
        System.out.println("Book Title: "+ this.bookTitle + "\n" + "Book Author: "+ this.bookAuthor + "\n" + "Book identifier: " + this.bookIdentifier);
    }

    public void markAsBorrowed(){
        if(!isAvailable){
            System.out.println(bookTitle + " is unavailable!");

            return;
        }

        if(isAvailable) {
            this.isAvailable = false;

            System.out.println("Successfully borrowed book: " + bookTitle);
        }
    }

    public void markAsReturned(){
        if(!isAvailable) {
            this.isAvailable = true;

            System.out.println("Successfully returned book: " + bookTitle);

            return;
        }

        if(isAvailable) {
            System.out.println(bookTitle + " has not been borrowed!");
        }
    }
}

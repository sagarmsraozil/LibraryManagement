import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library {
    Category[] categories = {
            new Category("Fiction","fiction"),
            new Category("Action","action"),
            new Category("Thriller","thriller"),
            new Category("Comedy","comedy")
    };
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Patron> patrons = new ArrayList<>();
    ArrayList<Loan> loans = new ArrayList<>();

    public Library(){}

    public void addBook(String bookTitle, String bookAuthor, String bookIdentifier, boolean isAvailable,String slug){
       Category category = getCategory(slug);

       if(category == null) {
         return;
       }

        Book book = new Book(bookTitle,bookAuthor,bookIdentifier,isAvailable,category);

        books.add(book);
    }

    public void createPatron(String name, int id, String type){
        Patron patron = new Patron(name,id,type);

        patrons.add(patron);
    }

    public void createLoan(int patronId, String title){
        Patron patron = getPatron(patronId);

        if(patron == null) {
            return;
        }

       Book book = getBook(title);

        if(book == null) {
            return;
        }

        Loan loan = new Loan();

        loan.createLoan(book,patron);

        loans.add(loan);
    }

    public void returnBook(Loan loan) {
        loan.completeLoan();
    }

    public ArrayList<Loan> getLoans(){
        for(Loan l: loans){
           l.getLoanDetails();
        }

        return this.loans;
    }

    public Book getBook(String title) {
        for(Book b: books){
            if(b.bookTitle.equals(title)){
                return b;
            }
        }

        return null;
    }

    public Patron getPatron(int patronId){
        for(Patron p: patrons){
            if(p.id == patronId){
                return p;
            }
        }

        return null;
    }

    public ArrayList<Patron> getPatrons(){
        for(Patron p: patrons){
            p.getPatronDetails();
        }

        return this.patrons;
    }

    public void getCategories() {
        for(Category c: categories){
            c.getCategory();
        }
    }

    public ArrayList<Book> getBooks(){
        for(Book book: books){
            book.getBookDetails();
            System.out.println("\n");
        }

        return books;
    }

    public Category getCategory(String slug) {
        for(Category category: categories){
            if(category.slug.equals(slug)){
                return category;
            }
        }

        return null;
    }
}

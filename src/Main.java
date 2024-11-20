import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook("Science","Ram","science",true,"thriller");
        lib.addBook("Maths","Ram","maths",true,"fiction");
        lib.addBook("Social","Ram","social",true,"action");
        lib.addBook("English","Ram","english",true,"comedy");
        lib.addBook("Health","Ram","health",true,"fiction");

        System.out.println("\nDisplaying Books...");

        ArrayList<Book> books = lib.getBooks();

        // Updating book author
        books.get(1).setBookDetails("Optional Maths","Hari","opt");

        System.out.println("\nDisplaying updated results...");
        books.get(1).getBookDetails();

       lib.createPatron("Sagar",1,"Premium");
       lib.createPatron("Shreya",2,"Bronze");
       lib.createPatron("Hassan",3,"Silver");
       lib.createPatron("Nishant",4,"Gold");

       System.out.println("\nDisplaying Patrons...");

       ArrayList<Patron> patrons = lib.getPatrons();

       // Creating loans
       lib.createLoan(patrons.get(0).id,books.get(2).bookTitle);
        lib.createLoan(patrons.get(1).id,books.get(0).bookTitle);
        lib.createLoan(patrons.get(2).id,books.get(1).bookTitle);
        lib.createLoan(patrons.get(3).id,books.get(3).bookTitle);

        // Displaying loans
        System.out.println("\nDisplaying Loans...");
       ArrayList<Loan> loans = lib.getLoans();

       // Returning loans
        loans.get(0).completeLoan();
        loans.get(1).completeLoan();

        //
        System.out.println("\nDisplaying Loans after returns...");
        lib.getLoans();
    }
}
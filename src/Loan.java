import java.util.Date;

public class Loan {
    public Date loanDate;
    public Date returnDate;
    public Date dueDate;
    public Patron patron;
    public Book book;

    public Loan(){}

    public void createLoan(Book book, Patron patron){
        this.book = book;
        this.patron = patron;


        if(!book.isAvailable) {
            System.out.println(book.bookTitle + " is unavailable!");

            return;
        }

        book.markAsBorrowed();

        Date dateInstance = new Date();

        dateInstance.setTime(4);

        this.dueDate = dateInstance;
        this.loanDate = new Date();
    }

    public void getLoanDetails(){
        System.out.println("Printing loan details: ");

        System.out.println("Patron name: "+ this.patron.name + "\n" + "Book name: " + this.book.bookTitle + "\n" + "Due date: "+ this.dueDate + "\n" + "Return Date: "+ this.returnDate + "\n" +"Loan Date: "+ this.loanDate);

       System.out.println();
    }

    public void completeLoan(){
        if(this.book.isAvailable) {
            System.out.println(book.bookTitle + " has not been borrowed!");

            return;
        }

        this.returnDate = new Date();
        this.book.markAsReturned();
    }
}

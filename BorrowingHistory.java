package ASS;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BorrowingHistory {

    private ArrayList<Book> borrowBooks;
    private String memberID;
    private LocalDateTime borrowDate;
    private LocalDateTime returnDate;
    private int borrowdays;

    public BorrowingHistory(){

        this.memberID = " ";
        this.borrowBooks = new ArrayList<>();
        this.borrowDate = null;
        this.returnDate = borrowDate.plusDays(0);

    }

    public BorrowingHistory(String memberID, ArrayList<Book> books,LocalDateTime borrowDate, int borrowdays){

        this.memberID = memberID;
        this.borrowBooks = books;
        this.borrowDate = borrowDate;
        this.returnDate = borrowDate.plusDays(borrowdays);
        
    }

    public String getMemberId(){
        return memberID;
    }

    DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    
    public void displayDate(){
        String borrowBookDate = borrowDate.format(DTF);
        String returnBookDate = returnDate.format(DTF);

        System.out.println("Borrow At " + borrowBookDate);
        System.out.println("Please return all the books At " + returnBookDate);

    }

    public void extendedReturn(){

        this.returnDate = returnDate.plusDays(7);
        System.out.println("Your return date is successfully extended.");
        System.out.println("Please return all the books At " + this.returnDate.format(DTF));
    
    }

    public void extendedReturn(int y){

        this.returnDate = returnDate.plusDays(y);
        System.out.println("Your return date is successfully extended.");
        System.out.println("Please return all the books At " + this.returnDate.format(DTF));

    }


}
// if s1.getStudentId == b1.getStudentId
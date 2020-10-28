package operation;

import book.Book;
import book.BookList;

public class BorrowOperation implements IOperation{
    public void work(BookList booklist){
        System.out.println("租借图书！");
        String name = this.sc.next();
        int currentSize = booklist.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = booklist.getBook(i);
            if(book.getName().equals(name)) {
                book.setBorrowed(true);
                System.out.println(book.isBorrowed());
                break;
            }
        }
    }
}

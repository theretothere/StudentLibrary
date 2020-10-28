package operation;

import book.Book;
import book.BookList;

public class ReturnOperation implements IOperation{
    public void work(BookList booklist){
        System.out.println("归还图书！");
        String name = this.sc.next();
        int currentSize = booklist.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = booklist.getBook(i);
            if(book.getName().equals(name)) {
                book.setBorrowed(false);
                System.out.println(book.isBorrowed());
                break;
            }
        }
    }
}

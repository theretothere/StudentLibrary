package operation;

import book.BookList;
import book.Book;
public class DisplayOperation implements IOperation{
    public void work(BookList booklist){
        System.out.println("展示图书！");
        int currentSize = booklist.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = booklist.getBook(i);
            System.out.println(book);
        }
    }

}

package operation;

import book.Book;
import book.BookList;

public class DelOperation implements IOperation{
    public void work(BookList booklist){
        System.out.println("删除图书！");
        String name = this.sc.next();
        int currentSize = booklist.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = booklist.getBook(i);
            Book book1 = booklist.getBook(i+1);
            if(book.getName().equals(name)) {
                if(booklist.getBook(i+2) == null){
                    book1 = null;
                }
                booklist.setBook(i,booklist.getBook(i+1));
                break;
            }
        }
    }
}

package operation;

import book.BookList;
import book.Book;
public class FindOperation implements IOperation{
    public void work(BookList booklist){
        System.out.println("查找图书！");
        String name = this.sc.next();
        int currentSize = booklist.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = booklist.getBook(i);
            if(book.getName().equals(name)) {
                System.out.println(book);
                break;
            }
        }
    }

}

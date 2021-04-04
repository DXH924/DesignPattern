package chapter01.demo;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 表示书架的类
 * @date 2021-04-04 21:28
 */
public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;
    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }
    public Book getBookAt(int index) {
        return books[index];
    }
    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }
    public int getLength() {
        return last;
    }

    @Override
    public Iterator itreator() {
        return new BookShelfIterator(this);
    }

}
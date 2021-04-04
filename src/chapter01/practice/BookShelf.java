package chapter01.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhang chhi
 * @Title:
 * @Package:
 * @Description: 表示书架的类
 * @date 2021-04-04 21:28
 */
public class BookShelf implements Aggregate {
    // 不使用数组，用list代替，确保当书的数量超过最初指定的书架容量时也能继续添加书本
    private List<Book> books;
    public BookShelf(int maxSize) {
        this.books = new ArrayList<>(maxSize);
    }
    public Book getBookAt(int index) {
        return books.get(index);
    }
    public void appendBook(Book book) {
        this.books.add(book);
    }
    public int getLength() {
        return this.books.size();
    }

    @Override
    public Iterator itreator() {
        return new BookShelfIterator(this);
    }

}
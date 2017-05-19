package com.pd.iterator2;

import java.util.List;

public class BookShelf2 implements Aggregate2 {

    private List<Book2> book2s;

    public BookShelf2(List<Book2> book2s) {
        this.book2s = book2s;
    }

    public int getLength() {
        return book2s.size();
    }

    public Book2 getBookAt(int index) {
        return book2s.get(index);
    }

    public void appendBook(Book2 book2) {
        book2s.add(book2);
    }

    @Override
    public Iterator2 iterator() {
        return new BookShelfIterator2(this);
    }
}

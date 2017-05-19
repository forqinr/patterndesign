package com.pd.iterator2;

public class BookShelfIterator2 implements Iterator2 {

    private BookShelf2 bookShelf2;

    private int index = 0;

    public BookShelfIterator2(BookShelf2 bookShelf2) {
        this.bookShelf2 = bookShelf2;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf2.getLength();
    }

    @Override
    public Object next() {
        Book2 book2 = bookShelf2.getBookAt(index);
        index++;
        return book2;
    }
}

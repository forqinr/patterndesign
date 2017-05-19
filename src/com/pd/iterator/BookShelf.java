package com.pd.iterator;

public class BookShelf implements Aggregate {

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
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
    public Iterator itrator() {
        return new BookshelfIterator(this);
    }


    private Book[] books;
    private int last = 0;
}

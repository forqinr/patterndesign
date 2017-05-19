package com.pd.iterator2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book2> list = new ArrayList<Book2>();
        BookShelf2 bookShelf2 = new BookShelf2(list);
        bookShelf2.appendBook(new Book2("AAA"));
        bookShelf2.appendBook(new Book2("BBB"));
        bookShelf2.appendBook(new Book2("CCC"));
        bookShelf2.appendBook(new Book2("DDD"));

        Iterator2 iterator2 = bookShelf2.iterator();
        while (iterator2.hasNext()) {
            System.out.println(((Book2) iterator2.next()).getName());
        }
    }
}

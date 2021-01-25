package com.biblennium.bible.domain.bible.booklist;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("engBookList")
public class EnglishBibleBookList extends AbstractBibleBookList {

    {
        BibleBook[] books = BibleBook.values();
        for (BibleBook book : books) {
            if (book.ordinal() < 39) {
                ot.put(book, book.toString());
            } else {
                nt.put(book, book.toString());
            }
        }
    }
}

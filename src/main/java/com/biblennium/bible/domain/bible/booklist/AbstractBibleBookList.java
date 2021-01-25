package com.biblennium.bible.domain.bible.booklist;

import java.util.EnumMap;
import java.util.Map;

public abstract class AbstractBibleBookList implements BibleBookList {

    final Map<BibleBook, String> ot = new EnumMap<>(BibleBook.class);
    final Map<BibleBook, String> nt = new EnumMap<>(BibleBook.class);

    @Override
    public Map<BibleBook, String> getOldTestaments() {
        return ot;
    }

    @Override
    public Map<BibleBook, String> getNewTestaments() {
        return nt;
    }
}

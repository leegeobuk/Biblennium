package com.biblennium.bible.domain.bible.booklist;

import java.util.List;
import java.util.Map;

public interface BibleBookList {
    Map<BibleBook, String> getOldTestaments();
    Map<BibleBook, String> getNewTestaments();
}

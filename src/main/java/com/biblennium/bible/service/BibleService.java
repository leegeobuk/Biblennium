package com.biblennium.bible.service;

import com.biblennium.bible.domain.bible.Bible;
import com.biblennium.bible.domain.bible.Nkrv;
import com.biblennium.bible.domain.bible.booklist.BibleBook;

import java.util.List;
import java.util.Map;

public interface BibleService {

    Map<BibleBook, String> getOldTestamentList();
    Map<BibleBook, String> getNewTestamentList();
    List<? extends Bible> getScriptByChapter(String book, int chapter);
}

package com.biblennium.bible.service.cache;

import com.biblennium.bible.domain.bible.Bible;

import java.util.List;

public interface CachedBibleService {

    List<? extends Bible> getScriptByChapter(String book, int chapter);
    void cacheBible(List<? extends Bible> script);
}

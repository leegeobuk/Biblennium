package com.biblennium.bible.dto;

import com.biblennium.bible.domain.bible.booklist.BibleBook;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Getter
public class BookListDTO {

    private final List<BookLink> ot = new LinkedList<>();
    private final List<BookLink> nt = new LinkedList<>();

    public BookListDTO(Map<BibleBook, String> ot, Map<BibleBook, String> nt) {
        for (Map.Entry<BibleBook, String> otEntry : ot.entrySet()) {
            BibleBook key = otEntry.getKey();
            this.ot.add(new BookLink(otEntry.getValue(), key.getAbbreviations(), key.chapters));
        }
        for (Map.Entry<BibleBook, String> ntEntry : nt.entrySet()) {
            BibleBook key = ntEntry.getKey();
            this.nt.add(new BookLink(ntEntry.getValue(), key.getAbbreviations(), key.chapters));
        }
    }

    @RequiredArgsConstructor
    @Getter
    static class BookLink {

        private final String fullName;
        private final String abbreviation;
        private final int chapters;
    }
}

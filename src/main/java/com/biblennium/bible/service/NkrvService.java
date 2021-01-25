package com.biblennium.bible.service;

import com.biblennium.bible.domain.bible.Nkrv;
import com.biblennium.bible.domain.bible.booklist.BibleBook;
import com.biblennium.bible.domain.bible.booklist.BibleBookList;
import com.biblennium.bible.repository.NkrvRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class NkrvService implements BibleService {

    private final BibleBookList bookList;
    private final NkrvRepository nkrvRepository;

    @Override
    public Map<BibleBook, String> getOldTestamentList() {
        return bookList.getOldTestaments();
    }

    @Override
    public Map<BibleBook, String> getNewTestamentList() {
        return bookList.getNewTestaments();
    }

    @Override
    public List<Nkrv> getScriptByChapter(String book, int chapter) {
        List<Nkrv> script = nkrvRepository.findByBookAndChapter(book, chapter);
        return Objects.requireNonNull(script);
    }
}

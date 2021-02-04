package com.biblennium.bible.controller;

import com.biblennium.bible.domain.bible.Bible;
import com.biblennium.bible.domain.bible.booklist.BibleBook;
import com.biblennium.bible.dto.BookListDTO;
import com.biblennium.bible.dto.ScriptDTO;
import com.biblennium.bible.service.BibleService;
import com.biblennium.bible.service.cache.CachedBibleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class BibleController {

    private final BibleService bibleService;
    private final CachedBibleService cachedBibleService;

    @GetMapping("/")
    public ResponseEntity<BookListDTO> getBookList() {
        Map<BibleBook, String> ot = bibleService.getOldTestamentList();
        Map<BibleBook, String> nt = bibleService.getNewTestamentList();
        BookListDTO bookListDTO = new BookListDTO(ot, nt);
        return ResponseEntity.ok(bookListDTO);
    }

    @GetMapping("/script")
    public ResponseEntity<ScriptDTO> getScript(@RequestParam("b") String book,
                                               @RequestParam("c") int chapter) {
//        List<? extends Bible> cache = cachedBibleService.getScriptByChapter(book, chapter);
//        if (cache.size() > 0) {
//            return ResponseEntity.ok(new ScriptDTO(cache));
//        }
        List<? extends Bible> script = bibleService.getScriptByChapter(book, chapter);
//        cachedBibleService.cacheBible(script);
        return ResponseEntity.ok(new ScriptDTO(script));
    }
}

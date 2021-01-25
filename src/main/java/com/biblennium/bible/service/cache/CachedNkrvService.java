package com.biblennium.bible.service.cache;

import com.biblennium.bible.domain.bible.Bible;
import com.biblennium.bible.domain.bible.cache.CachedNkrv;
import com.biblennium.bible.repository.cache.CachedNkrvRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CachedNkrvService implements CachedBibleService {

    private final CachedNkrvRepository cachedNkrvRepository;

    @Override
    public List<? extends Bible> getScriptByChapter(String book, int chapter) {
       return cachedNkrvRepository.findByBookAndChapter(book, chapter).stream()
           .sorted(Comparator.comparingInt(CachedNkrv::getVerse))
           .collect(Collectors.toUnmodifiableList());
    }

    @Override
    public void cacheBible(List<? extends Bible> script) {
        for (Bible bible : script) {
            CachedNkrv cachedNkrv = new CachedNkrv(bible);
            cachedNkrvRepository.save(cachedNkrv);
        }
    }
}

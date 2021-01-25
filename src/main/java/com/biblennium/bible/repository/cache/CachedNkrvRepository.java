package com.biblennium.bible.repository.cache;

import com.biblennium.bible.domain.bible.cache.CachedNkrv;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CachedNkrvRepository extends CrudRepository<CachedNkrv, String> {

    List<CachedNkrv> findByBookAndChapter(String book, int chapter);
}

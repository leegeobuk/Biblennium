package com.biblennium.bible.repository;

import com.biblennium.bible.domain.bible.Nkrv;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NkrvRepository extends JpaRepository<Nkrv, String> {

    List<Nkrv> findByBookAndChapter(String book, int chapter);
}

package com.biblennium.bible.service;

import com.biblennium.bible.domain.bible.booklist.BibleBook;
import com.biblennium.bible.domain.bible.booklist.KoreanBibleBookList;
import com.biblennium.bible.repository.NkrvRepository;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

class NkrvServiceTest {

    NkrvRepository mockedNkrvRepository = mock(NkrvRepository.class);
    BibleService bibleService = new NkrvService(new KoreanBibleBookList(), mockedNkrvRepository);

    @Test
    void getBookList() {
        //given
        Map<BibleBook, String> ot = bibleService.getOldTestamentList();
        Map<BibleBook, String> nt = bibleService.getNewTestamentList();

        //when
        int otSize = ot.size();
        int ntSize = nt.size();

        //then
        String nullDesc = "Testament shouldn't be null";
        String sizeDesc = "The number of books doesn't match";
        assertThat(ot).as(nullDesc).isNotSameAs(null);
        assertThat(nt).as(nullDesc).isNotSameAs(null);
        assertThat(otSize).as(sizeDesc).isEqualTo(39);
        assertThat(ntSize).as(sizeDesc).isEqualTo(27);

    }

}
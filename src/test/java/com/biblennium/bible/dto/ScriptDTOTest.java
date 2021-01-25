package com.biblennium.bible.dto;

import com.biblennium.bible.domain.bible.Bible;
import com.biblennium.bible.domain.bible.Nkrv;
import org.assertj.core.description.Description;
import org.assertj.core.description.TextDescription;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ScriptDTOTest {

    @Test
    void verseTest() {
        //given
        Bible deuMock1 = mock(Nkrv.class);
        Bible deuMock2 = mock(Nkrv.class);
        Bible deuMock3 = mock(Nkrv.class);
        Bible deuMock4 = mock(Nkrv.class);
        Bible deuMock5 = mock(Nkrv.class);

        Bible psaMock1 = mock(Nkrv.class);
        Bible psaMock2 = mock(Nkrv.class);
        Bible psaMock3 = mock(Nkrv.class);
        Bible psaMock4 = mock(Nkrv.class);
        Bible psaMock5 = mock(Nkrv.class);

        Bible romMock1 = mock(Nkrv.class);
        Bible romMock2 = mock(Nkrv.class);
        Bible romMock3 = mock(Nkrv.class);
        Bible romMock4 = mock(Nkrv.class);
        Bible romMock5 = mock(Nkrv.class);

        String s1 = "Deu 6:18-19";
        String s2 = "Psa 92:1-3";

        //when
        // two verses with same text
        when(deuMock1.getBook()).thenReturn("Deu");
        when(deuMock1.getChapter()).thenReturn(6);
        when(deuMock1.getVerse()).thenReturn(18);
        when(deuMock2.getVerse()).thenReturn(19);
        when(deuMock1.getScript()).thenReturn(s1);
        when(deuMock2.getScript()).thenReturn(s1);
        when(deuMock3.getScript()).thenReturn("Deu 6:20");
        when(deuMock4.getScript()).thenReturn("Deu 6:21");
        when(deuMock5.getScript()).thenReturn("Deu 6:22");

        // three verses with same text
        when(psaMock1.getBook()).thenReturn("Psa");
        when(psaMock1.getChapter()).thenReturn(92);
        when(psaMock1.getVerse()).thenReturn(1);
        when(psaMock2.getVerse()).thenReturn(2);
        when(psaMock3.getVerse()).thenReturn(3);
        when(psaMock1.getScript()).thenReturn(s2);
        when(psaMock2.getScript()).thenReturn(s2);
        when(psaMock3.getScript()).thenReturn(s2);
        when(psaMock4.getScript()).thenReturn("Psa 92:4");
        when(psaMock5.getScript()).thenReturn("Psa 92:5");

        // book is in CHECK_TABLE but not chapter
        when(romMock1.getBook()).thenReturn("Rom");
        when(romMock1.getChapter()).thenReturn(1);
        when(romMock1.getScript()).thenReturn("1");
        when(romMock2.getScript()).thenReturn("2");
        when(romMock3.getScript()).thenReturn("3");
        when(romMock4.getScript()).thenReturn("4");
        when(romMock5.getScript()).thenReturn("5");

        List<Bible> mockedList1 = List.of(deuMock1, deuMock2, deuMock3, deuMock4, deuMock5);
        List<Bible> mockedList2 = List.of(psaMock1, psaMock2, psaMock3, psaMock4, psaMock5);
        List<Bible> mockedList3 = List.of(romMock1, romMock2, romMock3, romMock4, romMock5);

        ScriptDTO scriptDTO1 = new ScriptDTO(mockedList1);
        ScriptDTO scriptDTO2 = new ScriptDTO(mockedList2);
        ScriptDTO scriptDTO3 = new ScriptDTO(mockedList3);

        String verse1 = scriptDTO1.getVerseList().get(0).getVerse();
        String verse2 = scriptDTO2.getVerseList().get(0).getVerse();

        //then
        Description verseDesc = new TextDescription("Wrong verse notation for ScriptDTO");
        assertThat(verse1).as(verseDesc).isEqualTo("18-19");
        assertThat(verse2).as(verseDesc).isEqualTo("1-3");

        Description sizeDesc = new TextDescription("Wrong number of verses for ScriptDTO");
        assertThat(scriptDTO1.getVerseList().size()).as(sizeDesc).isEqualTo(4);
        assertThat(scriptDTO2.getVerseList().size()).as(sizeDesc).isEqualTo(3);
        assertThat(scriptDTO3.getVerseList().size()).as(sizeDesc).isEqualTo(5);
    }

}
package com.biblennium.bible.domain.bible;

import org.assertj.core.description.Description;
import org.assertj.core.description.TextDescription;
import org.junit.jupiter.api.Test;

import static com.biblennium.bible.domain.bible.booklist.BibleBook.*;
import static org.assertj.core.api.Assertions.assertThat;

class BibleBookTest {

    @Test
    void testToString() {
        //given
        String genesis = GENESIS.toString();
        String samuel1 = SAMUEL1.toString();
        String kings1 = KINGS1.toString();
        String chronicles1 = CHRONICLES1.toString();
        String corinthians1 = CORINTHIANS1.toString();
        String thessalonians1 = THESSALONIANS1.toString();
        String timothy1 = TIMOTHY1.toString();
        String peter1 = PETER1.toString();
        String john1 = JOHN1.toString();
        String john2 = JOHN2.toString();
        String john3 = JOHN3.toString();

        //when

        //then
        Description desc = new TextDescription("Wrong capitalization for BibleBook");
        assertThat(genesis).as(desc).isEqualTo("Genesis");
        assertThat(samuel1).as(desc).isEqualTo("1Samuel");
        assertThat(kings1).as(desc).isEqualTo("1Kings");
        assertThat(chronicles1).as(desc).isEqualTo("1Chronicles");
        assertThat(corinthians1).as(desc).isEqualTo("1Corinthians");
        assertThat(thessalonians1).as(desc).isEqualTo("1Thessalonians");
        assertThat(timothy1).as(desc).isEqualTo("1Timothy");
        assertThat(peter1).as(desc).isEqualTo("1Peter");
        assertThat(john1).as(desc).isEqualTo("1John");
        assertThat(john2).as(desc).isEqualTo("2John");
        assertThat(john3).as(desc).isEqualTo("3John");
    }
}
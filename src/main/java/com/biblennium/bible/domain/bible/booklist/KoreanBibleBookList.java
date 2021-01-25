package com.biblennium.bible.domain.bible.booklist;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import static com.biblennium.bible.domain.bible.booklist.BibleBook.*;

@Component
@Primary
@Qualifier("mainBookList")
public class KoreanBibleBookList extends AbstractBibleBookList {

    {
        ot.put(GENESIS, "창세기");
        ot.put(EXODUS, "출애굽기");
        ot.put(LEVITICUS, "레위기");
        ot.put(NUMBERS, "민수기");
        ot.put(DEUTERONOMY, "신명기");
        ot.put(JOSHUA, "여호수아");
        ot.put(JUDGES, "사사기");
        ot.put(RUTH, "룻기");
        ot.put(SAMUEL1, "사무엘상");
        ot.put(SAMUEL2, "사무엘하");
        ot.put(KINGS1, "열왕기상");
        ot.put(KINGS2, "열왕기하");
        ot.put(CHRONICLES1, "역대상");
        ot.put(CHRONICLES2, "역대하");
        ot.put(EZRA, "에스라");
        ot.put(NEHEMIAH, "느헤미야");
        ot.put(ESTHER, "에스더");
        ot.put(JOB, "욥기");
        ot.put(PSALMS, "시편");
        ot.put(PROVERBS, "잠언");
        ot.put(ECCLESIASTES, "전도서");
        ot.put(SONG_OF_SOLOMON, "아가");
        ot.put(ISAIAH, "이사야");
        ot.put(JEREMIAH, "예레미야");
        ot.put(LAMENTATIONS, "예레미야애가");
        ot.put(EZEKIEL, "에스겔");
        ot.put(DANIEL, "다니엘");
        ot.put(HOSEA, "호세아");
        ot.put(JOEL, "요엘");
        ot.put(AMOS, "아모스");
        ot.put(OBADIAH, "오바댜");
        ot.put(JONAH, "요나");
        ot.put(MICAH, "미가");
        ot.put(NAHUM, "나훔");
        ot.put(HABAKKUK, "하박국");
        ot.put(ZEPHANIAH, "스바냐");
        ot.put(HAGGAI, "학개");
        ot.put(ZECHARIAH, "스가랴");
        ot.put(MALACHI, "말라기");
        nt.put(MATTHEW, "마태복음");
        nt.put(MARK, "마가복음");
        nt.put(LUKE, "누가복음");
        nt.put(JOHN, "요한복음");
        nt.put(ACTS, "사도행전");
        nt.put(ROMANS, "로마서");
        nt.put(CORINTHIANS1, "고린도전서");
        nt.put(CORINTHIANS2, "고린도후서");
        nt.put(GALATIANS, "갈라디아서");
        nt.put(EPHESIANS, "에베소서");
        nt.put(PHILIPPIANS, "빌립보서");
        nt.put(COLOSSIANS, "골로새서");
        nt.put(THESSALONIANS1, "데살로니가전서");
        nt.put(THESSALONIANS2, "데살로니가후서");
        nt.put(TIMOTHY1, "디모데전서");
        nt.put(TIMOTHY2, "디모데후서");
        nt.put(TITUS, "디도서");
        nt.put(PHILEMON, "빌레몬서");
        nt.put(HEBREWS, "히브리서");
        nt.put(JAMES, "야고보서");
        nt.put(PETER1, "베드로전서");
        nt.put(PETER2, "베드로후서");
        nt.put(JOHN1, "요한1서");
        nt.put(JOHN2, "요한2서");
        nt.put(JOHN3, "요한3서");
        nt.put(JUDE, "유다서");
        nt.put(REVELATION, "요한계시록");
    }
}

package com.biblennium.bible.domain.bible.booklist;

public enum BibleBook {
    GENESIS(50), EXODUS(40), LEVITICUS(27), NUMBERS(36),
    DEUTERONOMY(34), JOSHUA(24), JUDGES(21), RUTH(4),
    SAMUEL1(31), SAMUEL2(24), KINGS1(22), KINGS2(25),
    CHRONICLES1(29), CHRONICLES2(36), EZRA(10), NEHEMIAH(13),
    ESTHER(10), JOB(42), PSALMS(150), PROVERBS(31),
    ECCLESIASTES(12), SONG_OF_SOLOMON(8), ISAIAH(66),
    JEREMIAH(52), LAMENTATIONS(5), EZEKIEL(48), DANIEL(12),
    HOSEA(14), JOEL(3), AMOS(9), OBADIAH(1),
    JONAH(4), MICAH(7), NAHUM(3), HABAKKUK(3),
    ZEPHANIAH(3), HAGGAI(2), ZECHARIAH(14), MALACHI(4),

    MATTHEW(28), MARK(16), LUKE(24), JOHN(21),
    ACTS(28), ROMANS(16), CORINTHIANS1(16), CORINTHIANS2(13),
    GALATIANS(6), EPHESIANS(6), PHILIPPIANS(4), COLOSSIANS(4),
    THESSALONIANS1(5), THESSALONIANS2(3),
    TIMOTHY1(6), TIMOTHY2(4), TITUS(3), PHILEMON(1),
    HEBREWS(13), JAMES(5), PETER1(5), PETER2(3),
    JOHN1(5), JOHN2(1), JOHN3(1), JUDE(1), REVELATION(22);

    public final int chapters;

    BibleBook(int chapters) {
        this.chapters = chapters;
    }

    private String capitalize(String book) {
        return book.charAt(0) + book.substring(1).toLowerCase();
    }

    public String getAbbreviations() {
        return this == SONG_OF_SOLOMON ? "Sol"
            : this == PHILEMON ? "Phm"
            : toString().substring(0, 3);
    }

    @Override
    public String toString() {
        String name = this.name();
        char last = name.charAt(name.length() - 1);
        return ('1' <= last && last <= '9')
            ? last + capitalize(name.substring(0, name.length() - 1))
            : capitalize(name);
    }
}

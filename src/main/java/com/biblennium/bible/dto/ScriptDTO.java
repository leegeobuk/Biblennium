package com.biblennium.bible.dto;

import com.biblennium.bible.domain.bible.Bible;
import lombok.Getter;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Getter
public class ScriptDTO {

    // this is for verses with hyphen ex) 신명기 6:18-19, 시편 92:1-3
    private static final Map<String, List<Integer>> CHECK_TABLE = Map.of(
        "Deu", List.of(6, 15, 30),
        "1Ch", List.of(16),
        "Psa", List.of(92, 105),
        "Jer", List.of(32, 33),
        "Eze", List.of(24),
        "Act", List.of(15),
        "Rom", List.of(9)
    );

    private final List<Verse> verseList = new LinkedList<>();

    public ScriptDTO(List<? extends Bible> script) {
        String book = script.get(0).getBook();
        int chapter = script.get(0).getChapter();

        if (CHECK_TABLE.containsKey(book)) {
            List<Integer> chaptersToCheck = CHECK_TABLE.get(book);
            if (chaptersToCheck.contains(chapter)) {
                addHyphen(script, verseList);
                return;
            }
        }

        for (Bible bible : script) {
            verseList.add(new Verse(bible));
        }
    }

    private void addHyphen(List<? extends Bible> script, List<Verse> verseList) {
        Bible first = script.get(0);
        verseList.add(new Verse(first));

        for (int i = 1; i < script.size(); i++) {
            Verse last = verseList.get(verseList.size() - 1);
            Bible cur = script.get(i);
            if (last.text.equals(cur.getScript())) {
                int hyphenIndex = last.verse.indexOf("-");
                if (hyphenIndex > -1) {
                    last.verse = last.verse.substring(0, hyphenIndex);
                }
                last.verse += "-" + cur.getVerse();
                continue;
            }
            verseList.add(new Verse(cur));
        }
    }

    @Getter
    static class Verse {
        private String verse;
        private final String text;

        public Verse(Bible bible) {
            this.verse = "" + bible.getVerse();
            this.text = bible.getScript();
        }
    }
}

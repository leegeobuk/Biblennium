package com.biblennium.bible.domain.bible.cache;

import com.biblennium.bible.domain.bible.Bible;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@RedisHash(value = "nkrv", timeToLive = 86400L)
@Getter
@NoArgsConstructor
public class CachedNkrv implements Bible {

    @Id
    private String id;

    @Indexed
    private String book;

    @Indexed
    private int chapter;
    private int verse;
    private String script;

    public CachedNkrv(Bible bible) {
        this.id = bible.getId();
        this.book = bible.getBook();
        this.chapter = bible.getChapter();
        this.verse = bible.getVerse();
        this.script = bible.getScript();
    }
}

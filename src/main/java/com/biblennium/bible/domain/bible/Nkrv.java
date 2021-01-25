package com.biblennium.bible.domain.bible;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class Nkrv implements Bible {

    @Id
    private String id;

    private String book;
    private int chapter;
    private int verse;
    private String script;

    protected Nkrv() {
    }
}

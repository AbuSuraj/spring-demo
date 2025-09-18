package com.example.springdemo.Event;

import org.springframework.context.ApplicationEvent;

public class CoraEvent extends ApplicationEvent {
    private String episodeNo;

    public CoraEvent(Object source) {
        super(source);
    }

    public CoraEvent(Object source, String episodeNo) {
        super(source);
        this.episodeNo = episodeNo;
    }

    public String getEpisodeNo() {
        return episodeNo;
    }
}

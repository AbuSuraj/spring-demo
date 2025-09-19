package com.example.springdemo.EventListener;

import com.example.springdemo.Event.CoraEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CoraEventListener{
    public void getCoraEvent(String episodeNo){
        System.out.println("CoraEventListener - Episode " + episodeNo + " has started!");
    }

    @EventListener
    public void listenToCoraEvent(CoraEvent event) {
        getCoraEvent(event.getEpisodeNo());
    }
}

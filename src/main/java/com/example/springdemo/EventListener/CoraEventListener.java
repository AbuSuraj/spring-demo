package com.example.springdemo.EventListener;

import com.example.springdemo.Event.CoraEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CoraEventListener implements ApplicationListener<CoraEvent> {
    public void getCoraEvent(String episodeNo){
        System.out.println("CoraEventListener - Episode " + episodeNo + " has started!");
    }
    @Override
    public void onApplicationEvent(CoraEvent event) {
        getCoraEvent(event.getEpisodeNo());
    }
}

package com.example.springdemo.ZeeCafePublisher;

import com.example.springdemo.Event.CoraEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class ZeeCafePublisher {
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    public void streamBigBandTheory(String episodeNo){
        System.out.println("ZeeCafe - Big Band Theory - Episode " + episodeNo);

        applicationEventPublisher.publishEvent(new CoraEvent(this,episodeNo));
    }
}

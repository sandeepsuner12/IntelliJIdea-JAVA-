package com.solugenix.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class MyYoutubeChannel implements Subject{
    List<Observer> subscribers = new ArrayList<>();
    @Override
    public void subscribe(Observer o) {
    this.subscribers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        this.subscribers.remove(o);
    }

    @Override
    public void newVideoUploaded(String title){
        for(Observer observer:this.subscribers){
            observer.notified(title);
        }
    }
}

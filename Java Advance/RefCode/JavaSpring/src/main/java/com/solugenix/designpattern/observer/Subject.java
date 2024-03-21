package com.solugenix.designpattern.observer;



public interface Subject {

    void subscribe(Observer o);
    void unsubscribe(Observer o);
    void newVideoUploaded(String title);
}

package com.solugenix.designpattern.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        MyYoutubeChannel youtubeChannel = new MyYoutubeChannel();
        Subscriber s1 = new Subscriber("Rizwan");
        youtubeChannel.subscribe(s1);
        s1 = new Subscriber("Riya");
        youtubeChannel.subscribe(s1);
        youtubeChannel.newVideoUploaded("Microservices");
    }
}

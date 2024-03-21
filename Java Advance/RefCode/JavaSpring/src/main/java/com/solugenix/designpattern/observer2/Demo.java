package com.solugenix.designpattern.observer2;

public class Demo {
    public static void main(String[] args) {
        MyYoutubeChannel myYoutubeChannel = new MyYoutubeChannel();
        Subscriber aman = new Subscriber();

        myYoutubeChannel.subscribe(aman);
        myYoutubeChannel.addVideo("Design Patterns");

        System.out.println(aman.getVideo());
    }
}

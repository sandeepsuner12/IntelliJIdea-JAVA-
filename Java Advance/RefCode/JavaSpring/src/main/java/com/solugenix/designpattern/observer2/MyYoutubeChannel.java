package com.solugenix.designpattern.observer2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class MyYoutubeChannel {
    private String video;

    private PropertyChangeSupport support;

    public MyYoutubeChannel() {
        support = new PropertyChangeSupport(this);
    }

    public void subscribe(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void unsubscribe(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    public void addVideo(String value) {
        support.firePropertyChange("video", this.video, "New Video Uploaded - "+value);
        this.video = value;
    }
}
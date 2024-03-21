package com.solugenix.designpattern.observer2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Subscriber implements PropertyChangeListener {

    private String video;

    public void propertyChange(PropertyChangeEvent evt) {
        this.setVideo((String) evt.getNewValue());
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}

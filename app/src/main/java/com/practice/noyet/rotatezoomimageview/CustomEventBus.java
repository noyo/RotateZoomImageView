package com.practice.noyet.rotatezoomimageview;

/**
 * package: com.practice.noyet.rotatezoomimageview
 * Created by noyet on 2015/11/10.
 */
public class CustomEventBus {

    public EventType type;
    public Object obj;

    public CustomEventBus(EventType type, Object obj) {
        this.type = type;
        this.obj = obj;
    }

    enum EventType {
        SHOW_PICTURE
    }
}

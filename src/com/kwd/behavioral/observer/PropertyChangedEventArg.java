package com.kwd.behavioral.observer;

public class PropertyChangedEventArg {
    public Object source;
    public String propertyName;

    public PropertyChangedEventArg(Object source, String propertyName) {
        this.source = source;
        this.propertyName = propertyName;
    }

    
}

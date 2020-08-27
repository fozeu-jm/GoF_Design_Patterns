package com.kwd.behavioral.observer;

import jdk.nashorn.internal.ir.CallNode;

public class Human {
    private int age;
    public Event<PropertyChangedEventArg> propertyChanged = new Event<>();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        propertyChanged.emit(new PropertyChangedEventArg(this, "age"));
    }

    public Event<PropertyChangedEventArg> getPropertyChanged() {
        return propertyChanged;
    }

    public void setPropertyChanged(Event<PropertyChangedEventArg> propertyChanged) {
        this.propertyChanged = propertyChanged;
    }
}

package com.kwd.behavioral.observer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Event<TArgs> {
    int count = 0;
    Map<Integer, Consumer<TArgs>> handlers = new HashMap<>();

    public Subscription addHandler(Consumer<TArgs> handler) {
        int i = count;
        handlers.put(count++, handler);

        return new Subscription(this, i);
    }

    public void emit(TArgs args){
        for(Consumer<TArgs> handler : handlers.values())
            handler.accept(args);
    }

    public class Subscription implements AutoCloseable {
        private Event<TArgs> events;
        private int id;

        public Subscription(Event<TArgs> events, int id) {
            this.events = events;
            this.id = id;
        }

        @Override
        public void close() /*throws Exception*/ {
            events.handlers.remove(id);
        }
    }

}

package com.kwd.behavioral.strategy;

public class MultiplyOperation implements Operation {
    @Override
    public int calculate(int x, int y) {
        return x*y;
    }
}

package com.kwd.behavioral.strategy;

public class Mathematician {
    private Operation operation;

    public Mathematician(Operation operation) {
        this.operation = operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int calculate(int x, int y) {
        return operation.calculate(x, y);
    }
}

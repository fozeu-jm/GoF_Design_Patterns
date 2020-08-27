package com.kwd.behavioral.visitor;

public class CPU implements ComputerParts {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

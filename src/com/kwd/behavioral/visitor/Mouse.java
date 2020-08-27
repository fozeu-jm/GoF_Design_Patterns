package com.kwd.behavioral.visitor;

public class Mouse implements ComputerParts {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

package com.kwd.behavioral.visitor;

public class Keyboard implements ComputerParts{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

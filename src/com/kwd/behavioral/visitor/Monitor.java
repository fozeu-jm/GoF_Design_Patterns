package com.kwd.behavioral.visitor;

public class Monitor implements ComputerParts{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

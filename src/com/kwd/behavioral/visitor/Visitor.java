package com.kwd.behavioral.visitor;

public interface Visitor {
    void visit(Keyboard key);
    void visit(Monitor key);
    void visit(CPU key);
    void visit(Mouse key);
    void visit(Computer key);
}

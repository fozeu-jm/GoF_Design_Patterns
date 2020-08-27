package com.kwd.behavioral.visitor;

public class ComputerStartVisitor implements Visitor {

    @Override
    public void visit(Keyboard key) {
        System.out.println("Keyboard connected !");
    }

    @Override
    public void visit(Monitor key) {
        System.out.println("Monitor is well connected and on !");
    }

    @Override
    public void visit(CPU key) {
        System.out.println("Windows started !");
    }

    @Override
    public void visit(Mouse key) {
        System.out.println("Mouse connected !");
    }

    @Override
    public void visit(Computer key) {
        System.out.println("Computer started...");
    }
}

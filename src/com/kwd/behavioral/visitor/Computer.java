package com.kwd.behavioral.visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Computer implements ComputerParts {
    List<ComputerParts> parts;
    public Computer(){
        parts = Arrays.asList(new CPU(),new Monitor(),new Keyboard(),new Mouse());
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        parts.forEach(p -> p.accept(visitor));
    }
}

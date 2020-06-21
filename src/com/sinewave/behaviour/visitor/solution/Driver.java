package com.sinewave.behaviour.visitor.solution;

/**
 * @author Vivekanandan Sakthivelu
 */
public class Driver {

    public static void main(String[] args) {
        Node node = new AssignmentNode();
        Visitor visitor = new TypeCheckingVisitor();
        node.accept(visitor);
        node.accept(new AssignmentCheckVisitor());

        node = new VariableRefNode();
        node.accept(new TypeCheckingVisitor());
        node.accept(new AssignmentCheckVisitor());
    }
}

package com.sinewave.behaviour.visitor.solution;

/**
 * @author Vivekanandan Sakthivelu
 */
public class AssignmentCheckVisitor implements Visitor {

    @Override
    public void visitAssignmentNode(AssignmentNode node) {
        System.out.println("AssignmentCheckVisitor");
        System.out.println("AssignmentNode");
    }

    @Override
    public void visitVariableRefNode(VariableRefNode node) {
        System.out.println("AssignmentCheckVisitor");
        System.out.println("VariableRefNode");
    }
}

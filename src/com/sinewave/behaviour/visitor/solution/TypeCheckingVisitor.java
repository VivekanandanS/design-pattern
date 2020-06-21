package com.sinewave.behaviour.visitor.solution;

/**
 * @author Vivekanandan Sakthivelu
 */
public class TypeCheckingVisitor implements Visitor {


    @Override
    public void visitAssignmentNode(AssignmentNode node) {
        System.out.println("TypeChecking Visitor");
        System.out.println("AssignmentNode");

    }

    @Override
    public void visitVariableRefNode(VariableRefNode node) {
        System.out.println("TypeChecking Visitor");
        System.out.println("VariableRefNode");
    }
}

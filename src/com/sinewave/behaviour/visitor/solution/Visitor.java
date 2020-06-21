package com.sinewave.behaviour.visitor.solution;

/**
 * @author Vivekanandan Sakthivelu
 */
public interface Visitor {
    void visitAssignmentNode(AssignmentNode node);
    void visitVariableRefNode(VariableRefNode node);
}

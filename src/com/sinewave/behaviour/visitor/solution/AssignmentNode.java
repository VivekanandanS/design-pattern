package com.sinewave.behaviour.visitor.solution;

/**
 * @author Vivekanandan Sakthivelu
 */
public class AssignmentNode extends Node{


    @Override
    public void accept(Visitor visitor) {
        visitor.visitAssignmentNode(this);
    }
}

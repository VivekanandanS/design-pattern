package com.sinewave.behaviour.visitor.solution;

/**
 * @author Vivekanandan Sakthivelu
 */
public class VariableRefNode extends Node {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitVariableRefNode(this);
    }
}

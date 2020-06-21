package com.sinewave.behaviour.visitor.anitpattern;

/**
 * @author Vivekanandan Sakthivelu
 */
public class Driver {

    public static void main(String[] args) {
        Node node = new AssignmentNode();
        node.checkVariableAssignement();
        node.doTypeCheck();
    }
}

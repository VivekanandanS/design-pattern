package com.sinewave.behaviour.visitor.anitpattern;

/**
 * @author Vivekanandan Sakthivelu
 */
public class AssignmentNode  extends Node {

    @Override
    public void doTypeCheck() {
        System.out.println("Im typechecking Assingment Node");
    }

    @Override
    public void checkVariableAssignement() {
        System.out.println("I'm assingment on assingment node");
    }
}

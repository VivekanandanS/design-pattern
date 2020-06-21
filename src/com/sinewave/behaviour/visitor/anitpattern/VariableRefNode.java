package com.sinewave.behaviour.visitor.anitpattern;

import com.sinewave.behaviour.visitor.anitpattern.Node;

/**
 * @author Vivekanandan Sakthivelu
 */
public class VariableRefNode extends Node {

    @Override
    public void doTypeCheck() {
        System.out.println("I'm typechecking variable node");
    }

    @Override
    public void checkVariableAssignement() {
        System.out.println("I'm assingment on variable node");
    }
}

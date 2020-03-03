package com.company;

public class NoFly implements IFly {

    @Override
    public void fly() {
        System.out.println(" This duck does not fly");
    }
}

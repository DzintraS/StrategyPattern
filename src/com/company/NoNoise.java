package com.company;

public class NoNoise implements IMakeNoise {
    @Override
    public void makeNoise() {
        System.out.println(" Rubber duck is silent");
    }
}

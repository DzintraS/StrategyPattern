package com.company;

public class Duck {
    public int legs = 2;

    public Duck(int legs) {
        this.legs = legs;
    }

    public void duckMove(IFly fly){
        fly.fly();
    }

    public void makeNoise(IMakeNoise noise){
        noise.makeNoise();
    }
}

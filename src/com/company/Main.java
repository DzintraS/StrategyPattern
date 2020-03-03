package com.company;

public class Main {


public static Object NoNoise;

	public static void main(String[] args) {
	Duck rubberDuck = new Duck(2);

	IMakeNoise noise = new NoNoise();
	rubberDuck.makeNoise(noise);

	IFly fly = new FlyHigh();

	rubberDuck.duckMove(fly);

    }
}

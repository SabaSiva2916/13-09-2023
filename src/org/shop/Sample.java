package org.shop;

import java.util.ArrayList;

public abstract class Sample {

    int i = 0;

    public Sample() {
	display();
    }

    abstract void myMethod();

    void display() {
	System.out.println(i);
    }

}

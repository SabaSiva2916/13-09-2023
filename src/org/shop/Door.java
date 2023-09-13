package org.shop;

public class Door extends Sample implements _Test {

    public Door() {
	super();

	i = 1;
    }

    @Override
    public void myMethod() {
	new Door();
    }

}

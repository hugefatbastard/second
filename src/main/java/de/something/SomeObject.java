package de.something;

public class SomeObject {

    private boolean invoked;

    public void doSomething() {
        invoked = true;
    }


    public boolean check() {
        return invoked;
    }
}

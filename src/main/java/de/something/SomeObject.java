package de.something;

public class SomeObject {

    private boolean invoked;
    private boolean passed;

    public void doSomething() {
        invoked = true;
    }


    public boolean check() {
        return invoked || passed;
    }

    public void passSomething() {
        passed = true;
    }
}

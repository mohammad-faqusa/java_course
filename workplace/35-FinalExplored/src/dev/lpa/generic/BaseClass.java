package dev.lpa.generic;

public class BaseClass {

    public void recommendedMethod() {

        System.out.println("[BaseClass.recommendedMethod]: Best Way to do it");
        optionalMethod();
        mandatoryMethod();


    }

    protected void optionalMethod() {
        System.out.println("BaseClass.optionalMethod: customize optional method");
    }

    private void mandatoryMethod() {
        System.out.println("BaseClass.mandatoryMethod: Non-negotiable");
    }
}

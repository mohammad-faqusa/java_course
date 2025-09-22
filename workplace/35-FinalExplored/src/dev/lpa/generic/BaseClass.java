package dev.lpa.generic;

public class BaseClass {

    public final void recommendedMethod() {
        System.out.println("[BaseClass.recommendedMethod[: Best way to do it");
        optionalMethod();
        mandatoryMethod();
    }

    protected void optionalMethod() {
        System.out.println("[BaseClass.optionalMethod]: Customize optional method");
    }

    private final void mandatoryMethod() {
        System.out.println("[BaseClass.mandatoryMethod]: NON=NEGOTIABLE");
    }

    public static final void recommendedStatic() {
        System.out.println("[BaseClass.recommendedStatic] Best way to do it ");
        optionalStatic();
        mandatoryStatic();
    }

    protected static void optionalStatic() {
        System.out.println("[BaseClass.optionalStatic]: Optional");
    }

    private static void mandatoryStatic() {
        System.out.println("[baseClass.mandatoryStatic]");
    }
}

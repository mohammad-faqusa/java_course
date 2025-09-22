package consumer.specific;

import dev.lpa.generic.BaseClass;

public class ChildClass extends BaseClass {


    @Override
    protected void optionalMethod() {

        System.out.println("[ChildClass.optionalMethod] Extra Stuff");
        super.optionalMethod();
    }

//    @Override
//    public void recommendedMethod() {
//        System.out.println("[ChildClass.recommendedMethod] I'll do things my way");
//        super.recommendedMethod();
//    }

    private void mandatoryMethod() {
        System.out.println("[Child:mandatoryMethod]: my own important stuff");
    }

//    public static void recommendedStatic() {
//        System.out.println("[Child.recommendedStatic] Best way to do it ");
//        optionalStatic();
////        mandatoryStatic();
//    }
}

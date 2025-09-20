package consumer.specific;

import dev.lpa.generic.BaseClass;

public class ChildClass extends BaseClass {

    @Override
    protected void optionalMethod() {
        System.out.println("ChildClass.optionalMethod: Extra Stuff here : ");
        super.optionalMethod();
    }
}

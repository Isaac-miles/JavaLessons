package consumer.specific;

import dev.generic.BaseClass;

public class ChildClass extends BaseClass {
    @Override
    protected void optionalMethod() {
        System.out.println("Some extra stuff happened");
        super.optionalMethod();
    }
    public static void recommendedStatic(){
        System.out.println("[Child.recommendedMethod]: Extra Way to Do it");
        optionalStatic();
    }

}

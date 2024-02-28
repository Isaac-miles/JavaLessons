package dev.generic;

public class BaseClass {
    public final void recommendedMethod(){
        System.out.println("[BaseClass.recommendedMethod]: Best Way to Do it");
        optionalMethod();
        mandatoryMethod();
    }
    protected void optionalMethod(){
        System.out.println("[BaseClass.optionalMethod]: Customize Optional Method");
    }
    private void mandatoryMethod(){
        System.out.println("[BaseClass.mandatoryMethod]: NON-NEGOTIABLE!");
    }
}

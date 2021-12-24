package com.karvekar.lambda;


interface LambdaHandsOn {
    void lamdaMenthod();
}

public class LambdaHandsOnImpl implements LambdaHandsOn {

    //Following is the traditional approach of implementing the interfarce method
    @Override
    public void lamdaMenthod() {
        System.out.println("Implemented interface method traditionally");
    }

    public static void main(String[] args) {
        new LambdaHandsOnImpl().lamdaMenthod();

        //Following is the new Java 8 feature to implement method through Lambda Feature
        LambdaHandsOn lamdaHandsOn = () -> System.out.println("Implemented interface method using Lambda Expression");

        lamdaHandsOn.lamdaMenthod();
    }
}

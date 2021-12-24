package com.karvekar.lambda;


interface LambdaHandOn {
    void lamdaMenthod();
}

public class LambdaHandOnImpl implements LambdaHandOn{

    //Following is the traditional approach of implementing the interfarce method
    @Override
    public void lamdaMenthod() {
        System.out.println("Implemented interface method traditionally");
    }

    public static void main(String[] args) {
        new LambdaHandOnImpl().lamdaMenthod();

        //Following is the new Java 8 feature to implement method through Lambda Feature
        LambdaHandOn lamdaHandOn = () -> {
            System.out.println("Implemented interface method using Lambda Expression");
        };
        lamdaHandOn.lamdaMenthod();
    }
}

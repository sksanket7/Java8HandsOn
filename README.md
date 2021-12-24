# Java8HandsOn

**Lambda Expression**

1. Interface Design 
 - Interface should have only one abstract method, otherwise it will create a ambiguty.
 - While calling these lambda method it calls without its name so this may be the reason it is mandatory to have only a single method.
 - Eg.: ``` 
 interface LambdaHandOn {
    void lamdaMenthod();
}``` 
 <br />
 
2. Calling Lambda method
  - In the existing class we need to first implement the interface.
  - When we call lambda method no need to mention its name and return type.
  - Just have () double brackets if there are no parameters and -> this symbol is required while calling the interface method.
  - Eg.: ``` () -> System.out.println("Implemented interface method using Lambda Expression"); ```

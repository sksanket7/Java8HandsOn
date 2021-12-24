# Java8HandsOn

**Lambda Expression**

1. Interface Design 
 - Interface should have only one abstract method, otherwise it will create a ambiguity.
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
  - If the body is just one line stattement then no need to have ```return``` keyword.
 <br />
 
3. One of the inbuilt example is comparator interface, when we call ```Collections.sort( SomeObject , ```here we can implement``` (object1, object2) -> object1.getterOfVariable().compareTo(object2.getterOfVariable()))```
 <br />
 
**Consumer, Predicate and Supplier**

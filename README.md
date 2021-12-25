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
  - In the existing class no need to first implement the interface, just assign that lambda expression to the instance of the functional interface.
  - When we call lambda method no need to mention its name and return type.
  - Just have () double brackets if there are no parameters and -> this symbol is required while calling the interface method.
  - Eg.: ``` () -> System.out.println("Implemented interface method using Lambda Expression"); ```
  - If the body is just one line stattement then no need to have ```return``` keyword.
 <br />
 
3. One of the inbuilt example is comparator interface, when we call ```Collections.sort( SomeObject , ```here we can implement``` (object1, object2) -> object1.getterOfVariable().compareTo(object2.getterOfVariable()))```
 <br />
 
**Consumer, Predicate and Supplier** (Useful while using stream API)
1. Consumer Functional Interface
- Its a Java 8 inbuilt function. This interface is annotated with @FunctionalInterface, having abstract method accept as void with Object input parameter ```void accept(T t)``` and one default method.
- When we can use it ? So, when we have object as an input and based on the object we want to perform some operation and dont want to return anything. Basically when we want to manipulate an object we use this interface.
 <br />
 
 2. Predicate Fucntional Interface
 - We are using this interface to perform conditional operation it returns boolean.
 - This interface is annotated with @FunctionalInterface, having abstract method test as boolean with Object input parameter ```boolean test(T t)```.
 <br />
 
  3. Predicate Fucntional Interface
  - When there is no input but an output is expected.
  - This interface is annotated with @FunctionalInterface, having abstract method get as generic type(some object type) with no parameter ```T get()```.
 
 

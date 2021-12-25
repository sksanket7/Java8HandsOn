# Java8HandsOn

## Lambda Expression

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
 
## Consumer, Predicate and Supplier (Useful while using stream API)
1. Consumer Functional Interface
- Its a Java 8 inbuilt function. This interface is annotated with @FunctionalInterface, having abstract method accept as void with Object input parameter ```void accept(T t)``` and one default method.
- When we can use it ? So, when we have object as an input and based on the object we want to perform some operation and dont want to return anything. Basically when we want to manipulate an object we use this interface.
- One of the best example of Consumer interface is, List having stream with forEach method. Basically forEach method contains parameter of accept method of Consumer Functional Interface. You can checkout the example in ```com.karvekar.consumer.ConsumerListAndForEachExample```
 
 2. Predicate Fucntional Interface
 - We are using this interface to perform conditional operation it returns boolean.
 - This interface is annotated with @FunctionalInterface, having abstract method test as boolean with Object input parameter ```boolean test(T t)```.
 - Please check the exmaples in ```com.karvekar.predicate``` package.
 - In stream API there is a method called filer which internally uses predicate a method argument.
 <br />
 
  3. Supplier Fucntional Interface
  - When there is no input but an output is expected.
  - This interface is annotated with @FunctionalInterface, having abstract method get as generic type(some object type) with no parameter ```T get()```.
  - Supplier is used in the argument of orElseGet method of findBy method in Stream API. You can check the example in ```com.karvekar.supplier.SupplierDemoWithStreamFindByOrElseGet``` 
 <br />
 <br />

## Stream API
- Stream API process collection of objects.
- A stream is a sequence of objects that suppor various methods which can be pipelined to produce desired results.
- **Stream is not a data structure** instead it takes input from the Collections, Arrays or I/O channels.
- **Stream don't change the original data structure**, they only provide the result as per the pipelined methods.
 <br />
 
**Why we need Stream API ?**
- **Functional Programming:** 
 
 
 

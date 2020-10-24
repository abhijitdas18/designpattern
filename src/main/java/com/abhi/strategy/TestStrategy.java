package com.abhi.strategy;

// STRATEGY pattern
// Composition over inheritance
// Separate behaviour from implementations
// We can add new behaviour without modifying any of the existing behaviour classes

/**
 *  Very important principle #1 in design -> take what varies and encapsulate it ... and it will not
 *  		affect the rest of our code
 *
 *  	The code will be much more flexible ... later you can alter or extend the parts that vary without
 *  		affecting those that does not !!!
 *
 * 					code that changes    <------->  code that stays the same
 *
 *
 * 	Very important principle #2 in design -> program to an interface/supertype not an implementation !!!
 * 				Abstract superclass would be perfect too ...
 * 					- the actual runtime object is not locked into the code
 * 					- the type of variable should be a supertype/interface: can be of any
 * 							 concrete implementation
 *
 * 			Dog dog = new Dog();    not so good  "programming to an implementation"
 * 			Animal dog = new Dog();   GOOD       "programming to an interface"
 *
 *
 * 	Sometimes it is good to separate behaviors from implementation: easier to reuse it
 * 			+ we can add new behavior without modifying any of our existing behavior classes !!!
 * 					SOLID PRINCIPLE !!!
 *
 * Very important principle #3 in design -> Favor composition over inheritance !!!
 *
 * 		Composition: HAS-A relationship -> it gives you a lot more flexibility
 * 			1. you can encapsulate stuffs into their own set of classes
 * 			2. YOU CAN CHANGE BEHAVIOR AT RUNTIME with interfaces
 * 					So composition is used in several design patterns
 *
 * 		Inheritance: IS-A relationship
 *
 */
public class TestStrategy {

    public static void main(String []ar ) {

        Manager manager = new Manager();
        Strategy strategy = new Add();
        manager.setStrategy(strategy);
        //manager.setStrategy(new Add());

        manager.operation(3,7);

        manager.setStrategy(new Multiply());
        manager.operation(3,7);


    }
}

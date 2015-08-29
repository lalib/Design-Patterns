# Design-Patterns
Bismillahirrahmanirrahim

Java code samples for design patterns. Implemented clearly.

www.burhanaras.net


##Design Patterns
####Creational Patterns
* Factory Method
* Abstract Factory
* Builder
* Singleton
* Prototype

####Structural Patterns
* Adapter
* Facade Method
* Decorator 
* Bridge
* Composite
* Proxy
* Flyweight

####Behavioral Patterns
* Command
* Strategy
* Observer
* State
* Template
* Iterator
* Memento
* Chain of Responsibility
* Mediator
* Visitor

## Usage
#### Line Chart

![Design Patterns](http://www.vincehuston.org/images/GoF_full_medium.png)


```java
		PhoneFactory iPhoneFactory = new IPhoneFactory();
		Phone iPhone = iPhoneFactory.produce();
		System.out.println("iPhone is a " + iPhone.toString());

		PhoneFactory samsungFactory = new SamsungFactory();
		Phone samsungS6 = samsungFactory.produce();
		System.out.println("Samsung S6 is a " + samsungS6.toString());
```




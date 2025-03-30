# OOP-CAT2-
Overview

This repository contains Java programs demonstrating core object-oriented programming concepts, including encapsulation, method overloading and overriding, abstraction, and exception handling.

1. Encapsulation (Student Class)

File: Student.java

Concept: Encapsulation ensures that data (attributes) is hidden from external access and can only be modified through controlled methods (getters and setters).

Implementation:

Student class has private attributes name and grade.

Public getter and setter methods are used to access and modify these attributes.

The setGrade method ensures that grades are within the valid range (0 to 100); otherwise, it sets the grade to 0.

2. Method Overloading and Overriding

File: MathOperations.java and Animal.java

Concepts:

Method Overloading allows multiple methods with the same name but different parameters.

Method Overriding allows a subclass to provide a specific implementation of a method defined in its parent class.

Implementation:

MathOperations class contains two multiply() methods: one that multiplies two integers and another that multiplies three integers.

Animal class has a makeSound() method.

Dog and Cat subclasses override makeSound() to provide specific behavior.

3. Abstraction

File: Appliance.java

Concept: Abstraction allows defining a blueprint (abstract class) with abstract methods that must be implemented by subclasses.

Implementation:

Appliance is an abstract class with an abstract method turnOn().

Fan and TV classes extend Appliance and provide their own implementations of turnOn().

4. Exception Handling

File: DivisionHandler.java

Concept: Exception handling ensures that a program can handle runtime errors gracefully.

Implementation:

The program accepts two numbers from the user and divides the first by the second.

If the second number is zero, an ArithmeticException is caught, and a meaningful message ("Cannot divide by zero!") is displayed.



public class Main {
    public static void main(String[] args) {
        // Testing method overloading
        MathOperations mathOps = new MathOperations();
        System.out.println("Multiplication of two numbers: " + mathOps.multiply(3, 4));
        System.out.println("Multiplication of three numbers: " + mathOps.multiply(3, 4, 5));

        // Testing method overriding
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();
        myCat.makeSound();
        //Qn2
        Appliance myFan = new Fan();
        Appliance myTV = new TV();

        myFan.turnOn(); // This should print "Fan is now spinning."
        myTV.turnOn(); // This should print "TV is now on."
    }
}

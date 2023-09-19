class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public void drive() {
        System.out.println(model + " is driving.");
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Hi, I am " + name + ".");
    }
}

public class Oops {
    public static void main(String[] args) {
        Car myCar = new Car("Ford figo");
        myCar.drive();

        Person person = new Person("Darshann");
        person.introduce();
    }
}

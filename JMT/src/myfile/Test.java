package myfile;

class Animals {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animals {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animals {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
    public void eat(){
        System.out.println("Eat");
    }

}

class Test {
    public static void main(String[] args) {
        Animals myAnimal = new Animals();
        Animals myPig = new Pig(); // Polymorphism
        Animals myDog = new Dog();
        Dog d1 = new Dog(); // CLASS OBJECT OOP

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        d1.animalSound();
        d1.eat();
//        myDog.eat(); // ERROR
    }
}

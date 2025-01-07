package myfile.inher;

public class Ex1 {
    public static void main(String[] args){
        Dog d1 = new Dog(); //Single Inheritance
        //d1.sound();

        //overload
        //d1.add(1,2);
        //d1.add(1,2,3);

        //d1.add(10.5,15);

        SpecialDog sd1 = new SpecialDog();
        sd1.testAnimal();
    }
}
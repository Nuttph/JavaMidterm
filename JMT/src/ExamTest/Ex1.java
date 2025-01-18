package ExamTest;
abstract class Animal{
    private String name;
    private int age;
    public Animal(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("ชื่อ: "+name+", อายุ: "+age+" ปี");
    }
    void eat(){
        System.out.println("สัตว์กินอาหาร");
    }
    abstract void makeSound();
}

class Dog extends Animal{
    public Dog(String name,int age){
        super(name,age);
    }
    @Override
    void makeSound(){
        System.out.println("โฮ่ง โฮ่ง");
    }
    void wagTail(){
        System.out.println("สุนัขกำลังกระดิกหาง");
    }
}
class Cat extends Animal{
    public Cat(String name,int age){
        super(name,age);
    }
    @Override
    void makeSound(){
        System.out.println("เหมียว เหมียว");
    }
    void scratch(){
        System.out.println("แมวกำลังข่วน");
    }
}

public class Ex1 {
    public static void main(String[] args){
        Dog d1 = new Dog("Buddy",3);
        d1.eat();
        d1.makeSound();
        d1.wagTail();

        Cat c1 = new Cat("Kitty",2);
        c1.eat();
        c1.makeSound();
        c1.scratch();
    }
}

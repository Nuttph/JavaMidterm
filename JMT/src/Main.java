class Animal{
    private String name;
    //modifier
    // protected private public

    public Animal(String name){
        this.name = name;
    }
    public void getName(){
        System.out.println("Name: "+this.name);
    }
    public void setName(String n){
        this.name = n;
    }
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    @Override
    public void getName(){
        System.out.println("Hello ");
        super.getName();
    }
    public void eat(){
        System.out.println("Eating");
    }
}


public class Main {
    public static void main(String[] args) {
        Animal d1 = new Dog("Bug"); //poly
        d1.getName();
        d1.setName("Test");
        d1.getName();
//        d1.eat();
    }
}
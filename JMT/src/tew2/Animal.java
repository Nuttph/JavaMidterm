package tew2;

public class Animal {

    private String name;
    private int age;

    public Animal(String n,int a){
        this.name = n;
        this.age = a;
    }
    public void animalInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    public void setName(String n){
        this.name = n;
    }
}

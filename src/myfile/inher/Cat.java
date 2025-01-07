package myfile.inher;

public class Cat extends Animal {
    @Override
    public void sound(){
        System.out.println("Cat Sound...");
    }

    //Overloading
    //Overloaded
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public void add(double a,double b){
        System.out.println(a+b);
    }
}
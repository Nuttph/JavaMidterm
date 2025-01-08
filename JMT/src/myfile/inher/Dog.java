package myfile.inher;

public class Dog extends Animal {
    @Override
    public void sound(){
        System.out.println("Dog Sound...");
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
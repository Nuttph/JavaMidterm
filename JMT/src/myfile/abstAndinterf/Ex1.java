package myfile.abstAndinterf;

//abstract class, abstract method

abstract class Job{
    //variable, method-> มี feature หรือไม่มีก็ได้
    public abstract void y(); // abstract-method
    void x(){ //non-abstract
        System.out.println("Hello X");
    };
}

interface req{
    // abstract method
    public String setName(String name);
    public int setAge(int a);
    default void H(){
        System.out.println("H"); //static
    }
}
interface req2{
    public void hello();
}

public class Ex1 extends Job implements req,req2 {

    public void hello(){
    //code
    }

    public void y(){
        System.out.println("Y");
    }
    public String setName(String name){
        return "";
    }
    public int setAge(int a){
        return 0;
    }
    public static void main(String []args){
//       Ex1 obj = new Ex1();
//       obj.y();
//       obj.x();
    }

}

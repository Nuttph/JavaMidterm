package myfile;
class Person{ // OOP

    private String name; // variable
    private int age;
    private String job;
    // modifier + datatype + name of variable
    // private
    // public
    // protected

    // Constructor
    public Person(String n,String j,int a){ // def __init__(self,)
        this.name = n;
        this.job = j;
        this.age = a;
    }

    // getter
    public void getInfo(){
        System.out.println("name: "+name);
        System.out.println("job: "+job);
        System.out.println("age: "+age+"\n");
    }

    // setter
    public void setInfo(String n,String job,int a){
        this.name = n;
        this.job = job;
        this.age = a;
        System.out.println("SetInfo Success!!");

    }
}
public class FirstConcept  {
    public static void main(String[] args){
        Person p1 = new Person("Nuttaphon","Doctor",20);
        Person p2 = new Person("ABC","DEF",44);
        //Datatype + name of variable
       p2.getInfo();
       p2.setInfo("FFF","pilot",1);
       p2.getInfo();
    }
}

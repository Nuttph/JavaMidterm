package myfile.Ppp;

public class Ppp {
    // public - private - protected

    static public void a(){
        System.out.println("public a");
    }

    static private void b(){
        System.out.println("private b");
    }

    static protected void c(){
        System.out.println("protected c");
    }

    public static void main(String[]args){
        a();
        b();
        c();
    }
}

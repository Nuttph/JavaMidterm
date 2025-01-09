package myfile;

public class CastingConcept {

     static void primitiveCasting(){
        int num = 10;
        double d1 = num; // 10.0
        double d2 = 3.74;
        int i1 = (int) d2; // 3
        // byte → short → int → long → float → double

        double d3 = 15.4156;
        byte b1 = (byte) d3; // 15
        System.out.println(b1);
    }

    static void xy(){
         System.out.println("XY");

    }

    void zg(){
        System.out.println("ZG");
    }

    public static void main(String[] args){
        CastingConcept c1 = new CastingConcept();
        primitiveCasting();
    }
}

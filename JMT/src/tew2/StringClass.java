package tew2;

import myfile.inher.Animal;

public class StringClass {

    public static void Y(){

        // Ex1 + Ex2
        String c1 = "Programming";
        String c2 = "Java";
        String c3 = c1.concat(c2); // c1+c2
        String c4 = c1+c2;
//System.out.println(c3);
//System.out.println(c4);


        // Ex3
        String s1 = "Hello world!";
//        System.out.println(s1.substring(6));
//        System.out.println(s1.substring(0,6)); //start index 0 - 6


        String t = "  J  ";
//        System.out.println(t.trim());


        String co1 = "Hello World Java";
//        System.out.println(co1.contains("ld ")); true

        StringClass a1 = new StringClass("Ken");
        System.out.println(a1);
        String ss1 = new String();
        String ss2 = "";
        ss1 = "HEllo";
        System.out.println(s1.isEmpty());
    }

    private String name;
    public StringClass(String n){
        this.name = n;
    }
    public String toString(){
        return this.name + 123;
    }

    public static void main(String[] args){
        String ol = "Hello World H";
        System.out.println(ol.replaceAll("H","C"));
    }
}

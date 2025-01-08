package myfile.StringBB;

public class Ex1 {
    public static void main(String[] args){
        //Ex1
        String t1 = "Nuttaphon";
        t1.concat("Popardit");
        System.out.println(t1);

        //Ex2
        t1 = t1.concat("Popardit");
        System.out.println(".concat() : "+t1);

        //Ex3
        String t2 = "Java Programming";
        System.out.println(t2.substring(5)); //begin index 5
        System.out.println(t2.substring(0,5)); // begin index 0 and end index 5 || Overloading parameter

        //Ex4
        String t3 = "Python";
        String t33 = "python";
        System.out.println(t3.equals(t33)); // false

        //Ex5
        System.out.println(t3.equalsIgnoreCase(t33)); // ture because EIC is don't sensitive case up to lower or upper case

        //Ex6
        String t4 = "    Hello World!";
        System.out.println(t4);
        System.out.println(t4.trim()); //remove tab before first word

    }
}

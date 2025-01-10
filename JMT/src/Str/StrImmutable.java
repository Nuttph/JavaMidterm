package Str;

public class StrImmutable {

    //Ex 12 toString()
    private final String name;
    public StrImmutable(String n){
        this.name = n;
    }
    public String toString(){
        return "Name : "+this.name;
    }

    public static void main(String[]args){
        //Ex1,2 .concat(String),
        String cc1 = "Java";
        System.out.println(cc1.concat("Programming")); // JavaProgramming

        //Ex3 .substring(int), .substring(int,int)
        String subS = "Java Programming";
        System.out.println(subS.substring(5)); // Programming begin index 5
        System.out.println(subS.substring(0,5)); //Java <- have space begin index 0-5 ไม่เอา5

        //Ex4 .equals(...)
        String eq1 = "Python";
        String eq2 = "python";
        System.out.println(eq1.equals(eq2)); //false มัน sensitive

        //Ex5 .equalsIgnoreCase(...)
        System.out.println(eq1.equalsIgnoreCase(eq2)); //true non-sensitive

        //Ex6 .trim()
        String tr1 = " Java Python ";
        System.out.println(tr1.trim()); // Java Python <- ลบ space หน้าหลังออก

        //Ex7 .replace(string,string)
        String repl1 = "Java is a very good language";
        String reqplaceString = repl1.replace("v","w");
        System.out.println(reqplaceString); // convert "v" to "w" all of sentence

        //Ex8 + Ex9 .split(String), .split(String,int)
        String spl = "Text1 Text2, Text3 Tex4";
        String[] sentence = spl.split(",");
        for(String i:sentence){
            System.out.println(i); // แบ่งเป็น array โดยใช้ , ในการแบ่ง
        }

        String[] word = spl.split(" ");
        for(String i:word){
            System.out.println(i); // แบ่ง array โดยใช้ " " ช่องว่าง แบ่ง
        }

        for(String w:spl.split(" ",2)){
            System.out.println(w); //แบ่งเป็น ความยาว 2 แทนที่จะเป็นความยาวทั้งหมด
        }

        //Ex10 .concat(String)
        String cc2 = "Java";
        cc2.concat(" Programming");
        System.out.println(cc2);  //Output:Java เพราะไม่มีอะไรมารองรับ cc2.concat(..)

        //Ex11 .contains()
        String ct1 = "Java is Good";
        System.out.println(ct1.contains("Good")); //true
        System.out.println(ct1.contains(" Good")); //true
        System.out.println(ct1.contains("Good ")); //false
        System.out.println(ct1.contains("good")); //false

        //Ex12 toString()
        StrImmutable ts = new StrImmutable("Nuttaphon");
        System.out.println(ts); //Output จะไปทำที่ method String toString() แบบอัตโนมัติ

        //Ex13 .toUpperCase(), .toLowerCase(), .charAt(int)
        String ttc = "Hello World";
        System.out.println(ttc.toUpperCase()); // HELLO WORLD
        System.out.println(ttc.toLowerCase()); // hello world
        System.out.println(ttc.charAt(4)); // o -> index 4

        //Ex14 .length(), join(String,String...), isEmpty()
        String l = "";
        System.out.println(l.length()); //0
        System.out.println(l.isEmpty()); // true
        l = l.join("kkk","Hello world","L L L","Test","OOO");
        System.out.println(l); //เอา kkk ไปขั้นระหว่าง element ใน parameter

        //Ex15 .replaceAll(), .replaceFirst()
        String rr = "Java Programming is super aa a a";
        System.out.println(rr.replaceAll("a","e")); //แปลงทั้งหมด
        System.out.println(rr.replaceFirst("a","e")); //แปลงแค่ตัวแรกที่เจอ

        //Ex16 .indexOf(String), .indexOf(String,int)
        String ind = "abc def fed cba abc def";
        System.out.println(ind.indexOf("c")); // 2 หา c ว่าอยู่ index ที่เท่าไหร่
        System.out.println(ind.indexOf("a"));
        System.out.println(ind.indexOf("a",2)); //14 ก็คือเริ่มหาหลังจาก index 2
        System.out.println(ind.indexOf("a",14)); //14 ก็คือเริ่มหาหลังจาก index 14 และถ้า 14 เป็น a ก็ return 14

        //Ex17 .lastIndexOf()
        String ind2 = "abc def fed cba abc def";
        System.out.println(ind2.lastIndexOf("b")); // 17 นับจากหลังมาหน้า
        System.out.println(ind2.lastIndexOf("a",17)); // 16 เริ่มหา a ไล่จากหลังมาหน้าเริ่มจาก index ที่ 17
        System.out.println(ind2.lastIndexOf("a",16)); // 16 เริ่มหา a ไล่จากหลังมาหน้าเริ่มจาก index ที่ 16 ถ้าเจอก็ return 16 มาเลย

        //Ex18 .compareTo(...);
        String cpt1 = "Apple";
        String cpt2 = "banana";
        String cpt3 = "a";
        System.out.println(cpt1.compareTo(cpt2)); // -1
        System.out.println(cpt2.compareTo(cpt1)); // 1
        System.out.println(cpt1.compareTo(cpt3)); // 4
        System.out.println(cpt3.compareTo(cpt1)); // -4
        //สรุปง่ายๆว่า ผลลัพธ์ของ compareTo คืนค่าเป็นเลข -32 เพราะมันเปรียบเทียบ Unicode ของ 'A' (65) กับ 'a' (97)
        //ตัวเล็กมาก่อนตัวใหญ่!!

        //Ex19 .compareToIgnoreCse(...)
        String cpt4 = "c";
        String cpt5 = "cdf";
        String cpt6 = "C";
        System.out.println(cpt4.compareToIgnoreCase(cpt5)); // -2
        System.out.println(cpt4.compareToIgnoreCase(cpt6)); // 0
        //ไม่สนตัวเล็กตัวใหญ่

    }
}

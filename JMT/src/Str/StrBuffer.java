package Str;

public class StrBuffer {
    public static void main(String[] args){
        // สร้าง StringBuffer เริ่มต้น
        StringBuffer sb = new StringBuffer("Hello");

        // 1. append() - เพิ่มข้อความต่อท้าย
        sb.append(" World"); // เพิ่ม " World" ต่อท้าย
        System.out.println("append(): " + sb); // ผลลัพธ์: Hello World

        // 2. replace() - แทนที่ข้อความในช่วงที่กำหนด
        sb.replace(6, 11, "Java"); // แทนคำว่า "World" ด้วย "Java"
        System.out.println("replace(): " + sb); // ผลลัพธ์: Hello Java

        // 3. setCharAt() - เปลี่ยนตัวอักษรที่ตำแหน่งที่กำหนด
        sb.setCharAt(6, 'X'); // เปลี่ยน 'J' ที่ตำแหน่ง 6 เป็น 'X'
        System.out.println("setCharAt(): " + sb); // ผลลัพธ์: Hello Xava

        // 4. insert() - แทรกข้อความในตำแหน่งที่กำหนด
        sb.insert(6, "My "); // แทรก "My " ที่ตำแหน่ง 6
        System.out.println("insert(): " + sb); // ผลลัพธ์: Hello My Xava

        // 5. delete() - ลบข้อความในช่วงที่กำหนด
        sb.delete(6, 9); // ลบ "My " ตั้งแต่ตำแหน่งที่ 6 ถึง 8
        System.out.println("delete(): " + sb); // ผลลัพธ์: Hello Xava

        // 6. reverse() - กลับข้อความ
        sb.reverse(); // กลับข้อความทั้งหมด
        System.out.println("reverse(): " + sb); // ผลลัพธ์: avaX olleH

        // 7. length() - หาความยาวของข้อความ
        int length = sb.length(); // ความยาวของข้อความ
        System.out.println("length(): " + length); // ผลลัพธ์: 10

        // 8. charAt() - ดึงตัวอักษรที่ตำแหน่งที่กำหนด
        char ch = sb.charAt(2); // ตัวอักษรที่ตำแหน่ง 2
        System.out.println("charAt(): " + ch); // ผลลัพธ์: a

        // 9. deleteCharAt() - ลบตัวอักษรที่ตำแหน่งที่กำหนด
        sb.deleteCharAt(2); // ลบตัวอักษรที่ตำแหน่ง 2
        System.out.println("deleteCharAt(): " + sb); // ผลลัพธ์: avX olleH

        // 10. setLength() - ตั้งค่าความยาวของข้อความใหม่
        sb.setLength(5); // ตั้งความยาวให้เหลือ 5 ตัวอักษร
        System.out.println("setLength(): " + sb); // ผลลัพธ์: avX o

        // 11. subsequence() - ดึงข้อความย่อยจากตำแหน่งที่กำหนด
        sb = new StringBuffer("Hello World"); // ตั้งค่าใหม่เพื่อทดสอบ
        CharSequence sub = sb.subSequence(0, 5); // ดึงข้อความย่อยจากตำแหน่ง 0 ถึง 4
        System.out.println("subsequence(): " + sub); // ผลลัพธ์: Hello

        // 12. trimToSize() - ลดขนาดหน่วยความจำที่ใช้ให้พอดีกับความยาวปัจจุบัน
        sb.trimToSize(); // ลดขนาดให้พอดีกับข้อความใน StringBuffer
        System.out.println("trimToSize(): ขนาดของ StringBuffer ถูกปรับให้เหมาะสม");
    }
}

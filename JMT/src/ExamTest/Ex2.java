package ExamTest;

interface Vehicle{
    void drive();
    void refuel();
}

class Car implements Vehicle{
    private final String brand;
    private int fuelLevel;
    public Car(String brand,int fuelLevel){
        this.brand = brand;
        this.fuelLevel = fuelLevel;
        System.out.println("รถยนต์ยี่ห้อ: "+this.brand);
    }
    public void drive(){
        System.out.println("รถยนต์กำลังขับเคลื่อน");
    }
    public void refuel(){
        fuelLevel+=1;
        System.out.println("รถยนต์เติมน้ำมันแล้ว");
    }
}

class Motorcycle implements Vehicle{
    private final String brand;
    private int fuelLevel;
    public Motorcycle(String brand,int fuelLevel){
        this.brand = brand;
        this.fuelLevel = fuelLevel;
        System.out.println("มอเตอร์ไซค์ยี่ห้อ: "+this.brand);
    }
    public void drive(){
        System.out.println("มอเตอร์ไซค์กำลังขับเคลื่อน");
    }
    public void refuel(){
        fuelLevel+=1;
        System.out.println("มอเตอร์ไซค์เติมน้ำมันแล้ว");
    }
}


public class Ex2 {
    public static void main(String[] args){
        Car c1 = new Car("Toyota",99);
        c1.drive();
        c1.refuel();

        Motorcycle c2 = new Motorcycle("Honda",99);
        c2.drive();
        c2.refuel();
    }
}

package myfile.Encap;

public class Encapsulation {
    private int x = 10; // x ถูก encapsulation ด้วย private
    // private, public, protected

    private final double pi = 3.14;

    public void setNum(int x){
        this.x = x;
    }
    public int getNum(){
        return this.x;
    }

    public double spaceOfCicle(double r){
        double soc = 2 * this.pi * r;
        return soc;
    }
}

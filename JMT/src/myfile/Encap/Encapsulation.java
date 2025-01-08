package myfile.Encap;

public class Encapsulation {
    private int x = 10; // x ถูก encapsulation ด้วย private

    public void setNum(int x){
        this.x = x;
    }
    public int getNum(){
        return this.x;
    }
}
